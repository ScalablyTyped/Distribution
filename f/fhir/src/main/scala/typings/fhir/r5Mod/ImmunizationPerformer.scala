package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * When the individual practitioner who performed the action is known, it is best to send.
    */
  var actor: Reference
  
  /**
    * Describes the type of performance (e.g. ordering provider, administering provider, etc.).
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object ImmunizationPerformer {
  
  inline def apply(actor: Reference): ImmunizationPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationPerformer]
  }
  
  extension [Self <: ImmunizationPerformer](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
