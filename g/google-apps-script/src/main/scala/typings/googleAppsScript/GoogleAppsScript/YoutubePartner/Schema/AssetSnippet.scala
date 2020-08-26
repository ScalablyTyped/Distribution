package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetSnippet extends js.Object {
  var customId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isrc: js.UndefOr[String] = js.native
  var iswc: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var timeCreated: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AssetSnippet {
  @scala.inline
  def apply(): AssetSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetSnippet]
  }
  @scala.inline
  implicit class AssetSnippetOps[Self <: AssetSnippet] (val x: Self) extends AnyVal {
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
    def setCustomId(value: String): Self = this.set("customId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomId: Self = this.set("customId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsrc(value: String): Self = this.set("isrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsrc: Self = this.set("isrc", js.undefined)
    @scala.inline
    def setIswc(value: String): Self = this.set("iswc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIswc: Self = this.set("iswc", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
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

