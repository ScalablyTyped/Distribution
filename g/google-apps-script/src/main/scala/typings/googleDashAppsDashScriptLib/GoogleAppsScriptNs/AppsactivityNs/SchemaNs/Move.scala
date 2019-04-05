package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move extends js.Object {
  var addedParents: js.UndefOr[js.Array[Parent]] = js.undefined
  var removedParents: js.UndefOr[js.Array[Parent]] = js.undefined
}

object Move {
  @scala.inline
  def apply(addedParents: js.Array[Parent] = null, removedParents: js.Array[Parent] = null): Move = {
    val __obj = js.Dynamic.literal()
    if (addedParents != null) __obj.updateDynamic("addedParents")(addedParents)
    if (removedParents != null) __obj.updateDynamic("removedParents")(removedParents)
    __obj.asInstanceOf[Move]
  }
}

