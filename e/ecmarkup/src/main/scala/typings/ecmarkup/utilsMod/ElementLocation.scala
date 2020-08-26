package typings.ecmarkup.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementLocation extends js.Object {
  var endTag: Location | Null = js.native
  var startTag: Location = js.native
}

object ElementLocation {
  @scala.inline
  def apply(startTag: Location): ElementLocation = {
    val __obj = js.Dynamic.literal(startTag = startTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementLocation]
  }
  @scala.inline
  implicit class ElementLocationOps[Self <: ElementLocation] (val x: Self) extends AnyVal {
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
    def setStartTag(value: Location): Self = this.set("startTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTag(value: Location): Self = this.set("endTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTagNull: Self = this.set("endTag", null)
  }
  
}

