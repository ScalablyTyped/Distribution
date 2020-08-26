package typings.figma.mod.global

import typings.figma.figmaStrings.EASE_IN
import typings.figma.figmaStrings.EASE_IN_AND_OUT
import typings.figma.figmaStrings.EASE_OUT
import typings.figma.figmaStrings.LINEAR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easing extends js.Object {
  val `type`: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR = js.native
}

object Easing {
  @scala.inline
  def apply(`type`: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR): Easing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  @scala.inline
  implicit class EasingOps[Self <: Easing] (val x: Self) extends AnyVal {
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
    def setType(value: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

