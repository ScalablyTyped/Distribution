package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsNotifyAuthDeclinedRequest extends js.Object {
  var declineReason: js.UndefOr[String] = js.undefined
}

object OrderpaymentsNotifyAuthDeclinedRequest {
  @scala.inline
  def apply(declineReason: String = null): OrderpaymentsNotifyAuthDeclinedRequest = {
    val __obj = js.Dynamic.literal()
    if (declineReason != null) __obj.updateDynamic("declineReason")(declineReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderpaymentsNotifyAuthDeclinedRequest]
  }
}

