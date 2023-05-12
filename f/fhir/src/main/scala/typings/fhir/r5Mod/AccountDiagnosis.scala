package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountDiagnosis
  extends StObject
     with BackboneElement {
  
  var _dateOfDiagnosis: js.UndefOr[Element] = js.undefined
  
  var _onAdmission: js.UndefOr[Element] = js.undefined
  
  /**
    * The diagnosis relevant to the account.
    */
  var condition: CodeableReference
  
  /**
    * Ranking of the diagnosis (for each type).
    */
  var dateOfDiagnosis: js.UndefOr[String] = js.undefined
  
  /**
    * Was the Diagnosis present on Admission in the related Encounter.
    */
  var onAdmission: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The package code can be used to group diagnoses that may be priced or delivered as a single product. Such as DRGs.
    */
  var packageCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Ranking of the diagnosis (for each type).
    */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * Type that this diagnosis has relevant to the account (e.g. admission, billing, discharge …).
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object AccountDiagnosis {
  
  inline def apply(condition: CodeableReference): AccountDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDiagnosis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountDiagnosis] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: CodeableReference): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setDateOfDiagnosis(value: String): Self = StObject.set(x, "dateOfDiagnosis", value.asInstanceOf[js.Any])
    
    inline def setDateOfDiagnosisUndefined: Self = StObject.set(x, "dateOfDiagnosis", js.undefined)
    
    inline def setOnAdmission(value: Boolean): Self = StObject.set(x, "onAdmission", value.asInstanceOf[js.Any])
    
    inline def setOnAdmissionUndefined: Self = StObject.set(x, "onAdmission", js.undefined)
    
    inline def setPackageCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "packageCode", value.asInstanceOf[js.Any])
    
    inline def setPackageCodeUndefined: Self = StObject.set(x, "packageCode", js.undefined)
    
    inline def setPackageCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "packageCode", js.Array(value*))
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_dateOfDiagnosis(value: Element): Self = StObject.set(x, "_dateOfDiagnosis", value.asInstanceOf[js.Any])
    
    inline def set_dateOfDiagnosisUndefined: Self = StObject.set(x, "_dateOfDiagnosis", js.undefined)
    
    inline def set_onAdmission(value: Element): Self = StObject.set(x, "_onAdmission", value.asInstanceOf[js.Any])
    
    inline def set_onAdmissionUndefined: Self = StObject.set(x, "_onAdmission", js.undefined)
  }
}
