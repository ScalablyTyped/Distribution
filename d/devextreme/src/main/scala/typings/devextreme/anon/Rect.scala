package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rect extends StObject {
  
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var rect: js.UndefOr[js.Array[Double]] = js.undefined
  
  var sum: js.UndefOr[Double] = js.undefined
}
object Rect {
  
  inline def apply(): Rect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rect]
  }
  
  extension [Self <: Rect](x: Self) {
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setRect(value: js.Array[Double]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setRectVarargs(value: Double*): Self = StObject.set(x, "rect", js.Array(value :_*))
    
    inline def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
