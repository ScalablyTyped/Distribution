package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class DeviceUdiMutableBuilder[Self <: DeviceUdi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierAIDC(value: base64Binary): Self = StObject.set(x, "carrierAIDC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierAIDCUndefined: Self = StObject.set(x, "carrierAIDC", js.undefined)
    
    @scala.inline
    def setCarrierHRF(value: String): Self = StObject.set(x, "carrierHRF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierHRFUndefined: Self = StObject.set(x, "carrierHRF", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: String): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setEntryType(value: code): Self = StObject.set(x, "entryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryTypeUndefined: Self = StObject.set(x, "entryType", js.undefined)
    
    @scala.inline
    def setIssuer(value: uri): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: uri): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def set_carrierAIDC(value: Element): Self = StObject.set(x, "_carrierAIDC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_carrierAIDCUndefined: Self = StObject.set(x, "_carrierAIDC", js.undefined)
    
    @scala.inline
    def set_carrierHRF(value: Element): Self = StObject.set(x, "_carrierHRF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_carrierHRFUndefined: Self = StObject.set(x, "_carrierHRF", js.undefined)
    
    @scala.inline
    def set_deviceIdentifier(value: Element): Self = StObject.set(x, "_deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_deviceIdentifierUndefined: Self = StObject.set(x, "_deviceIdentifier", js.undefined)
    
    @scala.inline
    def set_entryType(value: Element): Self = StObject.set(x, "_entryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_entryTypeUndefined: Self = StObject.set(x, "_entryType", js.undefined)
    
    @scala.inline
    def set_issuer(value: Element): Self = StObject.set(x, "_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_issuerUndefined: Self = StObject.set(x, "_issuer", js.undefined)
    
    @scala.inline
    def set_jurisdiction(value: Element): Self = StObject.set(x, "_jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_jurisdictionUndefined: Self = StObject.set(x, "_jurisdiction", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
