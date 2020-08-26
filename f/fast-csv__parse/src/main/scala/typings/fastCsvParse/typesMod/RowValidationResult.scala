package typings.fastCsvParse.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowValidationResult[R /* <: Row[_] */] extends js.Object {
  var isValid: Boolean = js.native
  var reason: js.UndefOr[String] = js.native
  var row: R | Null = js.native
}

object RowValidationResult {
  @scala.inline
  def apply[/* <: typings.fastCsvParse.typesMod.Row[_] */ R](isValid: Boolean): RowValidationResult[R] = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowValidationResult[R]]
  }
  @scala.inline
  implicit class RowValidationResultOps[Self <: RowValidationResult[_], /* <: typings.fastCsvParse.typesMod.Row[_] */ R] (val x: Self with RowValidationResult[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRow(value: R): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowNull: Self = this.set("row", null)
  }
  
}

