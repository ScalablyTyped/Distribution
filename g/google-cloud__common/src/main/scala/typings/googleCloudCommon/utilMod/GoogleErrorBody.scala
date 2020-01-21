package typings.googleCloudCommon.utilMod

import typings.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleErrorBody extends js.Object {
  var code: Double
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var response: Response[_]
}

object GoogleErrorBody {
  @scala.inline
  def apply(
    code: Double,
    response: Response[_],
    errors: js.Array[GoogleInnerError] = null,
    message: String = null
  ): GoogleErrorBody = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleErrorBody]
  }
}

