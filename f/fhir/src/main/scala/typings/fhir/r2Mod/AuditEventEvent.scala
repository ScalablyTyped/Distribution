package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventEvent
  extends StObject
     with BackboneElement {
  
  var _action: js.UndefOr[Element] = js.undefined
  
  var _dateTime: js.UndefOr[Element] = js.undefined
  
  var _outcome: js.UndefOr[Element] = js.undefined
  
  var _outcomeDesc: js.UndefOr[Element] = js.undefined
  
  /**
    * This broadly indicates what kind of action was done on the Participant Object.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * This ties an event to a specific date and time. Security audits typically require a consistent time base (e.g. UTC), to eliminate time-zone issues arising from geographical distribution.
    */
  var dateTime: String
  
  /**
    * Indicates whether the event succeeded or failed.
    */
  var outcome: js.UndefOr[String] = js.undefined
  
  /**
    * A free text description of the outcome of the event.
    */
  var outcomeDesc: js.UndefOr[String] = js.undefined
  
  /**
    * The purposeOfUse (reason) that was used during the event being recorded.
    */
  var purposeOfEvent: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * This field enables queries of messages by implementation-defined event categories.
    */
  var subtype: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * This identifies the performed function. For "Execute" Event Action Code audit records, this identifies the application function performed.
    */
  var `type`: Coding
}
object AuditEventEvent {
  
  inline def apply(dateTime: String, `type`: Coding): AuditEventEvent = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventEvent]
  }
  
  extension [Self <: AuditEventEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeDesc(value: String): Self = StObject.set(x, "outcomeDesc", value.asInstanceOf[js.Any])
    
    inline def setOutcomeDescUndefined: Self = StObject.set(x, "outcomeDesc", js.undefined)
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPurposeOfEvent(value: js.Array[Coding]): Self = StObject.set(x, "purposeOfEvent", value.asInstanceOf[js.Any])
    
    inline def setPurposeOfEventUndefined: Self = StObject.set(x, "purposeOfEvent", js.undefined)
    
    inline def setPurposeOfEventVarargs(value: Coding*): Self = StObject.set(x, "purposeOfEvent", js.Array(value*))
    
    inline def setSubtype(value: js.Array[Coding]): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setSubtypeVarargs(value: Coding*): Self = StObject.set(x, "subtype", js.Array(value*))
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_action(value: Element): Self = StObject.set(x, "_action", value.asInstanceOf[js.Any])
    
    inline def set_actionUndefined: Self = StObject.set(x, "_action", js.undefined)
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    inline def set_outcomeDesc(value: Element): Self = StObject.set(x, "_outcomeDesc", value.asInstanceOf[js.Any])
    
    inline def set_outcomeDescUndefined: Self = StObject.set(x, "_outcomeDesc", js.undefined)
    
    inline def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
  }
}
