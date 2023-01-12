package typings.firebaseAnalyticsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalyticsTypes.mod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyCurrency
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var currency: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object DictkeyCurrency {
  
  inline def apply(): DictkeyCurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictkeyCurrency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkeyCurrency] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
