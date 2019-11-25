package typings.expressDashBoom.expressDashBoomMod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  /**
    * "Every key/value pair will be included ... in the response payload under the attributes key."
    * [see docs](https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes)
    */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /** error - the HTTP status message (e.g. 'Bad Request', 'Internal Server Error') derived from statusCode. */
  var error: String
  /** message - the error message derived from error.message. */
  var message: String
  /** statusCode - the HTTP status code, derived from error.output.statusCode. */
  var statusCode: Double
}

object Payload {
  @scala.inline
  def apply(error: String, message: String, statusCode: Double, attributes: js.Any = null): Payload = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

