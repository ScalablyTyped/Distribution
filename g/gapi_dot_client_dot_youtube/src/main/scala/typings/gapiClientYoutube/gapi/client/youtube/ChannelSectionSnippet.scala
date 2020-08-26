package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSectionSnippet extends js.Object {
  /** The ID that YouTube uses to uniquely identify the channel that published the channel section. */
  var channelId: js.UndefOr[String] = js.native
  /** The language of the channel section's default title and description. */
  var defaultLanguage: js.UndefOr[String] = js.native
  /** Localized title, read-only. */
  var localized: js.UndefOr[ChannelSectionLocalization] = js.native
  /** The position of the channel section in the channel. */
  var position: js.UndefOr[Double] = js.native
  /** The style of the channel section. */
  var style: js.UndefOr[String] = js.native
  /** The channel section's title for multiple_playlists and multiple_channels. */
  var title: js.UndefOr[String] = js.native
  /** The type of the channel section. */
  var `type`: js.UndefOr[String] = js.native
}

object ChannelSectionSnippet {
  @scala.inline
  def apply(): ChannelSectionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSectionSnippet]
  }
  @scala.inline
  implicit class ChannelSectionSnippetOps[Self <: ChannelSectionSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    @scala.inline
    def setLocalized(value: ChannelSectionLocalization): Self = this.set("localized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalized: Self = this.set("localized", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

