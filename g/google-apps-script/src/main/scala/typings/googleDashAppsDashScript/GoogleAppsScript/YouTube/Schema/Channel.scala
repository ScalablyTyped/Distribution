package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var auditDetails: js.UndefOr[ChannelAuditDetails] = js.undefined
  var brandingSettings: js.UndefOr[ChannelBrandingSettings] = js.undefined
  var contentDetails: js.UndefOr[ChannelContentDetails] = js.undefined
  var contentOwnerDetails: js.UndefOr[ChannelContentOwnerDetails] = js.undefined
  var conversionPings: js.UndefOr[ChannelConversionPings] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var invideoPromotion: js.UndefOr[InvideoPromotion] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var localizations: js.UndefOr[js.Object] = js.undefined
  var snippet: js.UndefOr[ChannelSnippet] = js.undefined
  var statistics: js.UndefOr[ChannelStatistics] = js.undefined
  var status: js.UndefOr[ChannelStatus] = js.undefined
  var topicDetails: js.UndefOr[ChannelTopicDetails] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    auditDetails: ChannelAuditDetails = null,
    brandingSettings: ChannelBrandingSettings = null,
    contentDetails: ChannelContentDetails = null,
    contentOwnerDetails: ChannelContentOwnerDetails = null,
    conversionPings: ChannelConversionPings = null,
    etag: String = null,
    id: String = null,
    invideoPromotion: InvideoPromotion = null,
    kind: String = null,
    localizations: js.Object = null,
    snippet: ChannelSnippet = null,
    statistics: ChannelStatistics = null,
    status: ChannelStatus = null,
    topicDetails: ChannelTopicDetails = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (auditDetails != null) __obj.updateDynamic("auditDetails")(auditDetails.asInstanceOf[js.Any])
    if (brandingSettings != null) __obj.updateDynamic("brandingSettings")(brandingSettings.asInstanceOf[js.Any])
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (contentOwnerDetails != null) __obj.updateDynamic("contentOwnerDetails")(contentOwnerDetails.asInstanceOf[js.Any])
    if (conversionPings != null) __obj.updateDynamic("conversionPings")(conversionPings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invideoPromotion != null) __obj.updateDynamic("invideoPromotion")(invideoPromotion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (topicDetails != null) __obj.updateDynamic("topicDetails")(topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

