package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.NumbersignDIVSlash0Exclamationmark
import typings.exceljs.exceljsStrings.NumbersignNAMEQuestionmark
import typings.exceljs.exceljsStrings.NumbersignNSlashA
import typings.exceljs.exceljsStrings.NumbersignNULLExclamationmark
import typings.exceljs.exceljsStrings.NumbersignNUMExclamationmark
import typings.exceljs.exceljsStrings.NumbersignREFExclamationmark
import typings.exceljs.exceljsStrings.NumbersignVALUEExclamationmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellErrorValue extends _CellValue {
  var error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
}

object CellErrorValue {
  @scala.inline
  def apply(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellErrorValue]
  }
}

