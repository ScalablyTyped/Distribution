package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`patient-reported-name`
import typings.fhir.fhirStrings.`registered-name`
import typings.fhir.fhirStrings.`user-friendly-name`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceName
  extends StObject
     with BackboneElement {
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the default or preferred name to be displayed.
    */
  var display: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the kind of name. RegisteredName | UserFriendlyName | PatientReportedName.
    */
  var `type`: `registered-name` | `user-friendly-name` | `patient-reported-name`
  
  /**
    * The actual name that identifies the device.
    */
  var value: String
}
object DeviceName {
  
  inline def apply(`type`: `registered-name` | `user-friendly-name` | `patient-reported-name`, value: String): DeviceName = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceName] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setType(value: `registered-name` | `user-friendly-name` | `patient-reported-name`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
