package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Protocol used by recommendation
  */
trait ImmunizationRecommendationRecommendationProtocol
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
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.undefined
  
  /**
    * Protocol details
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Dose number within sequence
    */
  var doseSequence: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Name of vaccination series
    */
  var series: js.UndefOr[String] = js.undefined
}
object ImmunizationRecommendationRecommendationProtocol {
  
  inline def apply(): ImmunizationRecommendationRecommendationProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationProtocol]
  }
  
  extension [Self <: ImmunizationRecommendationRecommendationProtocol](x: Self) {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDoseSequence(value: positiveInt): Self = StObject.set(x, "doseSequence", value.asInstanceOf[js.Any])
    
    inline def setDoseSequenceUndefined: Self = StObject.set(x, "doseSequence", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_doseSequence(value: Element): Self = StObject.set(x, "_doseSequence", value.asInstanceOf[js.Any])
    
    inline def set_doseSequenceUndefined: Self = StObject.set(x, "_doseSequence", js.undefined)
    
    inline def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    inline def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
  }
}
