package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Device network info.
  */
trait SchemaNetworkInfo extends StObject {
  
  /**
    * IMEI number of the GSM device. For example, A1000031212.
    */
  var imei: js.UndefOr[String] = js.undefined
  
  /**
    * MEID number of the CDMA device. For example, A00000292788E1.
    */
  var meid: js.UndefOr[String] = js.undefined
  
  /**
    * Alphabetic name of current registered operator. For example, Vodafone.
    */
  var networkOperatorName: js.UndefOr[String] = js.undefined
  
  /**
    * Wi-Fi MAC address of the device. For example, 7c:11:11:11:11:11.
    */
  var wifiMacAddress: js.UndefOr[String] = js.undefined
}
object SchemaNetworkInfo {
  
  @scala.inline
  def apply(): SchemaNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInfo]
  }
  
  @scala.inline
  implicit class SchemaNetworkInfoMutableBuilder[Self <: SchemaNetworkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    @scala.inline
    def setNetworkOperatorName(value: String): Self = StObject.set(x, "networkOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkOperatorNameUndefined: Self = StObject.set(x, "networkOperatorName", js.undefined)
    
    @scala.inline
    def setWifiMacAddress(value: String): Self = StObject.set(x, "wifiMacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiMacAddressUndefined: Self = StObject.set(x, "wifiMacAddress", js.undefined)
  }
}
