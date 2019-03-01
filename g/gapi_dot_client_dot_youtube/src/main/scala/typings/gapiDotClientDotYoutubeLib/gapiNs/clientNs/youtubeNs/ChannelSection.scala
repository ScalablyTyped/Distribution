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

object ChannelSection {
  @scala.inline
  def apply(
    contentDetails: ChannelSectionContentDetails = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    localizations: stdLib.Record[java.lang.String, ChannelSectionLocalization] = null,
    snippet: ChannelSectionSnippet = null,
    targeting: ChannelSectionTargeting = null
  ): ChannelSection = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localizations != null) __obj.updateDynamic("localizations")(localizations)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (targeting != null) __obj.updateDynamic("targeting")(targeting)
    __obj.asInstanceOf[ChannelSection]
  }
}

