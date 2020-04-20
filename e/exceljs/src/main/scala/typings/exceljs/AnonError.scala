package typings.exceljs

import typings.exceljs.mod.CellErrorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: CellErrorValue
}

object AnonError {
  @scala.inline
  def apply(error: CellErrorValue): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

