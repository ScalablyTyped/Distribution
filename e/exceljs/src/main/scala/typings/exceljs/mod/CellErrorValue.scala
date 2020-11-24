package typings.exceljs.mod

import typings.exceljs.exceljsStrings.NumbersignDIVSlash0Exclamationmark
import typings.exceljs.exceljsStrings.NumbersignNAMEQuestionmark
import typings.exceljs.exceljsStrings.NumbersignNSlashA
import typings.exceljs.exceljsStrings.NumbersignNULLExclamationmark
import typings.exceljs.exceljsStrings.NumbersignNUMExclamationmark
import typings.exceljs.exceljsStrings.NumbersignREFExclamationmark
import typings.exceljs.exceljsStrings.NumbersignVALUEExclamationmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellErrorValue extends _CellValue {
  
  var error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark = js.native
}
object CellErrorValue {
  
  @scala.inline
  def apply(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellErrorValue]
  }
  
  @scala.inline
  implicit class CellErrorValueOps[Self <: CellErrorValue] (val x: Self) extends AnyVal {
    
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
    def setError(
      value: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
    ): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
