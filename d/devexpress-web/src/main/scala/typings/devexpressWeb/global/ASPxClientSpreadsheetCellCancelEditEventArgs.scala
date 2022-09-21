package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.CellCancelEdit event.
  */
@JSGlobal("ASPxClientSpreadsheetCellCancelEditEventArgs")
@js.native
open class ASPxClientSpreadsheetCellCancelEditEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSpreadsheetCellCancelEditEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetCellCancelEditEventArgs class with specified settings.
    * @param columnIndex The active cell's column index.
    * @param rowIndex The active cell's row index.
    * @param formula The active cell's formula.
    * @param value The active cell's current value.
    * @param displayText The text displayed in the active cell.
    * @param sheetName The current worksheet's name.
    */
  def this(
    columnIndex: Double,
    rowIndex: Double,
    formula: String,
    value: String,
    displayText: String,
    sheetName: String
  ) = this()
  
  /**
    * Gets the active cell's column index.
    */
  /* CompleteClass */
  var columnIndex: Double = js.native
  
  /**
    * Specifies the text displayed in the processed cell.
    */
  /* CompleteClass */
  var displayText: String = js.native
  
  /**
    * Gets the active cell's formula.
    */
  /* CompleteClass */
  var formula: String = js.native
  
  /**
    * Gets the active cell's row index.
    */
  /* CompleteClass */
  var rowIndex: Double = js.native
  
  /**
    * Gets the current worksheet's name.
    */
  /* CompleteClass */
  var sheetName: String = js.native
  
  /**
    * Gets the active cell's current value.
    */
  /* CompleteClass */
  var value: String = js.native
}
