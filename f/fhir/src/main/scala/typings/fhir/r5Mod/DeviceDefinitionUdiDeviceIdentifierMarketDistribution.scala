package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionUdiDeviceIdentifierMarketDistribution
  extends StObject
     with BackboneElement {
  
  var _subJurisdiction: js.UndefOr[Element] = js.undefined
  
  /**
    * Begin and end dates for the commercial distribution of the device.
    */
  var marketPeriod: Period
  
  /**
    * National state or territory to which the marketDistribution recers, typically where the device is commercialized.
    */
  var subJurisdiction: String
}
object DeviceDefinitionUdiDeviceIdentifierMarketDistribution {
  
  inline def apply(marketPeriod: Period, subJurisdiction: String): DeviceDefinitionUdiDeviceIdentifierMarketDistribution = {
    val __obj = js.Dynamic.literal(marketPeriod = marketPeriod.asInstanceOf[js.Any], subJurisdiction = subJurisdiction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionUdiDeviceIdentifierMarketDistribution]
  }
  
  extension [Self <: DeviceDefinitionUdiDeviceIdentifierMarketDistribution](x: Self) {
    
    inline def setMarketPeriod(value: Period): Self = StObject.set(x, "marketPeriod", value.asInstanceOf[js.Any])
    
    inline def setSubJurisdiction(value: String): Self = StObject.set(x, "subJurisdiction", value.asInstanceOf[js.Any])
    
    inline def set_subJurisdiction(value: Element): Self = StObject.set(x, "_subJurisdiction", value.asInstanceOf[js.Any])
    
    inline def set_subJurisdictionUndefined: Self = StObject.set(x, "_subJurisdiction", js.undefined)
  }
}
