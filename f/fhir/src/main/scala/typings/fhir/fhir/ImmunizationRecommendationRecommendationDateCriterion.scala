package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dates governing proposed immunization
  */
@js.native
trait ImmunizationRecommendationRecommendationDateCriterion extends BackboneElement {
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  
  /**
    * Type of date
    */
  var code: CodeableConcept = js.native
  
  /**
    * Recommended date
    */
  var value: dateTime = js.native
}
object ImmunizationRecommendationRecommendationDateCriterion {
  
  @scala.inline
  def apply(code: CodeableConcept, value: dateTime): ImmunizationRecommendationRecommendationDateCriterion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationDateCriterion]
  }
  
  @scala.inline
  implicit class ImmunizationRecommendationRecommendationDateCriterionOps[Self <: ImmunizationRecommendationRecommendationDateCriterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: dateTime): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
  }
}
