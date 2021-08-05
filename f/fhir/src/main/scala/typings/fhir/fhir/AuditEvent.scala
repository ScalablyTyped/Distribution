package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event record kept for security purposes
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait AuditEvent
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'outcome'.
    */
  var _outcome: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'outcomeDesc'.
    */
  var _outcomeDesc: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.undefined
  
  /**
    * Type of action performed during the event
    */
  var action: js.UndefOr[code] = js.undefined
  
  /**
    * Actor involved in the event
    */
  var agent: js.Array[AuditEventAgent]
  
  /**
    * Data or objects used
    */
  var entity: js.UndefOr[js.Array[AuditEventEntity]] = js.undefined
  
  /**
    * Whether the event succeeded or failed
    */
  var outcome: js.UndefOr[code] = js.undefined
  
  /**
    * Description of the event outcome
    */
  var outcomeDesc: js.UndefOr[String] = js.undefined
  
  /**
    * The purposeOfUse of the event
    */
  var purposeOfEvent: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Time when the event occurred on source
    */
  var recorded: instant
  
  /**
    * Audit Event Reporter
    */
  var source: AuditEventSource
  
  /**
    * More specific type/id for the event
    */
  var subtype: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Type/identifier of event
    */
  var `type`: Coding
}
object AuditEvent {
  
  inline def apply(agent: js.Array[AuditEventAgent], recorded: instant, source: AuditEventSource, `type`: Coding): AuditEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEvent]
  }
  
  extension [Self <: AuditEvent](x: Self) {
    
    inline def setAction(value: code): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAgent(value: js.Array[AuditEventAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentVarargs(value: AuditEventAgent*): Self = StObject.set(x, "agent", js.Array(value :_*))
    
    inline def setEntity(value: js.Array[AuditEventEntity]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEntityVarargs(value: AuditEventEntity*): Self = StObject.set(x, "entity", js.Array(value :_*))
    
    inline def setOutcome(value: code): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeDesc(value: String): Self = StObject.set(x, "outcomeDesc", value.asInstanceOf[js.Any])
    
    inline def setOutcomeDescUndefined: Self = StObject.set(x, "outcomeDesc", js.undefined)
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPurposeOfEvent(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purposeOfEvent", value.asInstanceOf[js.Any])
    
    inline def setPurposeOfEventUndefined: Self = StObject.set(x, "purposeOfEvent", js.undefined)
    
    inline def setPurposeOfEventVarargs(value: CodeableConcept*): Self = StObject.set(x, "purposeOfEvent", js.Array(value :_*))
    
    inline def setRecorded(value: instant): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setSource(value: AuditEventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: js.Array[Coding]): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setSubtypeVarargs(value: Coding*): Self = StObject.set(x, "subtype", js.Array(value :_*))
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_action(value: Element): Self = StObject.set(x, "_action", value.asInstanceOf[js.Any])
    
    inline def set_actionUndefined: Self = StObject.set(x, "_action", js.undefined)
    
    inline def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    inline def set_outcomeDesc(value: Element): Self = StObject.set(x, "_outcomeDesc", value.asInstanceOf[js.Any])
    
    inline def set_outcomeDescUndefined: Self = StObject.set(x, "_outcomeDesc", js.undefined)
    
    inline def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
  }
}
