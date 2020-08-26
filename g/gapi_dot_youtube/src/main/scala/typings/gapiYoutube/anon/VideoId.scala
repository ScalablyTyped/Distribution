package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoId extends js.Object {
  /**
    * The videoId parameter specifies a YouTube video ID for which the custom video thumbnail is being provided.
    */
  var videoId: String = js.native
}

object VideoId {
  @scala.inline
  def apply(videoId: String): VideoId = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoId]
  }
  @scala.inline
  implicit class VideoIdOps[Self <: VideoId] (val x: Self) extends AnyVal {
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
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
  }
  
}

