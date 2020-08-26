package typings.googleDriveRealtimeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SHIFTAFTERDELETE extends js.Object {
  var SHIFT_AFTER_DELETE: String = js.native
  var SHIFT_BEFORE_DELETE: String = js.native
  var SHIFT_TO_INVALID: String = js.native
}

object SHIFTAFTERDELETE {
  @scala.inline
  def apply(SHIFT_AFTER_DELETE: String, SHIFT_BEFORE_DELETE: String, SHIFT_TO_INVALID: String): SHIFTAFTERDELETE = {
    val __obj = js.Dynamic.literal(SHIFT_AFTER_DELETE = SHIFT_AFTER_DELETE.asInstanceOf[js.Any], SHIFT_BEFORE_DELETE = SHIFT_BEFORE_DELETE.asInstanceOf[js.Any], SHIFT_TO_INVALID = SHIFT_TO_INVALID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SHIFTAFTERDELETE]
  }
  @scala.inline
  implicit class SHIFTAFTERDELETEOps[Self <: SHIFTAFTERDELETE] (val x: Self) extends AnyVal {
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
    def setSHIFT_AFTER_DELETE(value: String): Self = this.set("SHIFT_AFTER_DELETE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHIFT_BEFORE_DELETE(value: String): Self = this.set("SHIFT_BEFORE_DELETE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHIFT_TO_INVALID(value: String): Self = this.set("SHIFT_TO_INVALID", value.asInstanceOf[js.Any])
  }
  
}

