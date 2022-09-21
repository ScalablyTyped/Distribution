package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1PurchasableSku extends StObject {
  
  /**
    * SKU
    */
  var sku: js.UndefOr[SchemaGoogleCloudChannelV1Sku] = js.undefined
}
object SchemaGoogleCloudChannelV1PurchasableSku {
  
  inline def apply(): SchemaGoogleCloudChannelV1PurchasableSku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1PurchasableSku]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1PurchasableSku](x: Self) {
    
    inline def setSku(value: SchemaGoogleCloudChannelV1Sku): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
