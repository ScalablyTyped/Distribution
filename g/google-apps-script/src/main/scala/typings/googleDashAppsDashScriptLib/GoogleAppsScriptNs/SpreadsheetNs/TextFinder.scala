package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFinder extends js.Object {
  def findAll(): js.Array[Range]
  def findNext(): Range
  def findPrevious(): Range
  def getCurrentMatch(): Range
  def ignoreDiacritics(ignoreDiacritics: scala.Boolean): TextFinder
  def matchCase(matchCase: scala.Boolean): TextFinder
  def matchEntireCell(matchEntireCell: scala.Boolean): TextFinder
  def matchFormulaText(matchFormulaText: scala.Boolean): TextFinder
  def replaceAllWith(replaceText: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def replaceWith(replaceText: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def startFrom(startRange: Range): TextFinder
  def useRegularExpression(useRegEx: scala.Boolean): TextFinder
}

object TextFinder {
  @scala.inline
  def apply(
    findAll: () => js.Array[Range],
    findNext: () => Range,
    findPrevious: () => Range,
    getCurrentMatch: () => Range,
    ignoreDiacritics: scala.Boolean => TextFinder,
    matchCase: scala.Boolean => TextFinder,
    matchEntireCell: scala.Boolean => TextFinder,
    matchFormulaText: scala.Boolean => TextFinder,
    replaceAllWith: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    replaceWith: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    startFrom: Range => TextFinder,
    useRegularExpression: scala.Boolean => TextFinder
  ): TextFinder = {
    val __obj = js.Dynamic.literal(findAll = js.Any.fromFunction0(findAll), findNext = js.Any.fromFunction0(findNext), findPrevious = js.Any.fromFunction0(findPrevious), getCurrentMatch = js.Any.fromFunction0(getCurrentMatch), ignoreDiacritics = js.Any.fromFunction1(ignoreDiacritics), matchCase = js.Any.fromFunction1(matchCase), matchEntireCell = js.Any.fromFunction1(matchEntireCell), matchFormulaText = js.Any.fromFunction1(matchFormulaText), replaceAllWith = js.Any.fromFunction1(replaceAllWith), replaceWith = js.Any.fromFunction1(replaceWith), startFrom = js.Any.fromFunction1(startFrom), useRegularExpression = js.Any.fromFunction1(useRegularExpression))
  
    __obj.asInstanceOf[TextFinder]
  }
}

