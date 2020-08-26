package typings.figma.anon

import typings.figma.figmaStrings.MOUSE_DOWN
import typings.figma.figmaStrings.MOUSE_ENTER
import typings.figma.figmaStrings.MOUSE_LEAVE
import typings.figma.figmaStrings.MOUSE_UP
import typings.figma.mod.global.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay extends Trigger {
  val delay: Double = js.native
  val `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN = js.native
}

object Delay {
  @scala.inline
  def apply(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  @scala.inline
  implicit class DelayOps[Self <: Delay] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

