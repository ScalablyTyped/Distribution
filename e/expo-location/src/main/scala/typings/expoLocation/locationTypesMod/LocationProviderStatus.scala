package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationProviderStatus extends StObject {
  
  var backgroundModeEnabled: Boolean
  
  var gpsAvailable: js.UndefOr[Boolean] = js.undefined
  
  var locationServicesEnabled: Boolean
  
  var networkAvailable: js.UndefOr[Boolean] = js.undefined
  
  var passiveAvailable: js.UndefOr[Boolean] = js.undefined
}
object LocationProviderStatus {
  
  @scala.inline
  def apply(backgroundModeEnabled: Boolean, locationServicesEnabled: Boolean): LocationProviderStatus = {
    val __obj = js.Dynamic.literal(backgroundModeEnabled = backgroundModeEnabled.asInstanceOf[js.Any], locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationProviderStatus]
  }
  
  @scala.inline
  implicit class LocationProviderStatusMutableBuilder[Self <: LocationProviderStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundModeEnabled(value: Boolean): Self = StObject.set(x, "backgroundModeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpsAvailable(value: Boolean): Self = StObject.set(x, "gpsAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpsAvailableUndefined: Self = StObject.set(x, "gpsAvailable", js.undefined)
    
    @scala.inline
    def setLocationServicesEnabled(value: Boolean): Self = StObject.set(x, "locationServicesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAvailable(value: Boolean): Self = StObject.set(x, "networkAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAvailableUndefined: Self = StObject.set(x, "networkAvailable", js.undefined)
    
    @scala.inline
    def setPassiveAvailable(value: Boolean): Self = StObject.set(x, "passiveAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassiveAvailableUndefined: Self = StObject.set(x, "passiveAvailable", js.undefined)
  }
}
