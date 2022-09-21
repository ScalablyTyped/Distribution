package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Product extends StObject {
  
  /**
    * Marketing information for the product.
    */
  var marketingInfo: js.UndefOr[SchemaGoogleCloudChannelV1MarketingInfo] = js.undefined
  
  /**
    * Resource Name of the Product. Format: products/{product_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1Product {
  
  inline def apply(): SchemaGoogleCloudChannelV1Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Product]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Product](x: Self) {
    
    inline def setMarketingInfo(value: SchemaGoogleCloudChannelV1MarketingInfo): Self = StObject.set(x, "marketingInfo", value.asInstanceOf[js.Any])
    
    inline def setMarketingInfoUndefined: Self = StObject.set(x, "marketingInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
