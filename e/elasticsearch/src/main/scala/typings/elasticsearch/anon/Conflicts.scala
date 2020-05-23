package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conflicts extends js.Object {
  var conflicts: js.UndefOr[String] = js.undefined
  var dest: Optype
  var script: js.UndefOr[Inline] = js.undefined
  var source: Index
}

object Conflicts {
  @scala.inline
  def apply(dest: Optype, source: Index, conflicts: String = null, script: Inline = null): Conflicts = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
}

