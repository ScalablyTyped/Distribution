package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  def activate(): Sheet = js.native
  def addDeveloperMetadata(key: java.lang.String): Sheet = js.native
  def addDeveloperMetadata(key: java.lang.String, value: java.lang.String): Sheet = js.native
  def addDeveloperMetadata(key: java.lang.String, value: java.lang.String, visibility: DeveloperMetadataVisibility): Sheet = js.native
  def addDeveloperMetadata(key: java.lang.String, visibility: DeveloperMetadataVisibility): Sheet = js.native
  def appendRow(rowContents: js.Array[js.Object]): Sheet = js.native
  def autoResizeColumn(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def autoResizeColumns(
    startColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def autoResizeRows(
    startRow: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def clear(): Sheet = js.native
  def clear(options: js.Object): Sheet = js.native
  def clearConditionalFormatRules(): scala.Unit = js.native
  def clearContents(): Sheet = js.native
  def clearFormats(): Sheet = js.native
  def clearNotes(): Sheet = js.native
  def collapseAllColumnGroups(): Sheet = js.native
  def collapseAllRowGroups(): Sheet = js.native
  def copyTo(spreadsheet: Spreadsheet): Sheet = js.native
  def createDeveloperMetadataFinder(): DeveloperMetadataFinder = js.native
  def deleteColumn(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def deleteColumns(
    columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    howMany: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def deleteRow(rowPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def deleteRows(
    rowPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    howMany: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def expandAllColumnGroups(): Sheet = js.native
  def expandAllRowGroups(): Sheet = js.native
  def expandColumnGroupsUpToDepth(groupDepth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def expandRowGroupsUpToDepth(groupDepth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def getActiveCell(): Range = js.native
  def getActiveRange(): Range = js.native
  def getActiveRangeList(): RangeList = js.native
  def getBandings(): js.Array[Banding] = js.native
  def getCharts(): js.Array[EmbeddedChart] = js.native
  def getColumnGroup(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    groupDepth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Group = js.native
  def getColumnGroupControlPosition(): GroupControlTogglePosition = js.native
  def getColumnGroupDepth(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getColumnWidth(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getConditionalFormatRules(): js.Array[ConditionalFormatRule] = js.native
  def getCurrentCell(): Range = js.native
  def getDataRange(): Range = js.native
  def getDataSourceTables(): js.Array[DataSourceTable] = js.native
  def getDeveloperMetadata(): js.Array[DeveloperMetadata] = js.native
  def getFilter(): Filter = js.native
  def getFormUrl(): java.lang.String = js.native
  def getFrozenColumns(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getFrozenRows(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getImages(): js.Array[OverGridImage] = js.native
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLastColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLastRow(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxColumns(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMaxRows(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getName(): java.lang.String = js.native
  def getNamedRanges(): js.Array[NamedRange] = js.native
  def getParent(): Spreadsheet = js.native
  def getPivotTables(): js.Array[PivotTable] = js.native
  def getProtections(`type`: ProtectionType): js.Array[Protection] = js.native
  def getRange(a1Notation: java.lang.String): Range = js.native
  def getRange(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Range = js.native
  def getRange(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Range = js.native
  def getRange(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Range = js.native
  def getRangeList(a1Notations: js.Array[java.lang.String]): RangeList = js.native
  def getRowGroup(
    rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    groupDepth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Group = js.native
  def getRowGroupControlPosition(): GroupControlTogglePosition = js.native
  def getRowGroupDepth(rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getRowHeight(rowPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getSelection(): Selection = js.native
  def getSheetId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getSheetName(): java.lang.String = js.native
  def getSheetProtection(): PageProtection = js.native
  def getSheetValues(
    startRow: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    startColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[js.Array[js.Object]] = js.native
  def getTabColor(): java.lang.String = js.native
  def hasHiddenGridlines(): scala.Boolean = js.native
  def hideColumn(column: Range): scala.Unit = js.native
  def hideColumns(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def hideColumns(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def hideRow(row: Range): scala.Unit = js.native
  def hideRows(rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def hideRows(
    rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def hideSheet(): Sheet = js.native
  def insertChart(chart: EmbeddedChart): scala.Unit = js.native
  def insertColumnAfter(afterPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertColumnBefore(beforePosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertColumns(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def insertColumns(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def insertColumnsAfter(
    afterPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    howMany: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def insertColumnsBefore(
    beforePosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    howMany: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def insertImage(
    blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): OverGridImage = js.native
  def insertImage(
    blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): OverGridImage = js.native
  def insertImage(
    url: java.lang.String,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): OverGridImage = js.native
  def insertImage(
    url: java.lang.String,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): OverGridImage = js.native
  def insertRowAfter(afterPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertRowBefore(beforePosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertRows(rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def insertRows(
    rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def insertRowsAfter(
    afterPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    howMany: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def insertRowsBefore(
    beforePosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    howMany: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def isColumnHiddenByUser(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def isRightToLeft(): scala.Boolean = js.native
  def isRowHiddenByFilter(rowPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def isRowHiddenByUser(rowPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def isSheetHidden(): scala.Boolean = js.native
  def moveColumns(columnSpec: Range, destinationIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def moveRows(rowSpec: Range, destinationIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def newChart(): EmbeddedChartBuilder = js.native
  def protect(): Protection = js.native
  def removeChart(chart: EmbeddedChart): scala.Unit = js.native
  def setActiveRange(range: Range): Range = js.native
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  def setActiveSelection(a1Notation: java.lang.String): Range = js.native
  def setActiveSelection(range: Range): Range = js.native
  def setColumnGroupControlPosition(position: GroupControlTogglePosition): Sheet = js.native
  def setColumnWidth(
    columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def setColumnWidths(
    startColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def setConditionalFormatRules(rules: js.Array[ConditionalFormatRule]): scala.Unit = js.native
  def setCurrentCell(cell: Range): Range = js.native
  def setFrozenColumns(columns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def setFrozenRows(rows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def setHiddenGridlines(hideGridlines: scala.Boolean): Sheet = js.native
  def setName(name: java.lang.String): Sheet = js.native
  def setRightToLeft(rightToLeft: scala.Boolean): Sheet = js.native
  def setRowGroupControlPosition(position: GroupControlTogglePosition): Sheet = js.native
  def setRowHeight(
    rowPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def setRowHeights(
    startRow: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def setSheetProtection(permissions: PageProtection): scala.Unit = js.native
  def setTabColor(color: java.lang.String): Sheet = js.native
  def showColumns(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def showColumns(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def showRows(rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def showRows(
    rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def showSheet(): Sheet = js.native
  def sort(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def sort(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ascending: scala.Boolean): Sheet = js.native
  def unhideColumn(column: Range): scala.Unit = js.native
  def unhideRow(row: Range): scala.Unit = js.native
  def updateChart(chart: EmbeddedChart): scala.Unit = js.native
}

