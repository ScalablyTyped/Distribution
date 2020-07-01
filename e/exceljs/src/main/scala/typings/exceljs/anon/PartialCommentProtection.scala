package typings.exceljs.anon

import typings.exceljs.exceljsStrings.False
import typings.exceljs.exceljsStrings.True
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CommentProtection> */
trait PartialCommentProtection extends js.Object {
  var lockText: js.UndefOr[True | False] = js.undefined
  var locked: js.UndefOr[True | False] = js.undefined
}

object PartialCommentProtection {
  @scala.inline
  def apply(lockText: True | False = null, locked: True | False = null): PartialCommentProtection = {
    val __obj = js.Dynamic.literal()
    if (lockText != null) __obj.updateDynamic("lockText")(lockText.asInstanceOf[js.Any])
    if (locked != null) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCommentProtection]
  }
}

