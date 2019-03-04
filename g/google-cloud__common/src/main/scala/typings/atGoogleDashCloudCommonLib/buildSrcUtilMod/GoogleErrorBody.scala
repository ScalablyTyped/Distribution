package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleErrorBody extends js.Object {
  var code: scala.Double
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var response: requestLib.requestMod.requestNs.Response
}

object GoogleErrorBody {
  @scala.inline
  def apply(
    code: scala.Double,
    response: requestLib.requestMod.requestNs.Response,
    errors: js.Array[GoogleInnerError] = null,
    message: java.lang.String = null
  ): GoogleErrorBody = {
    val __obj = js.Dynamic.literal(code = code, response = response)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[GoogleErrorBody]
  }
}

