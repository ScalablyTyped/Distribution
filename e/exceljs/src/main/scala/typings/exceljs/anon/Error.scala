package typings.exceljs.anon

import typings.exceljs.mod.CellErrorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: CellErrorValue
}

object Error {
  @scala.inline
  def apply(error: CellErrorValue): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

