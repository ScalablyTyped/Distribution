package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsNotifyAuthDeclinedRequest extends js.Object {
  var declineReason: js.UndefOr[java.lang.String] = js.undefined
}

object OrderpaymentsNotifyAuthDeclinedRequest {
  @scala.inline
  def apply(declineReason: java.lang.String = null): OrderpaymentsNotifyAuthDeclinedRequest = {
    val __obj = js.Dynamic.literal()
    if (declineReason != null) __obj.updateDynamic("declineReason")(declineReason)
    __obj.asInstanceOf[OrderpaymentsNotifyAuthDeclinedRequest]
  }
}

