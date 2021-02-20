package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The people who performed the procedure
  */
@js.native
trait ProcedurePerformer extends BackboneElement {
  
  /**
    * The reference to the practitioner
    */
  var actor: Reference = js.native
  
  /**
    * Organization the device or practitioner was acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.native
  
  /**
    * The role the actor was in
    */
  var role: js.UndefOr[CodeableConcept] = js.native
}
object ProcedurePerformer {
  
  @scala.inline
  def apply(actor: Reference): ProcedurePerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedurePerformer]
  }
  
  @scala.inline
  implicit class ProcedurePerformerMutableBuilder[Self <: ProcedurePerformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
