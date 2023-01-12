package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAssociationStatus
  extends StObject
     with BackboneElement {
  
  /**
    * The reasons given for the current association status - i.e. why is the device explanted, or attached to the patient, etc.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * implanted|explanted|attached.
    */
  var value: CodeableConcept
}
object DeviceAssociationStatus {
  
  inline def apply(value: CodeableConcept): DeviceAssociationStatus = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAssociationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceAssociationStatus] (val x: Self) extends AnyVal {
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setValue(value: CodeableConcept): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
