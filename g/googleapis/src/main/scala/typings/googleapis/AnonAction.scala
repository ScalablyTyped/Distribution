package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  var action: js.UndefOr[AnonStorageClass] = js.native
  var condition: js.UndefOr[AnonAge] = js.native
}

object AnonAction {
  @scala.inline
  def apply(action: AnonStorageClass = null, condition: AnonAge = null): AnonAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
}

