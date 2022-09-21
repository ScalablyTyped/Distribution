package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Charts.DataTable
import typings.googleAppsScript.GoogleAppsScript.Integer
import typings.googleAppsScript.anon.CommentsOnly
import typings.googleAppsScript.anon.ContentsOnly
import typings.googleAppsScript.googleAppsScriptStrings.bottom
import typings.googleAppsScript.googleAppsScriptStrings.center
import typings.googleAppsScript.googleAppsScriptStrings.left
import typings.googleAppsScript.googleAppsScriptStrings.middle
import typings.googleAppsScript.googleAppsScriptStrings.normal
import typings.googleAppsScript.googleAppsScriptStrings.right
import typings.googleAppsScript.googleAppsScriptStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify spreadsheet ranges. A range can be a single cell in a sheet or a group of
  * adjacent cells in a sheet.
  */
@js.native
trait Range extends StObject {
  
  def activate(): Range = js.native
  
  def activateAsCurrentCell(): Range = js.native
  
  def addDeveloperMetadata(key: String): Range = js.native
  def addDeveloperMetadata(key: String, value: String): Range = js.native
  def addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): Range = js.native
  def addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): Range = js.native
  
  def applyColumnBanding(): Banding = js.native
  def applyColumnBanding(bandingTheme: BandingTheme): Banding = js.native
  def applyColumnBanding(bandingTheme: BandingTheme, showHeader: Boolean, showFooter: Boolean): Banding = js.native
  
  def applyRowBanding(): Banding = js.native
  def applyRowBanding(bandingTheme: BandingTheme): Banding = js.native
  def applyRowBanding(bandingTheme: BandingTheme, showHeader: Boolean, showFooter: Boolean): Banding = js.native
  
  def autoFill(destination: Range, series: AutoFillSeries): Unit = js.native
  
  def autoFillToNeighbor(series: AutoFillSeries): Unit = js.native
  
  def breakApart(): Range = js.native
  
  def canEdit(): Boolean = js.native
  
  def check(): Range = js.native
  
  def clear(): Range = js.native
  def clear(options: CommentsOnly): Range = js.native
  
  def clearContent(): Range = js.native
  
  def clearDataValidations(): Range = js.native
  
  def clearFormat(): Range = js.native
  
  def clearNote(): Range = js.native
  
  def collapseGroups(): Range = js.native
  
  def copyFormatToRange(gridId: Integer, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer): Unit = js.native
  def copyFormatToRange(sheet: Sheet, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer): Unit = js.native
  
  def copyTo(destination: Range): Unit = js.native
  def copyTo(destination: Range, copyPasteType: CopyPasteType, transposed: Boolean): Unit = js.native
  def copyTo(destination: Range, options: ContentsOnly): Unit = js.native
  
  def copyValuesToRange(gridId: Integer, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer): Unit = js.native
  def copyValuesToRange(sheet: Sheet, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer): Unit = js.native
  
  def createDeveloperMetadataFinder(): DeveloperMetadataFinder = js.native
  
  def createFilter(): Filter = js.native
  
  def createPivotTable(sourceData: Range): PivotTable = js.native
  
  def createTextFinder(findText: String): TextFinder = js.native
  
  def deleteCells(shiftDimension: Dimension): Unit = js.native
  
  def expandGroups(): Range = js.native
  
  def getA1Notation(): String = js.native
  
  def getBackground(): String = js.native
  
  def getBackgrounds(): js.Array[js.Array[String]] = js.native
  
  def getBandings(): js.Array[Banding] = js.native
  
  def getCell(row: Integer, column: Integer): Range = js.native
  
  def getColumn(): Integer = js.native
  
  def getDataRegion(): Range = js.native
  def getDataRegion(dimension: Dimension): Range = js.native
  
  def getDataSourceTables(): js.Array[DataSourceTable] = js.native
  
  def getDataSourceUrl(): String = js.native
  
  def getDataTable(): DataTable = js.native
  def getDataTable(firstRowIsHeader: Boolean): DataTable = js.native
  
  def getDataValidation(): DataValidation | Null = js.native
  
  def getDataValidations(): js.Array[js.Array[DataValidation | Null]] = js.native
  
  def getDeveloperMetadata(): js.Array[DeveloperMetadata] = js.native
  
  def getDisplayValue(): String = js.native
  
  def getDisplayValues(): js.Array[js.Array[String]] = js.native
  
  def getFilter(): Filter | Null = js.native
  
  def getFontColor(): String = js.native
  
  def getFontColors(): js.Array[js.Array[String]] = js.native
  
  def getFontFamilies(): js.Array[js.Array[String]] = js.native
  
  def getFontFamily(): String = js.native
  
  def getFontLine(): FontLine = js.native
  
  def getFontLines(): js.Array[js.Array[FontLine]] = js.native
  
  def getFontSize(): Integer = js.native
  
  def getFontSizes(): js.Array[js.Array[Integer]] = js.native
  
  def getFontStyle(): FontStyle = js.native
  
  def getFontStyles(): js.Array[js.Array[FontStyle]] = js.native
  
  def getFontWeight(): FontWeight = js.native
  
  def getFontWeights(): js.Array[js.Array[FontWeight]] = js.native
  
  def getFormula(): String = js.native
  
  def getFormulaR1C1(): String | Null = js.native
  
  def getFormulas(): js.Array[js.Array[String]] = js.native
  
  def getFormulasR1C1(): js.Array[js.Array[String | Null]] = js.native
  
  def getGridId(): Integer = js.native
  
  def getHeight(): Integer = js.native
  
  def getHorizontalAlignment(): String = js.native
  
  def getHorizontalAlignments(): js.Array[js.Array[String]] = js.native
  
  def getLastColumn(): Integer = js.native
  
  def getLastRow(): Integer = js.native
  
  def getMergedRanges(): js.Array[Range] = js.native
  
  def getNextDataCell(direction: Direction): Range = js.native
  
  def getNote(): String = js.native
  
  def getNotes(): js.Array[js.Array[String]] = js.native
  
  def getNumColumns(): Integer = js.native
  
  def getNumRows(): Integer = js.native
  
  def getNumberFormat(): String = js.native
  
  def getNumberFormats(): js.Array[js.Array[String]] = js.native
  
  def getRichTextValue(): RichTextValue | Null = js.native
  
  def getRichTextValues(): js.Array[js.Array[RichTextValue | Null]] = js.native
  
  def getRow(): Integer = js.native
  
  def getRowIndex(): Integer = js.native
  
  def getSheet(): Sheet = js.native
  
  def getTextDirection(): TextDirection | Null = js.native
  
  def getTextDirections(): js.Array[js.Array[TextDirection | Null]] = js.native
  
  def getTextRotation(): TextRotation = js.native
  
  def getTextRotations(): js.Array[js.Array[TextRotation]] = js.native
  
  def getTextStyle(): TextStyle = js.native
  
  def getTextStyles(): js.Array[js.Array[TextStyle]] = js.native
  
  def getValue(): Any = js.native
  
  def getValues(): js.Array[js.Array[Any]] = js.native
  
  def getVerticalAlignment(): String = js.native
  
  def getVerticalAlignments(): js.Array[js.Array[String]] = js.native
  
  def getWidth(): Integer = js.native
  
  def getWrap(): Boolean = js.native
  
  def getWrapStrategies(): js.Array[js.Array[WrapStrategy]] = js.native
  
  def getWrapStrategy(): WrapStrategy = js.native
  
  def getWraps(): js.Array[js.Array[Boolean]] = js.native
  
  def insertCells(shiftDimension: Dimension): Range = js.native
  
  def insertCheckboxes(): Range = js.native
  def insertCheckboxes(checkedValue: Any): Range = js.native
  def insertCheckboxes(checkedValue: Any, uncheckedValue: Any): Range = js.native
  
  def isBlank(): Boolean = js.native
  
  def isChecked(): Boolean | Null = js.native
  
  def isEndColumnBounded(): Boolean = js.native
  
  def isEndRowBounded(): Boolean = js.native
  
  def isPartOfMerge(): Boolean = js.native
  
  def isStartColumnBounded(): Boolean = js.native
  
  def isStartRowBounded(): Boolean = js.native
  
  def merge(): Range = js.native
  
  def mergeAcross(): Range = js.native
  
  def mergeVertically(): Range = js.native
  
  def moveTo(target: Range): Unit = js.native
  
  def offset(rowOffset: Integer, columnOffset: Integer): Range = js.native
  def offset(rowOffset: Integer, columnOffset: Integer, numRows: Integer): Range = js.native
  def offset(rowOffset: Integer, columnOffset: Integer, numRows: Integer, numColumns: Integer): Range = js.native
  
  def protect(): Protection = js.native
  
  def randomize(): Range = js.native
  
  def removeCheckboxes(): Range = js.native
  
  def removeDuplicates(): Range = js.native
  def removeDuplicates(columnsToCompare: js.Array[Integer]): Range = js.native
  
  def setBackground(): Range = js.native
  def setBackground(color: String): Range = js.native
  
  def setBackgroundRGB(red: Integer, green: Integer, blue: Integer): Range = js.native
  
  def setBackgrounds(color: js.Array[js.Array[String | Null]]): Range = js.native
  
  def setBorder(
    top: Boolean | Null,
    left: Boolean | Null,
    bottom: Boolean | Null,
    right: Boolean | Null,
    vertical: Boolean | Null,
    horizontal: Boolean | Null
  ): Range = js.native
  def setBorder(
    top: Boolean | Null,
    left: Boolean | Null,
    bottom: Boolean | Null,
    right: Boolean | Null,
    vertical: Boolean | Null,
    horizontal: Boolean | Null,
    color: String | Null,
    style: BorderStyle | Null
  ): Range = js.native
  
  def setDataValidation(): Range = js.native
  def setDataValidation(rule: DataValidation): Range = js.native
  
  def setDataValidations(rules: js.Array[js.Array[DataValidation | Null]]): Range = js.native
  
  def setFontColor(): Range = js.native
  def setFontColor(color: String): Range = js.native
  
  def setFontColors(colors: js.Array[js.Array[Any]]): Range = js.native
  
  def setFontFamilies(fontFamilies: js.Array[js.Array[String | Null]]): Range = js.native
  
  def setFontFamily(): Range = js.native
  def setFontFamily(fontFamily: String): Range = js.native
  
  def setFontLine(): Range = js.native
  def setFontLine(fontLine: FontLine): Range = js.native
  
  def setFontLines(fontLines: js.Array[js.Array[FontLine | Null]]): Range = js.native
  
  def setFontSize(size: Integer): Range = js.native
  
  def setFontSizes(sizes: js.Array[js.Array[Integer]]): Range = js.native
  
  def setFontStyle(): Range = js.native
  def setFontStyle(fontStyle: FontStyle): Range = js.native
  
  def setFontStyles(fontStyles: js.Array[js.Array[FontStyle | Null]]): Range = js.native
  
  def setFontWeight(): Range = js.native
  def setFontWeight(fontWeight: FontWeight): Range = js.native
  
  def setFontWeights(fontWeights: js.Array[js.Array[FontWeight | Null]]): Range = js.native
  
  def setFormula(formula: String): Range = js.native
  
  def setFormulaR1C1(formula: String): Range = js.native
  
  def setFormulas(formulas: js.Array[js.Array[String]]): Range = js.native
  
  def setFormulasR1C1(formulas: js.Array[js.Array[String]]): Range = js.native
  
  def setHorizontalAlignment(): Range = js.native
  def setHorizontalAlignment(alignment: left | center | normal | right): Range = js.native
  
  def setHorizontalAlignments(alignments: js.Array[js.Array[left | center | normal | right | Null]]): Range = js.native
  
  def setNote(): Range = js.native
  def setNote(note: String): Range = js.native
  
  def setNotes(notes: js.Array[js.Array[String | Null]]): Range = js.native
  
  def setNumberFormat(numberFormat: String): Range = js.native
  
  def setNumberFormats(numberFormats: js.Array[js.Array[String]]): Range = js.native
  
  def setRichTextValue(value: RichTextValue): Range = js.native
  
  def setRichTextValues(values: js.Array[js.Array[RichTextValue]]): Range = js.native
  
  def setShowHyperlink(showHyperlink: Boolean): Range = js.native
  
  def setTextDirection(): Range = js.native
  def setTextDirection(direction: TextDirection): Range = js.native
  
  def setTextDirections(directions: js.Array[js.Array[TextDirection | Null]]): Range = js.native
  
  def setTextRotation(degrees: Integer): Range = js.native
  def setTextRotation(rotation: TextRotation): Range = js.native
  
  def setTextRotations(rotations: js.Array[js.Array[TextRotation]]): Range = js.native
  
  def setTextStyle(style: TextStyle): Range = js.native
  
  def setTextStyles(styles: js.Array[js.Array[TextStyle]]): Range = js.native
  
  def setValue(value: Any): Range = js.native
  
  def setValues(values: js.Array[js.Array[Any]]): Range = js.native
  
  def setVerticalAlignment(): Range = js.native
  def setVerticalAlignment(alignment: top | middle | bottom): Range = js.native
  
  def setVerticalAlignments(alignments: js.Array[js.Array[top | middle | bottom | Null]]): Range = js.native
  
  def setVerticalText(isVertical: Boolean): Range = js.native
  
  def setWrap(isWrapEnabled: Boolean): Range = js.native
  
  def setWrapStrategies(strategies: js.Array[js.Array[WrapStrategy]]): Range = js.native
  
  def setWrapStrategy(strategy: WrapStrategy): Range = js.native
  
  def setWraps(isWrapEnabled: js.Array[js.Array[Boolean]]): Range = js.native
  
  def shiftColumnGroupDepth(delta: Integer): Range = js.native
  
  def shiftRowGroupDepth(delta: Integer): Range = js.native
  
  def sort(sortSpecObj: Any): Range = js.native
  
  def splitTextToColumns(): Unit = js.native
  def splitTextToColumns(delimiter: String): Unit = js.native
  def splitTextToColumns(delimiter: TextToColumnsDelimiter): Unit = js.native
  
  def trimWhitespace(): Range = js.native
  
  def uncheck(): Range = js.native
}
