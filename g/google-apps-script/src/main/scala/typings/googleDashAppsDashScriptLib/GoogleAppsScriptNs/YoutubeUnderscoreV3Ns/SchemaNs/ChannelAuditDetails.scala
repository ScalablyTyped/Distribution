package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelAuditDetails extends js.Object {
  var communityGuidelinesGoodStanding: js.UndefOr[scala.Boolean] = js.undefined
  var contentIdClaimsGoodStanding: js.UndefOr[scala.Boolean] = js.undefined
  var copyrightStrikesGoodStanding: js.UndefOr[scala.Boolean] = js.undefined
}

object ChannelAuditDetails {
  @scala.inline
  def apply(
    communityGuidelinesGoodStanding: js.UndefOr[scala.Boolean] = js.undefined,
    contentIdClaimsGoodStanding: js.UndefOr[scala.Boolean] = js.undefined,
    copyrightStrikesGoodStanding: js.UndefOr[scala.Boolean] = js.undefined
  ): ChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(communityGuidelinesGoodStanding)) __obj.updateDynamic("communityGuidelinesGoodStanding")(communityGuidelinesGoodStanding)
    if (!js.isUndefined(contentIdClaimsGoodStanding)) __obj.updateDynamic("contentIdClaimsGoodStanding")(contentIdClaimsGoodStanding)
    if (!js.isUndefined(copyrightStrikesGoodStanding)) __obj.updateDynamic("copyrightStrikesGoodStanding")(copyrightStrikesGoodStanding)
    __obj.asInstanceOf[ChannelAuditDetails]
  }
}

