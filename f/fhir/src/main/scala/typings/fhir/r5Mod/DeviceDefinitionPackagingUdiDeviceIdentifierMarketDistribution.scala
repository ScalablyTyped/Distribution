package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionPackagingUdiDeviceIdentifierMarketDistribution
  extends StObject
     with BackboneElement {
  
  var _subJurisdiction: js.UndefOr[Element] = js.undefined
  
  /**
    * Begin and end dates for the commercial distribution of the device.
    */
  var marketPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * National state or territory to which the marketDistribution refers, typically where the device is commercialized.
    */
  var subJurisdiction: js.UndefOr[String] = js.undefined
}
object DeviceDefinitionPackagingUdiDeviceIdentifierMarketDistribution {
  
  inline def apply(): DeviceDefinitionPackagingUdiDeviceIdentifierMarketDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDefinitionPackagingUdiDeviceIdentifierMarketDistribution]
  }
  
  extension [Self <: DeviceDefinitionPackagingUdiDeviceIdentifierMarketDistribution](x: Self) {
    
    inline def setMarketPeriod(value: Period): Self = StObject.set(x, "marketPeriod", value.asInstanceOf[js.Any])
    
    inline def setMarketPeriodUndefined: Self = StObject.set(x, "marketPeriod", js.undefined)
    
    inline def setSubJurisdiction(value: String): Self = StObject.set(x, "subJurisdiction", value.asInstanceOf[js.Any])
    
    inline def setSubJurisdictionUndefined: Self = StObject.set(x, "subJurisdiction", js.undefined)
    
    inline def set_subJurisdiction(value: Element): Self = StObject.set(x, "_subJurisdiction", value.asInstanceOf[js.Any])
    
    inline def set_subJurisdictionUndefined: Self = StObject.set(x, "_subJurisdiction", js.undefined)
  }
}
