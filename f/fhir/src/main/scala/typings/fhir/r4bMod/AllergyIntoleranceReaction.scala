package typings.fhir.r4bMod

import typings.fhir.fhirStrings.mild
import typings.fhir.fhirStrings.moderate
import typings.fhir.fhirStrings.severe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllergyIntoleranceReaction
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _onset: js.UndefOr[Element] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  /**
    * Use the description to provide any details of a particular event of the occurred reaction such as circumstances, reaction specifics, what happened before/after. Information, related to the event, but not describing a particular care should be captured in the comment field. For example: at the age of four, the patient was given penicillin for strep throat and subsequently developed severe hives.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Coding of the route of exposure with a terminology should be used wherever possible.
    */
  var exposureRoute: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Manifestation can be expressed as a single word, phrase or brief description. For example: nausea, rash or no reaction. It is preferable that manifestation should be coded with a terminology, where possible. The values entered here may be used to display on an application screen as part of a list of adverse reactions, as recommended in the UK NHS CUI guidelines.  Terminologies commonly used include, but are not limited to, SNOMED CT or ICD10.
    */
  var manifestation: js.Array[CodeableConcept]
  
  /**
    * Use this field to record information indirectly related to a particular event and not captured in the description. For example: Clinical records are no longer available, recorded based on information provided to the patient by her mother and her mother is deceased.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Record of the date and/or time of the onset of the Reaction.
    */
  var onset: js.UndefOr[String] = js.undefined
  
  /**
    * It is acknowledged that this assessment is very subjective. There may be some specific practice domains where objective scales have been applied. Objective scales can be included in this model as extensions.
    */
  var severity: js.UndefOr[mild | moderate | severe] = js.undefined
  
  /**
    * Coding of the specific substance (or pharmaceutical product) with a terminology capable of triggering decision support should be used wherever possible.  The 'code' element allows for the use of a specific substance or pharmaceutical product, or a group or class of substances. In the case of an allergy or intolerance to a class of substances, (for example, "penicillins"), the 'reaction.substance' element could be used to code the specific substance that was identified as having caused the reaction (for example, "amoxycillin"). Duplication of the value in the 'code' and 'reaction.substance' elements is acceptable when a specific substance has been recorded in 'code'.
    */
  var substance: js.UndefOr[CodeableConcept] = js.undefined
}
object AllergyIntoleranceReaction {
  
  inline def apply(manifestation: js.Array[CodeableConcept]): AllergyIntoleranceReaction = {
    val __obj = js.Dynamic.literal(manifestation = manifestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntoleranceReaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllergyIntoleranceReaction] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExposureRoute(value: CodeableConcept): Self = StObject.set(x, "exposureRoute", value.asInstanceOf[js.Any])
    
    inline def setExposureRouteUndefined: Self = StObject.set(x, "exposureRoute", js.undefined)
    
    inline def setManifestation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "manifestation", value.asInstanceOf[js.Any])
    
    inline def setManifestationVarargs(value: CodeableConcept*): Self = StObject.set(x, "manifestation", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOnset(value: String): Self = StObject.set(x, "onset", value.asInstanceOf[js.Any])
    
    inline def setOnsetUndefined: Self = StObject.set(x, "onset", js.undefined)
    
    inline def setSeverity(value: mild | moderate | severe): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSubstance(value: CodeableConcept): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    inline def setSubstanceUndefined: Self = StObject.set(x, "substance", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_onset(value: Element): Self = StObject.set(x, "_onset", value.asInstanceOf[js.Any])
    
    inline def set_onsetUndefined: Self = StObject.set(x, "_onset", js.undefined)
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
  }
}
