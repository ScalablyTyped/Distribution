package typings.fhir.r5Mod

import typings.fhir.fhirStrings.basic_
import typings.fhir.fhirStrings.license
import typings.fhir.fhirStrings.master
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionRegulatoryIdentifier
  extends StObject
     with BackboneElement {
  
  var _deviceIdentifier: js.UndefOr[Element] = js.undefined
  
  var _issuer: js.UndefOr[Element] = js.undefined
  
  var _jurisdiction: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The identifier itself.
    */
  var deviceIdentifier: String
  
  /**
    * The organization that issued this identifier.
    */
  var issuer: String
  
  /**
    * The jurisdiction to which the deviceIdentifier applies.
    */
  var jurisdiction: String
  
  /**
    * The type of identifier itself.
    */
  var `type`: basic_ | master | license
}
object DeviceDefinitionRegulatoryIdentifier {
  
  inline def apply(deviceIdentifier: String, issuer: String, jurisdiction: String, `type`: basic_ | master | license): DeviceDefinitionRegulatoryIdentifier = {
    val __obj = js.Dynamic.literal(deviceIdentifier = deviceIdentifier.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], jurisdiction = jurisdiction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionRegulatoryIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDefinitionRegulatoryIdentifier] (val x: Self) extends AnyVal {
    
    inline def setDeviceIdentifier(value: String): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setType(value: basic_ | master | license): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_deviceIdentifier(value: Element): Self = StObject.set(x, "_deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def set_deviceIdentifierUndefined: Self = StObject.set(x, "_deviceIdentifier", js.undefined)
    
    inline def set_issuer(value: Element): Self = StObject.set(x, "_issuer", value.asInstanceOf[js.Any])
    
    inline def set_issuerUndefined: Self = StObject.set(x, "_issuer", js.undefined)
    
    inline def set_jurisdiction(value: Element): Self = StObject.set(x, "_jurisdiction", value.asInstanceOf[js.Any])
    
    inline def set_jurisdictionUndefined: Self = StObject.set(x, "_jurisdiction", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
