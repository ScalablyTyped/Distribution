package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * The diagnosis.
    */
  var diagnosisCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The diagnosis.
    */
  var diagnosisReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The package billing code, for example DRG, based on the assigned grouping code system.
    */
  var packageCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Sequence of diagnosis which serves to provide a link.
    */
  var sequence: Double
  
  /**
    * Diagnosis are presented in list order to their expected importance: primary, secondary, etc.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ExplanationOfBenefitDiagnosis {
  
  inline def apply(sequence: Double): ExplanationOfBenefitDiagnosis = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitDiagnosis]
  }
  
  extension [Self <: ExplanationOfBenefitDiagnosis](x: Self) {
    
    inline def setDiagnosisCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "diagnosisCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisCodeableConceptUndefined: Self = StObject.set(x, "diagnosisCodeableConcept", js.undefined)
    
    inline def setDiagnosisReference(value: Reference): Self = StObject.set(x, "diagnosisReference", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisReferenceUndefined: Self = StObject.set(x, "diagnosisReference", js.undefined)
    
    inline def setPackageCode(value: CodeableConcept): Self = StObject.set(x, "packageCode", value.asInstanceOf[js.Any])
    
    inline def setPackageCodeUndefined: Self = StObject.set(x, "packageCode", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
