package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`undesirable-effect`
import typings.fhir.fhirStrings.contraindication
import typings.fhir.fhirStrings.indication
import typings.fhir.fhirStrings.interaction
import typings.fhir.fhirStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseIssue
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * A categorisation of the issue, primarily for dividing warnings into subject heading areas such as "Pregnancy and Lactation", "Overdose", "Effects on Ability to Drive and Use Machines".
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Specifics for when this is a contraindication.
    */
  var contraindication: js.UndefOr[ClinicalUseIssueContraindication] = js.undefined
  
  /**
    * General description of an effect (particularly for a general warning, rather than any of the more specific types such as indication) for when a distinct coded or textual description is not appropriate using  Indication.diseaseSymptomProcedure.text, Contraindication.diseaseSymptomProcedure.text etc. For example "May affect ability to drive".
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Business identifier for this issue.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Specifics for when this is an indication.
    */
  var indication: js.UndefOr[ClinicalUseIssueIndication] = js.undefined
  
  /**
    * Specifics for when this is an interaction.
    */
  var interaction: js.UndefOr[ClinicalUseIssueInteraction] = js.undefined
  
  /**
    * The population group to which this applies.
    */
  var population: js.UndefOr[js.Array[Population]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ClinicalUseIssue: typings.fhir.fhirStrings.ClinicalUseIssue
  
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
  var undesirableEffect: js.UndefOr[ClinicalUseIssueUndesirableEffect] = js.undefined
}
object ClinicalUseIssue {
  
  inline def apply(`type`: indication | contraindication | interaction | `undesirable-effect` | warning): ClinicalUseIssue = {
    val __obj = js.Dynamic.literal(resourceType = "ClinicalUseIssue")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalUseIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalUseIssue] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContraindication(value: ClinicalUseIssueContraindication): Self = StObject.set(x, "contraindication", value.asInstanceOf[js.Any])
    
    inline def setContraindicationUndefined: Self = StObject.set(x, "contraindication", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndication(value: ClinicalUseIssueIndication): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setInteraction(value: ClinicalUseIssueInteraction): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setPopulation(value: js.Array[Population]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: Population*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ClinicalUseIssue): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setType(value: indication | contraindication | interaction | `undesirable-effect` | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUndesirableEffect(value: ClinicalUseIssueUndesirableEffect): Self = StObject.set(x, "undesirableEffect", value.asInstanceOf[js.Any])
    
    inline def setUndesirableEffectUndefined: Self = StObject.set(x, "undesirableEffect", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
