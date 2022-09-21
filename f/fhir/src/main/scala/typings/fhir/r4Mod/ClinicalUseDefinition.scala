package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`undesirable-effect`
import typings.fhir.fhirStrings.contraindication
import typings.fhir.fhirStrings.indication
import typings.fhir.fhirStrings.interaction
import typings.fhir.fhirStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * A categorisation of the issue, primarily for dividing warnings into subject heading areas such as "Pregnancy and Lactation", "Overdose", "Effects on Ability to Drive and Use Machines".
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Specifics for when this is a contraindication.
    */
  var contraindication: js.UndefOr[ClinicalUseDefinitionContraindication] = js.undefined
  
  /**
    * Business identifier for this issue.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Specifics for when this is an indication.
    */
  var indication: js.UndefOr[ClinicalUseDefinitionIndication] = js.undefined
  
  /**
    * Specifics for when this is an interaction.
    */
  var interaction: js.UndefOr[ClinicalUseDefinitionInteraction] = js.undefined
  
  /**
    * The population group to which this applies.
    */
  var population: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ClinicalUseDefinition: typings.fhir.fhirStrings.ClinicalUseDefinition
  
  /**
    * Whether this is a current issue or one that has been retired etc.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The medication or procedure for which this is an indication.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * indication | contraindication | interaction | undesirable-effect | warning.
    */
  var `type`: indication | contraindication | interaction | `undesirable-effect` | warning
  
  /**
    * Describe the undesirable effects of the medicinal product.
    */
  var undesirableEffect: js.UndefOr[ClinicalUseDefinitionUndesirableEffect] = js.undefined
  
  /**
    * A critical piece of information about environmental, health or physical risks or hazards that serve as caution to the user. For example 'Do not operate heavy machinery', 'May cause drowsiness', or 'Get medical advice/attention if you feel unwell'.
    */
  var warning: js.UndefOr[ClinicalUseDefinitionWarning] = js.undefined
}
object ClinicalUseDefinition {
  
  inline def apply(`type`: indication | contraindication | interaction | `undesirable-effect` | warning): ClinicalUseDefinition = {
    val __obj = js.Dynamic.literal(resourceType = "ClinicalUseDefinition")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalUseDefinition]
  }
  
  extension [Self <: ClinicalUseDefinition](x: Self) {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContraindication(value: ClinicalUseDefinitionContraindication): Self = StObject.set(x, "contraindication", value.asInstanceOf[js.Any])
    
    inline def setContraindicationUndefined: Self = StObject.set(x, "contraindication", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndication(value: ClinicalUseDefinitionIndication): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setInteraction(value: ClinicalUseDefinitionInteraction): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setPopulation(value: js.Array[Reference]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: Reference*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ClinicalUseDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setType(value: indication | contraindication | interaction | `undesirable-effect` | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUndesirableEffect(value: ClinicalUseDefinitionUndesirableEffect): Self = StObject.set(x, "undesirableEffect", value.asInstanceOf[js.Any])
    
    inline def setUndesirableEffectUndefined: Self = StObject.set(x, "undesirableEffect", js.undefined)
    
    inline def setWarning(value: ClinicalUseDefinitionWarning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
