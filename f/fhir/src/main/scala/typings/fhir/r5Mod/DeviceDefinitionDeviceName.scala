package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`patient-reported-name`
import typings.fhir.fhirStrings.`registered-name`
import typings.fhir.fhirStrings.`user-friendly-name`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionDeviceName
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * A human-friendly name that is used to refer to the device - depending on the type, it can be the brand name, the common name or alias, or other.
    */
  var name: String
  
  /**
    * The type of deviceName.
    * RegisteredName | UserFriendlyName | PatientReportedName.
    */
  var `type`: `registered-name` | `user-friendly-name` | `patient-reported-name`
}
object DeviceDefinitionDeviceName {
  
  inline def apply(name: String, `type`: `registered-name` | `user-friendly-name` | `patient-reported-name`): DeviceDefinitionDeviceName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionDeviceName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDefinitionDeviceName] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `registered-name` | `user-friendly-name` | `patient-reported-name`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
