package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spreadsheet extends js.Object {
  def addEditor(emailAddress: java.lang.String): Spreadsheet = js.native
  def addEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Spreadsheet = js.native
  def addEditors(emailAddresses: js.Array[java.lang.String]): Spreadsheet = js.native
  def addMenu(name: java.lang.String, subMenus: js.Array[js.Object]): scala.Unit = js.native
  def addViewer(emailAddress: java.lang.String): Spreadsheet = js.native
  def addViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Spreadsheet = js.native
  def addViewers(emailAddresses: js.Array[java.lang.String]): Spreadsheet = js.native
  def appendRow(rowContents: js.Array[js.Object]): Sheet = js.native
  def autoResizeColumn(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def copy(name: java.lang.String): Spreadsheet = js.native
  def deleteActiveSheet(): Sheet = js.native
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
  def deleteSheet(sheet: Sheet): scala.Unit = js.native
  def duplicateActiveSheet(): Sheet = js.native
  def getActiveCell(): Range = js.native
  def getActiveRange(): Range = js.native
  def getActiveRangeList(): RangeList = js.native
  def getActiveSheet(): Sheet = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBandings(): js.Array[Banding] = js.native
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getColumnWidth(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getCurrentCell(): Range = js.native
  def getDataRange(): Range = js.native
  def getEditors(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getFormUrl(): java.lang.String = js.native
  def getFrozenColumns(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getFrozenRows(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getId(): java.lang.String = js.native
  def getLastColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLastRow(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getName(): java.lang.String = js.native
  def getNamedRanges(): js.Array[NamedRange] = js.native
  def getNumSheets(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getOwner(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User = js.native
  def getProtections(`type`: ProtectionType): js.Array[Protection] = js.native
  def getRange(a1Notation: java.lang.String): Range = js.native
  def getRangeByName(name: java.lang.String): Range = js.native
  def getRangeList(a1Notations: js.Array[java.lang.String]): RangeList = js.native
  def getRowHeight(rowPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getSelection(): Selection = js.native
  def getSheetByName(name: java.lang.String): Sheet = js.native
  def getSheetId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getSheetName(): java.lang.String = js.native
  def getSheetProtection(): PageProtection = js.native
  def getSheetValues(
    startRow: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    startColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[js.Array[js.Object]] = js.native
  def getSheets(): js.Array[Sheet] = js.native
  def getSpreadsheetLocale(): java.lang.String = js.native
  def getSpreadsheetTimeZone(): java.lang.String = js.native
  def getUrl(): java.lang.String = js.native
  def getViewers(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def hideColumn(column: Range): scala.Unit = js.native
  def hideRow(row: Range): scala.Unit = js.native
  def insertColumnAfter(afterPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertColumnBefore(beforePosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
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
  ): scala.Unit = js.native
  def insertImage(
    blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def insertImage(
    url: java.lang.String,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def insertImage(
    url: java.lang.String,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def insertRowAfter(afterPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertRowBefore(beforePosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertRowsAfter(
    afterPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    howMany: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def insertRowsBefore(
    beforePosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    howMany: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def insertSheet(): Sheet = js.native
  def insertSheet(options: js.Object): Sheet = js.native
  def insertSheet(sheetIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertSheet(sheetIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, options: js.Object): Sheet = js.native
  def insertSheet(sheetName: java.lang.String): Sheet = js.native
  def insertSheet(sheetName: java.lang.String, options: js.Object): Sheet = js.native
  def insertSheet(sheetName: java.lang.String, sheetIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def insertSheet(
    sheetName: java.lang.String,
    sheetIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    options: js.Object
  ): Sheet = js.native
  def isAnonymousView(): scala.Boolean = js.native
  def isAnonymousWrite(): scala.Boolean = js.native
  def moveActiveSheet(pos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def removeEditor(emailAddress: java.lang.String): Spreadsheet = js.native
  def removeEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Spreadsheet = js.native
  def removeMenu(name: java.lang.String): scala.Unit = js.native
  def removeNamedRange(name: java.lang.String): scala.Unit = js.native
  def removeViewer(emailAddress: java.lang.String): Spreadsheet = js.native
  def removeViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Spreadsheet = js.native
  def rename(newName: java.lang.String): scala.Unit = js.native
  def renameActiveSheet(newName: java.lang.String): scala.Unit = js.native
  def setActiveRange(range: Range): Range = js.native
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  def setActiveSelection(a1Notation: java.lang.String): Range = js.native
  def setActiveSelection(range: Range): Range = js.native
  def setActiveSheet(sheet: Sheet): Sheet = js.native
  def setActiveSheet(sheet: Sheet, restoreSelection: scala.Boolean): Sheet = js.native
  def setAnonymousAccess(anonymousReadAllowed: scala.Boolean, anonymousWriteAllowed: scala.Boolean): scala.Unit = js.native
  def setColumnWidth(
    columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def setCurrentCell(cell: Range): Range = js.native
  def setFrozenColumns(columns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def setFrozenRows(rows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def setNamedRange(name: java.lang.String, range: Range): scala.Unit = js.native
  def setRowHeight(
    rowPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Sheet = js.native
  def setSheetProtection(permissions: PageProtection): scala.Unit = js.native
  def setSpreadsheetLocale(locale: java.lang.String): scala.Unit = js.native
  def setSpreadsheetTimeZone(timezone: java.lang.String): scala.Unit = js.native
  def show(userInterface: js.Object): scala.Unit = js.native
  def sort(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Sheet = js.native
  def sort(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ascending: scala.Boolean): Sheet = js.native
  def toast(msg: java.lang.String): scala.Unit = js.native
  def toast(msg: java.lang.String, title: java.lang.String): scala.Unit = js.native
  def toast(msg: java.lang.String, title: java.lang.String, timeoutSeconds: stdLib.Number): scala.Unit = js.native
  def unhideColumn(column: Range): scala.Unit = js.native
  def unhideRow(row: Range): scala.Unit = js.native
  def updateMenu(name: java.lang.String, subMenus: js.Array[js.Object]): scala.Unit = js.native
}

