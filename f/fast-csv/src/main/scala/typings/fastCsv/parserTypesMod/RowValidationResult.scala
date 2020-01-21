package typings.fastCsv.parserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowValidationResult extends js.Object {
  var isValid: Boolean
  var reason: js.UndefOr[String] = js.undefined
  var row: Row | Null
}

object RowValidationResult {
  @scala.inline
  def apply(isValid: Boolean, reason: String = null, row: Row = null): RowValidationResult = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowValidationResult]
  }
}

