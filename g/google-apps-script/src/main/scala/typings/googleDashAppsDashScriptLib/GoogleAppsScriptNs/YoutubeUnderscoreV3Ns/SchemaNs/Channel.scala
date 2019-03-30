package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var auditDetails: js.UndefOr[ChannelAuditDetails] = js.undefined
  var brandingSettings: js.UndefOr[ChannelBrandingSettings] = js.undefined
  var contentDetails: js.UndefOr[ChannelContentDetails] = js.undefined
  var contentOwnerDetails: js.UndefOr[ChannelContentOwnerDetails] = js.undefined
  var conversionPings: js.UndefOr[ChannelConversionPings] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var invideoPromotion: js.UndefOr[InvideoPromotion] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
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
    etag: java.lang.String = null,
    id: java.lang.String = null,
    invideoPromotion: InvideoPromotion = null,
    kind: java.lang.String = null,
    localizations: js.Object = null,
    snippet: ChannelSnippet = null,
    statistics: ChannelStatistics = null,
    status: ChannelStatus = null,
    topicDetails: ChannelTopicDetails = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (auditDetails != null) __obj.updateDynamic("auditDetails")(auditDetails)
    if (brandingSettings != null) __obj.updateDynamic("brandingSettings")(brandingSettings)
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (contentOwnerDetails != null) __obj.updateDynamic("contentOwnerDetails")(contentOwnerDetails)
    if (conversionPings != null) __obj.updateDynamic("conversionPings")(conversionPings)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (invideoPromotion != null) __obj.updateDynamic("invideoPromotion")(invideoPromotion)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localizations != null) __obj.updateDynamic("localizations")(localizations)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    if (topicDetails != null) __obj.updateDynamic("topicDetails")(topicDetails)
    __obj.asInstanceOf[Channel]
  }
}

