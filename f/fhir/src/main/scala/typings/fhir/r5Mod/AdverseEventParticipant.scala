package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEventParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * For example, the physician prescribing a drug, a nurse administering the drug, a device that administered the drug, a witness to the event, or an informant of clinical history.
    */
  var actor: Reference
  
  /**
    * Distinguishes the type of involvement of the actor in the adverse event, such as contributor or informant.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object AdverseEventParticipant {
  
  inline def apply(actor: Reference): AdverseEventParticipant = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdverseEventParticipant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdverseEventParticipant] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
