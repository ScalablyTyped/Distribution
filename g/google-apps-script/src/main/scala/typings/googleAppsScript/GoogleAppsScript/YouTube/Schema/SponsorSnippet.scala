package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SponsorSnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var cumulativeDurationMonths: js.UndefOr[Double] = js.undefined
  var sponsorDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
  var sponsorSince: js.UndefOr[String] = js.undefined
}

object SponsorSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    cumulativeDurationMonths: js.UndefOr[Double] = js.undefined,
    sponsorDetails: ChannelProfileDetails = null,
    sponsorSince: String = null
  ): SponsorSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (!js.isUndefined(cumulativeDurationMonths)) __obj.updateDynamic("cumulativeDurationMonths")(cumulativeDurationMonths.get.asInstanceOf[js.Any])
    if (sponsorDetails != null) __obj.updateDynamic("sponsorDetails")(sponsorDetails.asInstanceOf[js.Any])
    if (sponsorSince != null) __obj.updateDynamic("sponsorSince")(sponsorSince.asInstanceOf[js.Any])
    __obj.asInstanceOf[SponsorSnippet]
  }
}

