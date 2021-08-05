package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsValue extends StObject {
  
  var items: js.UndefOr[js.Array[Double]] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object ItemsValue {
  
  inline def apply(): ItemsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsValue]
  }
  
  extension [Self <: ItemsValue](x: Self) {
    
    inline def setItems(value: js.Array[Double]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Double*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
