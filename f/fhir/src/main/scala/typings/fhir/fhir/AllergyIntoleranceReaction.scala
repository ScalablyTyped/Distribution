package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adverse Reaction Events linked to exposure to substance
  */
trait AllergyIntoleranceReaction
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'onset'.
    */
  var _onset: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.undefined
  
  /**
    * Description of the event as a whole
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * How the subject was exposed to the substance
    */
  var exposureRoute: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Clinical symptoms/signs associated with the Event
    */
  var manifestation: js.Array[CodeableConcept]
  
  /**
    * Text about event not captured in other fields
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Date(/time) when manifestations showed
    */
  var onset: js.UndefOr[dateTime] = js.undefined
  
  /**
    * mild | moderate | severe (of event as a whole)
    */
  var severity: js.UndefOr[code] = js.undefined
  
  /**
    * Specific substance or pharmaceutical product considered to be responsible for event
    */
  var substance: js.UndefOr[CodeableConcept] = js.undefined
}
object AllergyIntoleranceReaction {
  
  inline def apply(manifestation: js.Array[CodeableConcept]): AllergyIntoleranceReaction = {
    val __obj = js.Dynamic.literal(manifestation = manifestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntoleranceReaction]
  }
  
  extension [Self <: AllergyIntoleranceReaction](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExposureRoute(value: CodeableConcept): Self = StObject.set(x, "exposureRoute", value.asInstanceOf[js.Any])
    
    inline def setExposureRouteUndefined: Self = StObject.set(x, "exposureRoute", js.undefined)
    
    inline def setManifestation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "manifestation", value.asInstanceOf[js.Any])
    
    inline def setManifestationVarargs(value: CodeableConcept*): Self = StObject.set(x, "manifestation", js.Array(value :_*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setOnset(value: dateTime): Self = StObject.set(x, "onset", value.asInstanceOf[js.Any])
    
    inline def setOnsetUndefined: Self = StObject.set(x, "onset", js.undefined)
    
    inline def setSeverity(value: code): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
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
