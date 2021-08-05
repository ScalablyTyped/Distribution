package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rects extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var rects: js.UndefOr[js.Array[Left]] = js.undefined
  
  var secondary_rects: js.UndefOr[js.Array[Left]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object Rects {
  
  inline def apply(): Rects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rects]
  }
  
  extension [Self <: Rects](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRects(value: js.Array[Left]): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    inline def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
    
    inline def setRectsVarargs(value: Left*): Self = StObject.set(x, "rects", js.Array(value :_*))
    
    inline def setSecondary_rects(value: js.Array[Left]): Self = StObject.set(x, "secondary_rects", value.asInstanceOf[js.Any])
    
    inline def setSecondary_rectsUndefined: Self = StObject.set(x, "secondary_rects", js.undefined)
    
    inline def setSecondary_rectsVarargs(value: Left*): Self = StObject.set(x, "secondary_rects", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
