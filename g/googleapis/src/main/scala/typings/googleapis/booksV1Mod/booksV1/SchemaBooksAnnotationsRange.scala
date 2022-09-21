package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBooksAnnotationsRange extends StObject {
  
  /**
    * The offset from the ending position.
    */
  var endOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ending position for the range.
    */
  var endPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The offset from the starting position.
    */
  var startOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The starting position for the range.
    */
  var startPosition: js.UndefOr[String | Null] = js.undefined
}
object SchemaBooksAnnotationsRange {
  
  inline def apply(): SchemaBooksAnnotationsRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooksAnnotationsRange]
  }
  
  extension [Self <: SchemaBooksAnnotationsRange](x: Self) {
    
    inline def setEndOffset(value: String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetNull: Self = StObject.set(x, "endOffset", null)
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionNull: Self = StObject.set(x, "endPosition", null)
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setStartOffset(value: String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetNull: Self = StObject.set(x, "startOffset", null)
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionNull: Self = StObject.set(x, "startPosition", null)
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
  }
}
