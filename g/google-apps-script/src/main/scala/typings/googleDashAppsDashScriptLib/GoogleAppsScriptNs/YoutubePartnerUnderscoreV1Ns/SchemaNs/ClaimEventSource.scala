package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimEventSource extends js.Object {
  var contentOwnerId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var userEmail: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimEventSource {
  @scala.inline
  def apply(
    contentOwnerId: java.lang.String = null,
    `type`: java.lang.String = null,
    userEmail: java.lang.String = null
  ): ClaimEventSource = {
    val __obj = js.Dynamic.literal()
    if (contentOwnerId != null) __obj.updateDynamic("contentOwnerId")(contentOwnerId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail)
    __obj.asInstanceOf[ClaimEventSource]
  }
}

