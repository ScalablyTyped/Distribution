package typings.googleDriveRealtimeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SHIFTAFTERDELETE extends js.Object {
  var SHIFT_AFTER_DELETE: String
  var SHIFT_BEFORE_DELETE: String
  var SHIFT_TO_INVALID: String
}

object SHIFTAFTERDELETE {
  @scala.inline
  def apply(SHIFT_AFTER_DELETE: String, SHIFT_BEFORE_DELETE: String, SHIFT_TO_INVALID: String): SHIFTAFTERDELETE = {
    val __obj = js.Dynamic.literal(SHIFT_AFTER_DELETE = SHIFT_AFTER_DELETE.asInstanceOf[js.Any], SHIFT_BEFORE_DELETE = SHIFT_BEFORE_DELETE.asInstanceOf[js.Any], SHIFT_TO_INVALID = SHIFT_TO_INVALID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SHIFTAFTERDELETE]
  }
}

