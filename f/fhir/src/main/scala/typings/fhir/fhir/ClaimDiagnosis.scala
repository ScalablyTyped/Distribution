package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of Diagnosis
  */
@js.native
trait ClaimDiagnosis extends BackboneElement {
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  
  /**
    * Patient's diagnosis
    */
  var diagnosisCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Patient's diagnosis
    */
  var diagnosisReference: js.UndefOr[Reference] = js.native
  
  /**
    * Package billing code
    */
  var packageCode: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Number to covey order of diagnosis
    */
  var sequence: positiveInt = js.native
  
  /**
    * Timing or nature of the diagnosis
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object ClaimDiagnosis {
  
  @scala.inline
  def apply(sequence: positiveInt): ClaimDiagnosis = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDiagnosis]
  }
  
  @scala.inline
  implicit class ClaimDiagnosisMutableBuilder[Self <: ClaimDiagnosis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnosisCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "diagnosisCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosisCodeableConceptUndefined: Self = StObject.set(x, "diagnosisCodeableConcept", js.undefined)
    
    @scala.inline
    def setDiagnosisReference(value: Reference): Self = StObject.set(x, "diagnosisReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosisReferenceUndefined: Self = StObject.set(x, "diagnosisReference", js.undefined)
    
    @scala.inline
    def setPackageCode(value: CodeableConcept): Self = StObject.set(x, "packageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageCodeUndefined: Self = StObject.set(x, "packageCode", js.undefined)
    
    @scala.inline
    def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
