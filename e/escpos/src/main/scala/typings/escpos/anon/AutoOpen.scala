package typings.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoOpen extends js.Object {
  var autoOpen: Boolean = js.native
  var baudRate: Double = js.native
}

object AutoOpen {
  @scala.inline
  def apply(autoOpen: Boolean, baudRate: Double): AutoOpen = {
    val __obj = js.Dynamic.literal(autoOpen = autoOpen.asInstanceOf[js.Any], baudRate = baudRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoOpen]
  }
  @scala.inline
  implicit class AutoOpenOps[Self <: AutoOpen] (val x: Self) extends AnyVal {
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
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaudRate(value: Double): Self = this.set("baudRate", value.asInstanceOf[js.Any])
  }
  
}

