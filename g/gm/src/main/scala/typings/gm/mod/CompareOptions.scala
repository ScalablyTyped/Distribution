package typings.gm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareOptions extends StObject {
  
  var file: js.UndefOr[String] = js.undefined
  
  var highlightColor: js.UndefOr[String] = js.undefined
  
  var highlightStyle: js.UndefOr[HighlightStyle] = js.undefined
  
  var tolerance: js.UndefOr[Double] = js.undefined
}
object CompareOptions {
  
  inline def apply(): CompareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompareOptions] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    inline def setHighlightStyle(value: HighlightStyle): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
    
    inline def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
