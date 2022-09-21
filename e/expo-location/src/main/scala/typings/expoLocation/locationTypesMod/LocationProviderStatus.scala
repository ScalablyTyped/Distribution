package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationProviderStatus extends StObject {
  
  var backgroundModeEnabled: Boolean
  
  /**
    * Whether the GPS provider is available. If `true` the location data will come
    * from GPS, especially for requests with high accuracy.
    * @platform android
    */
  var gpsAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether location services are enabled. See [Location.hasServicesEnabledAsync](#locationhasservicesenabledasync)
    * for a more convenient solution to get this value.
    */
  var locationServicesEnabled: Boolean
  
  /**
    * Whether the network provider is available. If `true` the location data will
    * come from cellular network, especially for requests with low accuracy.
    * @platform android
    */
  var networkAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the passive provider is available. If `true` the location data will
    * be determined passively.
    * @platform android
    */
  var passiveAvailable: js.UndefOr[Boolean] = js.undefined
}
object LocationProviderStatus {
  
  inline def apply(backgroundModeEnabled: Boolean, locationServicesEnabled: Boolean): LocationProviderStatus = {
    val __obj = js.Dynamic.literal(backgroundModeEnabled = backgroundModeEnabled.asInstanceOf[js.Any], locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationProviderStatus]
  }
  
  extension [Self <: LocationProviderStatus](x: Self) {
    
    inline def setBackgroundModeEnabled(value: Boolean): Self = StObject.set(x, "backgroundModeEnabled", value.asInstanceOf[js.Any])
    
    inline def setGpsAvailable(value: Boolean): Self = StObject.set(x, "gpsAvailable", value.asInstanceOf[js.Any])
    
    inline def setGpsAvailableUndefined: Self = StObject.set(x, "gpsAvailable", js.undefined)
    
    inline def setLocationServicesEnabled(value: Boolean): Self = StObject.set(x, "locationServicesEnabled", value.asInstanceOf[js.Any])
    
    inline def setNetworkAvailable(value: Boolean): Self = StObject.set(x, "networkAvailable", value.asInstanceOf[js.Any])
    
    inline def setNetworkAvailableUndefined: Self = StObject.set(x, "networkAvailable", js.undefined)
    
    inline def setPassiveAvailable(value: Boolean): Self = StObject.set(x, "passiveAvailable", value.asInstanceOf[js.Any])
    
    inline def setPassiveAvailableUndefined: Self = StObject.set(x, "passiveAvailable", js.undefined)
  }
}
