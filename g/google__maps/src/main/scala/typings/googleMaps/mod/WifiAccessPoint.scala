package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WifiAccessPoint extends StObject {
  
  /** The number of milliseconds since this access point was detected. */
  var age: js.UndefOr[Double] = js.undefined
  
  /** The channel over which the client is communicating with the acces. */
  var channel: js.UndefOr[Double] = js.undefined
  
  /** The MAC address of the WiFi node. It's typically called a BSS, BSSID or MAC address. Separators must be `:` (colon). */
  var macAddress: String
  
  /** The current signal strength measured in dBm. */
  var signalStrength: js.UndefOr[Double] = js.undefined
  
  /** The current signal to noise ratio measured in dB. */
  var signalToNoiseRatio: js.UndefOr[Double] = js.undefined
}
object WifiAccessPoint {
  
  @scala.inline
  def apply(macAddress: String): WifiAccessPoint = {
    val __obj = js.Dynamic.literal(macAddress = macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiAccessPoint]
  }
  
  @scala.inline
  implicit class WifiAccessPointMutableBuilder[Self <: WifiAccessPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    @scala.inline
    def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthUndefined: Self = StObject.set(x, "signalStrength", js.undefined)
    
    @scala.inline
    def setSignalToNoiseRatio(value: Double): Self = StObject.set(x, "signalToNoiseRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalToNoiseRatioUndefined: Self = StObject.set(x, "signalToNoiseRatio", js.undefined)
  }
}
