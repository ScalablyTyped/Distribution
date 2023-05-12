package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceUsageAdherence
  extends StObject
     with BackboneElement {
  
  /**
    * Type of adherence.
    */
  var code: CodeableConcept
  
  /**
    * Reason for adherence type.
    */
  var reason: js.Array[CodeableConcept]
}
object DeviceUsageAdherence {
  
  inline def apply(code: CodeableConcept, reason: js.Array[CodeableConcept]): DeviceUsageAdherence = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUsageAdherence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceUsageAdherence] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
  }
}
