package typings.gherkin

import typings.gherkin.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gherkinLineMod {
  
  @JSImport("gherkin/dist/src/GherkinLine", JSImport.Default)
  @js.native
  class default protected () extends GherkinLine {
    def this(lineText: String, lineNumber: Double) = this()
  }
  
  @js.native
  trait GherkinLine extends StObject {
    
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
    implicit class GherkinLineMutableBuilder[Self <: GherkinLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetLineText(value: Double => String): Self = StObject.set(x, "getLineText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRestTrimmed(value: Double => String): Self = StObject.set(x, "getRestTrimmed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTableCells(value: () => js.Array[Column]): Self = StObject.set(x, "getTableCells", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTags(value: () => js.Array[Column]): Self = StObject.set(x, "getTags", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: js.Any): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineText(value: js.Any): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWith(value: String => Boolean): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartsWithTitleKeyword(value: String => Boolean): Self = StObject.set(x, "startsWithTitleKeyword", js.Any.fromFunction1(value))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimmedLineText(value: String): Self = StObject.set(x, "trimmedLineText", value.asInstanceOf[js.Any])
    }
  }
}
