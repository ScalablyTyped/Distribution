package typings.fhir.r5Mod

import typings.fhir.fhirStrings.alert
import typings.fhir.fhirStrings.critical
import typings.fhir.fhirStrings.debug
import typings.fhir.fhirStrings.emergency
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.informational
import typings.fhir.fhirStrings.notice
import typings.fhir.fhirStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEvent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _action: js.UndefOr[Element] = js.undefined
  
  var _occurredDateTime: js.UndefOr[Element] = js.undefined
  
  var _recorded: js.UndefOr[Element] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicator for type of action performed during the event that generated the audit.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Several agents may be associated (i.e. have some responsibility for an activity) with an event or activity.
    * For example, an activity may be initiated by one user for other users or involve more than one user. However, only one user may be the initiator/requestor for the activity.
    * When a network are used in an event being recorded, there should be distinct agent elements for the known actors using the network. The agent with a network detail would be the responsible agent for use of that network.
    */
  var agent: js.Array[AuditEventAgent]
  
  /**
    * Use AuditEvent.agent.authorization when you know that it is specific to the agent, otherwise use AuditEvent.authorization. For example, during a machine-to-machine transfer it might not be obvious to the audit system who caused the event, but it does know why.
    */
  var authorization: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Allows tracing of authorizatino for the events and tracking whether proposals/recommendations were acted upon.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Classification of the type of event.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Describes what happened. The most specific code for the event.
    */
  var code: CodeableConcept
  
  /**
    * This will typically be the encounter the event occurred, but some events may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter (e.g. pre-admission lab tests).
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Required unless the values for event identification, agent identification, and audit source identification are sufficient to document the entire auditable event. Because events may have more than one entity, this group can be a repeating set of values.
    */
  var entity: js.UndefOr[js.Array[AuditEventEntity]] = js.undefined
  
  /**
    * The time or period can be a little arbitrary; where possible, the time should correspond to human assessment of the activity time.
    */
  var occurredDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time or period can be a little arbitrary; where possible, the time should correspond to human assessment of the activity time.
    */
  var occurredPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * In some cases a "success" may be partial, for example, an incomplete or interrupted transfer of a radiological study. For the purpose of establishing accountability, these distinctions are not relevant.
    */
  var outcome: js.UndefOr[AuditEventOutcome] = js.undefined
  
  /**
    * The patient element is available to enable deterministic tracking of activities that involve the patient as the subject of the data used in an activity.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * In a distributed system, some sort of common time base (e.g. an NTP [RFC1305] server) is a good implementation tactic.
    */
  var recorded: String
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AuditEvent: typings.fhir.fhirStrings.AuditEvent
  
  /**
    * ATNA will map this to the SYSLOG PRI element.
    */
  var severity: js.UndefOr[emergency | alert | critical | error | warning | notice | informational | debug] = js.undefined
  
  /**
    * Events are reported by the actor that detected them. This may be one of the participating actors, but may also be different. The actor may be a human such as a medical-records clerk disclosing data manually, that clerk would be the source for the record of disclosure.
    */
  var source: AuditEventSource
}
object AuditEvent {
  
  inline def apply(
    agent: js.Array[AuditEventAgent],
    code: CodeableConcept,
    recorded: String,
    source: AuditEventSource
  ): AuditEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], resourceType = "AuditEvent", source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAgent(value: js.Array[AuditEventAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentVarargs(value: AuditEventAgent*): Self = StObject.set(x, "agent", js.Array(value*))
    
    inline def setAuthorization(value: js.Array[CodeableConcept]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setAuthorizationVarargs(value: CodeableConcept*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEntity(value: js.Array[AuditEventEntity]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEntityVarargs(value: AuditEventEntity*): Self = StObject.set(x, "entity", js.Array(value*))
    
    inline def setOccurredDateTime(value: String): Self = StObject.set(x, "occurredDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurredDateTimeUndefined: Self = StObject.set(x, "occurredDateTime", js.undefined)
    
    inline def setOccurredPeriod(value: Period): Self = StObject.set(x, "occurredPeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurredPeriodUndefined: Self = StObject.set(x, "occurredPeriod", js.undefined)
    
    inline def setOutcome(value: AuditEventOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setRecorded(value: String): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AuditEvent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: emergency | alert | critical | error | warning | notice | informational | debug): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSource(value: AuditEventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def set_action(value: Element): Self = StObject.set(x, "_action", value.asInstanceOf[js.Any])
    
    inline def set_actionUndefined: Self = StObject.set(x, "_action", js.undefined)
    
    inline def set_occurredDateTime(value: Element): Self = StObject.set(x, "_occurredDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurredDateTimeUndefined: Self = StObject.set(x, "_occurredDateTime", js.undefined)
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
  }
}
