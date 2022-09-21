package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Sku extends StObject {
  
  /**
    * Marketing information for the SKU.
    */
  var marketingInfo: js.UndefOr[SchemaGoogleCloudChannelV1MarketingInfo] = js.undefined
  
  /**
    * Resource Name of the SKU. Format: products/{product_id\}/skus/{sku_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Product the SKU is associated with.
    */
  var product: js.UndefOr[SchemaGoogleCloudChannelV1Product] = js.undefined
}
object SchemaGoogleCloudChannelV1Sku {
  
  inline def apply(): SchemaGoogleCloudChannelV1Sku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Sku]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Sku](x: Self) {
    
    inline def setMarketingInfo(value: SchemaGoogleCloudChannelV1MarketingInfo): Self = StObject.set(x, "marketingInfo", value.asInstanceOf[js.Any])
    
    inline def setMarketingInfoUndefined: Self = StObject.set(x, "marketingInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProduct(value: SchemaGoogleCloudChannelV1Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
