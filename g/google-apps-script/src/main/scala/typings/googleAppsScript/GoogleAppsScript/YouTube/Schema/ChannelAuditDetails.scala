package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelAuditDetails extends js.Object {
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.undefined
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.undefined
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.undefined
}

object ChannelAuditDetails {
  @scala.inline
  def apply(
    communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.undefined,
    contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.undefined,
    copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.undefined
  ): ChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(communityGuidelinesGoodStanding)) __obj.updateDynamic("communityGuidelinesGoodStanding")(communityGuidelinesGoodStanding.asInstanceOf[js.Any])
    if (!js.isUndefined(contentIdClaimsGoodStanding)) __obj.updateDynamic("contentIdClaimsGoodStanding")(contentIdClaimsGoodStanding.asInstanceOf[js.Any])
    if (!js.isUndefined(copyrightStrikesGoodStanding)) __obj.updateDynamic("copyrightStrikesGoodStanding")(copyrightStrikesGoodStanding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelAuditDetails]
  }
}

