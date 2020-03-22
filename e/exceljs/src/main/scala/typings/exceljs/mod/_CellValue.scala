package typings.exceljs.mod

import typings.exceljs.AnonError
import typings.exceljs.exceljsStrings.NumbersignDIVSlash0Exclamationmark
import typings.exceljs.exceljsStrings.NumbersignNAMEQuestionmark
import typings.exceljs.exceljsStrings.NumbersignNSlashA
import typings.exceljs.exceljsStrings.NumbersignNULLExclamationmark
import typings.exceljs.exceljsStrings.NumbersignNUMExclamationmark
import typings.exceljs.exceljsStrings.NumbersignREFExclamationmark
import typings.exceljs.exceljsStrings.NumbersignVALUEExclamationmark
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CellValue extends js.Object

object _CellValue {
  @scala.inline
  def CellRichTextValue(richText: js.Array[RichText]): _CellValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CellValue]
  }
  @scala.inline
  def CellErrorValue(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): _CellValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CellValue]
  }
  @scala.inline
  def CellFormulaValue(date1904: Boolean, formula: String, result: Double | String | Date | AnonError = null): _CellValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CellValue]
  }
  @scala.inline
  def CellHyperlinkValue(hyperlink: String, text: String): _CellValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CellValue]
  }
  @scala.inline
  def CellSharedFormulaValue(
    date1904: Boolean,
    sharedFormula: String,
    formula: String = null,
    result: Double | String | Date | AnonError = null
  ): _CellValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], sharedFormula = sharedFormula.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CellValue]
  }
}

