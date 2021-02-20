package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class ImmunizationRecommendationRecommendationMutableBuilder[Self <: ImmunizationRecommendationRecommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCriterion(value: js.Array[ImmunizationRecommendationRecommendationDateCriterion]): Self = StObject.set(x, "dateCriterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCriterionUndefined: Self = StObject.set(x, "dateCriterion", js.undefined)
    
    @scala.inline
    def setDateCriterionVarargs(value: ImmunizationRecommendationRecommendationDateCriterion*): Self = StObject.set(x, "dateCriterion", js.Array(value :_*))
    
    @scala.inline
    def setDoseNumber(value: positiveInt): Self = StObject.set(x, "doseNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoseNumberUndefined: Self = StObject.set(x, "doseNumber", js.undefined)
    
    @scala.inline
    def setForecastStatus(value: CodeableConcept): Self = StObject.set(x, "forecastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: ImmunizationRecommendationRecommendationProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setSupportingImmunization(value: js.Array[Reference]): Self = StObject.set(x, "supportingImmunization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingImmunizationUndefined: Self = StObject.set(x, "supportingImmunization", js.undefined)
    
    @scala.inline
    def setSupportingImmunizationVarargs(value: Reference*): Self = StObject.set(x, "supportingImmunization", js.Array(value :_*))
    
    @scala.inline
    def setSupportingPatientInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingPatientInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingPatientInformationUndefined: Self = StObject.set(x, "supportingPatientInformation", js.undefined)
    
    @scala.inline
    def setSupportingPatientInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingPatientInformation", js.Array(value :_*))
    
    @scala.inline
    def setTargetDisease(value: CodeableConcept): Self = StObject.set(x, "targetDisease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDiseaseUndefined: Self = StObject.set(x, "targetDisease", js.undefined)
    
    @scala.inline
    def setVaccineCode(value: CodeableConcept): Self = StObject.set(x, "vaccineCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaccineCodeUndefined: Self = StObject.set(x, "vaccineCode", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_doseNumber(value: Element): Self = StObject.set(x, "_doseNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_doseNumberUndefined: Self = StObject.set(x, "_doseNumber", js.undefined)
  }
}
