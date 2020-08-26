package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectList extends js.Object {
  var rectList: js.Array[Bottom] = js.native
  var textList: js.Array[String] = js.native
}

object RectList {
  @scala.inline
  def apply(rectList: js.Array[Bottom], textList: js.Array[String]): RectList = {
    val __obj = js.Dynamic.literal(rectList = rectList.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectList]
  }
  @scala.inline
  implicit class RectListOps[Self <: RectList] (val x: Self) extends AnyVal {
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
    def setRectListVarargs(value: Bottom*): Self = this.set("rectList", js.Array(value :_*))
    @scala.inline
    def setRectList(value: js.Array[Bottom]): Self = this.set("rectList", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextListVarargs(value: String*): Self = this.set("textList", js.Array(value :_*))
    @scala.inline
    def setTextList(value: js.Array[String]): Self = this.set("textList", value.asInstanceOf[js.Any])
  }
  
}

