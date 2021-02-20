package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Participants in producing the report
  */
@js.native
trait DiagnosticReportPerformer extends BackboneElement {
  
  /**
    * Practitioner or Organization  participant
    */
  var actor: Reference = js.native
  
  /**
    * Type of performer
    */
  var role: js.UndefOr[CodeableConcept] = js.native
}
object DiagnosticReportPerformer {
  
  @scala.inline
  def apply(actor: Reference): DiagnosticReportPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReportPerformer]
  }
  
  @scala.inline
  implicit class DiagnosticReportPerformerMutableBuilder[Self <: DiagnosticReportPerformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
