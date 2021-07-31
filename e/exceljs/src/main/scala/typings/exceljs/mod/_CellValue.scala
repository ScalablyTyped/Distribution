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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _CellValue extends StObject
object _CellValue {
  
  @scala.inline
  def CellErrorValue(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): typings.exceljs.mod.CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.CellErrorValue]
  }
  
  @scala.inline
  def CellFormulaValue(date1904: Boolean, formula: String): typings.exceljs.mod.CellFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.CellFormulaValue]
  }
  
  @scala.inline
  def CellHyperlinkValue(hyperlink: String, text: String): typings.exceljs.mod.CellHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.CellHyperlinkValue]
  }
  
  @scala.inline
  def CellRichTextValue(richText: js.Array[RichText]): typings.exceljs.mod.CellRichTextValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.CellRichTextValue]
  }
  
  @scala.inline
  def CellSharedFormulaValue(date1904: Boolean, sharedFormula: String): typings.exceljs.mod.CellSharedFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], sharedFormula = sharedFormula.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.exceljs.mod.CellSharedFormulaValue]
  }
}
