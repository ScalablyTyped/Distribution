package typings.expressBoom.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload extends js.Object {
  /**
    * "Every key/value pair will be included ... in the response payload under the attributes key."
    * [see docs](https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes)
    */
  var attributes: js.UndefOr[js.Any] = js.native
  /** error - the HTTP status message (e.g. 'Bad Request', 'Internal Server Error') derived from statusCode. */
  var error: String = js.native
  /** message - the error message derived from error.message. */
  var message: String = js.native
  /** statusCode - the HTTP status code, derived from error.output.statusCode. */
  var statusCode: Double = js.native
}

object Payload {
  @scala.inline
  def apply(error: String, message: String, statusCode: Double): Payload = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  @scala.inline
  implicit class PayloadOps[Self <: Payload] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
  
}

