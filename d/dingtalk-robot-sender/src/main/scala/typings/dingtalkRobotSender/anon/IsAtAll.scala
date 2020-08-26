package typings.dingtalkRobotSender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsAtAll extends js.Object {
  var atMobiles: js.Array[String] = js.native
  var isAtAll: Boolean = js.native
  var text: String = js.native
  var title: String = js.native
}

object IsAtAll {
  @scala.inline
  def apply(atMobiles: js.Array[String], isAtAll: Boolean, text: String, title: String): IsAtAll = {
    val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAtAll]
  }
  @scala.inline
  implicit class IsAtAllOps[Self <: IsAtAll] (val x: Self) extends AnyVal {
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
    def setAtMobilesVarargs(value: String*): Self = this.set("atMobiles", js.Array(value :_*))
    @scala.inline
    def setAtMobiles(value: js.Array[String]): Self = this.set("atMobiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAtAll(value: Boolean): Self = this.set("isAtAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

