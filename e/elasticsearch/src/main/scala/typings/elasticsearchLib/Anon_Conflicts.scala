package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conflicts extends js.Object {
  var conflicts: js.UndefOr[java.lang.String] = js.undefined
  var dest: Anon_IndexOptype
  var script: js.UndefOr[Anon_Inline] = js.undefined
  var source: Anon_Index
}

object Anon_Conflicts {
  @scala.inline
  def apply(
    dest: Anon_IndexOptype,
    source: Anon_Index,
    conflicts: java.lang.String = null,
    script: Anon_Inline = null
  ): Anon_Conflicts = {
    val __obj = js.Dynamic.literal(dest = dest, source = source)
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts)
    if (script != null) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[Anon_Conflicts]
  }
}

