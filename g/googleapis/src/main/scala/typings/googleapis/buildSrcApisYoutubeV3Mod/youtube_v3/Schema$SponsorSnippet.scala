package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SponsorSnippet extends js.Object {
  /**
    * The id of the channel being sponsored.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The cumulative time a user has been a sponsor in months.
    */
  var cumulativeDurationMonths: js.UndefOr[Double] = js.native
  /**
    * Details about the sponsor.
    */
  var sponsorDetails: js.UndefOr[Schema$ChannelProfileDetails] = js.native
  /**
    * The date and time when the user became a sponsor. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var sponsorSince: js.UndefOr[String] = js.native
}

object Schema$SponsorSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    cumulativeDurationMonths: Int | Double = null,
    sponsorDetails: Schema$ChannelProfileDetails = null,
    sponsorSince: String = null
  ): Schema$SponsorSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (cumulativeDurationMonths != null) __obj.updateDynamic("cumulativeDurationMonths")(cumulativeDurationMonths.asInstanceOf[js.Any])
    if (sponsorDetails != null) __obj.updateDynamic("sponsorDetails")(sponsorDetails.asInstanceOf[js.Any])
    if (sponsorSince != null) __obj.updateDynamic("sponsorSince")(sponsorSince.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SponsorSnippet]
  }
}

