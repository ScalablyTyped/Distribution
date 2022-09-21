package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1PercentageAdjustment extends StObject {
  
  /**
    * The percentage of the bill to adjust. For example: Mark down by 1% =\> "-1.00" Mark up by 1% =\> "1.00" Pass-Through =\> "0.00"
    */
  var percentage: js.UndefOr[SchemaGoogleTypeDecimal] = js.undefined
}
object SchemaGoogleCloudChannelV1PercentageAdjustment {
  
  inline def apply(): SchemaGoogleCloudChannelV1PercentageAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1PercentageAdjustment]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1PercentageAdjustment](x: Self) {
    
    inline def setPercentage(value: SchemaGoogleTypeDecimal): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
