package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeList extends js.Object {
  def activate(): RangeList = js.native
  def breakApart(): RangeList = js.native
  def clear(): RangeList = js.native
  def clear(options: js.Object): RangeList = js.native
  def clearContent(): RangeList = js.native
  def clearDataValidations(): RangeList = js.native
  def clearFormat(): RangeList = js.native
  def clearNote(): RangeList = js.native
  def getRanges(): js.Array[Range] = js.native
  def setBackground(color: java.lang.String): RangeList = js.native
  def setBackgroundRGB(
    red: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    green: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): RangeList = js.native
  def setBorder(
    top: scala.Boolean,
    left: scala.Boolean,
    bottom: scala.Boolean,
    right: scala.Boolean,
    vertical: scala.Boolean,
    horizontal: scala.Boolean
  ): RangeList = js.native
  def setBorder(
    top: scala.Boolean,
    left: scala.Boolean,
    bottom: scala.Boolean,
    right: scala.Boolean,
    vertical: scala.Boolean,
    horizontal: scala.Boolean,
    color: java.lang.String,
    style: BorderStyle
  ): RangeList = js.native
  def setFontColor(color: java.lang.String): RangeList = js.native
  def setFontFamily(fontFamily: java.lang.String): RangeList = js.native
  def setFontLine(fontLine: java.lang.String): RangeList = js.native
  def setFontSize(size: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RangeList = js.native
  def setFontStyle(fontStyle: java.lang.String): RangeList = js.native
  def setFontWeight(fontWeight: java.lang.String): RangeList = js.native
  def setFormula(formula: java.lang.String): RangeList = js.native
  def setFormulaR1C1(formula: java.lang.String): RangeList = js.native
  def setHorizontalAlignment(alignment: java.lang.String): RangeList = js.native
  def setNote(note: java.lang.String): RangeList = js.native
  def setNumberFormat(numberFormat: java.lang.String): RangeList = js.native
  def setShowHyperlink(showHyperlink: scala.Boolean): RangeList = js.native
  def setTextDirection(direction: TextDirection): RangeList = js.native
  def setTextRotation(degrees: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RangeList = js.native
  def setValue(value: js.Object): RangeList = js.native
  def setVerticalAlignment(alignment: java.lang.String): RangeList = js.native
  def setVerticalText(isVertical: scala.Boolean): RangeList = js.native
  def setWrap(isWrapEnabled: scala.Boolean): RangeList = js.native
  def setWrapStrategy(strategy: WrapStrategy): RangeList = js.native
}

