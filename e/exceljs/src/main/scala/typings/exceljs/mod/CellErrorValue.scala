package typings.exceljs.mod

import typings.exceljs.exceljsStrings.NumbersignDIVSlash0Exclamationmark
import typings.exceljs.exceljsStrings.NumbersignNAMEQuestionmark
import typings.exceljs.exceljsStrings.NumbersignNSlashA
import typings.exceljs.exceljsStrings.NumbersignNULLExclamationmark
import typings.exceljs.exceljsStrings.NumbersignNUMExclamationmark
import typings.exceljs.exceljsStrings.NumbersignREFExclamationmark
import typings.exceljs.exceljsStrings.NumbersignVALUEExclamationmark
import org.scalablytyped.runtime.StObject
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
  implicit class CellErrorValueMutableBuilder[Self <: CellErrorValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(
      value: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
    ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
