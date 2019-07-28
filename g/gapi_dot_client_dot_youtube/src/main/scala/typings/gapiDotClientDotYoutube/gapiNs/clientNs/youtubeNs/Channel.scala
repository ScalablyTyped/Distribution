package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /** The auditionDetails object encapsulates channel data that is relevant for YouTube Partners during the audition process. */
  var auditDetails: js.UndefOr[ChannelAuditDetails] = js.undefined
  /** The brandingSettings object encapsulates information about the branding of the channel. */
  var brandingSettings: js.UndefOr[ChannelBrandingSettings] = js.undefined
  /** The contentDetails object encapsulates information about the channel's content. */
  var contentDetails: js.UndefOr[ChannelContentDetails] = js.undefined
  /** The contentOwnerDetails object encapsulates channel data that is relevant for YouTube Partners linked with the channel. */
  var contentOwnerDetails: js.UndefOr[ChannelContentOwnerDetails] = js.undefined
  /** The conversionPings object encapsulates information about conversion pings that need to be respected by the channel. */
  var conversionPings: js.UndefOr[ChannelConversionPings] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the channel. */
  var id: js.UndefOr[String] = js.undefined
  /** The invideoPromotion object encapsulates information about promotion campaign associated with the channel. */
  var invideoPromotion: js.UndefOr[InvideoPromotion] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channel". */
  var kind: js.UndefOr[String] = js.undefined
  /** Localizations for different languages */
  var localizations: js.UndefOr[Record[String, ChannelLocalization]] = js.undefined
  /** The snippet object contains basic details about the channel, such as its title, description, and thumbnail images. */
  var snippet: js.UndefOr[ChannelSnippet] = js.undefined
  /** The statistics object encapsulates statistics for the channel. */
  var statistics: js.UndefOr[ChannelStatistics] = js.undefined
  /** The status object encapsulates information about the privacy status of the channel. */
  var status: js.UndefOr[ChannelStatus] = js.undefined
  /** The topicDetails object encapsulates information about Freebase topics associated with the channel. */
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
    localizations: Record[String, ChannelLocalization] = null,
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

