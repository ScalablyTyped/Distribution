package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCount extends StObject {
  
  var itemCount: js.UndefOr[String] = js.undefined
  
  var itemType: js.UndefOr[String] = js.undefined
}
object ItemCount {
  
  inline def apply(): ItemCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemCount]
  }
  
  extension [Self <: ItemCount](x: Self) {
    
    inline def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
  }
}
