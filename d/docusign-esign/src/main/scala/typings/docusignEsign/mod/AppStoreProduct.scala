package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppStoreProduct extends StObject {
  
  var marketPlace: js.UndefOr[String] = js.undefined
  
  /**
    * The Product ID from the AppStore.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object AppStoreProduct {
  
  inline def apply(): AppStoreProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppStoreProduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppStoreProduct] (val x: Self) extends AnyVal {
    
    inline def setMarketPlace(value: String): Self = StObject.set(x, "marketPlace", value.asInstanceOf[js.Any])
    
    inline def setMarketPlaceUndefined: Self = StObject.set(x, "marketPlace", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
