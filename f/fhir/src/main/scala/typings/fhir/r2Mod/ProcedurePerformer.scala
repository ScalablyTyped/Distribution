package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcedurePerformer
  extends StObject
     with BackboneElement {
  
  /**
    * The practitioner who was involved in the procedure.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example: surgeon, anaethetist, endoscopist.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object ProcedurePerformer {
  
  inline def apply(): ProcedurePerformer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcedurePerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcedurePerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
