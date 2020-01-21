package typings.dispatchr

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionName extends js.Object {
  var actionName: js.UndefOr[String] = js.undefined
  var error: Error
  var payload: js.UndefOr[js.Any] = js.undefined
}

object AnonActionName {
  @scala.inline
  def apply(error: Error, actionName: String = null, payload: js.Any = null): AnonActionName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionName]
  }
}

