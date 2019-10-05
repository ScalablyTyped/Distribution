package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SponsorSnippet extends js.Object {
  /** The id of the channel being sponsored. */
  var channelId: js.UndefOr[String] = js.undefined
  /** Details about the sponsor. */
  var sponsorDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
  /** The date and time when the user became a sponsor. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var sponsorSince: js.UndefOr[String] = js.undefined
}

object SponsorSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    sponsorDetails: ChannelProfileDetails = null,
    sponsorSince: String = null
  ): SponsorSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (sponsorDetails != null) __obj.updateDynamic("sponsorDetails")(sponsorDetails)
    if (sponsorSince != null) __obj.updateDynamic("sponsorSince")(sponsorSince)
    __obj.asInstanceOf[SponsorSnippet]
  }
}

