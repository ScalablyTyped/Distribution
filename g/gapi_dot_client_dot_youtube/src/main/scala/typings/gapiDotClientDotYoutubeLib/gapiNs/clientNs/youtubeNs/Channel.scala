package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

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
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the channel. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The invideoPromotion object encapsulates information about promotion campaign associated with the channel. */
  var invideoPromotion: js.UndefOr[InvideoPromotion] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channel". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Localizations for different languages */
  var localizations: js.UndefOr[stdLib.Record[java.lang.String, ChannelLocalization]] = js.undefined
  /** The snippet object contains basic details about the channel, such as its title, description, and thumbnail images. */
  var snippet: js.UndefOr[ChannelSnippet] = js.undefined
  /** The statistics object encapsulates statistics for the channel. */
  var statistics: js.UndefOr[ChannelStatistics] = js.undefined
  /** The status object encapsulates information about the privacy status of the channel. */
  var status: js.UndefOr[ChannelStatus] = js.undefined
  /** The topicDetails object encapsulates information about Freebase topics associated with the channel. */
  var topicDetails: js.UndefOr[ChannelTopicDetails] = js.undefined
}

