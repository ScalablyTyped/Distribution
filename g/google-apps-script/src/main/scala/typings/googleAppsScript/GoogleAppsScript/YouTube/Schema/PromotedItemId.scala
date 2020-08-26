package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromotedItemId extends js.Object {
  var recentlyUploadedBy: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
  var websiteUrl: js.UndefOr[String] = js.native
}

object PromotedItemId {
  @scala.inline
  def apply(): PromotedItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromotedItemId]
  }
  @scala.inline
  implicit class PromotedItemIdOps[Self <: PromotedItemId] (val x: Self) extends AnyVal {
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
    def setRecentlyUploadedBy(value: String): Self = this.set("recentlyUploadedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecentlyUploadedBy: Self = this.set("recentlyUploadedBy", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}

