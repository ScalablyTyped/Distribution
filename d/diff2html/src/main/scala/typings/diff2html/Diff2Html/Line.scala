package typings.diff2html.Diff2Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends js.Object {
  var content: String = js.native
  var newNumber: Double = js.native
  var oldNumber: Double = js.native
  var `type`: String = js.native
}

object Line {
  @scala.inline
  def apply(content: String, newNumber: Double, oldNumber: Double, `type`: String): Line = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], newNumber = newNumber.asInstanceOf[js.Any], oldNumber = oldNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewNumber(value: Double): Self = this.set("newNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldNumber(value: Double): Self = this.set("oldNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

