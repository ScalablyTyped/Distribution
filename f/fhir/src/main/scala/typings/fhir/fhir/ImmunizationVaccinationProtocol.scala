package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What protocol was followed
  */
trait ImmunizationVaccinationProtocol
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'doseSequence'.
    */
  var _doseSequence: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'series'.
    */
  var _series: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'seriesDoses'.
    */
  var _seriesDoses: js.UndefOr[Element] = js.undefined
  
  /**
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.undefined
  
  /**
    * Details of vaccine protocol
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Dose number within series
    */
  var doseSequence: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Indicates if dose counts towards immunity
    */
  var doseStatus: CodeableConcept
  
  /**
    * Why dose does (not) count
    */
  var doseStatusReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Name of vaccine series
    */
  var series: js.UndefOr[String] = js.undefined
  
  /**
    * Recommended number of doses for immunity
    */
  var seriesDoses: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Disease immunized against
    */
  var targetDisease: js.Array[CodeableConcept]
}
object ImmunizationVaccinationProtocol {
  
  inline def apply(doseStatus: CodeableConcept, targetDisease: js.Array[CodeableConcept]): ImmunizationVaccinationProtocol = {
    val __obj = js.Dynamic.literal(doseStatus = doseStatus.asInstanceOf[js.Any], targetDisease = targetDisease.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationVaccinationProtocol]
  }
  
  extension [Self <: ImmunizationVaccinationProtocol](x: Self) {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDoseSequence(value: positiveInt): Self = StObject.set(x, "doseSequence", value.asInstanceOf[js.Any])
    
    inline def setDoseSequenceUndefined: Self = StObject.set(x, "doseSequence", js.undefined)
    
    inline def setDoseStatus(value: CodeableConcept): Self = StObject.set(x, "doseStatus", value.asInstanceOf[js.Any])
    
    inline def setDoseStatusReason(value: CodeableConcept): Self = StObject.set(x, "doseStatusReason", value.asInstanceOf[js.Any])
    
    inline def setDoseStatusReasonUndefined: Self = StObject.set(x, "doseStatusReason", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesDoses(value: positiveInt): Self = StObject.set(x, "seriesDoses", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesUndefined: Self = StObject.set(x, "seriesDoses", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setTargetDisease(value: js.Array[CodeableConcept]): Self = StObject.set(x, "targetDisease", value.asInstanceOf[js.Any])
    
    inline def setTargetDiseaseVarargs(value: CodeableConcept*): Self = StObject.set(x, "targetDisease", js.Array(value :_*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_doseSequence(value: Element): Self = StObject.set(x, "_doseSequence", value.asInstanceOf[js.Any])
    
    inline def set_doseSequenceUndefined: Self = StObject.set(x, "_doseSequence", js.undefined)
    
    inline def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    inline def set_seriesDoses(value: Element): Self = StObject.set(x, "_seriesDoses", value.asInstanceOf[js.Any])
    
    inline def set_seriesDosesUndefined: Self = StObject.set(x, "_seriesDoses", js.undefined)
    
    inline def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
  }
}
