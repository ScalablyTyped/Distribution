package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CellEndEdit event.
  */
@JSGlobal("ASPxClientSpreadsheetCellEndEditEventArgs")
@js.native
class ASPxClientSpreadsheetCellEndEditEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientSpreadsheetCellEndEditEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetCellEndEditEventArgs object. For internal use only.
    * @param columnIndex Gets the active cell's column index.
    * @param rowIndex Gets the active cell's row index.
    * @param formula Gets the active cell's formula.
    * @param value Gets the active cell's current value.
    * @param sheetName Gets the current worksheet's name.
    * @param editorText Gets or sets the text stored within an active cell's editor.
    */
  def this(
    columnIndex: Double,
    rowIndex: Double,
    formula: String,
    value: String,
    sheetName: String,
    editorText: String
  ) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the active cell's column index.
    */
  /* CompleteClass */
  override var columnIndex: Double = js.native
  /**
    * Gets or sets the text stored within the active cell's editor.
    */
  /* CompleteClass */
  override var editorText: String = js.native
  /**
    * Gets the active cell's formula.
    */
  /* CompleteClass */
  override var formula: String = js.native
  /**
    * Gets the active cell's row index.
    */
  /* CompleteClass */
  override var rowIndex: Double = js.native
  /**
    * Gets the current worksheet's name.
    */
  /* CompleteClass */
  override var sheetName: String = js.native
  /**
    * Gets the active cell's current value.
    */
  /* CompleteClass */
  override var value: String = js.native
}

