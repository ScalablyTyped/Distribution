package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationDispensePerformer
  extends StObject
     with BackboneElement {
  
  /**
    * The device, practitioner, etc. who performed the action.  It should be assumed that the actor is the dispenser of the medication.
    */
  var actor: Reference
  
  /**
    * Distinguishes the type of performer in the dispense.  For example, date enterer, packager, final checker.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicationDispensePerformer {
  
  inline def apply(actor: Reference): MedicationDispensePerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispensePerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationDispensePerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
