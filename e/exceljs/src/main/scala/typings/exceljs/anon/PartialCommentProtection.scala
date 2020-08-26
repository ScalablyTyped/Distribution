package typings.exceljs.anon

import typings.exceljs.exceljsStrings.False
import typings.exceljs.exceljsStrings.True
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CommentProtection> */
@js.native
trait PartialCommentProtection extends js.Object {
  var lockText: js.UndefOr[True | False] = js.native
  var locked: js.UndefOr[True | False] = js.native
}

object PartialCommentProtection {
  @scala.inline
  def apply(): PartialCommentProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommentProtection]
  }
  @scala.inline
  implicit class PartialCommentProtectionOps[Self <: PartialCommentProtection] (val x: Self) extends AnyVal {
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
    def setLockText(value: True | False): Self = this.set("lockText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockText: Self = this.set("lockText", js.undefined)
    @scala.inline
    def setLocked(value: True | False): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
  }
  
}

