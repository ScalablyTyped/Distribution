package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellError extends js.Object {
  var message: String
  var `type`: CellErrorType
}

object CellError {
  @scala.inline
  def apply(message: String, `type`: CellErrorType): CellError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellError]
  }
}

