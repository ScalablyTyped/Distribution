package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSnippet extends js.Object {
  var country: js.UndefOr[String] = js.native
  var customUrl: js.UndefOr[String] = js.native
  var defaultLanguage: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var localized: js.UndefOr[ChannelLocalization] = js.native
  var publishedAt: js.UndefOr[String] = js.native
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.native
  var title: js.UndefOr[String] = js.native
}

object ChannelSnippet {
  @scala.inline
  def apply(): ChannelSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSnippet]
  }
  @scala.inline
  implicit class ChannelSnippetOps[Self <: ChannelSnippet] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCustomUrl(value: String): Self = this.set("customUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomUrl: Self = this.set("customUrl", js.undefined)
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLocalized(value: ChannelLocalization): Self = this.set("localized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalized: Self = this.set("localized", js.undefined)
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    @scala.inline
    def setThumbnails(value: ThumbnailDetails): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

