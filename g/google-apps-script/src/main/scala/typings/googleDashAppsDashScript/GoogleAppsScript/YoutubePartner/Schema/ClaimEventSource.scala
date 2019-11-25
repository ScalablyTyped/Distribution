package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (contentOwnerId != null) __obj.updateDynamic("contentOwnerId")(contentOwnerId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimEventSource]
  }
}

