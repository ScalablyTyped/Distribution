package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppStoreProduct extends StObject {
  
  var marketPlace: js.UndefOr[String] = js.native
  
  /**
    * The Product ID from the AppStore.
    */
  var productId: js.UndefOr[String] = js.native
}
object AppStoreProduct {
  
  @scala.inline
  def apply(): AppStoreProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppStoreProduct]
  }
  
  @scala.inline
  implicit class AppStoreProductMutableBuilder[Self <: AppStoreProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarketPlace(value: String): Self = StObject.set(x, "marketPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketPlaceUndefined: Self = StObject.set(x, "marketPlace", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
