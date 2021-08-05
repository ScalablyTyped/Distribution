package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Participants involved in appointment
  */
trait AppointmentParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Person, Location/HealthcareService or Device
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * required | optional | information-only
    */
  var required: js.UndefOr[code] = js.undefined
  
  /**
    * accepted | declined | tentative | needs-action
    */
  var status: code
  
  /**
    * Role of participant in the appointment
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object AppointmentParticipant {
  
  inline def apply(status: code): AppointmentParticipant = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentParticipant]
  }
  
  extension [Self <: AppointmentParticipant](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setRequired(value: code): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def set_required(value: Element): Self = StObject.set(x, "_required", value.asInstanceOf[js.Any])
    
    inline def set_requiredUndefined: Self = StObject.set(x, "_required", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
