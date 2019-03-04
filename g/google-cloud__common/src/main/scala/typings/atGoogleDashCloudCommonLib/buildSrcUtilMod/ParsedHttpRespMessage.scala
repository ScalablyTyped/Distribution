package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHttpRespMessage extends js.Object {
  var err: js.UndefOr[ApiError] = js.undefined
  var resp: requestLib.requestMod.requestNs.Response
}

object ParsedHttpRespMessage {
  @scala.inline
  def apply(resp: requestLib.requestMod.requestNs.Response, err: ApiError = null): ParsedHttpRespMessage = {
    val __obj = js.Dynamic.literal(resp = resp)
    if (err != null) __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[ParsedHttpRespMessage]
  }
}

