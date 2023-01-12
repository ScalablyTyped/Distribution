package typings.fhir.r4Mod

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

trait ObservationDefinitionQualifiedInterval
  extends StObject
     with BackboneElement {
  
  var _category: js.UndefOr[Element] = js.undefined
  
  var _condition: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * Some analytes vary greatly over age.
    */
  var age: js.UndefOr[Range] = js.undefined
  
  /**
    * If this element is not present then the global population is assumed.
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The category of interval of values for continuous or ordinal observations conforming to this ObservationDefinition.
    */
  var category: js.UndefOr[reference | critical | absolute] = js.undefined
  
  /**
    * Text based condition for which the reference range is valid.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * Codes to indicate the health context the range applies to. For example, the normal or therapeutic range.
    */
  var context: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Sex of the population the range applies to.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * The gestational age to which this reference range is applicable, in the context of pregnancy.
    */
  var gestationalAge: js.UndefOr[Range] = js.undefined
  
  /**
    * The low and high values determining the interval. There may be only one of the two.
    */
  var range: js.UndefOr[Range] = js.undefined
}
object ObservationDefinitionQualifiedInterval {
  
  inline def apply(): ObservationDefinitionQualifiedInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationDefinitionQualifiedInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservationDefinitionQualifiedInterval] (val x: Self) extends AnyVal {
    
    inline def setAge(value: Range): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setAppliesTo(value: js.Array[CodeableConcept]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: CodeableConcept*): Self = StObject.set(x, "appliesTo", js.Array(value*))
    
    inline def setCategory(value: reference | critical | absolute): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContext(value: CodeableConcept): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setGestationalAge(value: Range): Self = StObject.set(x, "gestationalAge", value.asInstanceOf[js.Any])
    
    inline def setGestationalAgeUndefined: Self = StObject.set(x, "gestationalAge", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    inline def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    inline def set_condition(value: Element): Self = StObject.set(x, "_condition", value.asInstanceOf[js.Any])
    
    inline def set_conditionUndefined: Self = StObject.set(x, "_condition", js.undefined)
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
  }
}
