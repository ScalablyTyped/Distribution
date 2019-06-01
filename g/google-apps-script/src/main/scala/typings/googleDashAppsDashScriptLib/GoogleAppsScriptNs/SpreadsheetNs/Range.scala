package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  def activate(): Range = js.native
  def activateAsCurrentCell(): Range = js.native
  def addDeveloperMetadata(key: java.lang.String): Range = js.native
  def addDeveloperMetadata(key: java.lang.String, value: java.lang.String): Range = js.native
  def addDeveloperMetadata(key: java.lang.String, value: java.lang.String, visibility: DeveloperMetadataVisibility): Range = js.native
  def addDeveloperMetadata(key: java.lang.String, visibility: DeveloperMetadataVisibility): Range = js.native
  def applyColumnBanding(): Banding = js.native
  def applyColumnBanding(bandingTheme: BandingTheme): Banding = js.native
  def applyColumnBanding(bandingTheme: BandingTheme, showHeader: scala.Boolean, showFooter: scala.Boolean): Banding = js.native
  def applyRowBanding(): Banding = js.native
  def applyRowBanding(bandingTheme: BandingTheme): Banding = js.native
  def applyRowBanding(bandingTheme: BandingTheme, showHeader: scala.Boolean, showFooter: scala.Boolean): Banding = js.native
  def autoFill(destination: Range, series: AutoFillSeries): scala.Unit = js.native
  def autoFillToNeighbor(series: AutoFillSeries): scala.Unit = js.native
  def breakApart(): Range = js.native
  def canEdit(): scala.Boolean = js.native
  def check(): Range = js.native
  def clear(): Range = js.native
  def clear(options: js.Any): Range = js.native
  def clearContent(): Range = js.native
  def clearDataValidations(): Range = js.native
  def clearFormat(): Range = js.native
  def clearNote(): Range = js.native
  def collapseGroups(): Range = js.native
  def copyFormatToRange(
    gridId: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columnEnd: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    rowEnd: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def copyFormatToRange(
    sheet: Sheet,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columnEnd: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    rowEnd: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def copyTo(destination: Range): scala.Unit = js.native
  def copyTo(destination: Range, copyPasteType: CopyPasteType, transposed: scala.Boolean): scala.Unit = js.native
  def copyTo(destination: Range, options: js.Any): scala.Unit = js.native
  def copyValuesToRange(
    gridId: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columnEnd: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    rowEnd: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def copyValuesToRange(
    sheet: Sheet,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columnEnd: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    rowEnd: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def createDeveloperMetadataFinder(): DeveloperMetadataFinder = js.native
  def createFilter(): Filter = js.native
  def createPivotTable(sourceData: Range): PivotTable = js.native
  def createTextFinder(findText: java.lang.String): TextFinder = js.native
  def deleteCells(shiftDimension: Dimension): scala.Unit = js.native
  def expandGroups(): Range = js.native
  def getA1Notation(): java.lang.String = js.native
  def getBackground(): java.lang.String = js.native
  def getBackgrounds(): js.Array[js.Array[java.lang.String]] = js.native
  def getBandings(): js.Array[Banding] = js.native
  def getCell(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Range = js.native
  def getColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getDataRegion(): Range = js.native
  def getDataRegion(dimension: Dimension): Range = js.native
  def getDataSourceTables(): js.Array[DataSourceTable] = js.native
  def getDataSourceUrl(): java.lang.String = js.native
  def getDataTable(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.DataTable = js.native
  def getDataTable(firstRowIsHeader: scala.Boolean): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.DataTable = js.native
  def getDataValidation(): DataValidation = js.native
  def getDataValidations(): js.Array[js.Array[DataValidation]] = js.native
  def getDeveloperMetadata(): js.Array[DeveloperMetadata] = js.native
  def getDisplayValue(): java.lang.String = js.native
  def getDisplayValues(): js.Array[js.Array[java.lang.String]] = js.native
  def getFilter(): Filter = js.native
  def getFontColor(): java.lang.String = js.native
  def getFontColors(): js.Array[js.Array[java.lang.String]] = js.native
  def getFontFamilies(): js.Array[js.Array[java.lang.String]] = js.native
  def getFontFamily(): java.lang.String = js.native
  def getFontLine(): java.lang.String = js.native
  def getFontLines(): js.Array[js.Array[java.lang.String]] = js.native
  def getFontSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getFontSizes(): js.Array[js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]] = js.native
  def getFontStyle(): java.lang.String = js.native
  def getFontStyles(): js.Array[js.Array[java.lang.String]] = js.native
  def getFontWeight(): java.lang.String = js.native
  def getFontWeights(): js.Array[js.Array[java.lang.String]] = js.native
  def getFormula(): java.lang.String = js.native
  def getFormulaR1C1(): java.lang.String = js.native
  def getFormulas(): js.Array[js.Array[java.lang.String]] = js.native
  def getFormulasR1C1(): js.Array[js.Array[java.lang.String]] = js.native
  def getGridId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getHeight(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getHorizontalAlignment(): java.lang.String = js.native
  def getHorizontalAlignments(): js.Array[js.Array[java.lang.String]] = js.native
  def getLastColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLastRow(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMergedRanges(): js.Array[Range] = js.native
  def getNextDataCell(direction: Direction): Range = js.native
  def getNote(): java.lang.String = js.native
  def getNotes(): js.Array[js.Array[java.lang.String]] = js.native
  def getNumColumns(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getNumRows(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getNumberFormat(): java.lang.String = js.native
  def getNumberFormats(): js.Array[js.Array[java.lang.String]] = js.native
  def getRichTextValue(): RichTextValue = js.native
  def getRichTextValues(): js.Array[js.Array[RichTextValue]] = js.native
  def getRow(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getRowIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getSheet(): Sheet = js.native
  def getTextDirection(): TextDirection = js.native
  def getTextDirections(): js.Array[js.Array[TextDirection]] = js.native
  def getTextRotation(): TextRotation = js.native
  def getTextRotations(): js.Array[js.Array[TextRotation]] = js.native
  def getTextStyle(): TextStyle = js.native
  def getTextStyles(): js.Array[js.Array[TextStyle]] = js.native
  def getValue(): js.Any = js.native
  def getValues(): js.Array[js.Array[_]] = js.native
  def getVerticalAlignment(): java.lang.String = js.native
  def getVerticalAlignments(): js.Array[js.Array[java.lang.String]] = js.native
  def getWidth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getWrap(): scala.Boolean = js.native
  def getWrapStrategies(): js.Array[js.Array[WrapStrategy]] = js.native
  def getWrapStrategy(): WrapStrategy = js.native
  def getWraps(): js.Array[js.Array[scala.Boolean]] = js.native
  def insertCells(shiftDimension: Dimension): Range = js.native
  def insertCheckboxes(): Range = js.native
  def insertCheckboxes(checkedValue: js.Any): Range = js.native
  def insertCheckboxes(checkedValue: js.Any, uncheckedValue: js.Any): Range = js.native
  def isBlank(): scala.Boolean = js.native
  def isChecked(): scala.Boolean = js.native
  def isEndColumnBounded(): scala.Boolean = js.native
  def isEndRowBounded(): scala.Boolean = js.native
  def isPartOfMerge(): scala.Boolean = js.native
  def isStartColumnBounded(): scala.Boolean = js.native
  def isStartRowBounded(): scala.Boolean = js.native
  def merge(): Range = js.native
  def mergeAcross(): Range = js.native
  def mergeVertically(): Range = js.native
  def moveTo(target: Range): scala.Unit = js.native
  def offset(
    rowOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columnOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Range = js.native
  def offset(
    rowOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columnOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Range = js.native
  def offset(
    rowOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columnOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Range = js.native
  def protect(): Protection = js.native
  def randomize(): Range = js.native
  def removeCheckboxes(): Range = js.native
  def setBackground(color: java.lang.String): Range = js.native
  def setBackgroundRGB(
    red: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    green: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Range = js.native
  def setBackgrounds(color: js.Array[js.Array[java.lang.String]]): Range = js.native
  def setBorder(
    top: scala.Boolean,
    left: scala.Boolean,
    bottom: scala.Boolean,
    right: scala.Boolean,
    vertical: scala.Boolean,
    horizontal: scala.Boolean
  ): Range = js.native
  def setBorder(
    top: scala.Boolean,
    left: scala.Boolean,
    bottom: scala.Boolean,
    right: scala.Boolean,
    vertical: scala.Boolean,
    horizontal: scala.Boolean,
    color: java.lang.String,
    style: BorderStyle
  ): Range = js.native
  def setDataValidation(rule: DataValidation): Range = js.native
  def setDataValidations(rules: js.Array[js.Array[DataValidation]]): Range = js.native
  def setFontColor(color: java.lang.String): Range = js.native
  def setFontColors(colors: js.Array[js.Array[_]]): Range = js.native
  def setFontFamilies(fontFamilies: js.Array[js.Array[_]]): Range = js.native
  def setFontFamily(fontFamily: java.lang.String): Range = js.native
  def setFontLine(fontLine: java.lang.String): Range = js.native
  def setFontLines(fontLines: js.Array[js.Array[_]]): Range = js.native
  def setFontSize(size: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Range = js.native
  def setFontSizes(sizes: js.Array[js.Array[_]]): Range = js.native
  def setFontStyle(fontStyle: java.lang.String): Range = js.native
  def setFontStyles(fontStyles: js.Array[js.Array[_]]): Range = js.native
  def setFontWeight(fontWeight: java.lang.String): Range = js.native
  def setFontWeights(fontWeights: js.Array[js.Array[_]]): Range = js.native
  def setFormula(formula: java.lang.String): Range = js.native
  def setFormulaR1C1(formula: java.lang.String): Range = js.native
  def setFormulas(formulas: js.Array[js.Array[java.lang.String]]): Range = js.native
  def setFormulasR1C1(formulas: js.Array[js.Array[java.lang.String]]): Range = js.native
  def setHorizontalAlignment(alignment: java.lang.String): Range = js.native
  def setHorizontalAlignments(alignments: js.Array[js.Array[_]]): Range = js.native
  def setNote(note: java.lang.String): Range = js.native
  def setNotes(notes: js.Array[js.Array[_]]): Range = js.native
  def setNumberFormat(numberFormat: java.lang.String): Range = js.native
  def setNumberFormats(numberFormats: js.Array[js.Array[_]]): Range = js.native
  def setRichTextValue(value: RichTextValue): Range = js.native
  def setRichTextValues(values: js.Array[js.Array[RichTextValue]]): Range = js.native
  def setShowHyperlink(showHyperlink: scala.Boolean): Range = js.native
  def setTextDirection(direction: TextDirection): Range = js.native
  def setTextDirections(directions: js.Array[js.Array[TextDirection]]): Range = js.native
  def setTextRotation(degrees: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Range = js.native
  def setTextRotation(rotation: TextRotation): Range = js.native
  def setTextRotations(rotations: js.Array[js.Array[TextRotation]]): Range = js.native
  def setTextStyle(style: TextStyle): Range = js.native
  def setTextStyles(styles: js.Array[js.Array[TextStyle]]): Range = js.native
  def setValue(value: js.Any): Range = js.native
  def setValues(values: js.Array[js.Array[_]]): Range = js.native
  def setVerticalAlignment(alignment: java.lang.String): Range = js.native
  def setVerticalAlignments(alignments: js.Array[js.Array[_]]): Range = js.native
  def setVerticalText(isVertical: scala.Boolean): Range = js.native
  def setWrap(isWrapEnabled: scala.Boolean): Range = js.native
  def setWrapStrategies(strategies: js.Array[js.Array[WrapStrategy]]): Range = js.native
  def setWrapStrategy(strategy: WrapStrategy): Range = js.native
  def setWraps(isWrapEnabled: js.Array[js.Array[_]]): Range = js.native
  def shiftColumnGroupDepth(delta: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Range = js.native
  def shiftRowGroupDepth(delta: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Range = js.native
  def sort(sortSpecObj: js.Any): Range = js.native
  def splitTextToColumns(): scala.Unit = js.native
  def splitTextToColumns(delimiter: TextToColumnsDelimiter): scala.Unit = js.native
  def splitTextToColumns(delimiter: java.lang.String): scala.Unit = js.native
  def uncheck(): Range = js.native
}

