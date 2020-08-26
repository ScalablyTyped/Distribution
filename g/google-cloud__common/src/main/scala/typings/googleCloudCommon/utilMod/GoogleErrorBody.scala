package typings.googleCloudCommon.utilMod

import typings.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleErrorBody extends js.Object {
  var code: Double = js.native
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  var message: js.UndefOr[String] = js.native
  var response: Response[_] = js.native
}

object GoogleErrorBody {
  @scala.inline
  def apply(code: Double, response: Response[_]): GoogleErrorBody = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleErrorBody]
  }
  @scala.inline
  implicit class GoogleErrorBodyOps[Self <: GoogleErrorBody] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Response[_]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: GoogleInnerError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GoogleInnerError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

