package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protection extends js.Object {
  var locked: Boolean = js.native
}

object Protection {
  @scala.inline
  def apply(locked: Boolean): Protection = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protection]
  }
  @scala.inline
  implicit class ProtectionOps[Self <: Protection] (val x: Self) extends AnyVal {
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
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
  }
  
}

