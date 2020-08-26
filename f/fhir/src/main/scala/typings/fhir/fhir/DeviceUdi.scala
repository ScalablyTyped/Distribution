package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unique Device Identifier (UDI) Barcode string
  */
@js.native
trait DeviceUdi extends BackboneElement {
  /**
    * Contains extended information for property 'carrierAIDC'.
    */
  var _carrierAIDC: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'carrierHRF'.
    */
  var _carrierHRF: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deviceIdentifier'.
    */
  var _deviceIdentifier: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'entryType'.
    */
  var _entryType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'issuer'.
    */
  var _issuer: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'jurisdiction'.
    */
  var _jurisdiction: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * UDI Machine Readable Barcode String
    */
  var carrierAIDC: js.UndefOr[base64Binary] = js.native
  /**
    * UDI Human Readable Barcode String
    */
  var carrierHRF: js.UndefOr[String] = js.native
  /**
    * Mandatory fixed portion of UDI
    */
  var deviceIdentifier: js.UndefOr[String] = js.native
  /**
    * barcode | rfid | manual +
    */
  var entryType: js.UndefOr[code] = js.native
  /**
    * UDI Issuing Organization
    */
  var issuer: js.UndefOr[uri] = js.native
  /**
    * Regional UDI authority
    */
  var jurisdiction: js.UndefOr[uri] = js.native
  /**
    * Device Name as appears on UDI label
    */
  var name: js.UndefOr[String] = js.native
}

object DeviceUdi {
  @scala.inline
  def apply(): DeviceUdi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceUdi]
  }
  @scala.inline
  implicit class DeviceUdiOps[Self <: DeviceUdi] (val x: Self) extends AnyVal {
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
    def set_carrierAIDC(value: Element): Self = this.set("_carrierAIDC", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_carrierAIDC: Self = this.set("_carrierAIDC", js.undefined)
    @scala.inline
    def set_carrierHRF(value: Element): Self = this.set("_carrierHRF", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_carrierHRF: Self = this.set("_carrierHRF", js.undefined)
    @scala.inline
    def set_deviceIdentifier(value: Element): Self = this.set("_deviceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_deviceIdentifier: Self = this.set("_deviceIdentifier", js.undefined)
    @scala.inline
    def set_entryType(value: Element): Self = this.set("_entryType", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_entryType: Self = this.set("_entryType", js.undefined)
    @scala.inline
    def set_issuer(value: Element): Self = this.set("_issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_issuer: Self = this.set("_issuer", js.undefined)
    @scala.inline
    def set_jurisdiction(value: Element): Self = this.set("_jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_jurisdiction: Self = this.set("_jurisdiction", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def setCarrierAIDC(value: base64Binary): Self = this.set("carrierAIDC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrierAIDC: Self = this.set("carrierAIDC", js.undefined)
    @scala.inline
    def setCarrierHRF(value: String): Self = this.set("carrierHRF", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrierHRF: Self = this.set("carrierHRF", js.undefined)
    @scala.inline
    def setDeviceIdentifier(value: String): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    @scala.inline
    def setEntryType(value: code): Self = this.set("entryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryType: Self = this.set("entryType", js.undefined)
    @scala.inline
    def setIssuer(value: uri): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setJurisdiction(value: uri): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

