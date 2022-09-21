package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1PriceTier extends StObject {
  
  /**
    * First resource for which the tier price applies.
    */
  var firstResource: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Last resource for which the tier price applies.
    */
  var lastResource: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Price of the tier.
    */
  var price: js.UndefOr[SchemaGoogleCloudChannelV1Price] = js.undefined
}
object SchemaGoogleCloudChannelV1PriceTier {
  
  inline def apply(): SchemaGoogleCloudChannelV1PriceTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1PriceTier]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1PriceTier](x: Self) {
    
    inline def setFirstResource(value: Double): Self = StObject.set(x, "firstResource", value.asInstanceOf[js.Any])
    
    inline def setFirstResourceNull: Self = StObject.set(x, "firstResource", null)
    
    inline def setFirstResourceUndefined: Self = StObject.set(x, "firstResource", js.undefined)
    
    inline def setLastResource(value: Double): Self = StObject.set(x, "lastResource", value.asInstanceOf[js.Any])
    
    inline def setLastResourceNull: Self = StObject.set(x, "lastResource", null)
    
    inline def setLastResourceUndefined: Self = StObject.set(x, "lastResource", js.undefined)
    
    inline def setPrice(value: SchemaGoogleCloudChannelV1Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
