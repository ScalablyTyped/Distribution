package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Protection> */
@js.native
trait PartialProtection extends js.Object {
  var locked: js.UndefOr[Boolean] = js.native
}

object PartialProtection {
  @scala.inline
  def apply(): PartialProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProtection]
  }
  @scala.inline
  implicit class PartialProtectionOps[Self <: PartialProtection] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
  }
  
}

