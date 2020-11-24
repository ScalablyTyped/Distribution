package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Device network info.
  */
@js.native
trait SchemaNetworkInfo extends js.Object {
  
  /**
    * IMEI number of the GSM device. For example, A1000031212.
    */
  var imei: js.UndefOr[String] = js.native
  
  /**
    * MEID number of the CDMA device. For example, A00000292788E1.
    */
  var meid: js.UndefOr[String] = js.native
  
  /**
    * Alphabetic name of current registered operator. For example, Vodafone.
    */
  var networkOperatorName: js.UndefOr[String] = js.native
  
  /**
    * Wi-Fi MAC address of the device. For example, 7c:11:11:11:11:11.
    */
  var wifiMacAddress: js.UndefOr[String] = js.native
}
object SchemaNetworkInfo {
  
  @scala.inline
  def apply(): SchemaNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInfo]
  }
  
  @scala.inline
  implicit class SchemaNetworkInfoOps[Self <: SchemaNetworkInfo] (val x: Self) extends AnyVal {
    
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
    def setImei(value: String): Self = this.set("imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImei: Self = this.set("imei", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = this.set("meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    
    @scala.inline
    def setNetworkOperatorName(value: String): Self = this.set("networkOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkOperatorName: Self = this.set("networkOperatorName", js.undefined)
    
    @scala.inline
    def setWifiMacAddress(value: String): Self = this.set("wifiMacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiMacAddress: Self = this.set("wifiMacAddress", js.undefined)
  }
}
