package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFinder extends js.Object {
  def findAll(): js.Array[Range]
  def findNext(): Range
  def findPrevious(): Range
  def getCurrentMatch(): Range
  def ignoreDiacritics(ignoreDiacritics: Boolean): TextFinder
  def matchCase(matchCase: Boolean): TextFinder
  def matchEntireCell(matchEntireCell: Boolean): TextFinder
  def matchFormulaText(matchFormulaText: Boolean): TextFinder
  def replaceAllWith(replaceText: String): Integer
  def replaceWith(replaceText: String): Integer
  def startFrom(startRange: Range): TextFinder
  def useRegularExpression(useRegEx: Boolean): TextFinder
}

object TextFinder {
  @scala.inline
  def apply(
    findAll: () => js.Array[Range],
    findNext: () => Range,
    findPrevious: () => Range,
    getCurrentMatch: () => Range,
    ignoreDiacritics: Boolean => TextFinder,
    matchCase: Boolean => TextFinder,
    matchEntireCell: Boolean => TextFinder,
    matchFormulaText: Boolean => TextFinder,
    replaceAllWith: String => Integer,
    replaceWith: String => Integer,
    startFrom: Range => TextFinder,
    useRegularExpression: Boolean => TextFinder
  ): TextFinder = {
    val __obj = js.Dynamic.literal(findAll = js.Any.fromFunction0(findAll), findNext = js.Any.fromFunction0(findNext), findPrevious = js.Any.fromFunction0(findPrevious), getCurrentMatch = js.Any.fromFunction0(getCurrentMatch), ignoreDiacritics = js.Any.fromFunction1(ignoreDiacritics), matchCase = js.Any.fromFunction1(matchCase), matchEntireCell = js.Any.fromFunction1(matchEntireCell), matchFormulaText = js.Any.fromFunction1(matchFormulaText), replaceAllWith = js.Any.fromFunction1(replaceAllWith), replaceWith = js.Any.fromFunction1(replaceWith), startFrom = js.Any.fromFunction1(startFrom), useRegularExpression = js.Any.fromFunction1(useRegularExpression))
  
    __obj.asInstanceOf[TextFinder]
  }
}

