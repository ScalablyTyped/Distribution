package typings.gherkin.gherkinLineMod

import typings.gherkin.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GherkinLine extends js.Object {
  
  var column: Double = js.native
  
  def getLineText(indentToRemove: Double): String = js.native
  
  def getRestTrimmed(length: Double): String = js.native
  
  def getTableCells(): js.Array[Column] = js.native
  
  def getTags(): js.Array[Column] = js.native
  
  var indent: Double = js.native
  
  var isEmpty: Boolean = js.native
  
  val lineNumber: js.Any = js.native
  
  val lineText: js.Any = js.native
  
  def startsWith(prefix: String): Boolean = js.native
  
  def startsWithTitleKeyword(keyword: String): Boolean = js.native
  
  var text: String = js.native
  
  var trimmedLineText: String = js.native
}
object GherkinLine {
  
  @scala.inline
  def apply(
    column: Double,
    getLineText: Double => String,
    getRestTrimmed: Double => String,
    getTableCells: () => js.Array[Column],
    getTags: () => js.Array[Column],
    indent: Double,
    isEmpty: Boolean,
    lineNumber: js.Any,
    lineText: js.Any,
    startsWith: String => Boolean,
    startsWithTitleKeyword: String => Boolean,
    text: String,
    trimmedLineText: String
  ): GherkinLine = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], getLineText = js.Any.fromFunction1(getLineText), getRestTrimmed = js.Any.fromFunction1(getRestTrimmed), getTableCells = js.Any.fromFunction0(getTableCells), getTags = js.Any.fromFunction0(getTags), indent = indent.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], startsWith = js.Any.fromFunction1(startsWith), startsWithTitleKeyword = js.Any.fromFunction1(startsWithTitleKeyword), text = text.asInstanceOf[js.Any], trimmedLineText = trimmedLineText.asInstanceOf[js.Any])
    __obj.asInstanceOf[GherkinLine]
  }
  
  @scala.inline
  implicit class GherkinLineOps[Self <: GherkinLine] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLineText(value: Double => String): Self = this.set("getLineText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRestTrimmed(value: Double => String): Self = this.set("getRestTrimmed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTableCells(value: () => js.Array[Column]): Self = this.set("getTableCells", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTags(value: () => js.Array[Column]): Self = this.set("getTags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: js.Any): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineText(value: js.Any): Self = this.set("lineText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsWith(value: String => Boolean): Self = this.set("startsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartsWithTitleKeyword(value: String => Boolean): Self = this.set("startsWithTitleKeyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimmedLineText(value: String): Self = this.set("trimmedLineText", value.asInstanceOf[js.Any])
  }
}
