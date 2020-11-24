package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import typings.googleAppsScript.anon.CommentsOnly
import typings.googleAppsScript.googleAppsScriptStrings.bottom
import typings.googleAppsScript.googleAppsScriptStrings.center
import typings.googleAppsScript.googleAppsScriptStrings.left
import typings.googleAppsScript.googleAppsScriptStrings.middle
import typings.googleAppsScript.googleAppsScriptStrings.normal
import typings.googleAppsScript.googleAppsScriptStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of one or more Range instances in the same sheet. You can use this class
  * to apply operations on collections of non-adjacent ranges or cells.
  */
@js.native
trait RangeList extends js.Object {
  
  def activate(): RangeList = js.native
  
  def breakApart(): RangeList = js.native
  
  def check(): RangeList = js.native
  
  def clear(): RangeList = js.native
  def clear(options: CommentsOnly): RangeList = js.native
  
  def clearContent(): RangeList = js.native
  
  def clearDataValidations(): RangeList = js.native
  
  def clearFormat(): RangeList = js.native
  
  def clearNote(): RangeList = js.native
  
  def getRanges(): js.Array[Range] = js.native
  
  def insertCheckboxes(): RangeList = js.native
  def insertCheckboxes(checkedValue: js.Any): RangeList = js.native
  def insertCheckboxes(checkedValue: js.Any, uncheckedValue: js.Any): RangeList = js.native
  
  def removeCheckboxes(): RangeList = js.native
  
  def setBackground(): RangeList = js.native
  def setBackground(color: String): RangeList = js.native
  
  def setBackgroundRGB(red: Integer, green: Integer, blue: Integer): RangeList = js.native
  
  def setBorder(
    top: Boolean | Null,
    left: Boolean | Null,
    bottom: Boolean | Null,
    right: Boolean | Null,
    vertical: Boolean | Null,
    horizontal: Boolean | Null
  ): RangeList = js.native
  def setBorder(
    top: Boolean | Null,
    left: Boolean | Null,
    bottom: Boolean | Null,
    right: Boolean | Null,
    vertical: Boolean | Null,
    horizontal: Boolean | Null,
    color: String | Null,
    style: BorderStyle | Null
  ): RangeList = js.native
  
  def setFontColor(): RangeList = js.native
  def setFontColor(color: String): RangeList = js.native
  
  def setFontFamily(): RangeList = js.native
  def setFontFamily(fontFamily: String): RangeList = js.native
  
  def setFontLine(): RangeList = js.native
  def setFontLine(fontLine: FontLine): RangeList = js.native
  
  def setFontSize(size: Integer): RangeList = js.native
  
  def setFontStyle(): RangeList = js.native
  def setFontStyle(fontStyle: FontStyle): RangeList = js.native
  
  def setFontWeight(): RangeList = js.native
  def setFontWeight(fontWeight: FontWeight): RangeList = js.native
  
  def setFormula(formula: String): RangeList = js.native
  
  def setFormulaR1C1(formula: String): RangeList = js.native
  
  def setHorizontalAlignment(): RangeList = js.native
  @JSName("setHorizontalAlignment")
  def setHorizontalAlignment_center(alignment: center): RangeList = js.native
  @JSName("setHorizontalAlignment")
  def setHorizontalAlignment_left(alignment: left): RangeList = js.native
  @JSName("setHorizontalAlignment")
  def setHorizontalAlignment_normal(alignment: normal): RangeList = js.native
  
  def setNote(): RangeList = js.native
  def setNote(note: String): RangeList = js.native
  
  def setNumberFormat(numberFormat: String): RangeList = js.native
  
  def setShowHyperlink(showHyperlink: Boolean): RangeList = js.native
  
  def setTextDirection(): RangeList = js.native
  def setTextDirection(direction: TextDirection): RangeList = js.native
  
  def setTextRotation(degrees: Integer): RangeList = js.native
  
  def setValue(value: js.Any): RangeList = js.native
  
  def setVerticalAlignment(): RangeList = js.native
  @JSName("setVerticalAlignment")
  def setVerticalAlignment_bottom(alignment: bottom): RangeList = js.native
  @JSName("setVerticalAlignment")
  def setVerticalAlignment_middle(alignment: middle): RangeList = js.native
  @JSName("setVerticalAlignment")
  def setVerticalAlignment_top(alignment: top): RangeList = js.native
  
  def setVerticalText(isVertical: Boolean): RangeList = js.native
  
  def setWrap(isWrapEnabled: Boolean): RangeList = js.native
  
  def setWrapStrategy(strategy: WrapStrategy): RangeList = js.native
  
  def trimWhitespace(): RangeList = js.native
  
  def uncheck(): RangeList = js.native
}
