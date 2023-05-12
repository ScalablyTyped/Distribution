package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcedurePerformer
  extends StObject
     with BackboneElement {
  
  /**
    * Indicates who or what performed the procedure.
    */
  var actor: Reference
  
  /**
    * Distinguishes the type of involvement of the performer in the procedure. For example, surgeon, anaesthetist, endoscopist.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Organization, Patient, RelatedPerson, Device, CareTeam, and HealthcareService can be associated with multiple organizations. This element indicates which organization they were acting on behalf of when performing the action.
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * Time period during which the performer performed the procedure.
    */
  var period: js.UndefOr[Period] = js.undefined
}
object ProcedurePerformer {
  
  inline def apply(actor: Reference): ProcedurePerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedurePerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcedurePerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
