package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

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
    if (addedParents != null) __obj.updateDynamic("addedParents")(addedParents.asInstanceOf[js.Any])
    if (removedParents != null) __obj.updateDynamic("removedParents")(removedParents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
}

