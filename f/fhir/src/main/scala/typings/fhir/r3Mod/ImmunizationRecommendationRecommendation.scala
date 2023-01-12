package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationRecommendationRecommendation
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * The date the immunization recommendation was created.
    */
  var date: String
  
  /**
    * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
    */
  var dateCriterion: js.UndefOr[js.Array[ImmunizationRecommendationRecommendationDateCriterion]] = js.undefined
  
  /**
    * May need other dose concepts such as administered vs. valid.
    */
  var doseNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Vaccine administration status.
    */
  var forecastStatus: CodeableConcept
  
  /**
    * Contains information about the protocol under which the vaccine was administered.
    */
  var protocol: js.UndefOr[ImmunizationRecommendationRecommendationProtocol] = js.undefined
  
  /**
    * Immunization event history that supports the status and recommendation.
    */
  var supportingImmunization: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
    */
  var supportingPatientInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The targeted disease for the recommendation.
    */
  var targetDisease: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Vaccine that pertains to the recommendation.
    */
  var vaccineCode: js.UndefOr[CodeableConcept] = js.undefined
}
object ImmunizationRecommendationRecommendation {
  
  inline def apply(date: String, forecastStatus: CodeableConcept): ImmunizationRecommendationRecommendation = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], forecastStatus = forecastStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImmunizationRecommendationRecommendation] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateCriterion(value: js.Array[ImmunizationRecommendationRecommendationDateCriterion]): Self = StObject.set(x, "dateCriterion", value.asInstanceOf[js.Any])
    
    inline def setDateCriterionUndefined: Self = StObject.set(x, "dateCriterion", js.undefined)
    
    inline def setDateCriterionVarargs(value: ImmunizationRecommendationRecommendationDateCriterion*): Self = StObject.set(x, "dateCriterion", js.Array(value*))
    
    inline def setDoseNumber(value: Double): Self = StObject.set(x, "doseNumber", value.asInstanceOf[js.Any])
    
    inline def setDoseNumberUndefined: Self = StObject.set(x, "doseNumber", js.undefined)
    
    inline def setForecastStatus(value: CodeableConcept): Self = StObject.set(x, "forecastStatus", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: ImmunizationRecommendationRecommendationProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSupportingImmunization(value: js.Array[Reference]): Self = StObject.set(x, "supportingImmunization", value.asInstanceOf[js.Any])
    
    inline def setSupportingImmunizationUndefined: Self = StObject.set(x, "supportingImmunization", js.undefined)
    
    inline def setSupportingImmunizationVarargs(value: Reference*): Self = StObject.set(x, "supportingImmunization", js.Array(value*))
    
    inline def setSupportingPatientInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingPatientInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingPatientInformationUndefined: Self = StObject.set(x, "supportingPatientInformation", js.undefined)
    
    inline def setSupportingPatientInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingPatientInformation", js.Array(value*))
    
    inline def setTargetDisease(value: CodeableConcept): Self = StObject.set(x, "targetDisease", value.asInstanceOf[js.Any])
    
    inline def setTargetDiseaseUndefined: Self = StObject.set(x, "targetDisease", js.undefined)
    
    inline def setVaccineCode(value: CodeableConcept): Self = StObject.set(x, "vaccineCode", value.asInstanceOf[js.Any])
    
    inline def setVaccineCodeUndefined: Self = StObject.set(x, "vaccineCode", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
