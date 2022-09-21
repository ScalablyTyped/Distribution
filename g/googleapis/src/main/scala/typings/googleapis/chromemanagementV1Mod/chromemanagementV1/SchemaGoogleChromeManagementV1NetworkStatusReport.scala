package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1NetworkStatusReport extends StObject {
  
  /**
    * Output only. Current connection state of the network.
    */
  var connectionState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Network connection type.
    */
  var connectionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the wifi encryption key is turned off.
    */
  var encryptionOn: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Gateway IP address.
    */
  var gatewayIpAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Network connection guid.
    */
  var guid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. LAN IP address.
    */
  var lanIpAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Receiving bit rate measured in Megabits per second.
    */
  var receivingBitRateMbps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the network state was reported.
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Frequency the report is sampled.
    */
  var sampleFrequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Signal strength for wireless networks measured in decibels.
    */
  var signalStrengthDbm: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Transmission bit rate measured in Megabits per second.
    */
  var transmissionBitRateMbps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Transmission power measured in decibels.
    */
  var transmissionPowerDbm: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Wifi link quality. Value ranges from [0, 70]. 0 indicates no signal and 70 indicates a strong signal.
    */
  var wifiLinkQuality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Wifi power management enabled
    */
  var wifiPowerManagementEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1NetworkStatusReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1NetworkStatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1NetworkStatusReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1NetworkStatusReport](x: Self) {
    
    inline def setConnectionState(value: String): Self = StObject.set(x, "connectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateNull: Self = StObject.set(x, "connectionState", null)
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "connectionState", js.undefined)
    
    inline def setConnectionType(value: String): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeNull: Self = StObject.set(x, "connectionType", null)
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setEncryptionOn(value: Boolean): Self = StObject.set(x, "encryptionOn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOnNull: Self = StObject.set(x, "encryptionOn", null)
    
    inline def setEncryptionOnUndefined: Self = StObject.set(x, "encryptionOn", js.undefined)
    
    inline def setGatewayIpAddress(value: String): Self = StObject.set(x, "gatewayIpAddress", value.asInstanceOf[js.Any])
    
    inline def setGatewayIpAddressNull: Self = StObject.set(x, "gatewayIpAddress", null)
    
    inline def setGatewayIpAddressUndefined: Self = StObject.set(x, "gatewayIpAddress", js.undefined)
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidNull: Self = StObject.set(x, "guid", null)
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setLanIpAddress(value: String): Self = StObject.set(x, "lanIpAddress", value.asInstanceOf[js.Any])
    
    inline def setLanIpAddressNull: Self = StObject.set(x, "lanIpAddress", null)
    
    inline def setLanIpAddressUndefined: Self = StObject.set(x, "lanIpAddress", js.undefined)
    
    inline def setReceivingBitRateMbps(value: String): Self = StObject.set(x, "receivingBitRateMbps", value.asInstanceOf[js.Any])
    
    inline def setReceivingBitRateMbpsNull: Self = StObject.set(x, "receivingBitRateMbps", null)
    
    inline def setReceivingBitRateMbpsUndefined: Self = StObject.set(x, "receivingBitRateMbps", js.undefined)
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
    
    inline def setSampleFrequency(value: String): Self = StObject.set(x, "sampleFrequency", value.asInstanceOf[js.Any])
    
    inline def setSampleFrequencyNull: Self = StObject.set(x, "sampleFrequency", null)
    
    inline def setSampleFrequencyUndefined: Self = StObject.set(x, "sampleFrequency", js.undefined)
    
    inline def setSignalStrengthDbm(value: Double): Self = StObject.set(x, "signalStrengthDbm", value.asInstanceOf[js.Any])
    
    inline def setSignalStrengthDbmNull: Self = StObject.set(x, "signalStrengthDbm", null)
    
    inline def setSignalStrengthDbmUndefined: Self = StObject.set(x, "signalStrengthDbm", js.undefined)
    
    inline def setTransmissionBitRateMbps(value: String): Self = StObject.set(x, "transmissionBitRateMbps", value.asInstanceOf[js.Any])
    
    inline def setTransmissionBitRateMbpsNull: Self = StObject.set(x, "transmissionBitRateMbps", null)
    
    inline def setTransmissionBitRateMbpsUndefined: Self = StObject.set(x, "transmissionBitRateMbps", js.undefined)
    
    inline def setTransmissionPowerDbm(value: Double): Self = StObject.set(x, "transmissionPowerDbm", value.asInstanceOf[js.Any])
    
    inline def setTransmissionPowerDbmNull: Self = StObject.set(x, "transmissionPowerDbm", null)
    
    inline def setTransmissionPowerDbmUndefined: Self = StObject.set(x, "transmissionPowerDbm", js.undefined)
    
    inline def setWifiLinkQuality(value: String): Self = StObject.set(x, "wifiLinkQuality", value.asInstanceOf[js.Any])
    
    inline def setWifiLinkQualityNull: Self = StObject.set(x, "wifiLinkQuality", null)
    
    inline def setWifiLinkQualityUndefined: Self = StObject.set(x, "wifiLinkQuality", js.undefined)
    
    inline def setWifiPowerManagementEnabled(value: Boolean): Self = StObject.set(x, "wifiPowerManagementEnabled", value.asInstanceOf[js.Any])
    
    inline def setWifiPowerManagementEnabledNull: Self = StObject.set(x, "wifiPowerManagementEnabled", null)
    
    inline def setWifiPowerManagementEnabledUndefined: Self = StObject.set(x, "wifiPowerManagementEnabled", js.undefined)
  }
}
