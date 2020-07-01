package typings.exceljs.mod

import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.custom
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentMargins extends js.Object {
  var inset: js.Array[Number]
  var insetmode: auto | custom
}

object CommentMargins {
  @scala.inline
  def apply(inset: js.Array[Number], insetmode: auto | custom): CommentMargins = {
    val __obj = js.Dynamic.literal(inset = inset.asInstanceOf[js.Any], insetmode = insetmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentMargins]
  }
}

