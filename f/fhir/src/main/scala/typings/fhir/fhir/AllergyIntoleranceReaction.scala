package typings.fhir.fhir

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
  implicit class AllergyIntoleranceReactionOps[Self <: AllergyIntoleranceReaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManifestationVarargs(value: CodeableConcept*): Self = this.set("manifestation", js.Array(value :_*))
    
    @scala.inline
    def setManifestation(value: js.Array[CodeableConcept]): Self = this.set("manifestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_onset(value: Element): Self = this.set("_onset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_onset: Self = this.set("_onset", js.undefined)
    
    @scala.inline
    def set_severity(value: Element): Self = this.set("_severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_severity: Self = this.set("_severity", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExposureRoute(value: CodeableConcept): Self = this.set("exposureRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposureRoute: Self = this.set("exposureRoute", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setOnset(value: dateTime): Self = this.set("onset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnset: Self = this.set("onset", js.undefined)
    
    @scala.inline
    def setSeverity(value: code): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setSubstance(value: CodeableConcept): Self = this.set("substance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstance: Self = this.set("substance", js.undefined)
  }
}
