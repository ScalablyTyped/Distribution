package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceId extends js.Object {
  var channelId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var playlistId: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object ResourceId {
  @scala.inline
  def apply(): ResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceId]
  }
  @scala.inline
  implicit class ResourceIdOps[Self <: ResourceId] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPlaylistId(value: String): Self = this.set("playlistId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaylistId: Self = this.set("playlistId", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

