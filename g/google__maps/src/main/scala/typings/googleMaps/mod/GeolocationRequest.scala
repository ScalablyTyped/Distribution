package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationRequest extends StObject {
  
  /** The carrier name. */
  var carrier: js.UndefOr[String] = js.undefined
  
  /** An array of cell tower objects. */
  var cellTowers: js.UndefOr[js.Array[CellTower]] = js.undefined
  
  /**
    * Specifies whether to fall back to IP geolocation if wifi and cell tower signals are not available.
    * Defaults to `true`. Set `considerIp` to `false` to disable fall back.
    */
  var considerIp: js.UndefOr[Boolean] = js.undefined
  
  /** The mobile country code (MCC) for the device's home network. */
  var homeMobileCountryCode: js.UndefOr[Double] = js.undefined
  
  /** The mobile network code (MNC) for the device's home network. */
  var homeMobileNetworkCode: js.UndefOr[Double] = js.undefined
  
  /** The mobile radio type. While this field is optional, it should be included if a value is available, for more accurate results. */
  var radioType: js.UndefOr[RadioType] = js.undefined
  
  /** An array of WiFi access point objects. */
  var wifiAccessPoints: js.UndefOr[js.Array[WifiAccessPoint]] = js.undefined
}
object GeolocationRequest {
  
  inline def apply(): GeolocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationRequest]
  }
  
  extension [Self <: GeolocationRequest](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setCellTowers(value: js.Array[CellTower]): Self = StObject.set(x, "cellTowers", value.asInstanceOf[js.Any])
    
    inline def setCellTowersUndefined: Self = StObject.set(x, "cellTowers", js.undefined)
    
    inline def setCellTowersVarargs(value: CellTower*): Self = StObject.set(x, "cellTowers", js.Array(value*))
    
    inline def setConsiderIp(value: Boolean): Self = StObject.set(x, "considerIp", value.asInstanceOf[js.Any])
    
    inline def setConsiderIpUndefined: Self = StObject.set(x, "considerIp", js.undefined)
    
    inline def setHomeMobileCountryCode(value: Double): Self = StObject.set(x, "homeMobileCountryCode", value.asInstanceOf[js.Any])
    
    inline def setHomeMobileCountryCodeUndefined: Self = StObject.set(x, "homeMobileCountryCode", js.undefined)
    
    inline def setHomeMobileNetworkCode(value: Double): Self = StObject.set(x, "homeMobileNetworkCode", value.asInstanceOf[js.Any])
    
    inline def setHomeMobileNetworkCodeUndefined: Self = StObject.set(x, "homeMobileNetworkCode", js.undefined)
    
    inline def setRadioType(value: RadioType): Self = StObject.set(x, "radioType", value.asInstanceOf[js.Any])
    
    inline def setRadioTypeUndefined: Self = StObject.set(x, "radioType", js.undefined)
    
    inline def setWifiAccessPoints(value: js.Array[WifiAccessPoint]): Self = StObject.set(x, "wifiAccessPoints", value.asInstanceOf[js.Any])
    
    inline def setWifiAccessPointsUndefined: Self = StObject.set(x, "wifiAccessPoints", js.undefined)
    
    inline def setWifiAccessPointsVarargs(value: WifiAccessPoint*): Self = StObject.set(x, "wifiAccessPoints", js.Array(value*))
  }
}
