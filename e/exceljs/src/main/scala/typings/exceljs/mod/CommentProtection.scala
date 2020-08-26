package typings.exceljs.mod

import typings.exceljs.exceljsStrings.False
import typings.exceljs.exceljsStrings.True
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentProtection extends js.Object {
  var lockText: True | False = js.native
  var locked: True | False = js.native
}

object CommentProtection {
  @scala.inline
  def apply(lockText: True | False, locked: True | False): CommentProtection = {
    val __obj = js.Dynamic.literal(lockText = lockText.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentProtection]
  }
  @scala.inline
  implicit class CommentProtectionOps[Self <: CommentProtection] (val x: Self) extends AnyVal {
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
    def setLocked(value: True | False): Self = this.set("locked", value.asInstanceOf[js.Any])
  }
  
}

