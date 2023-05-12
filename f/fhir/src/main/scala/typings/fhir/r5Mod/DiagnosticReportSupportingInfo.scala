package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticReportSupportingInfo
  extends StObject
     with BackboneElement {
  
  /**
    * The reference for the supporting information in the diagnostic report.
    */
  var reference: Reference
  
  /**
    * The code value for the role of the supporting information in the diagnostic report.
    */
  var `type`: CodeableConcept
}
object DiagnosticReportSupportingInfo {
  
  inline def apply(reference: Reference, `type`: CodeableConcept): DiagnosticReportSupportingInfo = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReportSupportingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticReportSupportingInfo] (val x: Self) extends AnyVal {
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
