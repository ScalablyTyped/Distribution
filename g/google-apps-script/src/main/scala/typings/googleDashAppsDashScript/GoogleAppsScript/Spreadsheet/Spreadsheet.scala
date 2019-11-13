package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.Anon_FunctionName
import typings.googleDashAppsDashScript.Anon_Template
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.HTML.HtmlOutput
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify Google Sheets files. Common operations are adding new sheets and adding
  * collaborators.
  */
@js.native
trait Spreadsheet extends js.Object {
  def addDeveloperMetadata(key: String): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addDeveloperMetadata(key: String, value: String): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addEditor(emailAddress: String): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addEditor(user: User): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addEditors(emailAddresses: js.Array[String]): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addMenu(name: String, subMenus: js.Array[Anon_FunctionName | Null]): Unit = js.native
  def addViewer(emailAddress: String): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addViewer(user: User): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def addViewers(emailAddresses: js.Array[String]): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def appendRow(rowContents: js.Array[_]): Sheet = js.native
  def autoResizeColumn(columnPosition: Integer): Sheet = js.native
  def copy(name: String): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def createDeveloperMetadataFinder(): DeveloperMetadataFinder = js.native
  def createTextFinder(findText: String): TextFinder = js.native
  def deleteActiveSheet(): Sheet = js.native
  def deleteColumn(columnPosition: Integer): Sheet = js.native
  def deleteColumns(columnPosition: Integer, howMany: Integer): Unit = js.native
  def deleteRow(rowPosition: Integer): Sheet = js.native
  def deleteRows(rowPosition: Integer, howMany: Integer): Unit = js.native
  def deleteSheet(sheet: Sheet): Unit = js.native
  def duplicateActiveSheet(): Sheet = js.native
  def getActiveCell(): Range = js.native
  def getActiveRange(): Range | Null = js.native
  def getActiveRangeList(): RangeList | Null = js.native
  def getActiveSheet(): Sheet = js.native
  def getAs(contentType: String): Blob = js.native
  def getBandings(): js.Array[Banding] = js.native
  def getBlob(): Blob = js.native
  def getColumnWidth(columnPosition: Integer): Integer = js.native
  def getCurrentCell(): Range | Null = js.native
  def getDataRange(): Range = js.native
  def getDataSourceTables(): js.Array[DataSourceTable] = js.native
  def getDeveloperMetadata(): js.Array[DeveloperMetadata] = js.native
  def getEditors(): js.Array[User] = js.native
  def getFormUrl(): String | Null = js.native
  def getFrozenColumns(): Integer = js.native
  def getFrozenRows(): Integer = js.native
  def getId(): String = js.native
  def getImages(): js.Array[OverGridImage] = js.native
  def getIterativeCalculationConvergenceThreshold(): Double = js.native
  def getLastColumn(): Integer = js.native
  def getLastRow(): Integer = js.native
  def getMaxIterativeCalculationCycles(): Integer = js.native
  def getName(): String = js.native
  def getNamedRanges(): js.Array[NamedRange] = js.native
  def getNumSheets(): Integer = js.native
  def getOwner(): User | Null = js.native
  def getProtections(`type`: ProtectionType): js.Array[Protection] = js.native
  def getRange(a1Notation: String): Range = js.native
  def getRangeByName(name: String): Range | Null = js.native
  def getRangeList(a1Notations: js.Array[String]): RangeList = js.native
  def getRecalculationInterval(): RecalculationInterval = js.native
  def getRowHeight(rowPosition: Integer): Integer = js.native
  def getSelection(): Selection = js.native
  def getSheetByName(name: String): Sheet | Null = js.native
  def getSheetId(): Integer = js.native
  def getSheetName(): String = js.native
  /** @deprecated DO NOT USE */ def getSheetProtection(): PageProtection = js.native
  def getSheetValues(startRow: Integer, startColumn: Integer, numRows: Integer, numColumns: Integer): js.Array[js.Array[_]] = js.native
  def getSheets(): js.Array[Sheet] = js.native
  def getSpreadsheetLocale(): String = js.native
  def getSpreadsheetTimeZone(): String = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def hideColumn(column: Range): Unit = js.native
  def hideRow(row: Range): Unit = js.native
  def insertColumnAfter(afterPosition: Integer): Sheet = js.native
  def insertColumnBefore(beforePosition: Integer): Sheet = js.native
  def insertColumnsAfter(afterPosition: Integer, howMany: Integer): Sheet = js.native
  def insertColumnsBefore(beforePosition: Integer, howMany: Integer): Sheet = js.native
  def insertImage(blobSource: BlobSource, column: Integer, row: Integer): OverGridImage = js.native
  def insertImage(blobSource: BlobSource, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage = js.native
  def insertImage(url: String, column: Integer, row: Integer): OverGridImage = js.native
  def insertImage(url: String, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage = js.native
  def insertRowAfter(afterPosition: Integer): Sheet = js.native
  def insertRowBefore(beforePosition: Integer): Sheet = js.native
  def insertRowsAfter(afterPosition: Integer, howMany: Integer): Sheet = js.native
  def insertRowsBefore(beforePosition: Integer, howMany: Integer): Sheet = js.native
  def insertSheet(): Sheet = js.native
  def insertSheet(options: Anon_Template): Sheet = js.native
  def insertSheet(sheetIndex: Integer): Sheet = js.native
  def insertSheet(sheetIndex: Integer, options: Anon_Template): Sheet = js.native
  def insertSheet(sheetName: String): Sheet = js.native
  def insertSheet(sheetName: String, options: Anon_Template): Sheet = js.native
  def insertSheet(sheetName: String, sheetIndex: Integer): Sheet = js.native
  def insertSheet(sheetName: String, sheetIndex: Integer, options: Anon_Template): Sheet = js.native
  def insertSheetWithDataSourceTable(spec: DataSourceSpec): Sheet = js.native
  /** @deprecated DO NOT USE */ def isAnonymousView(): Boolean = js.native
  /** @deprecated DO NOT USE */ def isAnonymousWrite(): Boolean = js.native
  def isColumnHiddenByUser(columnPosition: Integer): Boolean = js.native
  def isIterativeCalculationEnabled(): Boolean = js.native
  def isRowHiddenByFilter(rowPosition: Integer): Boolean = js.native
  def isRowHiddenByUser(rowPosition: Integer): Boolean = js.native
  def moveActiveSheet(pos: Integer): Unit = js.native
  def moveChartToObjectSheet(chart: EmbeddedChart): Sheet = js.native
  def removeEditor(emailAddress: String): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def removeEditor(user: User): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def removeMenu(name: String): Unit = js.native
  def removeNamedRange(name: String): Unit = js.native
  def removeViewer(emailAddress: String): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def removeViewer(user: User): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def rename(newName: String): Unit = js.native
  def renameActiveSheet(newName: String): Unit = js.native
  def setActiveRange(range: Range): Range = js.native
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  def setActiveSelection(a1Notation: String): Range = js.native
  def setActiveSelection(range: Range): Range = js.native
  def setActiveSheet(sheet: Sheet): Sheet = js.native
  def setActiveSheet(sheet: Sheet, restoreSelection: Boolean): Sheet = js.native
  /** @deprecated DO NOT USE */ def setAnonymousAccess(anonymousReadAllowed: Boolean, anonymousWriteAllowed: Boolean): Unit = js.native
  def setColumnWidth(columnPosition: Integer, width: Integer): Sheet = js.native
  def setCurrentCell(cell: Range): Range = js.native
  def setFrozenColumns(columns: Integer): Unit = js.native
  def setFrozenRows(rows: Integer): Unit = js.native
  def setIterativeCalculationConvergenceThreshold(minThreshold: Double): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def setIterativeCalculationEnabled(isEnabled: Boolean): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def setMaxIterativeCalculationCycles(maxIterations: Integer): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def setNamedRange(name: String, range: Range): Unit = js.native
  def setRecalculationInterval(recalculationInterval: RecalculationInterval): typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def setRowHeight(rowPosition: Integer, height: Integer): Sheet = js.native
  /** @deprecated DO NOT USE */ def setSheetProtection(permissions: PageProtection): Unit = js.native
  def setSpreadsheetLocale(locale: String): Unit = js.native
  def setSpreadsheetTimeZone(timezone: String): Unit = js.native
  def show(userInterface: HtmlOutput): Unit = js.native
  def sort(columnPosition: Integer): Sheet = js.native
  def sort(columnPosition: Integer, ascending: Boolean): Sheet = js.native
  def toast(msg: String): Unit = js.native
  def toast(msg: String, title: String): Unit = js.native
  def toast(msg: String, title: String, timeoutSeconds: Double): Unit = js.native
  def unhideColumn(column: Range): Unit = js.native
  def unhideRow(row: Range): Unit = js.native
  def updateMenu(name: String, subMenus: js.Array[Anon_FunctionName]): Unit = js.native
}

