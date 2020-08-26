package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiError extends js.Object {
  var statusBody: js.Object = js.native
  var statusCode: Double = js.native
  var statusMessage: String = js.native
}

object ApiError {
  @scala.inline
  def apply(statusBody: js.Object, statusCode: Double, statusMessage: String): ApiError = {
    val __obj = js.Dynamic.literal(statusBody = statusBody.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
  @scala.inline
  implicit class ApiErrorOps[Self <: ApiError] (val x: Self) extends AnyVal {
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
    def setStatusBody(value: js.Object): Self = this.set("statusBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
  }
  
}

