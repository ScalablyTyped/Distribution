package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationRecommendationRecommendation
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _doseNumberString: js.UndefOr[Element] = js.undefined
  
  var _series: js.UndefOr[Element] = js.undefined
  
  var _seriesDosesString: js.UndefOr[Element] = js.undefined
  
  /**
    * Vaccine(s) which should not be used to fulfill the recommendation.
    */
  var contraindicatedVaccineCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
    */
  var dateCriterion: js.UndefOr[js.Array[ImmunizationRecommendationRecommendationDateCriterion]] = js.undefined
  
  /**
    * Contains the description about the protocol under which the vaccine was administered.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The use of an integer is prefered if known. A string should only be used in cases where an interger is not available (such as when documenting a recurring booster dose).
    */
  var doseNumberPositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * The use of an integer is prefered if known. A string should only be used in cases where an interger is not available (such as when documenting a recurring booster dose).
    */
  var doseNumberString: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the assigned forecast status.
    */
  var forecastReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates the patient status with respect to the path to immunity for the target disease.
    */
  var forecastStatus: CodeableConcept
  
  /**
    * One possible path to achieve presumed immunity against a disease - within the context of an authority.
    */
  var series: js.UndefOr[String] = js.undefined
  
  /**
    * The use of an integer is prefered if known. A string should only be used in cases where an interger is not available (such as when documenting a recurring booster dose).
    */
  var seriesDosesPositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * The use of an integer is prefered if known. A string should only be used in cases where an interger is not available (such as when documenting a recurring booster dose).
    */
  var seriesDosesString: js.UndefOr[String] = js.undefined
  
  /**
    * Immunization event history and/or evaluation that supports the status and recommendation.
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
    * Vaccine(s) or vaccine group that pertain to the recommendation.
    */
  var vaccineCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ImmunizationRecommendationRecommendation {
  
  inline def apply(forecastStatus: CodeableConcept): ImmunizationRecommendationRecommendation = {
    val __obj = js.Dynamic.literal(forecastStatus = forecastStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendation]
  }
  
  extension [Self <: ImmunizationRecommendationRecommendation](x: Self) {
    
    inline def setContraindicatedVaccineCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "contraindicatedVaccineCode", value.asInstanceOf[js.Any])
    
    inline def setContraindicatedVaccineCodeUndefined: Self = StObject.set(x, "contraindicatedVaccineCode", js.undefined)
    
    inline def setContraindicatedVaccineCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "contraindicatedVaccineCode", js.Array(value*))
    
    inline def setDateCriterion(value: js.Array[ImmunizationRecommendationRecommendationDateCriterion]): Self = StObject.set(x, "dateCriterion", value.asInstanceOf[js.Any])
    
    inline def setDateCriterionUndefined: Self = StObject.set(x, "dateCriterion", js.undefined)
    
    inline def setDateCriterionVarargs(value: ImmunizationRecommendationRecommendationDateCriterion*): Self = StObject.set(x, "dateCriterion", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDoseNumberPositiveInt(value: Double): Self = StObject.set(x, "doseNumberPositiveInt", value.asInstanceOf[js.Any])
    
    inline def setDoseNumberPositiveIntUndefined: Self = StObject.set(x, "doseNumberPositiveInt", js.undefined)
    
    inline def setDoseNumberString(value: String): Self = StObject.set(x, "doseNumberString", value.asInstanceOf[js.Any])
    
    inline def setDoseNumberStringUndefined: Self = StObject.set(x, "doseNumberString", js.undefined)
    
    inline def setForecastReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "forecastReason", value.asInstanceOf[js.Any])
    
    inline def setForecastReasonUndefined: Self = StObject.set(x, "forecastReason", js.undefined)
    
    inline def setForecastReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "forecastReason", js.Array(value*))
    
    inline def setForecastStatus(value: CodeableConcept): Self = StObject.set(x, "forecastStatus", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesPositiveInt(value: Double): Self = StObject.set(x, "seriesDosesPositiveInt", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesPositiveIntUndefined: Self = StObject.set(x, "seriesDosesPositiveInt", js.undefined)
    
    inline def setSeriesDosesString(value: String): Self = StObject.set(x, "seriesDosesString", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesStringUndefined: Self = StObject.set(x, "seriesDosesString", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSupportingImmunization(value: js.Array[Reference]): Self = StObject.set(x, "supportingImmunization", value.asInstanceOf[js.Any])
    
    inline def setSupportingImmunizationUndefined: Self = StObject.set(x, "supportingImmunization", js.undefined)
    
    inline def setSupportingImmunizationVarargs(value: Reference*): Self = StObject.set(x, "supportingImmunization", js.Array(value*))
    
    inline def setSupportingPatientInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingPatientInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingPatientInformationUndefined: Self = StObject.set(x, "supportingPatientInformation", js.undefined)
    
    inline def setSupportingPatientInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingPatientInformation", js.Array(value*))
    
    inline def setTargetDisease(value: CodeableConcept): Self = StObject.set(x, "targetDisease", value.asInstanceOf[js.Any])
    
    inline def setTargetDiseaseUndefined: Self = StObject.set(x, "targetDisease", js.undefined)
    
    inline def setVaccineCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "vaccineCode", value.asInstanceOf[js.Any])
    
    inline def setVaccineCodeUndefined: Self = StObject.set(x, "vaccineCode", js.undefined)
    
    inline def setVaccineCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "vaccineCode", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_doseNumberString(value: Element): Self = StObject.set(x, "_doseNumberString", value.asInstanceOf[js.Any])
    
    inline def set_doseNumberStringUndefined: Self = StObject.set(x, "_doseNumberString", js.undefined)
    
    inline def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    inline def set_seriesDosesString(value: Element): Self = StObject.set(x, "_seriesDosesString", value.asInstanceOf[js.Any])
    
    inline def set_seriesDosesStringUndefined: Self = StObject.set(x, "_seriesDosesString", js.undefined)
    
    inline def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
  }
}
