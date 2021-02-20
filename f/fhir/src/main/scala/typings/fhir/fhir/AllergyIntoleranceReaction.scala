package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adverse Reaction Events linked to exposure to substance
  */
@js.native
trait AllergyIntoleranceReaction extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'onset'.
    */
  var _onset: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.native
  
  /**
    * Description of the event as a whole
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * How the subject was exposed to the substance
    */
  var exposureRoute: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Clinical symptoms/signs associated with the Event
    */
  var manifestation: js.Array[CodeableConcept] = js.native
  
  /**
    * Text about event not captured in other fields
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Date(/time) when manifestations showed
    */
  var onset: js.UndefOr[dateTime] = js.native
  
  /**
    * mild | moderate | severe (of event as a whole)
    */
  var severity: js.UndefOr[code] = js.native
  
  /**
    * Specific substance or pharmaceutical product considered to be responsible for event
    */
  var substance: js.UndefOr[CodeableConcept] = js.native
}
object AllergyIntoleranceReaction {
  
  @scala.inline
  def apply(manifestation: js.Array[CodeableConcept]): AllergyIntoleranceReaction = {
    val __obj = js.Dynamic.literal(manifestation = manifestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntoleranceReaction]
  }
  
  @scala.inline
  implicit class AllergyIntoleranceReactionMutableBuilder[Self <: AllergyIntoleranceReaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExposureRoute(value: CodeableConcept): Self = StObject.set(x, "exposureRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureRouteUndefined: Self = StObject.set(x, "exposureRoute", js.undefined)
    
    @scala.inline
    def setManifestation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "manifestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestationVarargs(value: CodeableConcept*): Self = StObject.set(x, "manifestation", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOnset(value: dateTime): Self = StObject.set(x, "onset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetUndefined: Self = StObject.set(x, "onset", js.undefined)
    
    @scala.inline
    def setSeverity(value: code): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSubstance(value: CodeableConcept): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstanceUndefined: Self = StObject.set(x, "substance", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_onset(value: Element): Self = StObject.set(x, "_onset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onsetUndefined: Self = StObject.set(x, "_onset", js.undefined)
    
    @scala.inline
    def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
  }
}
