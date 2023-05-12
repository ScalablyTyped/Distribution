package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionCapability
  extends StObject
     with BackboneElement {
  
  /**
    * Description of capability.
    */
  var description: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Type of capability.
    */
  var `type`: CodeableConcept
}
object DeviceDefinitionCapability {
  
  inline def apply(`type`: CodeableConcept): DeviceDefinitionCapability = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionCapability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDefinitionCapability] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: js.Array[CodeableConcept]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDescriptionVarargs(value: CodeableConcept*): Self = StObject.set(x, "description", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
