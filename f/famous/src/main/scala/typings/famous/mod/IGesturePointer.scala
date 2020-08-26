package typings.famous.mod

import typings.famous.mathMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGesturePointer extends js.Object {
  var delta: Vec2 = js.native
  var position: Vec2 = js.native
  var velocity: Vec2 = js.native
}

object IGesturePointer {
  @scala.inline
  def apply(delta: Vec2, position: Vec2, velocity: Vec2): IGesturePointer = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGesturePointer]
  }
  @scala.inline
  implicit class IGesturePointerOps[Self <: IGesturePointer] (val x: Self) extends AnyVal {
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
    def setDelta(value: Vec2): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Vec2): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocity(value: Vec2): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
  
}

