package typings.exceljs.mod

import typings.exceljs.exceljsStrings.False
import typings.exceljs.exceljsStrings.True
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentProtection extends js.Object {
  var lockText: True | False
  var locked: True | False
}

object CommentProtection {
  @scala.inline
  def apply(lockText: True | False, locked: True | False): CommentProtection = {
    val __obj = js.Dynamic.literal(lockText = lockText.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentProtection]
  }
}

