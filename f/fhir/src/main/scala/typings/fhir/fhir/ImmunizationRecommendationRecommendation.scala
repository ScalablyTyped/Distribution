package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Vaccine administration recommendations
  */
@js.native
trait ImmunizationRecommendationRecommendation extends BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'doseNumber'.
    */
  var _doseNumber: js.UndefOr[Element] = js.native
  
  /**
    * Date recommendation created
    */
  var date: dateTime = js.native
  
  /**
    * Dates governing proposed immunization
    */
  var dateCriterion: js.UndefOr[js.Array[ImmunizationRecommendationRecommendationDateCriterion]] = js.native
  
  /**
    * Recommended dose number
    */
  var doseNumber: js.UndefOr[positiveInt] = js.native
  
  /**
    * Vaccine administration status
    */
  var forecastStatus: CodeableConcept = js.native
  
  /**
    * Protocol used by recommendation
    */
  var protocol: js.UndefOr[ImmunizationRecommendationRecommendationProtocol] = js.native
  
  /**
    * Past immunizations supporting recommendation
    */
  var supportingImmunization: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Patient observations supporting recommendation
    */
  var supportingPatientInformation: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Disease to be immunized against
    */
  var targetDisease: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Vaccine recommendation applies to
    */
  var vaccineCode: js.UndefOr[CodeableConcept] = js.native
}
object ImmunizationRecommendationRecommendation {
  
  @scala.inline
  def apply(date: dateTime, forecastStatus: CodeableConcept): ImmunizationRecommendationRecommendation = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], forecastStatus = forecastStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendation]
  }
  
  @scala.inline
  implicit class ImmunizationRecommendationRecommendationOps[Self <: ImmunizationRecommendationRecommendation] (val x: Self) extends AnyVal {
    
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
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastStatus(value: CodeableConcept): Self = this.set("forecastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_doseNumber(value: Element): Self = this.set("_doseNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_doseNumber: Self = this.set("_doseNumber", js.undefined)
    
    @scala.inline
    def setDateCriterionVarargs(value: ImmunizationRecommendationRecommendationDateCriterion*): Self = this.set("dateCriterion", js.Array(value :_*))
    
    @scala.inline
    def setDateCriterion(value: js.Array[ImmunizationRecommendationRecommendationDateCriterion]): Self = this.set("dateCriterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCriterion: Self = this.set("dateCriterion", js.undefined)
    
    @scala.inline
    def setDoseNumber(value: positiveInt): Self = this.set("doseNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoseNumber: Self = this.set("doseNumber", js.undefined)
    
    @scala.inline
    def setProtocol(value: ImmunizationRecommendationRecommendationProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSupportingImmunizationVarargs(value: Reference*): Self = this.set("supportingImmunization", js.Array(value :_*))
    
    @scala.inline
    def setSupportingImmunization(value: js.Array[Reference]): Self = this.set("supportingImmunization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportingImmunization: Self = this.set("supportingImmunization", js.undefined)
    
    @scala.inline
    def setSupportingPatientInformationVarargs(value: Reference*): Self = this.set("supportingPatientInformation", js.Array(value :_*))
    
    @scala.inline
    def setSupportingPatientInformation(value: js.Array[Reference]): Self = this.set("supportingPatientInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportingPatientInformation: Self = this.set("supportingPatientInformation", js.undefined)
    
    @scala.inline
    def setTargetDisease(value: CodeableConcept): Self = this.set("targetDisease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDisease: Self = this.set("targetDisease", js.undefined)
    
    @scala.inline
    def setVaccineCode(value: CodeableConcept): Self = this.set("vaccineCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaccineCode: Self = this.set("vaccineCode", js.undefined)
  }
}
