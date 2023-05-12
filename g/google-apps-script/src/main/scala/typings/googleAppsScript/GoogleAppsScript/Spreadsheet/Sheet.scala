package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import typings.googleAppsScript.anon.ContentsOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify spreadsheet sheets. Common operations are renaming a sheet and accessing range
  * objects from the sheet.
  */
@js.native
trait Sheet extends StObject {
  
  def activate(): Sheet = js.native
  
  def addDeveloperMetadata(key: String): Sheet = js.native
  def addDeveloperMetadata(key: String, value: String): Sheet = js.native
  def addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): Sheet = js.native
  def addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): Sheet = js.native
  
  def appendRow(rowContents: js.Array[Any]): Sheet = js.native
  
  def autoResizeColumn(columnPosition: Integer): Sheet = js.native
  
  def autoResizeColumns(startColumn: Integer, numColumns: Integer): Sheet = js.native
  
  def autoResizeRows(startRow: Integer, numRows: Integer): Sheet = js.native
  
  def clear(): Sheet = js.native
  def clear(options: ContentsOnly): Sheet = js.native
  
  def clearConditionalFormatRules(): Unit = js.native
  
  def clearContents(): Sheet = js.native
  
  def clearFormats(): Sheet = js.native
  
  def clearNotes(): Sheet = js.native
  
  def collapseAllColumnGroups(): Sheet = js.native
  
  def collapseAllRowGroups(): Sheet = js.native
  
  def copyTo(spreadsheet: typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet): Sheet = js.native
  
  def createDeveloperMetadataFinder(): DeveloperMetadataFinder = js.native
  
  def createTextFinder(findText: String): TextFinder = js.native
  
  def deleteColumn(columnPosition: Integer): Sheet = js.native
  
  def deleteColumns(columnPosition: Integer, howMany: Integer): Unit = js.native
  
  def deleteRow(rowPosition: Integer): Sheet = js.native
  
  def deleteRows(rowPosition: Integer, howMany: Integer): Unit = js.native
  
  def expandAllColumnGroups(): Sheet = js.native
  
  def expandAllRowGroups(): Sheet = js.native
  
  def expandColumnGroupsUpToDepth(groupDepth: Integer): Sheet = js.native
  
  def expandRowGroupsUpToDepth(groupDepth: Integer): Sheet = js.native
  
  def getActiveCell(): Range = js.native
  
  def getActiveRange(): Range | Null = js.native
  
  def getActiveRangeList(): RangeList | Null = js.native
  
  def getBandings(): js.Array[Banding] = js.native
  
  def getCharts(): js.Array[EmbeddedChart] = js.native
  
  def getColumnGroup(columnIndex: Integer, groupDepth: Integer): Group | Null = js.native
  
  def getColumnGroupControlPosition(): GroupControlTogglePosition = js.native
  
  def getColumnGroupDepth(columnIndex: Integer): Integer = js.native
  
  def getColumnWidth(columnPosition: Integer): Integer = js.native
  
  def getConditionalFormatRules(): js.Array[ConditionalFormatRule] = js.native
  
  def getCurrentCell(): Range | Null = js.native
  
  def getDataRange(): Range = js.native
  
  def getDataSourceTables(): js.Array[DataSourceTable] = js.native
  
  def getDeveloperMetadata(): js.Array[DeveloperMetadata] = js.native
  
  def getDrawings(): js.Array[Drawing] = js.native
  
  def getFilter(): Filter | Null = js.native
  
  def getFormUrl(): String | Null = js.native
  
  def getFrozenColumns(): Integer = js.native
  
  def getFrozenRows(): Integer = js.native
  
  def getImages(): js.Array[OverGridImage] = js.native
  
  def getIndex(): Integer = js.native
  
  def getLastColumn(): Integer = js.native
  
  def getLastRow(): Integer = js.native
  
  def getMaxColumns(): Integer = js.native
  
  def getMaxRows(): Integer = js.native
  
  def getName(): String = js.native
  
  def getNamedRanges(): js.Array[NamedRange] = js.native
  
  def getParent(): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  
  def getPivotTables(): js.Array[PivotTable] = js.native
  
  def getProtections(`type`: ProtectionType): js.Array[Protection] = js.native
  
  def getRange(a1Notation: String): Range = js.native
  def getRange(row: Integer, column: Integer): Range = js.native
  def getRange(row: Integer, column: Integer, numRows: Integer): Range = js.native
  def getRange(row: Integer, column: Integer, numRows: Integer, numColumns: Integer): Range = js.native
  
  def getRangeList(a1Notations: js.Array[String]): RangeList = js.native
  
  def getRowGroup(rowIndex: Integer, groupDepth: Integer): Group | Null = js.native
  
  def getRowGroupControlPosition(): GroupControlTogglePosition = js.native
  
  def getRowGroupDepth(rowIndex: Integer): Integer = js.native
  
  def getRowHeight(rowPosition: Integer): Integer = js.native
  
  def getSelection(): Selection = js.native
  
  def getSheetId(): Integer = js.native
  
  def getSheetName(): String = js.native
  
  /** @deprecated DO NOT USE */ def getSheetProtection(): PageProtection = js.native
  
  def getSheetValues(startRow: Integer, startColumn: Integer, numRows: Integer, numColumns: Integer): js.Array[js.Array[Any]] = js.native
  
  def getSlicers(): js.Array[Slicer] = js.native
  
  def getTabColor(): String | Null = js.native
  
  def getType(): SheetType = js.native
  
  def hasHiddenGridlines(): Boolean = js.native
  
  def hideColumn(column: Range): Unit = js.native
  
  def hideColumns(columnIndex: Integer): Unit = js.native
  def hideColumns(columnIndex: Integer, numColumns: Integer): Unit = js.native
  
  def hideRow(row: Range): Unit = js.native
  
  def hideRows(rowIndex: Integer): Unit = js.native
  def hideRows(rowIndex: Integer, numRows: Integer): Unit = js.native
  
  def hideSheet(): Sheet = js.native
  
  def insertChart(chart: EmbeddedChart): Unit = js.native
  
  def insertColumnAfter(afterPosition: Integer): Sheet = js.native
  
  def insertColumnBefore(beforePosition: Integer): Sheet = js.native
  
  def insertColumns(columnIndex: Integer): Unit = js.native
  def insertColumns(columnIndex: Integer, numColumns: Integer): Unit = js.native
  
  def insertColumnsAfter(afterPosition: Integer, howMany: Integer): Sheet = js.native
  
  def insertColumnsBefore(beforePosition: Integer, howMany: Integer): Sheet = js.native
  
  def insertImage(blobSource: BlobSource, column: Integer, row: Integer): OverGridImage = js.native
  def insertImage(blobSource: BlobSource, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage = js.native
  def insertImage(url: String, column: Integer, row: Integer): OverGridImage = js.native
  def insertImage(url: String, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage = js.native
  
  def insertRowAfter(afterPosition: Integer): Sheet = js.native
  
  def insertRowBefore(beforePosition: Integer): Sheet = js.native
  
  def insertRows(rowIndex: Integer): Unit = js.native
  def insertRows(rowIndex: Integer, numRows: Integer): Unit = js.native
  
  def insertRowsAfter(afterPosition: Integer, howMany: Integer): Sheet = js.native
  
  def insertRowsBefore(beforePosition: Integer, howMany: Integer): Sheet = js.native
  
  def insertSlicer(range: Range, anchorRowPos: Integer, anchorColPos: Integer): Slicer = js.native
  def insertSlicer(range: Range, anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): Slicer = js.native
  
  def isColumnHiddenByUser(columnPosition: Integer): Boolean = js.native
  
  def isRightToLeft(): Boolean = js.native
  
  def isRowHiddenByFilter(rowPosition: Integer): Boolean = js.native
  
  def isRowHiddenByUser(rowPosition: Integer): Boolean = js.native
  
  def isSheetHidden(): Boolean = js.native
  
  def moveColumns(columnSpec: Range, destinationIndex: Integer): Unit = js.native
  
  def moveRows(rowSpec: Range, destinationIndex: Integer): Unit = js.native
  
  def newChart(): EmbeddedChartBuilder = js.native
  
  def protect(): Protection = js.native
  
  def removeChart(chart: EmbeddedChart): Unit = js.native
  
  def setActiveRange(range: Range): Range = js.native
  
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  
  def setActiveSelection(a1Notation: String): Range = js.native
  def setActiveSelection(range: Range): Range = js.native
  
  def setColumnGroupControlPosition(position: GroupControlTogglePosition): Sheet = js.native
  
  def setColumnWidth(columnPosition: Integer, width: Integer): Sheet = js.native
  
  def setColumnWidths(startColumn: Integer, numColumns: Integer, width: Integer): Sheet = js.native
  
  def setConditionalFormatRules(rules: js.Array[ConditionalFormatRule]): Unit = js.native
  
  def setCurrentCell(cell: Range): Range = js.native
  
  def setFrozenColumns(columns: Integer): Unit = js.native
  
  def setFrozenRows(rows: Integer): Unit = js.native
  
  def setHiddenGridlines(hideGridlines: Boolean): Sheet = js.native
  
  def setName(name: String): Sheet = js.native
  
  def setRightToLeft(rightToLeft: Boolean): Sheet = js.native
  
  def setRowGroupControlPosition(position: GroupControlTogglePosition): Sheet = js.native
  
  def setRowHeight(rowPosition: Integer, height: Integer): Sheet = js.native
  
  def setRowHeights(startRow: Integer, numRows: Integer, height: Integer): Sheet = js.native
  
  def setRowHeightsForced(startRow: Integer, numRows: Integer, height: Integer): Sheet = js.native
  
  /** @deprecated DO NOT USE */ def setSheetProtection(permissions: PageProtection): Unit = js.native
  
  def setTabColor(): Sheet = js.native
  def setTabColor(color: String): Sheet = js.native
  
  def showColumns(columnIndex: Integer): Unit = js.native
  def showColumns(columnIndex: Integer, numColumns: Integer): Unit = js.native
  
  def showRows(rowIndex: Integer): Unit = js.native
  def showRows(rowIndex: Integer, numRows: Integer): Unit = js.native
  
  def showSheet(): Sheet = js.native
  
  def sort(columnPosition: Integer): Sheet = js.native
  def sort(columnPosition: Integer, ascending: Boolean): Sheet = js.native
  
  def unhideColumn(column: Range): Unit = js.native
  
  def unhideRow(row: Range): Unit = js.native
  
  def updateChart(chart: EmbeddedChart): Unit = js.native
}
