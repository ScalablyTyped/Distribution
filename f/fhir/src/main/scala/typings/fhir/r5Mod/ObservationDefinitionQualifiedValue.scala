package typings.fhir.r5Mod

import typings.fhir.fhirStrings.absolute
import typings.fhir.fhirStrings.critical
import typings.fhir.fhirStrings.female
import typings.fhir.fhirStrings.male
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.reference
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationDefinitionQualifiedValue
  extends StObject
     with BackboneElement {
  
  var _abnormalCodedValueSet: js.UndefOr[Element] = js.undefined
  
  var _condition: js.UndefOr[Element] = js.undefined
  
  var _criticalCodedValueSet: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  var _normalCodedValueSet: js.UndefOr[Element] = js.undefined
  
  var _rangeCategory: js.UndefOr[Element] = js.undefined
  
  var _validCodedValueSet: js.UndefOr[Element] = js.undefined
  
  /**
    * The set of abnormal coded results for qualitative observations  that match the criteria of this set of qualified values.
    */
  var abnormalCodedValueSet: js.UndefOr[String] = js.undefined
  
  /**
    * Some analytes vary greatly over age.
    */
  var age: js.UndefOr[Range] = js.undefined
  
  /**
    * If this element is not present then the global population is assumed.
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Text based condition for which the the set of qualified values is valid.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * A concept defining the context for this set of qualified values.
    */
  var context: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The set of critical coded results for qualitative observations  that match the criteria of this set of qualified values.
    */
  var criticalCodedValueSet: js.UndefOr[String] = js.undefined
  
  /**
    * The gender this  set of qualified values applies to.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * The gestational age this  set of qualified values applies to.
    */
  var gestationalAge: js.UndefOr[Range] = js.undefined
  
  /**
    * The set of normal coded results for qualitative observations  that match the criteria of this set of qualified values.
    */
  var normalCodedValueSet: js.UndefOr[String] = js.undefined
  
  /**
    * The range of values defined for continuous or ordinal observations that match the criteria of this set of qualified values.
    */
  var range: js.UndefOr[Range] = js.undefined
  
  /**
    * The category of range of values for continuous or ordinal observations that match the criteria of this set of qualified values.
    */
  var rangeCategory: js.UndefOr[reference | critical | absolute] = js.undefined
  
  /**
    * The set of valid coded results for qualitative observations  that match the criteria of this set of qualified values.
    */
  var validCodedValueSet: js.UndefOr[String] = js.undefined
}
object ObservationDefinitionQualifiedValue {
  
  inline def apply(): ObservationDefinitionQualifiedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationDefinitionQualifiedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservationDefinitionQualifiedValue] (val x: Self) extends AnyVal {
    
    inline def setAbnormalCodedValueSet(value: String): Self = StObject.set(x, "abnormalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setAbnormalCodedValueSetUndefined: Self = StObject.set(x, "abnormalCodedValueSet", js.undefined)
    
    inline def setAge(value: Range): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setAppliesTo(value: js.Array[CodeableConcept]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: CodeableConcept*): Self = StObject.set(x, "appliesTo", js.Array(value*))
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContext(value: CodeableConcept): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCriticalCodedValueSet(value: String): Self = StObject.set(x, "criticalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setCriticalCodedValueSetUndefined: Self = StObject.set(x, "criticalCodedValueSet", js.undefined)
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setGestationalAge(value: Range): Self = StObject.set(x, "gestationalAge", value.asInstanceOf[js.Any])
    
    inline def setGestationalAgeUndefined: Self = StObject.set(x, "gestationalAge", js.undefined)
    
    inline def setNormalCodedValueSet(value: String): Self = StObject.set(x, "normalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setNormalCodedValueSetUndefined: Self = StObject.set(x, "normalCodedValueSet", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeCategory(value: reference | critical | absolute): Self = StObject.set(x, "rangeCategory", value.asInstanceOf[js.Any])
    
    inline def setRangeCategoryUndefined: Self = StObject.set(x, "rangeCategory", js.undefined)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setValidCodedValueSet(value: String): Self = StObject.set(x, "validCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setValidCodedValueSetUndefined: Self = StObject.set(x, "validCodedValueSet", js.undefined)
    
    inline def set_abnormalCodedValueSet(value: Element): Self = StObject.set(x, "_abnormalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def set_abnormalCodedValueSetUndefined: Self = StObject.set(x, "_abnormalCodedValueSet", js.undefined)
    
    inline def set_condition(value: Element): Self = StObject.set(x, "_condition", value.asInstanceOf[js.Any])
    
    inline def set_conditionUndefined: Self = StObject.set(x, "_condition", js.undefined)
    
    inline def set_criticalCodedValueSet(value: Element): Self = StObject.set(x, "_criticalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def set_criticalCodedValueSetUndefined: Self = StObject.set(x, "_criticalCodedValueSet", js.undefined)
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
    
    inline def set_normalCodedValueSet(value: Element): Self = StObject.set(x, "_normalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def set_normalCodedValueSetUndefined: Self = StObject.set(x, "_normalCodedValueSet", js.undefined)
    
    inline def set_rangeCategory(value: Element): Self = StObject.set(x, "_rangeCategory", value.asInstanceOf[js.Any])
    
    inline def set_rangeCategoryUndefined: Self = StObject.set(x, "_rangeCategory", js.undefined)
    
    inline def set_validCodedValueSet(value: Element): Self = StObject.set(x, "_validCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def set_validCodedValueSetUndefined: Self = StObject.set(x, "_validCodedValueSet", js.undefined)
  }
}
