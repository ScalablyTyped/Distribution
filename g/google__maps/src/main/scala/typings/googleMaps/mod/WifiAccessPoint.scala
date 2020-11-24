package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WifiAccessPoint extends js.Object {
  
  /** The number of milliseconds since this access point was detected. */
  var age: js.UndefOr[Double] = js.native
  
  /** The channel over which the client is communicating with the acces. */
  var channel: js.UndefOr[Double] = js.native
  
  /** The MAC address of the WiFi node. It's typically called a BSS, BSSID or MAC address. Separators must be `:` (colon). */
  var macAddress: String = js.native
  
  /** The current signal strength measured in dBm. */
  var signalStrength: js.UndefOr[Double] = js.native
  
  /** The current signal to noise ratio measured in dB. */
  var signalToNoiseRatio: js.UndefOr[Double] = js.native
}
object WifiAccessPoint {
  
  @scala.inline
  def apply(macAddress: String): WifiAccessPoint = {
    val __obj = js.Dynamic.literal(macAddress = macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiAccessPoint]
  }
  
  @scala.inline
  implicit class WifiAccessPointOps[Self <: WifiAccessPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    
    @scala.inline
    def setChannel(value: Double): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setSignalStrength(value: Double): Self = this.set("signalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignalStrength: Self = this.set("signalStrength", js.undefined)
    
    @scala.inline
    def setSignalToNoiseRatio(value: Double): Self = this.set("signalToNoiseRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignalToNoiseRatio: Self = this.set("signalToNoiseRatio", js.undefined)
  }
}
