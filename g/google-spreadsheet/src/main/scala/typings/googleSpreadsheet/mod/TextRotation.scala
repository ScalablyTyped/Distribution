package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRotation extends js.Object {
  var angle: Double = js.native
  var vertical: Boolean = js.native
}

object TextRotation {
  @scala.inline
  def apply(angle: Double, vertical: Boolean): TextRotation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRotation]
  }
  @scala.inline
  implicit class TextRotationOps[Self <: TextRotation] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
  
}

