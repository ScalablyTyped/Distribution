package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

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
    cumulativeDurationMonths: Int | Double = null,
    sponsorDetails: ChannelProfileDetails = null,
    sponsorSince: String = null
  ): SponsorSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (cumulativeDurationMonths != null) __obj.updateDynamic("cumulativeDurationMonths")(cumulativeDurationMonths.asInstanceOf[js.Any])
    if (sponsorDetails != null) __obj.updateDynamic("sponsorDetails")(sponsorDetails)
    if (sponsorSince != null) __obj.updateDynamic("sponsorSince")(sponsorSince)
    __obj.asInstanceOf[SponsorSnippet]
  }
}

