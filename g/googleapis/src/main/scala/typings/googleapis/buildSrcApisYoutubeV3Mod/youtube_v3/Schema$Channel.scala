package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A channel resource contains information about a YouTube channel.
  */
@js.native
trait Schema$Channel extends js.Object {
  /**
    * The auditionDetails object encapsulates channel data that is relevant for
    * YouTube Partners during the audition process.
    */
  var auditDetails: js.UndefOr[Schema$ChannelAuditDetails] = js.native
  /**
    * The brandingSettings object encapsulates information about the branding
    * of the channel.
    */
  var brandingSettings: js.UndefOr[Schema$ChannelBrandingSettings] = js.native
  /**
    * The contentDetails object encapsulates information about the
    * channel&#39;s content.
    */
  var contentDetails: js.UndefOr[Schema$ChannelContentDetails] = js.native
  /**
    * The contentOwnerDetails object encapsulates channel data that is relevant
    * for YouTube Partners linked with the channel.
    */
  var contentOwnerDetails: js.UndefOr[Schema$ChannelContentOwnerDetails] = js.native
  /**
    * The conversionPings object encapsulates information about conversion
    * pings that need to be respected by the channel.
    */
  var conversionPings: js.UndefOr[Schema$ChannelConversionPings] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The invideoPromotion object encapsulates information about promotion
    * campaign associated with the channel.
    */
  var invideoPromotion: js.UndefOr[Schema$InvideoPromotion] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channel&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[Schema$ChannelLocalization]] = js.native
  /**
    * The snippet object contains basic details about the channel, such as its
    * title, description, and thumbnail images.
    */
  var snippet: js.UndefOr[Schema$ChannelSnippet] = js.native
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: js.UndefOr[Schema$ChannelStatistics] = js.native
  /**
    * The status object encapsulates information about the privacy status of
    * the channel.
    */
  var status: js.UndefOr[Schema$ChannelStatus] = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics
    * associated with the channel.
    */
  var topicDetails: js.UndefOr[Schema$ChannelTopicDetails] = js.native
}

object Schema$Channel {
  @scala.inline
  def apply(
    auditDetails: Schema$ChannelAuditDetails = null,
    brandingSettings: Schema$ChannelBrandingSettings = null,
    contentDetails: Schema$ChannelContentDetails = null,
    contentOwnerDetails: Schema$ChannelContentOwnerDetails = null,
    conversionPings: Schema$ChannelConversionPings = null,
    etag: String = null,
    id: String = null,
    invideoPromotion: Schema$InvideoPromotion = null,
    kind: String = null,
    localizations: StringDictionary[Schema$ChannelLocalization] = null,
    snippet: Schema$ChannelSnippet = null,
    statistics: Schema$ChannelStatistics = null,
    status: Schema$ChannelStatus = null,
    topicDetails: Schema$ChannelTopicDetails = null
  ): Schema$Channel = {
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
    __obj.asInstanceOf[Schema$Channel]
  }
}

