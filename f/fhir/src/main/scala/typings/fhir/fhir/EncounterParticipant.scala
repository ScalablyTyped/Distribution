package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class EncounterParticipantMutableBuilder[Self <: EncounterParticipant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndividual(value: Reference): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualUndefined: Self = StObject.set(x, "individual", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
