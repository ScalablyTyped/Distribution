package typings.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move extends js.Object {
  /** The added parent(s). */
  var addedParents: js.UndefOr[js.Array[Parent]] = js.undefined
  /** The removed parent(s). */
  var removedParents: js.UndefOr[js.Array[Parent]] = js.undefined
}

object Move {
  @scala.inline
  def apply(addedParents: js.Array[Parent] = null, removedParents: js.Array[Parent] = null): Move = {
    val __obj = js.Dynamic.literal()
    if (addedParents != null) __obj.updateDynamic("addedParents")(addedParents.asInstanceOf[js.Any])
    if (removedParents != null) __obj.updateDynamic("removedParents")(removedParents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
}

