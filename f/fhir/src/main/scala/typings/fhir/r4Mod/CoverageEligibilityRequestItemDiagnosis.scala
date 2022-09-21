package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityRequestItemDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * The nature of illness or problem in a coded form or as a reference to an external defined Condition.
    */
  var diagnosisCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The nature of illness or problem in a coded form or as a reference to an external defined Condition.
    */
  var diagnosisReference: js.UndefOr[Reference] = js.undefined
}
object CoverageEligibilityRequestItemDiagnosis {
  
  inline def apply(): CoverageEligibilityRequestItemDiagnosis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageEligibilityRequestItemDiagnosis]
  }
  
  extension [Self <: CoverageEligibilityRequestItemDiagnosis](x: Self) {
    
    inline def setDiagnosisCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "diagnosisCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisCodeableConceptUndefined: Self = StObject.set(x, "diagnosisCodeableConcept", js.undefined)
    
    inline def setDiagnosisReference(value: Reference): Self = StObject.set(x, "diagnosisReference", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisReferenceUndefined: Self = StObject.set(x, "diagnosisReference", js.undefined)
  }
}
