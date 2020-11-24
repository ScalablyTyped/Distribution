package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationRequest extends js.Object {
  
  /** The carrier name. */
  var carrier: js.UndefOr[String] = js.native
  
  /** An array of cell tower objects. */
  var cellTowers: js.UndefOr[js.Array[CellTower]] = js.native
  
  /**
    * Specifies whether to fall back to IP geolocation if wifi and cell tower signals are not available.
    * Defaults to `true`. Set `considerIp` to `false` to disable fall back.
    */
  var considerIp: js.UndefOr[Boolean] = js.native
  
  /** The mobile country code (MCC) for the device's home network. */
  var homeMobileCountryCode: js.UndefOr[Double] = js.native
  
  /** The mobile network code (MNC) for the device's home network. */
  var homeMobileNetworkCode: js.UndefOr[Double] = js.native
  
  /** The mobile radio type. While this field is optional, it should be included if a value is available, for more accurate results. */
  var radioType: js.UndefOr[RadioType] = js.native
  
  /** An array of WiFi access point objects. */
  var wifiAccessPoints: js.UndefOr[js.Array[WifiAccessPoint]] = js.native
}
object GeolocationRequest {
  
  @scala.inline
  def apply(): GeolocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationRequest]
  }
  
  @scala.inline
  implicit class GeolocationRequestOps[Self <: GeolocationRequest] (val x: Self) extends AnyVal {
    
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
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    
    @scala.inline
    def setCellTowersVarargs(value: CellTower*): Self = this.set("cellTowers", js.Array(value :_*))
    
    @scala.inline
    def setCellTowers(value: js.Array[CellTower]): Self = this.set("cellTowers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellTowers: Self = this.set("cellTowers", js.undefined)
    
    @scala.inline
    def setConsiderIp(value: Boolean): Self = this.set("considerIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsiderIp: Self = this.set("considerIp", js.undefined)
    
    @scala.inline
    def setHomeMobileCountryCode(value: Double): Self = this.set("homeMobileCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeMobileCountryCode: Self = this.set("homeMobileCountryCode", js.undefined)
    
    @scala.inline
    def setHomeMobileNetworkCode(value: Double): Self = this.set("homeMobileNetworkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeMobileNetworkCode: Self = this.set("homeMobileNetworkCode", js.undefined)
    
    @scala.inline
    def setRadioType(value: RadioType): Self = this.set("radioType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioType: Self = this.set("radioType", js.undefined)
    
    @scala.inline
    def setWifiAccessPointsVarargs(value: WifiAccessPoint*): Self = this.set("wifiAccessPoints", js.Array(value :_*))
    
    @scala.inline
    def setWifiAccessPoints(value: js.Array[WifiAccessPoint]): Self = this.set("wifiAccessPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiAccessPoints: Self = this.set("wifiAccessPoints", js.undefined)
  }
}
