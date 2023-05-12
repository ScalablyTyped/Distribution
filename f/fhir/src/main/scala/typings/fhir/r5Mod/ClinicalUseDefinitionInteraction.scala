package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseDefinitionInteraction
  extends StObject
     with BackboneElement {
  
  /**
    * The effect of the interaction, for example "reduced gastric absorption of primary medication".
    */
  var effect: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The incidence of the interaction, e.g. theoretical, observed.
    */
  var incidence: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The specific medication, product, food, substance etc. or laboratory test that interacts.
    */
  var interactant: js.UndefOr[js.Array[ClinicalUseDefinitionInteractionInteractant]] = js.undefined
  
  /**
    * Actions for managing the interaction.
    */
  var management: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ClinicalUseDefinitionInteraction {
  
  inline def apply(): ClinicalUseDefinitionInteraction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalUseDefinitionInteraction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalUseDefinitionInteraction] (val x: Self) extends AnyVal {
    
    inline def setEffect(value: CodeableReference): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setIncidence(value: CodeableConcept): Self = StObject.set(x, "incidence", value.asInstanceOf[js.Any])
    
    inline def setIncidenceUndefined: Self = StObject.set(x, "incidence", js.undefined)
    
    inline def setInteractant(value: js.Array[ClinicalUseDefinitionInteractionInteractant]): Self = StObject.set(x, "interactant", value.asInstanceOf[js.Any])
    
    inline def setInteractantUndefined: Self = StObject.set(x, "interactant", js.undefined)
    
    inline def setInteractantVarargs(value: ClinicalUseDefinitionInteractionInteractant*): Self = StObject.set(x, "interactant", js.Array(value*))
    
    inline def setManagement(value: js.Array[CodeableConcept]): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    inline def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    inline def setManagementVarargs(value: CodeableConcept*): Self = StObject.set(x, "management", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
