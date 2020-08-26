package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shadow extends js.Object {
  // properties
  var blur: Double = js.native
  var color: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
}

object Shadow {
  @scala.inline
  def apply(blur: Double, color: String, offsetX: Double, offsetY: Double): Shadow = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
  @scala.inline
  implicit class ShadowOps[Self <: Shadow] (val x: Self) extends AnyVal {
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
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
  }
  
}

