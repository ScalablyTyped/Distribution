package typings.figma.mod.global

import typings.figma.figmaStrings.X
import typings.figma.figmaStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guide extends js.Object {
  val axis: X | Y = js.native
  val offset: Double = js.native
}

object Guide {
  @scala.inline
  def apply(axis: X | Y, offset: Double): Guide = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guide]
  }
  @scala.inline
  implicit class GuideOps[Self <: Guide] (val x: Self) extends AnyVal {
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
    def setAxis(value: X | Y): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}

