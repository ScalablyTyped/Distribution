package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationStatementAdherence
  extends StObject
     with BackboneElement {
  
  /**
    * Type of the adherence for the medication.
    */
  var code: CodeableConcept
  
  /**
    * This is generally only used for "exception" statuses such as "entered-in-error". The reason for performing the event at all is captured in reasonCode, not here.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicationStatementAdherence {
  
  inline def apply(code: CodeableConcept): MedicationStatementAdherence = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationStatementAdherence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationStatementAdherence] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
