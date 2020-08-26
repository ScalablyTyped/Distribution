package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistItemContentDetails extends js.Object {
  var endAt: js.UndefOr[String] = js.native
  var note: js.UndefOr[String] = js.native
  var startAt: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
  var videoPublishedAt: js.UndefOr[String] = js.native
}

object PlaylistItemContentDetails {
  @scala.inline
  def apply(): PlaylistItemContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistItemContentDetails]
  }
  @scala.inline
  implicit class PlaylistItemContentDetailsOps[Self <: PlaylistItemContentDetails] (val x: Self) extends AnyVal {
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
    def setEndAt(value: String): Self = this.set("endAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAt: Self = this.set("endAt", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setStartAt(value: String): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    @scala.inline
    def setVideoPublishedAt(value: String): Self = this.set("videoPublishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoPublishedAt: Self = this.set("videoPublishedAt", js.undefined)
  }
  
}

