package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimEventSource extends js.Object {
  var contentOwnerId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var userEmail: js.UndefOr[String] = js.undefined
}

object ClaimEventSource {
  @scala.inline
  def apply(contentOwnerId: String = null, `type`: String = null, userEmail: String = null): ClaimEventSource = {
    val __obj = js.Dynamic.literal()
    if (contentOwnerId != null) __obj.updateDynamic("contentOwnerId")(contentOwnerId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail)
    __obj.asInstanceOf[ClaimEventSource]
  }
}

