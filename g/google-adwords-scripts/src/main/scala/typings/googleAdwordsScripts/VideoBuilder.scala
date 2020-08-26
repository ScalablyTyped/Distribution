package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoBuilder[Media] extends AdWordsBuilder[Media] {
  def withYouTubeVideoId(youTubeVideoId: String): VideoBuilder[Media] = js.native
}

object VideoBuilder {
  @scala.inline
  def apply[Media](build: () => AdWordsOperation[Media], withYouTubeVideoId: String => VideoBuilder[Media]): VideoBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withYouTubeVideoId = js.Any.fromFunction1(withYouTubeVideoId))
    __obj.asInstanceOf[VideoBuilder[Media]]
  }
  @scala.inline
  implicit class VideoBuilderOps[Self <: VideoBuilder[_], Media] (val x: Self with VideoBuilder[Media]) extends AnyVal {
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
    def setWithYouTubeVideoId(value: String => VideoBuilder[Media]): Self = this.set("withYouTubeVideoId", js.Any.fromFunction1(value))
  }
  
}

