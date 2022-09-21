package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1PriceByResource extends StObject {
  
  /**
    * Price of the Offer. Present if there are no price phases.
    */
  var price: js.UndefOr[SchemaGoogleCloudChannelV1Price] = js.undefined
  
  /**
    * Specifies the price by time range.
    */
  var pricePhases: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1PricePhase]] = js.undefined
  
  /**
    * Resource Type. Example: SEAT
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1PriceByResource {
  
  inline def apply(): SchemaGoogleCloudChannelV1PriceByResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1PriceByResource]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1PriceByResource](x: Self) {
    
    inline def setPrice(value: SchemaGoogleCloudChannelV1Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPricePhases(value: js.Array[SchemaGoogleCloudChannelV1PricePhase]): Self = StObject.set(x, "pricePhases", value.asInstanceOf[js.Any])
    
    inline def setPricePhasesUndefined: Self = StObject.set(x, "pricePhases", js.undefined)
    
    inline def setPricePhasesVarargs(value: SchemaGoogleCloudChannelV1PricePhase*): Self = StObject.set(x, "pricePhases", js.Array(value*))
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
