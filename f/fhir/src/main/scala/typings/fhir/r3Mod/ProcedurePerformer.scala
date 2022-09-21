package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcedurePerformer
  extends StObject
     with BackboneElement {
  
  /**
    * The practitioner who was involved in the procedure.
    */
  var actor: Reference
  
  /**
    * The organization the device or practitioner was acting on behalf of.
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example: surgeon, anaethetist, endoscopist.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object ProcedurePerformer {
  
  inline def apply(actor: Reference): ProcedurePerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedurePerformer]
  }
  
  extension [Self <: ProcedurePerformer](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
