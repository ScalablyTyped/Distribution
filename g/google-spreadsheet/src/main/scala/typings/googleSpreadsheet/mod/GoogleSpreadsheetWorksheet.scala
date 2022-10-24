package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StringDictionary
import typings.googleSpreadsheet.anon.Data
import typings.googleSpreadsheet.anon.End
import typings.googleSpreadsheet.anon.Insert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-spreadsheet", "GoogleSpreadsheetWorksheet")
@js.native
open class GoogleSpreadsheetWorksheet protected ()
  extends StObject
     with WorksheetBasicProperties {
  def this(parentSpreadsheet: GoogleSpreadsheetWorksheet, param1: Data) = this()
  
  /**
    * @description
    * alias for the worksheet title
    */
  var a1SheetName: String = js.native
  
  def addRow(values: js.Array[String | Double | Boolean]): js.Promise[GoogleSpreadsheetRow] = js.native
  def addRow(values: js.Array[String | Double | Boolean], options: Insert): js.Promise[GoogleSpreadsheetRow] = js.native
  /**
    * @description
    * append a row to the end of the worksheet
    *
    * @param values row values as either:
    * - an object of header and value pairs (relative to the worksheet header columns)
    * - an array of values in column order
    * @param options insertion options
    * - raw: ?DESCRIPTION?
    * - insert:?DESCRIPTION?
    */
  def addRow(values: StringDictionary[String | Double | Boolean]): js.Promise[GoogleSpreadsheetRow] = js.native
  def addRow(values: StringDictionary[String | Double | Boolean], options: Insert): js.Promise[GoogleSpreadsheetRow] = js.native
  
  /**
    * @description
    * append rows to the end of the worksheet
    *
    * @see addRow this method is the pluralized form
    *
    * @param rowValues array of row values as either:
    * - an object of header and value pairs (relative to the worksheet header columns)
    * - an array of values in column order
    * @param options insertion options
    * - raw: ?DESCRIPTION?
    * - insert:?DESCRIPTION?
    */
  def addRows(
    rowValues: js.Array[
      (StringDictionary[String | Double | Boolean]) | (js.Array[String | Double | Boolean])
    ]
  ): js.Promise[js.Array[GoogleSpreadsheetRow]] = js.native
  def addRows(
    rowValues: js.Array[
      (StringDictionary[String | Double | Boolean]) | (js.Array[String | Double | Boolean])
    ],
    options: Insert
  ): js.Promise[js.Array[GoogleSpreadsheetRow]] = js.native
  
  /**
    * @description
    * stats about the cells in the worksheet
    */
  var cellStats: CellStats = js.native
  
  /**
    * @description
    * defaults to clearing the entire sheet, or pass in a specific a1 range
    *
    * @param a1Range optional specific range within the sheet to clear
    */
  def clear(): js.Promise[Unit] = js.native
  def clear(a1Range: String): js.Promise[Unit] = js.native
  
  /**
    * @description
    * clear data/cells in a range of rows, defaulting to all rows after the header row(s)
    *
    * @param options options to control which rows to clear:
    * - start: A1 style row number of first row to clear, defaults to first non-header row
    * - end: A1 style row number of last row to clear, defaults to last row
    */
  def clearRows(): js.Promise[Unit] = js.native
  def clearRows(options: End): js.Promise[Unit] = js.native
  
  /**
    * @description
    * number of columns in the worksheet
    */
  var columnCount: Double = js.native
  
  /**
    * @description
    * copy this sheet to another document
    *
    * @param destinationSpreadsheetId destination spreadsheet doc ID
    */
  def copyToSpreadsheet(destinationSpreadsheetId: String): js.Promise[Unit] = js.native
  
  /**
    * @description
    * delete the worksheet
    */
  def delete(): js.Promise[Unit] = js.native
  
  // #endregion
  // #region SYNCHRONOUS METHODS
  /**
    * @description
    * retrieve a cell from the cache based on numeric row and column indices
    * - zero-based index
    */
  def getCell(rowIndex: Double, columnIndex: Double): GoogleSpreadsheetCell = js.native
  
  /**
    * @description
    * retrieve a cell from the cache based on A1 address
    */
  def getCellByA1(a1Address: String): GoogleSpreadsheetCell = js.native
  
  /**
    * @description
    * fetch all rows in the worksheet
    *
    * @param options pagination options
    */
  def getRows(): js.Promise[js.Array[GoogleSpreadsheetRow]] = js.native
  def getRows(options: PaginationOptions): js.Promise[js.Array[GoogleSpreadsheetRow]] = js.native
  
  /**
    * @description
    * additional properties of the worksheet if this sheet is a grid
    */
  @JSName("gridProperties")
  var gridProperties_GoogleSpreadsheetWorksheet: WorksheetGridProperties = js.native
  
  // #region BASIC PROPERTIES
  // These properties should reflect the ones in the WorksheetBasicProperties interface
  /**
    * @description
    * first row values
    * - used in row-based interactions
    * - defines the dynamic properties of the Worksheet's GoogleSpreadsheetRows
    */
  @JSName("headerValues")
  var headerValues_GoogleSpreadsheetWorksheet: js.Array[String] = js.native
  
  /**
    * @description
    * true if the worksheet is hidden in the UI, false if it's visible
    */
  @JSName("hidden")
  var hidden_GoogleSpreadsheetWorksheet: Boolean = js.native
  
  /**
    * @description
    * tab index in the worksheet doc (based on rightToLeft property)
    */
  @JSName("index")
  var index_GoogleSpreadsheetWorksheet: Double = js.native
  
  /**
    * @description
    * insert into worksheet "dimension properties"
    *
    * @param columnsOrRows which dimension to update
    *
    * @param bounds start index and end index of the dimension to be added
    *
    * @param inheritFromBefore to inherit properties from the previous dimension
    */
  def insertDimension(columnsOrRows: WorksheetDimension, bounds: WorksheetDimensionBounds): js.Promise[Unit] = js.native
  def insertDimension(columnsOrRows: WorksheetDimension, bounds: WorksheetDimensionBounds, inheritFromBefore: Boolean): js.Promise[Unit] = js.native
  
  /**
    * @description
    * A1 column letter of the last column in the worksheet
    */
  var lastColumnLetter: String = js.native
  
  // #endregion
  // #region ASYNCHRONOUS METHODS
  /**
    * @description
    * loads the cells in the worksheet
    * - note: if using an API key (read-only access), only A1 ranges are supported
    * @param filters single or array of filters
    * - strings are treated as an A1 range
    * - objects are treated as a WorksheetGridRange
    * - if skipped, all cells are loaded
    */
  def loadCells(): js.Promise[Unit] = js.native
  def loadCells(filters: String): js.Promise[Unit] = js.native
  def loadCells(filters: js.Array[String | WorksheetGridRange]): js.Promise[Unit] = js.native
  def loadCells(filters: WorksheetGridRange): js.Promise[Unit] = js.native
  
  /**
    * @description
    * loads the header row (first row) of the sheet
    * - usually do not need to call this directly
    *
    * @param headerRowIndex The index of the header row, if not the first. NOTE: not zero-indexed
    */
  def loadHeaderRow(): js.Promise[Unit] = js.native
  def loadHeaderRow(headerRowIndex: Double): js.Promise[Unit] = js.native
  
  /**
    * @description
    * reset local cache of properties and cell data
    * - cache is empties so props and cells must be re-fetched
    *
    * @param dataOnly if true, only affects data, not properties
    */
  def resetLocalCache(dataOnly: Boolean): Unit = js.native
  
  /**
    * @description
    * update worksheet grid properties / dimensions
    * - alias for setGridProperties
    */
  def resize(gridProperties: WorksheetGridProperties): js.Promise[Unit] = js.native
  
  /**
    * @description
    * true if the worksheet is an RTL sheet instead of an LTR sheet
    */
  @JSName("rightToLeft")
  var rightToLeft_GoogleSpreadsheetWorksheet: Boolean = js.native
  
  /**
    * @description
    * number of rows in the worksheet
    */
  var rowCount: Double = js.native
  
  /**
    * @description
    * saves all cells that have unsaved changes
    *
    * @param cells array of cells to save
    */
  def saveCells(cells: js.Array[GoogleSpreadsheetCell]): js.Promise[Unit] = js.native
  
  /**
    * @description
    * saves all cells in the worksheet that have unsaved changes
    */
  def saveUpdatedCells(): js.Promise[Unit] = js.native
  
  /**
    * @description
    * set the grid properties of the worksheet
    *
    * @param gridProperties
    */
  def setGridProperties(gridProperties: WorksheetGridProperties): js.Promise[Unit] = js.native
  
  /**
    * @description
    * set the header (first) row in the worksheet
    *
    * @param headers
    * @param headerRowIndex The index of the header row, if not the first. NOTE: not zero-indexed
    */
  def setHeaderRow(headers: js.Array[String]): js.Promise[Unit] = js.native
  def setHeaderRow(headers: js.Array[String], headerRowIndex: Double): js.Promise[Unit] = js.native
  
  // #endregion
  // #region NON-BASIC PROPERTIES
  /**
    * @description
    * set during creation, not editable
    */
  val sheetId: String = js.native
  
  /**
    * @description
    * set during creation, not editable
    */
  val sheetType: WorksheetType = js.native
  
  /**
    * @description
    * the color of the worksheet tab
    */
  @JSName("tabColor")
  var tabColor_GoogleSpreadsheetWorksheet: Color = js.native
  
  /**
    * @description
    * name of the worksheet tab
    */
  @JSName("title")
  var title_GoogleSpreadsheetWorksheet: String = js.native
  
  /**
    * @description
    * update the worksheet "dimension properties"
    *
    * @param columnsOrRows which dimension to update
    *
    * @param properties properties of the dimension to update
    *
    * @param bounds start and end dimension indices
    */
  def updateDimensionProperties(
    columnsOrRows: WorksheetDimension,
    properties: WorksheetDimensionProperties,
    bounds: WorksheetDimensionBounds
  ): js.Promise[Unit] = js.native
  
  /**
    * @description
    * update basic worksheet properties
    *
    * @param properties
    */
  def updateProperties(properties: WorksheetBasicProperties): js.Promise[Unit] = js.native
}
