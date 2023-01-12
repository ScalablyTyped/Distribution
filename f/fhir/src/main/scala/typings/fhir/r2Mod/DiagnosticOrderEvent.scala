package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.failed
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.received
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.requested
import typings.fhir.fhirStrings.review
import typings.fhir.fhirStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticOrderEvent
  extends StObject
     with BackboneElement {
  
  var _dateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The person responsible for performing or recording the action.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date/time at which the event occurred.
    */
  var dateTime: String
  
  /**
    * Additional information about the event that occurred - e.g. if the status remained unchanged.
    */
  var description: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The status for the event.
    */
  var status: proposed | draft | planned | requested | received | accepted | `in-progress` | review | completed | cancelled | suspended | rejected | failed
}
object DiagnosticOrderEvent {
  
  inline def apply(
    dateTime: String,
    status: proposed | draft | planned | requested | received | accepted | `in-progress` | review | completed | cancelled | suspended | rejected | failed
  ): DiagnosticOrderEvent = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticOrderEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticOrderEvent] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: CodeableConcept): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStatus(
      value: proposed | draft | planned | requested | received | accepted | `in-progress` | review | completed | cancelled | suspended | rejected | failed
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
