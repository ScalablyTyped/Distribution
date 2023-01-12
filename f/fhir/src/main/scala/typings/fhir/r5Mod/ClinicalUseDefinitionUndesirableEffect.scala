package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseDefinitionUndesirableEffect
  extends StObject
     with BackboneElement {
  
  /**
    * High level classification of the effect.
    */
  var classification: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * How often the effect is seen.
    */
  var frequencyOfOccurrence: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The situation in which the undesirable effect may manifest.
    */
  var symptomConditionEffect: js.UndefOr[CodeableReference] = js.undefined
}
object ClinicalUseDefinitionUndesirableEffect {
  
  inline def apply(): ClinicalUseDefinitionUndesirableEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalUseDefinitionUndesirableEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalUseDefinitionUndesirableEffect] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: CodeableConcept): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setFrequencyOfOccurrence(value: CodeableConcept): Self = StObject.set(x, "frequencyOfOccurrence", value.asInstanceOf[js.Any])
    
    inline def setFrequencyOfOccurrenceUndefined: Self = StObject.set(x, "frequencyOfOccurrence", js.undefined)
    
    inline def setSymptomConditionEffect(value: CodeableReference): Self = StObject.set(x, "symptomConditionEffect", value.asInstanceOf[js.Any])
    
    inline def setSymptomConditionEffectUndefined: Self = StObject.set(x, "symptomConditionEffect", js.undefined)
  }
}
