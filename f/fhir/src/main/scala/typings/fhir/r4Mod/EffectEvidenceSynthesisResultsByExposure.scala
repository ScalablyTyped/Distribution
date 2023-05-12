package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`exposure-alternative`
import typings.fhir.fhirStrings.exposure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectEvidenceSynthesisResultsByExposure
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _exposureState: js.UndefOr[Element] = js.undefined
  
  /**
    * Human-readable summary of results by exposure state.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Whether these results are for the exposure state or alternative exposure state.
    */
  var exposureState: js.UndefOr[exposure | `exposure-alternative`] = js.undefined
  
  /**
    * Reference to a RiskEvidenceSynthesis resource.
    */
  var riskEvidenceSynthesis: Reference
  
  /**
    * Used to define variant exposure states such as low-risk state.
    */
  var variantState: js.UndefOr[CodeableConcept] = js.undefined
}
object EffectEvidenceSynthesisResultsByExposure {
  
  inline def apply(riskEvidenceSynthesis: Reference): EffectEvidenceSynthesisResultsByExposure = {
    val __obj = js.Dynamic.literal(riskEvidenceSynthesis = riskEvidenceSynthesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectEvidenceSynthesisResultsByExposure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectEvidenceSynthesisResultsByExposure] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExposureState(value: exposure | `exposure-alternative`): Self = StObject.set(x, "exposureState", value.asInstanceOf[js.Any])
    
    inline def setExposureStateUndefined: Self = StObject.set(x, "exposureState", js.undefined)
    
    inline def setRiskEvidenceSynthesis(value: Reference): Self = StObject.set(x, "riskEvidenceSynthesis", value.asInstanceOf[js.Any])
    
    inline def setVariantState(value: CodeableConcept): Self = StObject.set(x, "variantState", value.asInstanceOf[js.Any])
    
    inline def setVariantStateUndefined: Self = StObject.set(x, "variantState", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_exposureState(value: Element): Self = StObject.set(x, "_exposureState", value.asInstanceOf[js.Any])
    
    inline def set_exposureStateUndefined: Self = StObject.set(x, "_exposureState", js.undefined)
  }
}
