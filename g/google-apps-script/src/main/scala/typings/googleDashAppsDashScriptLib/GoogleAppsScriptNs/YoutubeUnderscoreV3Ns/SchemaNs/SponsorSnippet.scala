package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SponsorSnippet extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var cumulativeDurationMonths: js.UndefOr[scala.Double] = js.undefined
  var sponsorDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
  var sponsorSince: js.UndefOr[java.lang.String] = js.undefined
}

object SponsorSnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    cumulativeDurationMonths: scala.Int | scala.Double = null,
    sponsorDetails: ChannelProfileDetails = null,
    sponsorSince: java.lang.String = null
  ): SponsorSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (cumulativeDurationMonths != null) __obj.updateDynamic("cumulativeDurationMonths")(cumulativeDurationMonths.asInstanceOf[js.Any])
    if (sponsorDetails != null) __obj.updateDynamic("sponsorDetails")(sponsorDetails)
    if (sponsorSince != null) __obj.updateDynamic("sponsorSince")(sponsorSince)
    __obj.asInstanceOf[SponsorSnippet]
  }
}

