package typings.fastCsvParse.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowValidationResult[R /* <: Row[_] */] extends js.Object {
  var isValid: Boolean
  var reason: js.UndefOr[String] = js.undefined
  var row: R | Null
}

object RowValidationResult {
  @scala.inline
  def apply[/* <: typings.fastCsvParse.typesMod.Row[_] */ R](isValid: Boolean, reason: String = null, row: R = null): RowValidationResult[R] = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowValidationResult[R]]
  }
}

