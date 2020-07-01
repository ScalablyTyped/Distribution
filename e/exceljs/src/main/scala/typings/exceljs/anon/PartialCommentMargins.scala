package typings.exceljs.anon

import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.custom
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CommentMargins> */
trait PartialCommentMargins extends js.Object {
  var inset: js.UndefOr[js.Array[Number]] = js.undefined
  var insetmode: js.UndefOr[auto | custom] = js.undefined
}

object PartialCommentMargins {
  @scala.inline
  def apply(inset: js.Array[Number] = null, insetmode: auto | custom = null): PartialCommentMargins = {
    val __obj = js.Dynamic.literal()
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (insetmode != null) __obj.updateDynamic("insetmode")(insetmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCommentMargins]
  }
}

