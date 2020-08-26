package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CellEndEdit event.
  */
@js.native
trait ASPxClientSpreadsheetCellEndEditEventArgs extends ASPxClientSpreadsheetCellBeginEditEventArgs {
  /**
    * Gets or sets the text stored within the active cell's editor.
    */
  var editorText: String = js.native
}

object ASPxClientSpreadsheetCellEndEditEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    columnIndex: Double,
    editorText: String,
    formula: String,
    rowIndex: Double,
    sheetName: String,
    value: String
  ): ASPxClientSpreadsheetCellEndEditEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], editorText = editorText.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCellEndEditEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSpreadsheetCellEndEditEventArgsOps[Self <: ASPxClientSpreadsheetCellEndEditEventArgs] (val x: Self) extends AnyVal {
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
    def setEditorText(value: String): Self = this.set("editorText", value.asInstanceOf[js.Any])
  }
  
}

