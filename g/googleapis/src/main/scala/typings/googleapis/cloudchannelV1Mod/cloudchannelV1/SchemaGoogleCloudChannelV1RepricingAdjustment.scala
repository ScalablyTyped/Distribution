package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1RepricingAdjustment extends StObject {
  
  /**
    * Flat markup or markdown on an entire bill.
    */
  var percentageAdjustment: js.UndefOr[SchemaGoogleCloudChannelV1PercentageAdjustment] = js.undefined
}
object SchemaGoogleCloudChannelV1RepricingAdjustment {
  
  inline def apply(): SchemaGoogleCloudChannelV1RepricingAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1RepricingAdjustment]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1RepricingAdjustment](x: Self) {
    
    inline def setPercentageAdjustment(value: SchemaGoogleCloudChannelV1PercentageAdjustment): Self = StObject.set(x, "percentageAdjustment", value.asInstanceOf[js.Any])
    
    inline def setPercentageAdjustmentUndefined: Self = StObject.set(x, "percentageAdjustment", js.undefined)
  }
}
