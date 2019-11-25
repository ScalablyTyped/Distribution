package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionSnippet extends js.Object {
  /** The ID that YouTube uses to uniquely identify the channel that published the channel section. */
  var channelId: js.UndefOr[String] = js.undefined
  /** The language of the channel section's default title and description. */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  /** Localized title, read-only. */
  var localized: js.UndefOr[ChannelSectionLocalization] = js.undefined
  /** The position of the channel section in the channel. */
  var position: js.UndefOr[Double] = js.undefined
  /** The style of the channel section. */
  var style: js.UndefOr[String] = js.undefined
  /** The channel section's title for multiple_playlists and multiple_channels. */
  var title: js.UndefOr[String] = js.undefined
  /** The type of the channel section. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ChannelSectionSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    defaultLanguage: String = null,
    localized: ChannelSectionLocalization = null,
    position: Int | Double = null,
    style: String = null,
    title: String = null,
    `type`: String = null
  ): ChannelSectionSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSectionSnippet]
  }
}

