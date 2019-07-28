package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import typings.request.requestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleErrorBody extends js.Object {
  var code: Double
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var response: Response
}

object GoogleErrorBody {
  @scala.inline
  def apply(
    code: Double,
    response: Response,
    errors: js.Array[GoogleInnerError] = null,
    message: String = null
  ): GoogleErrorBody = {
    val __obj = js.Dynamic.literal(code = code, response = response)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[GoogleErrorBody]
  }
}

