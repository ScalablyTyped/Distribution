package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSection extends js.Object {
  var contentDetails: js.UndefOr[ChannelSectionContentDetails] = js.native
  var etag: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var localizations: js.UndefOr[js.Object] = js.native
  var snippet: js.UndefOr[ChannelSectionSnippet] = js.native
  var targeting: js.UndefOr[ChannelSectionTargeting] = js.native
}

object ChannelSection {
  @scala.inline
  def apply(): ChannelSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSection]
  }
  @scala.inline
  implicit class ChannelSectionOps[Self <: ChannelSection] (val x: Self) extends AnyVal {
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
    def setContentDetails(value: ChannelSectionContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocalizations(value: js.Object): Self = this.set("localizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizations: Self = this.set("localizations", js.undefined)
    @scala.inline
    def setSnippet(value: ChannelSectionSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setTargeting(value: ChannelSectionTargeting): Self = this.set("targeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargeting: Self = this.set("targeting", js.undefined)
  }
  
}

