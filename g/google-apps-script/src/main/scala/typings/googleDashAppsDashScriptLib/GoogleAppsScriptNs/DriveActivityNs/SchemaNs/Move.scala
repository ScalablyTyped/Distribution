package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move extends js.Object {
  var addedParents: js.UndefOr[js.Array[TargetReference]] = js.undefined
  var removedParents: js.UndefOr[js.Array[TargetReference]] = js.undefined
}

object Move {
  @scala.inline
  def apply(addedParents: js.Array[TargetReference] = null, removedParents: js.Array[TargetReference] = null): Move = {
    val __obj = js.Dynamic.literal()
    if (addedParents != null) __obj.updateDynamic("addedParents")(addedParents)
    if (removedParents != null) __obj.updateDynamic("removedParents")(removedParents)
    __obj.asInstanceOf[Move]
  }
}

