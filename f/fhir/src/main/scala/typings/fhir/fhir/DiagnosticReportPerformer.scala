package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Participants in producing the report
  */
trait DiagnosticReportPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * Practitioner or Organization  participant
    */
  var actor: Reference
  
  /**
    * Type of performer
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object DiagnosticReportPerformer {
  
  inline def apply(actor: Reference): DiagnosticReportPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReportPerformer]
  }
  
  extension [Self <: DiagnosticReportPerformer](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
