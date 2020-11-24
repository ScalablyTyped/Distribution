package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Find or replace text within a range, sheet or spreadsheet. Can also specify search options.
  */
@js.native
trait TextFinder extends js.Object {
  
  def findAll(): js.Array[Range] = js.native
  
  def findNext(): Range | Null = js.native
  
  def findPrevious(): Range | Null = js.native
  
  def getCurrentMatch(): Range | Null = js.native
  
  def ignoreDiacritics(ignoreDiacritics: Boolean): TextFinder = js.native
  
  def matchCase(matchCase: Boolean): TextFinder = js.native
  
  def matchEntireCell(matchEntireCell: Boolean): TextFinder = js.native
  
  def matchFormulaText(matchFormulaText: Boolean): TextFinder = js.native
  
  def replaceAllWith(replaceText: String): Integer = js.native
  
  def replaceWith(replaceText: String): Integer = js.native
  
  def startFrom(startRange: Range): TextFinder = js.native
  
  def useRegularExpression(useRegEx: Boolean): TextFinder = js.native
}
object TextFinder {
  
  @scala.inline
  def apply(
    findAll: () => js.Array[Range],
    findNext: () => Range | Null,
    findPrevious: () => Range | Null,
    getCurrentMatch: () => Range | Null,
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
  
  @scala.inline
  implicit class TextFinderOps[Self <: TextFinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFindAll(value: () => js.Array[Range]): Self = this.set("findAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindNext(value: () => Range | Null): Self = this.set("findNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindPrevious(value: () => Range | Null): Self = this.set("findPrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentMatch(value: () => Range | Null): Self = this.set("getCurrentMatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIgnoreDiacritics(value: Boolean => TextFinder): Self = this.set("ignoreDiacritics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchCase(value: Boolean => TextFinder): Self = this.set("matchCase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchEntireCell(value: Boolean => TextFinder): Self = this.set("matchEntireCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchFormulaText(value: Boolean => TextFinder): Self = this.set("matchFormulaText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceAllWith(value: String => Integer): Self = this.set("replaceAllWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceWith(value: String => Integer): Self = this.set("replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartFrom(value: Range => TextFinder): Self = this.set("startFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseRegularExpression(value: Boolean => TextFinder): Self = this.set("useRegularExpression", js.Any.fromFunction1(value))
  }
}
