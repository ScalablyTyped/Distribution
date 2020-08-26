package typings.figma.anon

import typings.figma.figmaStrings.AFTER_TIMEOUT
import typings.figma.mod.global.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeout extends Trigger {
  val timeout: Double = js.native
  val `type`: AFTER_TIMEOUT = js.native
}

object Timeout {
  @scala.inline
  def apply(timeout: Double, `type`: AFTER_TIMEOUT): Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
  @scala.inline
  implicit class TimeoutOps[Self <: Timeout] (val x: Self) extends AnyVal {
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
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AFTER_TIMEOUT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

