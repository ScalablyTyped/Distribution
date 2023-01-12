package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticReportPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * This is not necessarily the source of the atomic data items. It is the entity that takes responsibility for the clinical report.
    */
  var actor: Reference
  
  /**
    * Describes the type of participation (e.g.  a responsible party, author, or verifier).
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object DiagnosticReportPerformer {
  
  inline def apply(actor: Reference): DiagnosticReportPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReportPerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticReportPerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
