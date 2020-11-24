package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of participants involved in the encounter
  */
@js.native
trait EncounterParticipant extends BackboneElement {
  
  /**
    * Persons involved in the encounter other than the patient
    */
  var individual: js.UndefOr[Reference] = js.native
  
  /**
    * Period of time during the encounter that the participant participated
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Role of participant in encounter
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object EncounterParticipant {
  
  @scala.inline
  def apply(): EncounterParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterParticipant]
  }
  
  @scala.inline
  implicit class EncounterParticipantOps[Self <: EncounterParticipant] (val x: Self) extends AnyVal {
    
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
    def setIndividual(value: Reference): Self = this.set("individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividual: Self = this.set("individual", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
