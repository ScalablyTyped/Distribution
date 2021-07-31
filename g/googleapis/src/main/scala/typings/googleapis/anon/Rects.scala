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
  
  @scala.inline
  def apply(): Rects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rects]
  }
  
  @scala.inline
  implicit class RectsMutableBuilder[Self <: Rects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRects(value: js.Array[Left]): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
    
    @scala.inline
    def setRectsVarargs(value: Left*): Self = StObject.set(x, "rects", js.Array(value :_*))
    
    @scala.inline
    def setSecondary_rects(value: js.Array[Left]): Self = StObject.set(x, "secondary_rects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondary_rectsUndefined: Self = StObject.set(x, "secondary_rects", js.undefined)
    
    @scala.inline
    def setSecondary_rectsVarargs(value: Left*): Self = StObject.set(x, "secondary_rects", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
