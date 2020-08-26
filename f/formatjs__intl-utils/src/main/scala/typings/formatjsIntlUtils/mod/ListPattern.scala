package typings.formatjsIntlUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPattern extends js.Object {
  var end: String = js.native
  var middle: String = js.native
  var pair: String = js.native
  var start: String = js.native
}

object ListPattern {
  @scala.inline
  def apply(end: String, middle: String, pair: String, start: String): ListPattern = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], pair = pair.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPattern]
  }
  @scala.inline
  implicit class ListPatternOps[Self <: ListPattern] (val x: Self) extends AnyVal {
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddle(value: String): Self = this.set("middle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPair(value: String): Self = this.set("pair", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

