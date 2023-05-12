package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiologicallyDerivedProductDispensePerformer
  extends StObject
     with BackboneElement {
  
  /**
    * Identifies the person responsible for the action.
    */
  var actor: Reference
  
  /**
    * Identifies the function of the performer during the dispense.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object BiologicallyDerivedProductDispensePerformer {
  
  inline def apply(actor: Reference): BiologicallyDerivedProductDispensePerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiologicallyDerivedProductDispensePerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiologicallyDerivedProductDispensePerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
