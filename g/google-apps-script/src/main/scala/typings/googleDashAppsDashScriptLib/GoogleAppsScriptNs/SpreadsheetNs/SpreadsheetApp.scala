package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetApp extends js.Object {
  var AutoFillSeries: js.Any = js.native
  var BandingTheme: js.Any = js.native
  var BooleanCriteria: js.Any = js.native
  var BorderStyle: js.Any = js.native
  var CopyPasteType: js.Any = js.native
  var DataValidationCriteria: js.Any = js.native
  var Dimension: js.Any = js.native
  var Direction: js.Any = js.native
  var GroupControlTogglePosition: js.Any = js.native
  var InterpolationType: js.Any = js.native
  var PivotTableSummarizeFunction: js.Any = js.native
  var PivotValueDisplayType: js.Any = js.native
  var ProtectionType: js.Any = js.native
  var RelativeDate: js.Any = js.native
  var TextDirection: js.Any = js.native
  var TextToColumnsDelimiter: js.Any = js.native
  var WrapStrategy: js.Any = js.native
  def create(name: java.lang.String): Spreadsheet = js.native
  def create(
    name: java.lang.String,
    rows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Spreadsheet = js.native
  def flush(): scala.Unit = js.native
  def getActive(): Spreadsheet = js.native
  def getActiveRange(): Range = js.native
  def getActiveRangeList(): RangeList = js.native
  def getActiveSheet(): Sheet = js.native
  def getActiveSpreadsheet(): Spreadsheet = js.native
  def getCurrentCell(): Range = js.native
  def getSelection(): Selection = js.native
  def getUi(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui = js.native
  def newConditionalFormatRule(): ConditionalFormatRuleBuilder = js.native
  def newDataValidation(): DataValidationBuilder = js.native
  def newFilterCriteria(): FilterCriteriaBuilder = js.native
  def open(file: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.File): Spreadsheet = js.native
  def openById(id: java.lang.String): Spreadsheet = js.native
  def openByUrl(url: java.lang.String): Spreadsheet = js.native
  def setActiveRange(range: Range): Range = js.native
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  def setActiveSheet(sheet: Sheet): Sheet = js.native
  def setActiveSheet(sheet: Sheet, restoreSelection: scala.Boolean): Sheet = js.native
  def setActiveSpreadsheet(newActiveSpreadsheet: Spreadsheet): scala.Unit = js.native
  def setCurrentCell(cell: Range): Range = js.native
}

