package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of Diagnosis
  */
trait ClaimDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * Patient's diagnosis
    */
  var diagnosisCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Patient's diagnosis
    */
  var diagnosisReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Package billing code
    */
  var packageCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Number to covey order of diagnosis
    */
  var sequence: positiveInt
  
  /**
    * Timing or nature of the diagnosis
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ClaimDiagnosis {
  
  inline def apply(sequence: positiveInt): ClaimDiagnosis = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDiagnosis]
  }
  
  extension [Self <: ClaimDiagnosis](x: Self) {
    
    inline def setDiagnosisCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "diagnosisCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisCodeableConceptUndefined: Self = StObject.set(x, "diagnosisCodeableConcept", js.undefined)
    
    inline def setDiagnosisReference(value: Reference): Self = StObject.set(x, "diagnosisReference", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisReferenceUndefined: Self = StObject.set(x, "diagnosisReference", js.undefined)
    
    inline def setPackageCode(value: CodeableConcept): Self = StObject.set(x, "packageCode", value.asInstanceOf[js.Any])
    
    inline def setPackageCodeUndefined: Self = StObject.set(x, "packageCode", js.undefined)
    
    inline def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
