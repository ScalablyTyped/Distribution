package typings.gherkin

import typings.gherkin.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGherkinLineMod {
  
  @JSImport("gherkin/dist/src/GherkinLine", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with GherkinLine {
    def this(lineText: String, lineNumber: Double) = this()
    
    /* CompleteClass */
    var column: Double = js.native
    
    /* CompleteClass */
    override def getLineText(indentToRemove: Double): String = js.native
    
    /* CompleteClass */
    override def getRestTrimmed(length: Double): String = js.native
    
    /* CompleteClass */
    override def getTableCells(): js.Array[Column] = js.native
    
    /* CompleteClass */
    override def getTags(): js.Array[Column] = js.native
    
    /* CompleteClass */
    var indent: Double = js.native
    
    /* CompleteClass */
    var isEmpty: Boolean = js.native
    
    /* private */ /* CompleteClass */
    override val lineNumber: Any = js.native
    
    /* private */ /* CompleteClass */
    override val lineText: Any = js.native
    
    /* CompleteClass */
    override def startsWith(prefix: String): Boolean = js.native
    
    /* CompleteClass */
    override def startsWithTitleKeyword(keyword: String): Boolean = js.native
    
    /* CompleteClass */
    var text: String = js.native
    
    /* CompleteClass */
    var trimmedLineText: String = js.native
  }
  
  trait GherkinLine extends StObject {
    
    var column: Double
    
    def getLineText(indentToRemove: Double): String
    
    def getRestTrimmed(length: Double): String
    
    def getTableCells(): js.Array[Column]
    
    def getTags(): js.Array[Column]
    
    var indent: Double
    
    var isEmpty: Boolean
    
    /* private */ val lineNumber: Any
    
    /* private */ val lineText: Any
    
    def startsWith(prefix: String): Boolean
    
    def startsWithTitleKeyword(keyword: String): Boolean
    
    var text: String
    
    var trimmedLineText: String
  }
  object GherkinLine {
    
    inline def apply(
      column: Double,
      getLineText: Double => String,
      getRestTrimmed: Double => String,
      getTableCells: () => js.Array[Column],
      getTags: () => js.Array[Column],
      indent: Double,
      isEmpty: Boolean,
      lineNumber: Any,
      lineText: Any,
      startsWith: String => Boolean,
      startsWithTitleKeyword: String => Boolean,
      text: String,
      trimmedLineText: String
    ): GherkinLine = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], getLineText = js.Any.fromFunction1(getLineText), getRestTrimmed = js.Any.fromFunction1(getRestTrimmed), getTableCells = js.Any.fromFunction0(getTableCells), getTags = js.Any.fromFunction0(getTags), indent = indent.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], startsWith = js.Any.fromFunction1(startsWith), startsWithTitleKeyword = js.Any.fromFunction1(startsWithTitleKeyword), text = text.asInstanceOf[js.Any], trimmedLineText = trimmedLineText.asInstanceOf[js.Any])
      __obj.asInstanceOf[GherkinLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GherkinLine] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setGetLineText(value: Double => String): Self = StObject.set(x, "getLineText", js.Any.fromFunction1(value))
      
      inline def setGetRestTrimmed(value: Double => String): Self = StObject.set(x, "getRestTrimmed", js.Any.fromFunction1(value))
      
      inline def setGetTableCells(value: () => js.Array[Column]): Self = StObject.set(x, "getTableCells", js.Any.fromFunction0(value))
      
      inline def setGetTags(value: () => js.Array[Column]): Self = StObject.set(x, "getTags", js.Any.fromFunction0(value))
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Any): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineText(value: Any): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
      
      inline def setStartsWith(value: String => Boolean): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
      
      inline def setStartsWithTitleKeyword(value: String => Boolean): Self = StObject.set(x, "startsWithTitleKeyword", js.Any.fromFunction1(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTrimmedLineText(value: String): Self = StObject.set(x, "trimmedLineText", value.asInstanceOf[js.Any])
    }
  }
}
