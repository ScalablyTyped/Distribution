package typings.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaGroup extends js.Object {
  var content: js.Array[MediaContent] = js.native
}

object MediaGroup {
  @scala.inline
  def apply(content: js.Array[MediaContent]): MediaGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaGroup]
  }
  @scala.inline
  implicit class MediaGroupOps[Self <: MediaGroup] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: MediaContent*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[MediaContent]): Self = this.set("content", value.asInstanceOf[js.Any])
  }
  
}

