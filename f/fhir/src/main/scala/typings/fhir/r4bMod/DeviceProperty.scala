package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceProperty
  extends StObject
     with BackboneElement {
  
  /**
    * Code that specifies the property DeviceDefinitionPropetyCode (Extensible).
    */
  var `type`: CodeableConcept
  
  /**
    * Property value as a code, e.g., NTP4 (synced to NTP).
    */
  var valueCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Property value as a quantity.
    */
  var valueQuantity: js.UndefOr[js.Array[Quantity]] = js.undefined
}
object DeviceProperty {
  
  inline def apply(`type`: CodeableConcept): DeviceProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    inline def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    inline def setValueCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "valueCode", js.Array(value*))
    
    inline def setValueQuantity(value: js.Array[Quantity]): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueQuantityVarargs(value: Quantity*): Self = StObject.set(x, "valueQuantity", js.Array(value*))
  }
}
