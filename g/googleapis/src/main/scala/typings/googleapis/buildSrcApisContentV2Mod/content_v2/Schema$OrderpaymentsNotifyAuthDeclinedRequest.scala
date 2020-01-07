package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderpaymentsNotifyAuthDeclinedRequest extends js.Object {
  /**
    * Reason why payment authorization was declined.
    */
  var declineReason: js.UndefOr[String] = js.native
}

object Schema$OrderpaymentsNotifyAuthDeclinedRequest {
  @scala.inline
  def apply(declineReason: String = null): Schema$OrderpaymentsNotifyAuthDeclinedRequest = {
    val __obj = js.Dynamic.literal()
    if (declineReason != null) __obj.updateDynamic("declineReason")(declineReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderpaymentsNotifyAuthDeclinedRequest]
  }
}

