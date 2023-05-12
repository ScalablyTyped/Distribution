package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductInteraction
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * The interaction described.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The effect of the interaction, for example "reduced gastric absorption of primary medication".
    */
  var effect: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The incidence of the interaction, e.g. theoretical, observed.
    */
  var incidence: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The specific medication, food or laboratory test that interacts.
    */
  var interactant: js.UndefOr[js.Array[MedicinalProductInteractionInteractant]] = js.undefined
  
  /**
    * Actions for managing the interaction.
    */
  var management: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductInteraction: typings.fhir.fhirStrings.MedicinalProductInteraction
  
  /**
    * The medication for which this is a described interaction.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductInteraction {
  
  inline def apply(): MedicinalProductInteraction = {
    val __obj = js.Dynamic.literal(resourceType = "MedicinalProductInteraction")
    __obj.asInstanceOf[MedicinalProductInteraction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductInteraction] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEffect(value: CodeableConcept): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setIncidence(value: CodeableConcept): Self = StObject.set(x, "incidence", value.asInstanceOf[js.Any])
    
    inline def setIncidenceUndefined: Self = StObject.set(x, "incidence", js.undefined)
    
    inline def setInteractant(value: js.Array[MedicinalProductInteractionInteractant]): Self = StObject.set(x, "interactant", value.asInstanceOf[js.Any])
    
    inline def setInteractantUndefined: Self = StObject.set(x, "interactant", js.undefined)
    
    inline def setInteractantVarargs(value: MedicinalProductInteractionInteractant*): Self = StObject.set(x, "interactant", js.Array(value*))
    
    inline def setManagement(value: CodeableConcept): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    inline def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductInteraction): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
