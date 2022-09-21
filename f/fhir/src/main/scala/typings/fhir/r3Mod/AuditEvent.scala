package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEvent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _action: js.UndefOr[Element] = js.undefined
  
  var _outcome: js.UndefOr[Element] = js.undefined
  
  var _outcomeDesc: js.UndefOr[Element] = js.undefined
  
  var _recorded: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicator for type of action performed during the event that generated the audit.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Several agents may be associated (i.e. have some responsibility for an activity) with an event or activity.
    * For example, an activity may be initiated by one user for other users or involve more than one user. However, only one user may be the initiator/requestor for the activity.
    */
  var agent: js.Array[AuditEventAgent]
  
  /**
    * Required unless the values for event identification, agent identification, and audit source identification are sufficient to document the entire auditable event. Because events may have more than one entity, this group can be a repeating set of values.
    */
  var entity: js.UndefOr[js.Array[AuditEventEntity]] = js.undefined
  
  /**
    * In some cases a "success" may be partial, for example, an incomplete or interrupted transfer of a radiological study. For the purpose of establishing accountability, these distinctions are not relevant.
    */
  var outcome: js.UndefOr[String] = js.undefined
  
  /**
    * A free text description of the outcome of the event.
    */
  var outcomeDesc: js.UndefOr[String] = js.undefined
  
  /**
    * Use AuditEvent.agent.purposeOfUse when you know that it is specific to the agent, otherwise use AuditEvent.purposeOfEvent. For example, during a machine-to-machine transfer it might not be obvious to the audit system who caused the event, but it does know why.
    */
  var purposeOfEvent: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * In a distributed system, some sort of common time base (e.g. an NTP [RFC1305] server) is a good implementation tactic.
    */
  var recorded: String
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AuditEvent: typings.fhir.fhirStrings.AuditEvent
  
  /**
    * Since multi-tier, distributed, or composite applications make source identification ambiguous, this collection of fields may repeat for each application or process actively involved in the event. For example, multiple value-sets can identify participating web servers, application processes, and database server threads in an n-tier distributed application. Passive event participants (e.g. low-level network transports) need not be identified.
    */
  var source: AuditEventSource
  
  /**
    * Identifier for the category of event.
    */
  var subtype: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.
    */
  var `type`: Coding
}
object AuditEvent {
  
  inline def apply(agent: js.Array[AuditEventAgent], recorded: String, source: AuditEventSource, `type`: Coding): AuditEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], resourceType = "AuditEvent", source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEvent]
  }
  
  extension [Self <: AuditEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAgent(value: js.Array[AuditEventAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentVarargs(value: AuditEventAgent*): Self = StObject.set(x, "agent", js.Array(value*))
    
    inline def setEntity(value: js.Array[AuditEventEntity]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEntityVarargs(value: AuditEventEntity*): Self = StObject.set(x, "entity", js.Array(value*))
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeDesc(value: String): Self = StObject.set(x, "outcomeDesc", value.asInstanceOf[js.Any])
    
    inline def setOutcomeDescUndefined: Self = StObject.set(x, "outcomeDesc", js.undefined)
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPurposeOfEvent(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purposeOfEvent", value.asInstanceOf[js.Any])
    
    inline def setPurposeOfEventUndefined: Self = StObject.set(x, "purposeOfEvent", js.undefined)
    
    inline def setPurposeOfEventVarargs(value: CodeableConcept*): Self = StObject.set(x, "purposeOfEvent", js.Array(value*))
    
    inline def setRecorded(value: String): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AuditEvent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: AuditEventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: js.Array[Coding]): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setSubtypeVarargs(value: Coding*): Self = StObject.set(x, "subtype", js.Array(value*))
    
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
