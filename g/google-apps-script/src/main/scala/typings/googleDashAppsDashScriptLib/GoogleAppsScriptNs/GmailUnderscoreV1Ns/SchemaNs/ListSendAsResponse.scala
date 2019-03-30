package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSendAsResponse extends js.Object {
  var sendAs: js.UndefOr[js.Array[SendAs]] = js.undefined
}

object ListSendAsResponse {
  @scala.inline
  def apply(sendAs: js.Array[SendAs] = null): ListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    if (sendAs != null) __obj.updateDynamic("sendAs")(sendAs)
    __obj.asInstanceOf[ListSendAsResponse]
  }
}

