package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The auditDetails object encapsulates channel data that is relevant for
  * YouTube Partners during the audit process.
  */
@js.native
trait Schema$ChannelAuditDetails extends js.Object {
  /**
    * Whether or not the channel respects the community guidelines.
    */
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the channel has any unresolved claims.
    */
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the channel has any copyright strikes.
    */
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.native
}

object Schema$ChannelAuditDetails {
  @scala.inline
  def apply(
    communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.undefined,
    contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.undefined,
    copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.undefined
  ): Schema$ChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(communityGuidelinesGoodStanding)) __obj.updateDynamic("communityGuidelinesGoodStanding")(communityGuidelinesGoodStanding.asInstanceOf[js.Any])
    if (!js.isUndefined(contentIdClaimsGoodStanding)) __obj.updateDynamic("contentIdClaimsGoodStanding")(contentIdClaimsGoodStanding.asInstanceOf[js.Any])
    if (!js.isUndefined(copyrightStrikesGoodStanding)) __obj.updateDynamic("copyrightStrikesGoodStanding")(copyrightStrikesGoodStanding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelAuditDetails]
  }
}

