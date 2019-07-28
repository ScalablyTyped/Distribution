package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleInnerError extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
}

object GoogleInnerError {
  @scala.inline
  def apply(message: String = null, reason: String = null): GoogleInnerError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[GoogleInnerError]
  }
}

