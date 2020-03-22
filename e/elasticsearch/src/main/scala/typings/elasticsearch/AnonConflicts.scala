package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConflicts extends js.Object {
  var conflicts: js.UndefOr[String] = js.undefined
  var dest: AnonOptype
  var script: js.UndefOr[AnonInline] = js.undefined
  var source: AnonIndex
}

object AnonConflicts {
  @scala.inline
  def apply(dest: AnonOptype, source: AnonIndex, conflicts: String = null, script: AnonInline = null): AnonConflicts = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConflicts]
  }
}

