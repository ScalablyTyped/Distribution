package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unique Device Identifier (UDI) Barcode string
  */
trait DeviceUdi
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'carrierAIDC'.
    */
  var _carrierAIDC: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'carrierHRF'.
    */
  var _carrierHRF: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'deviceIdentifier'.
    */
  var _deviceIdentifier: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'entryType'.
    */
  var _entryType: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'issuer'.
    */
  var _issuer: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'jurisdiction'.
    */
  var _jurisdiction: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * UDI Machine Readable Barcode String
    */
  var carrierAIDC: js.UndefOr[base64Binary] = js.undefined
  
  /**
    * UDI Human Readable Barcode String
    */
  var carrierHRF: js.UndefOr[String] = js.undefined
  
  /**
    * Mandatory fixed portion of UDI
    */
  var deviceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * barcode | rfid | manual +
    */
  var entryType: js.UndefOr[code] = js.undefined
  
  /**
    * UDI Issuing Organization
    */
  var issuer: js.UndefOr[uri] = js.undefined
  
  /**
    * Regional UDI authority
    */
  var jurisdiction: js.UndefOr[uri] = js.undefined
  
  /**
    * Device Name as appears on UDI label
    */
  var name: js.UndefOr[String] = js.undefined
}
object DeviceUdi {
  
  inline def apply(): DeviceUdi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceUdi]
  }
  
  extension [Self <: DeviceUdi](x: Self) {
    
    inline def setCarrierAIDC(value: base64Binary): Self = StObject.set(x, "carrierAIDC", value.asInstanceOf[js.Any])
    
    inline def setCarrierAIDCUndefined: Self = StObject.set(x, "carrierAIDC", js.undefined)
    
    inline def setCarrierHRF(value: String): Self = StObject.set(x, "carrierHRF", value.asInstanceOf[js.Any])
    
    inline def setCarrierHRFUndefined: Self = StObject.set(x, "carrierHRF", js.undefined)
    
    inline def setDeviceIdentifier(value: String): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    inline def setEntryType(value: code): Self = StObject.set(x, "entryType", value.asInstanceOf[js.Any])
    
    inline def setEntryTypeUndefined: Self = StObject.set(x, "entryType", js.undefined)
    
    inline def setIssuer(value: uri): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setJurisdiction(value: uri): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def set_carrierAIDC(value: Element): Self = StObject.set(x, "_carrierAIDC", value.asInstanceOf[js.Any])
    
    inline def set_carrierAIDCUndefined: Self = StObject.set(x, "_carrierAIDC", js.undefined)
    
    inline def set_carrierHRF(value: Element): Self = StObject.set(x, "_carrierHRF", value.asInstanceOf[js.Any])
    
    inline def set_carrierHRFUndefined: Self = StObject.set(x, "_carrierHRF", js.undefined)
    
    inline def set_deviceIdentifier(value: Element): Self = StObject.set(x, "_deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def set_deviceIdentifierUndefined: Self = StObject.set(x, "_deviceIdentifier", js.undefined)
    
    inline def set_entryType(value: Element): Self = StObject.set(x, "_entryType", value.asInstanceOf[js.Any])
    
    inline def set_entryTypeUndefined: Self = StObject.set(x, "_entryType", js.undefined)
    
    inline def set_issuer(value: Element): Self = StObject.set(x, "_issuer", value.asInstanceOf[js.Any])
    
    inline def set_issuerUndefined: Self = StObject.set(x, "_issuer", js.undefined)
    
    inline def set_jurisdiction(value: Element): Self = StObject.set(x, "_jurisdiction", value.asInstanceOf[js.Any])
    
    inline def set_jurisdictionUndefined: Self = StObject.set(x, "_jurisdiction", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
