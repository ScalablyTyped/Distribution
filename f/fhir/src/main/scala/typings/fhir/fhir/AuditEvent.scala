package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event record kept for security purposes
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait AuditEvent extends DomainResource {
  
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'outcome'.
    */
  var _outcome: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'outcomeDesc'.
    */
  var _outcomeDesc: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.native
  
  /**
    * Type of action performed during the event
    */
  var action: js.UndefOr[code] = js.native
  
  /**
    * Actor involved in the event
    */
  var agent: js.Array[AuditEventAgent] = js.native
  
  /**
    * Data or objects used
    */
  var entity: js.UndefOr[js.Array[AuditEventEntity]] = js.native
  
  /**
    * Whether the event succeeded or failed
    */
  var outcome: js.UndefOr[code] = js.native
  
  /**
    * Description of the event outcome
    */
  var outcomeDesc: js.UndefOr[String] = js.native
  
  /**
    * The purposeOfUse of the event
    */
  var purposeOfEvent: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Time when the event occurred on source
    */
  var recorded: instant = js.native
  
  /**
    * Audit Event Reporter
    */
  var source: AuditEventSource = js.native
  
  /**
    * More specific type/id for the event
    */
  var subtype: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Type/identifier of event
    */
  var `type`: Coding = js.native
}
object AuditEvent {
  
  @scala.inline
  def apply(agent: js.Array[AuditEventAgent], recorded: instant, source: AuditEventSource, `type`: Coding): AuditEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEvent]
  }
  
  @scala.inline
  implicit class AuditEventMutableBuilder[Self <: AuditEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: code): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAgent(value: js.Array[AuditEventAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVarargs(value: AuditEventAgent*): Self = StObject.set(x, "agent", js.Array(value :_*))
    
    @scala.inline
    def setEntity(value: js.Array[AuditEventEntity]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setEntityVarargs(value: AuditEventEntity*): Self = StObject.set(x, "entity", js.Array(value :_*))
    
    @scala.inline
    def setOutcome(value: code): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeDesc(value: String): Self = StObject.set(x, "outcomeDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeDescUndefined: Self = StObject.set(x, "outcomeDesc", js.undefined)
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setPurposeOfEvent(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purposeOfEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeOfEventUndefined: Self = StObject.set(x, "purposeOfEvent", js.undefined)
    
    @scala.inline
    def setPurposeOfEventVarargs(value: CodeableConcept*): Self = StObject.set(x, "purposeOfEvent", js.Array(value :_*))
    
    @scala.inline
    def setRecorded(value: instant): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: AuditEventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: js.Array[Coding]): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    @scala.inline
    def setSubtypeVarargs(value: Coding*): Self = StObject.set(x, "subtype", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_action(value: Element): Self = StObject.set(x, "_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actionUndefined: Self = StObject.set(x, "_action", js.undefined)
    
    @scala.inline
    def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_outcomeDesc(value: Element): Self = StObject.set(x, "_outcomeDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_outcomeDescUndefined: Self = StObject.set(x, "_outcomeDesc", js.undefined)
    
    @scala.inline
    def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
    
    @scala.inline
    def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
  }
}
