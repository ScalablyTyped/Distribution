package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet extends js.Object {
  
  /** Specifies the border for the cell in the Spreadsheet.
    * @Default {[]}
    */
  var border: js.UndefOr[js.Array[SheetsBorder]] = js.native
  
  /** Specifies the conditional formatting for the range of cell in Spreadsheet.
    * @Default {[]}
    */
  var cFormatRule: js.UndefOr[js.Array[SheetsCFormatRule]] = js.native
  
  /** Specifies the cell types for a cell or range in Spreadsheet.
    * @Default {[]}
    */
  var cellTypes: js.UndefOr[js.Array[_]] = js.native
  
  /** Gets or sets a value that indicates to define column count in the Spreadsheet.
    * @Default {21}
    */
  var colCount: js.UndefOr[Double] = js.native
  
  /** Gets or sets a value that indicates to define column width in the Spreadsheet.
    * @Default {64}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  
  /** Gets or sets the data to render the Spreadsheet.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable field as column header in the Spreadsheet.
    * @Default {false}
    */
  var fieldAsColumnHeader: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value to freeze columns in the Spreadsheet.
    * @Default {0}
    */
  var frozenColumns: js.UndefOr[Double] = js.native
  
  /** Gets or sets a value to freeze rows in the Spreadsheet.
    * @Default {0}
    */
  var frozenRows: js.UndefOr[Double] = js.native
  
  /** Specifies the header styles for the headers in datasource range.
    * @Default {null}
    */
  var headerStyles: js.UndefOr[js.Any] = js.native
  
  /** To hide the specified columns in Spreadsheet.
    * @Default {[]}
    */
  var hideColumns: js.UndefOr[js.Array[_]] = js.native
  
  /** To hide the specified rows in Spreadsheet.
    * @Default {[]}
    */
  var hideRows: js.UndefOr[js.Array[_]] = js.native
  
  /** To merge specified ranges in Spreadsheet.
    * @Default {[]}
    */
  var mergeCells: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the primary key for the datasource in Spreadsheet.
    */
  var primaryKey: js.UndefOr[String] = js.native
  
  /** Specifies the query for the dataSource in Spreadsheet.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /** Specifies single range or multiple range settings for a sheet in Spreadsheet.
    * @Default {[]}
    */
  var rangeSettings: js.UndefOr[js.Array[SheetsRangeSetting]] = js.native
  
  /** Gets or sets a value that indicates to define row count in the Spreadsheet.
    * @Default {20}
    */
  var rowCount: js.UndefOr[Double] = js.native
  
  /** Specifies the rows for a sheet in Spreadsheet.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[SheetsRow]] = js.native
  
  /** Specifies the name for sheet in the Spreadsheet.
    * @Default {string}
    */
  var sheetName: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates whether to show or hide grid lines in the Spreadsheet.
    * @Default {true}
    */
  var showGridlines: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to show or hide headings in the Spreadsheet.
    * @Default {true}
    */
  var showHeadings: js.UndefOr[Boolean] = js.native
  
  /** Specifies the start cell for the datasource range in Spreadsheet.
    * @Default {A1}
    */
  var startCell: js.UndefOr[String] = js.native
}
object Sheet {
  
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  
  @scala.inline
  implicit class SheetOps[Self <: Sheet] (val x: Self) extends AnyVal {
    
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
    def setBorderVarargs(value: SheetsBorder*): Self = this.set("border", js.Array(value :_*))
    
    @scala.inline
    def setBorder(value: js.Array[SheetsBorder]): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setCFormatRuleVarargs(value: SheetsCFormatRule*): Self = this.set("cFormatRule", js.Array(value :_*))
    
    @scala.inline
    def setCFormatRule(value: js.Array[SheetsCFormatRule]): Self = this.set("cFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCFormatRule: Self = this.set("cFormatRule", js.undefined)
    
    @scala.inline
    def setCellTypesVarargs(value: js.Any*): Self = this.set("cellTypes", js.Array(value :_*))
    
    @scala.inline
    def setCellTypes(value: js.Array[_]): Self = this.set("cellTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellTypes: Self = this.set("cellTypes", js.undefined)
    
    @scala.inline
    def setColCount(value: Double): Self = this.set("colCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColCount: Self = this.set("colCount", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setFieldAsColumnHeader(value: Boolean): Self = this.set("fieldAsColumnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldAsColumnHeader: Self = this.set("fieldAsColumnHeader", js.undefined)
    
    @scala.inline
    def setFrozenColumns(value: Double): Self = this.set("frozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenColumns: Self = this.set("frozenColumns", js.undefined)
    
    @scala.inline
    def setFrozenRows(value: Double): Self = this.set("frozenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenRows: Self = this.set("frozenRows", js.undefined)
    
    @scala.inline
    def setHeaderStyles(value: js.Any): Self = this.set("headerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyles: Self = this.set("headerStyles", js.undefined)
    
    @scala.inline
    def setHideColumnsVarargs(value: js.Any*): Self = this.set("hideColumns", js.Array(value :_*))
    
    @scala.inline
    def setHideColumns(value: js.Array[_]): Self = this.set("hideColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideColumns: Self = this.set("hideColumns", js.undefined)
    
    @scala.inline
    def setHideRowsVarargs(value: js.Any*): Self = this.set("hideRows", js.Array(value :_*))
    
    @scala.inline
    def setHideRows(value: js.Array[_]): Self = this.set("hideRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideRows: Self = this.set("hideRows", js.undefined)
    
    @scala.inline
    def setMergeCellsVarargs(value: js.Any*): Self = this.set("mergeCells", js.Array(value :_*))
    
    @scala.inline
    def setMergeCells(value: js.Array[_]): Self = this.set("mergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeCells: Self = this.set("mergeCells", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRangeSettingsVarargs(value: SheetsRangeSetting*): Self = this.set("rangeSettings", js.Array(value :_*))
    
    @scala.inline
    def setRangeSettings(value: js.Array[SheetsRangeSetting]): Self = this.set("rangeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeSettings: Self = this.set("rangeSettings", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SheetsRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[SheetsRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSheetName(value: String): Self = this.set("sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetName: Self = this.set("sheetName", js.undefined)
    
    @scala.inline
    def setShowGridlines(value: Boolean): Self = this.set("showGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridlines: Self = this.set("showGridlines", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    
    @scala.inline
    def setShowHeadings(value: Boolean): Self = this.set("showHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeadings: Self = this.set("showHeadings", js.undefined)
    
    @scala.inline
    def setStartCell(value: String): Self = this.set("startCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCell: Self = this.set("startCell", js.undefined)
  }
}
