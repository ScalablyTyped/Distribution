package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YoutubeActorInfo extends js.Object {
  var youtubeActorInfo: js.UndefOr[ChannelId] = js.native
}

object YoutubeActorInfo {
  @scala.inline
  def apply(): YoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YoutubeActorInfo]
  }
  @scala.inline
  implicit class YoutubeActorInfoOps[Self <: YoutubeActorInfo] (val x: Self) extends AnyVal {
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
    def setYoutubeActorInfo(value: ChannelId): Self = this.set("youtubeActorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoutubeActorInfo: Self = this.set("youtubeActorInfo", js.undefined)
  }
  
}

