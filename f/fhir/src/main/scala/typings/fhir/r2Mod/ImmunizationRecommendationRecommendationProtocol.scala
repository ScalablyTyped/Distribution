package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationRecommendationRecommendationProtocol
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _series: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the authority who published the protocol.  For example, ACIP.
    */
  var authority: js.UndefOr[Reference] = js.undefined
  
  /**
    * Contains the description about the protocol under which the vaccine was administered.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
    */
  var doseSequence: js.UndefOr[Double] = js.undefined
  
  /**
    * One possible path to achieve presumed immunity against a disease - within the context of an authority.
    */
  var series: js.UndefOr[String] = js.undefined
}
object ImmunizationRecommendationRecommendationProtocol {
  
  inline def apply(): ImmunizationRecommendationRecommendationProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationProtocol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImmunizationRecommendationRecommendationProtocol] (val x: Self) extends AnyVal {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDoseSequence(value: Double): Self = StObject.set(x, "doseSequence", value.asInstanceOf[js.Any])
    
    inline def setDoseSequenceUndefined: Self = StObject.set(x, "doseSequence", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    inline def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
  }
}
