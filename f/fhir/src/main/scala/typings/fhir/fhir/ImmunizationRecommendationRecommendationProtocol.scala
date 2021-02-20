package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Protocol used by recommendation
  */
@js.native
trait ImmunizationRecommendationRecommendationProtocol extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'doseSequence'.
    */
  var _doseSequence: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'series'.
    */
  var _series: js.UndefOr[Element] = js.native
  
  /**
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.native
  
  /**
    * Protocol details
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Dose number within sequence
    */
  var doseSequence: js.UndefOr[positiveInt] = js.native
  
  /**
    * Name of vaccination series
    */
  var series: js.UndefOr[String] = js.native
}
object ImmunizationRecommendationRecommendationProtocol {
  
  @scala.inline
  def apply(): ImmunizationRecommendationRecommendationProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationProtocol]
  }
  
  @scala.inline
  implicit class ImmunizationRecommendationRecommendationProtocolMutableBuilder[Self <: ImmunizationRecommendationRecommendationProtocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDoseSequence(value: positiveInt): Self = StObject.set(x, "doseSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoseSequenceUndefined: Self = StObject.set(x, "doseSequence", js.undefined)
    
    @scala.inline
    def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_doseSequence(value: Element): Self = StObject.set(x, "_doseSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_doseSequenceUndefined: Self = StObject.set(x, "_doseSequence", js.undefined)
    
    @scala.inline
    def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
  }
}
