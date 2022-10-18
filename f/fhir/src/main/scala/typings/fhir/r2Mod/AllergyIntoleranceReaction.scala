package typings.fhir.r2Mod

import typings.fhir.fhirStrings.confirmed
import typings.fhir.fhirStrings.likely
import typings.fhir.fhirStrings.mild
import typings.fhir.fhirStrings.moderate
import typings.fhir.fhirStrings.severe
import typings.fhir.fhirStrings.unlikely
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllergyIntoleranceReaction
  extends StObject
     with BackboneElement {
  
  var _certainty: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _onset: js.UndefOr[Element] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  /**
    * Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.
    */
  var certainty: js.UndefOr[unlikely | likely | confirmed] = js.undefined
  
  /**
    * Text description about the reaction as a whole, including details of the manifestation if required.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Identification of the route by which the subject was exposed to the substance.
    */
  var exposureRoute: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
    */
  var manifestation: js.Array[CodeableConcept]
  
  /**
    * Additional text about the adverse reaction event not captured in other fields.
    */
  var note: js.UndefOr[Annotation] = js.undefined
  
  /**
    * Record of the date and/or time of the onset of the Reaction.
    */
  var onset: js.UndefOr[String] = js.undefined
  
  /**
    * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
    */
  var severity: js.UndefOr[mild | moderate | severe] = js.undefined
  
  /**
    * Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.
    */
  var substance: js.UndefOr[CodeableConcept] = js.undefined
}
object AllergyIntoleranceReaction {
  
  inline def apply(manifestation: js.Array[CodeableConcept]): AllergyIntoleranceReaction = {
    val __obj = js.Dynamic.literal(manifestation = manifestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntoleranceReaction]
  }
  
  extension [Self <: AllergyIntoleranceReaction](x: Self) {
    
    inline def setCertainty(value: unlikely | likely | confirmed): Self = StObject.set(x, "certainty", value.asInstanceOf[js.Any])
    
    inline def setCertaintyUndefined: Self = StObject.set(x, "certainty", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExposureRoute(value: CodeableConcept): Self = StObject.set(x, "exposureRoute", value.asInstanceOf[js.Any])
    
    inline def setExposureRouteUndefined: Self = StObject.set(x, "exposureRoute", js.undefined)
    
    inline def setManifestation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "manifestation", value.asInstanceOf[js.Any])
    
    inline def setManifestationVarargs(value: CodeableConcept*): Self = StObject.set(x, "manifestation", js.Array(value*))
    
    inline def setNote(value: Annotation): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setOnset(value: String): Self = StObject.set(x, "onset", value.asInstanceOf[js.Any])
    
    inline def setOnsetUndefined: Self = StObject.set(x, "onset", js.undefined)
    
    inline def setSeverity(value: mild | moderate | severe): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSubstance(value: CodeableConcept): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    inline def setSubstanceUndefined: Self = StObject.set(x, "substance", js.undefined)
    
    inline def set_certainty(value: Element): Self = StObject.set(x, "_certainty", value.asInstanceOf[js.Any])
    
    inline def set_certaintyUndefined: Self = StObject.set(x, "_certainty", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_onset(value: Element): Self = StObject.set(x, "_onset", value.asInstanceOf[js.Any])
    
    inline def set_onsetUndefined: Self = StObject.set(x, "_onset", js.undefined)
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
  }
}
