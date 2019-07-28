package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeList extends js.Object {
  def activate(): RangeList = js.native
  def breakApart(): RangeList = js.native
  def check(): RangeList = js.native
  def clear(): RangeList = js.native
  def clear(options: js.Any): RangeList = js.native
  def clearContent(): RangeList = js.native
  def clearDataValidations(): RangeList = js.native
  def clearFormat(): RangeList = js.native
  def clearNote(): RangeList = js.native
  def getRanges(): js.Array[Range] = js.native
  def insertCheckboxes(): RangeList = js.native
  def insertCheckboxes(checkedValue: js.Any): RangeList = js.native
  def insertCheckboxes(checkedValue: js.Any, uncheckedValue: js.Any): RangeList = js.native
  def removeCheckboxes(): RangeList = js.native
  def setBackground(color: String): RangeList = js.native
  def setBackgroundRGB(red: Integer, green: Integer, blue: Integer): RangeList = js.native
  def setBorder(
    top: Boolean,
    left: Boolean,
    bottom: Boolean,
    right: Boolean,
    vertical: Boolean,
    horizontal: Boolean
  ): RangeList = js.native
  def setBorder(
    top: Boolean,
    left: Boolean,
    bottom: Boolean,
    right: Boolean,
    vertical: Boolean,
    horizontal: Boolean,
    color: String,
    style: BorderStyle
  ): RangeList = js.native
  def setFontColor(color: String): RangeList = js.native
  def setFontFamily(fontFamily: String): RangeList = js.native
  def setFontLine(fontLine: String): RangeList = js.native
  def setFontSize(size: Integer): RangeList = js.native
  def setFontStyle(fontStyle: String): RangeList = js.native
  def setFontWeight(fontWeight: String): RangeList = js.native
  def setFormula(formula: String): RangeList = js.native
  def setFormulaR1C1(formula: String): RangeList = js.native
  def setHorizontalAlignment(alignment: String): RangeList = js.native
  def setNote(note: String): RangeList = js.native
  def setNumberFormat(numberFormat: String): RangeList = js.native
  def setShowHyperlink(showHyperlink: Boolean): RangeList = js.native
  def setTextDirection(direction: TextDirection): RangeList = js.native
  def setTextRotation(degrees: Integer): RangeList = js.native
  def setValue(value: js.Any): RangeList = js.native
  def setVerticalAlignment(alignment: String): RangeList = js.native
  def setVerticalText(isVertical: Boolean): RangeList = js.native
  def setWrap(isWrapEnabled: Boolean): RangeList = js.native
  def setWrapStrategy(strategy: WrapStrategy): RangeList = js.native
  def uncheck(): RangeList = js.native
}

