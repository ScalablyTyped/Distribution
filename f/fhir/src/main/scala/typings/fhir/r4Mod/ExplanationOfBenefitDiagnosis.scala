package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitDiagnosis
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
  
  /**
    * Indication of whether the diagnosis was present on admission to a facility.
    */
  var onAdmission: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example, DRG (Diagnosis Related Group) or a bundled billing code. A patient may have a diagnosis of a Myocardio-infarction and a DRG for HeartAttack would assigned. The Claim item (and possible subsequent claims) would refer to the DRG for those line items that were for services related to the heart attack event.
    */
  var packageCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Diagnosis are presented in list order to their expected importance: primary, secondary, etc.
    */
  var sequence: Double
  
  /**
    * For example: admitting, primary, secondary, discharge.
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
    
    inline def setOnAdmission(value: CodeableConcept): Self = StObject.set(x, "onAdmission", value.asInstanceOf[js.Any])
    
    inline def setOnAdmissionUndefined: Self = StObject.set(x, "onAdmission", js.undefined)
    
    inline def setPackageCode(value: CodeableConcept): Self = StObject.set(x, "packageCode", value.asInstanceOf[js.Any])
    
    inline def setPackageCodeUndefined: Self = StObject.set(x, "packageCode", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
