package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-spreadsheet", "GoogleSpreadsheetCell")
@js.native
class GoogleSpreadsheetCell protected () extends CellFormat {
  def this(parentSheet: GoogleSpreadsheetWorksheet, rowIndex: Double, columnIndex: Double, cellData: js.Any) = this()
  /**
    * @description
    * cell full A1 address format
    */
  var a1Address: String = js.native
  /**
    * @description
    * cell column letter in A1 address format
    */
  var a1Column: String = js.native
  /**
    * @description
    * cell row number in A1 address format
    */
  var a1Row: Double = js.native
  /**
    * @description
    * background color of the cell
    */
  /* CompleteClass */
  override var backgroundColor: Color = js.native
  /**
    * @description
    * border settings of the cell
    */
  /* CompleteClass */
  override var borders: Borders = js.native
  /**
    * @description
    * cell column in the worksheet
    */
  var columnIndex: Double = js.native
  /**
    * @description
    * "effective format" used by the cell
    * - note: using named format properties is preferred
    * - this includes the results of applying any conditional formatting
    * - if the cell contains a formula, the computed number format
    * - if the effective format is the default format, effective format will not be written
    */
  val effectiveFormat: CellFormat = js.native
  /**
    * @description
    * value after formatting rules are applied
    */
  val formattedValue: js.Any = js.native
  /**
    * @description
    * formula (if any) in the cell
    */
  var formula: String = js.native
  /**
    * @description
    * error related to an invalid cell format
    */
  val formulaError: CellError = js.native
  /**
    * @description
    * horizontal alignment of the cell's value
    */
  /* CompleteClass */
  override var horizontalAlignment: HorizontalAlign = js.native
  /**
    * @description
    * url of the cell's link
    * - when using =HYPERLINK() formula
    */
  val hyperlink: String = js.native
  /**
    * @description
    * how a hyperlink (if any) should be displayed
    */
  /* CompleteClass */
  override var hyperlinkDisplayType: HyperlinkDisplayType = js.native
  /**
    * @description
    * note attached to the cell
    */
  var note: String = js.native
  /**
    * @description
    * format describing how number values should be represented to the user
    */
  /* CompleteClass */
  override var numberFormat: NumberFormat = js.native
  /**
    * @description
    * padding in the cell
    * - spacing between inner text and cell boundaries
    */
  /* CompleteClass */
  override var padding: Padding = js.native
  // #endregion
  // #region OWN PROPERTIES
  /**
    * @description
    * cell row in the worksheet
    */
  var rowIndex: Double = js.native
  /**
    * @description
    * display direction of cell value text
    */
  /* CompleteClass */
  override var textDirection: TextDirection = js.native
  /**
    * @description
    * format of the text in the cell
    * - font, size etc.
    */
  /* CompleteClass */
  override var textFormat: TextFormat = js.native
  /**
    * @description
    * rotation applied to text in a cell
    */
  /* CompleteClass */
  override var textRotation: TextRotation = js.native
  /**
    * @description
    * format the user entered in the cell
    * - note: using named format properties is preferred
    */
  val userEnteredFormat: CellFormat = js.native
  /**
    * @description
    * this is the full value in the cell
    * - if there is a formula in the cell, this will be the value the formula resolves to
    */
  var value: String | Double | Boolean = js.native
  /**
    * @description
    * the type of the value, using google's terminology
    */
  val valueType: CellValueType = js.native
  /**
    * @description
    * vertical alignment of the cell's value
    */
  /* CompleteClass */
  override var verticalAlignment: VerticalAlign = js.native
  /**
    * @description
    * text-wrapping strategy of the cell's value
    */
  /* CompleteClass */
  override var wrapStrategy: WrapStrategy = js.native
  // #endregion
  // #region SYNCHRONOUS METHODS
  /**
    * @description
    * reset all cell formatting to default / none
    * - LOCAL CHANGE (must be saved to persist)
    */
  def clearAllFormatting(): Unit = js.native
  /**
    * @description
    * discard all unsaved changes
    * - includes value, notes and formatting
    * - LOCAL CHANGE (must be saved to persist)
    */
  def discardUnsavedChanges(): Unit = js.native
  // #endregion
  // #region ASYNCHRONOUS METHODS
  /**
    * @description
    * save this individual cell
    * - persist any local changes made to the cell
    * - see worksheet.saveUpdatedCells() for bulk saving
    */
  def save(): js.Promise[Unit] = js.native
}

