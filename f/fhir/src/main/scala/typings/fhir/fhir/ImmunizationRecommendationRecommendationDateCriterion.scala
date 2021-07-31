package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dates governing proposed immunization
  */
trait ImmunizationRecommendationRecommendationDateCriterion
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Type of date
    */
  var code: CodeableConcept
  
  /**
    * Recommended date
    */
  var value: dateTime
}
object ImmunizationRecommendationRecommendationDateCriterion {
  
  @scala.inline
  def apply(code: CodeableConcept, value: dateTime): ImmunizationRecommendationRecommendationDateCriterion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationDateCriterion]
  }
  
  @scala.inline
  implicit class ImmunizationRecommendationRecommendationDateCriterionMutableBuilder[Self <: ImmunizationRecommendationRecommendationDateCriterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: dateTime): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
