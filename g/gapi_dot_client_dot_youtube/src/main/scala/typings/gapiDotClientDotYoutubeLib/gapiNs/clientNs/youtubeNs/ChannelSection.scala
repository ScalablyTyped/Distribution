package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChannelSection extends js.Object {
  /** The contentDetails object contains details about the channel section content, such as a list of playlists or channels featured in the section. */
  var contentDetails: js.UndefOr[ChannelSectionContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the channel section. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channelSection". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Localizations for different languages */
  var localizations: js.UndefOr[stdLib.Record[java.lang.String, ChannelSectionLocalization]] = js.undefined
  /** The snippet object contains basic details about the channel section, such as its type, style and title. */
  var snippet: js.UndefOr[ChannelSectionSnippet] = js.undefined
  /** The targeting object contains basic targeting settings about the channel section. */
  var targeting: js.UndefOr[ChannelSectionTargeting] = js.undefined
}

