package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaBooksAnnotationsRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CfiRange extends StObject {
  
  var cfiRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.undefined
  
  var contentVersion: js.UndefOr[String] = js.undefined
  
  var gbImageRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.undefined
  
  var gbTextRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.undefined
  
  var imageCfiRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.undefined
}
object CfiRange {
  
  inline def apply(): CfiRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CfiRange]
  }
  
  extension [Self <: CfiRange](x: Self) {
    
    inline def setCfiRange(value: SchemaBooksAnnotationsRange): Self = StObject.set(x, "cfiRange", value.asInstanceOf[js.Any])
    
    inline def setCfiRangeUndefined: Self = StObject.set(x, "cfiRange", js.undefined)
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setGbImageRange(value: SchemaBooksAnnotationsRange): Self = StObject.set(x, "gbImageRange", value.asInstanceOf[js.Any])
    
    inline def setGbImageRangeUndefined: Self = StObject.set(x, "gbImageRange", js.undefined)
    
    inline def setGbTextRange(value: SchemaBooksAnnotationsRange): Self = StObject.set(x, "gbTextRange", value.asInstanceOf[js.Any])
    
    inline def setGbTextRangeUndefined: Self = StObject.set(x, "gbTextRange", js.undefined)
    
    inline def setImageCfiRange(value: SchemaBooksAnnotationsRange): Self = StObject.set(x, "imageCfiRange", value.asInstanceOf[js.Any])
    
    inline def setImageCfiRangeUndefined: Self = StObject.set(x, "imageCfiRange", js.undefined)
  }
}
