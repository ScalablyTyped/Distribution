package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderpaymentsNotifyAuthDeclinedRequest extends js.Object {
  var declineReason: js.UndefOr[String] = js.native
}

object OrderpaymentsNotifyAuthDeclinedRequest {
  @scala.inline
  def apply(): OrderpaymentsNotifyAuthDeclinedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderpaymentsNotifyAuthDeclinedRequest]
  }
  @scala.inline
  implicit class OrderpaymentsNotifyAuthDeclinedRequestOps[Self <: OrderpaymentsNotifyAuthDeclinedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeclineReason(value: String): Self = this.set("declineReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclineReason: Self = this.set("declineReason", js.undefined)
  }
  
}

