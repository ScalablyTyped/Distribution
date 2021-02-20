package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsValue extends StObject {
  
  var items: js.UndefOr[js.Array[Double]] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object ItemsValue {
  
  @scala.inline
  def apply(): ItemsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsValue]
  }
  
  @scala.inline
  implicit class ItemsValueMutableBuilder[Self <: ItemsValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Double]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Double*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
