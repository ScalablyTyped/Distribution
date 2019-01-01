package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetApp extends js.Object {
  var AutoFillSeries: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.AutoFillSeries */ js.Any = js.native
  var BandingTheme: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.BandingTheme */ js.Any = js.native
  var BooleanCriteria: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.BooleanCriteria */ js.Any = js.native
  var BorderStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.BorderStyle */ js.Any = js.native
  var CopyPasteType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.CopyPasteType */ js.Any = js.native
  var DataValidationCriteria: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.DataValidationCriteria */ js.Any = js.native
  var DeveloperMetadataLocationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType */ js.Any = js.native
  var DeveloperMetadataVisibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility */ js.Any = js.native
  var Dimension: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.Dimension */ js.Any = js.native
  var Direction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.Direction */ js.Any = js.native
  var GroupControlTogglePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition */ js.Any = js.native
  var InterpolationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.InterpolationType */ js.Any = js.native
  var PivotTableSummarizeFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction */ js.Any = js.native
  var PivotValueDisplayType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.PivotValueDisplayType */ js.Any = js.native
  var ProtectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.ProtectionType */ js.Any = js.native
  var RelativeDate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.RelativeDate */ js.Any = js.native
  var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.TextDirection */ js.Any = js.native
  var TextToColumnsDelimiter: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter */ js.Any = js.native
  var WrapStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Spreadsheet.WrapStrategy */ js.Any = js.native
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

