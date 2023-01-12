package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`patient-reported-name`
import typings.fhir.fhirStrings.`registered-name`
import typings.fhir.fhirStrings.`user-friendly-name`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDeviceName
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The name that identifies the device.
    */
  var name: String
  
  /**
    * The type of deviceName. Note that ManufactureDeviceName means that the name is the name as given by the manufacturer, not the name of the manufacturer.
    * RegisteredName | UserFriendlyName | PatientReportedName.
    */
  var `type`: `registered-name` | `user-friendly-name` | `patient-reported-name`
}
object DeviceDeviceName {
  
  inline def apply(name: String, `type`: `registered-name` | `user-friendly-name` | `patient-reported-name`): DeviceDeviceName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDeviceName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDeviceName] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `registered-name` | `user-friendly-name` | `patient-reported-name`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
