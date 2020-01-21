package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.Ui
import typings.googleAppsScript.GoogleAppsScript.Drive.File
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and create Google Sheets files. This class is the parent class for the Spreadsheet service.
  */
@js.native
trait SpreadsheetApp extends js.Object {
  var AutoFillSeries: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoFillSeries */ js.Any = js.native
  var BandingTheme: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BandingTheme */ js.Any = js.native
  var BooleanCriteria: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BooleanCriteria */ js.Any = js.native
  var BorderStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderStyle */ js.Any = js.native
  var ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any = js.native
  var CopyPasteType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CopyPasteType */ js.Any = js.native
  var DataExecutionErrorCode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataExecutionErrorCode */ js.Any = js.native
  var DataExecutionState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataExecutionState */ js.Any = js.native
  var DataSourceParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataSourceParameterType */ js.Any = js.native
  var DataSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataSourceType */ js.Any = js.native
  var DataValidationCriteria: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataValidationCriteria */ js.Any = js.native
  var DeveloperMetadataLocationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeveloperMetadataLocationType */ js.Any = js.native
  var DeveloperMetadataVisibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeveloperMetadataVisibility */ js.Any = js.native
  var Dimension: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Dimension */ js.Any = js.native
  var Direction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Direction */ js.Any = js.native
  var GroupControlTogglePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GroupControlTogglePosition */ js.Any = js.native
  var InterpolationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InterpolationType */ js.Any = js.native
  var PivotTableSummarizeFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PivotTableSummarizeFunction */ js.Any = js.native
  var PivotValueDisplayType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PivotValueDisplayType */ js.Any = js.native
  var ProtectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ProtectionType */ js.Any = js.native
  var RecalculationInterval: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RecalculationInterval */ js.Any = js.native
  var RelativeDate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RelativeDate */ js.Any = js.native
  var SheetType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetType */ js.Any = js.native
  var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any = js.native
  var TextToColumnsDelimiter: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextToColumnsDelimiter */ js.Any = js.native
  var ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any = js.native
  var WrapStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrapStrategy */ js.Any = js.native
  def create(name: String): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def create(name: String, rows: Integer, columns: Integer): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def enableAllDataSourcesExecution(): Unit = js.native
  def enableBigQueryExecution(): Unit = js.native
  def flush(): Unit = js.native
  def getActive(): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def getActiveRange(): Range = js.native
  def getActiveRangeList(): RangeList = js.native
  def getActiveSheet(): Sheet = js.native
  def getActiveSpreadsheet(): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def getCurrentCell(): Range = js.native
  def getSelection(): Selection = js.native
  def getUi(): Ui = js.native
  def newColor(): ColorBuilder = js.native
  def newConditionalFormatRule(): ConditionalFormatRuleBuilder = js.native
  def newDataSourceSpec(): DataSourceSpecBuilder = js.native
  def newDataValidation(): DataValidationBuilder = js.native
  def newFilterCriteria(): FilterCriteriaBuilder = js.native
  def newRichTextValue(): RichTextValueBuilder = js.native
  def newTextStyle(): TextStyleBuilder = js.native
  def open(file: File): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def openById(id: String): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def openByUrl(url: String): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet = js.native
  def setActiveRange(range: Range): Range = js.native
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  def setActiveSheet(sheet: Sheet): Sheet = js.native
  def setActiveSheet(sheet: Sheet, restoreSelection: Boolean): Sheet = js.native
  def setActiveSpreadsheet(newActiveSpreadsheet: typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet): Unit = js.native
  def setCurrentCell(cell: Range): Range = js.native
}

