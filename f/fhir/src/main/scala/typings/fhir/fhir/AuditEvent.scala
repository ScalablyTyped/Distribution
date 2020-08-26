package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class AuditEventOps[Self <: AuditEvent] (val x: Self) extends AnyVal {
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
    def setAgentVarargs(value: AuditEventAgent*): Self = this.set("agent", js.Array(value :_*))
    @scala.inline
    def setAgent(value: js.Array[AuditEventAgent]): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecorded(value: instant): Self = this.set("recorded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: AuditEventSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Coding): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_action(value: Element): Self = this.set("_action", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_action: Self = this.set("_action", js.undefined)
    @scala.inline
    def set_outcome(value: Element): Self = this.set("_outcome", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_outcome: Self = this.set("_outcome", js.undefined)
    @scala.inline
    def set_outcomeDesc(value: Element): Self = this.set("_outcomeDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_outcomeDesc: Self = this.set("_outcomeDesc", js.undefined)
    @scala.inline
    def set_recorded(value: Element): Self = this.set("_recorded", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_recorded: Self = this.set("_recorded", js.undefined)
    @scala.inline
    def setAction(value: code): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setEntityVarargs(value: AuditEventEntity*): Self = this.set("entity", js.Array(value :_*))
    @scala.inline
    def setEntity(value: js.Array[AuditEventEntity]): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    @scala.inline
    def setOutcome(value: code): Self = this.set("outcome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    @scala.inline
    def setOutcomeDesc(value: String): Self = this.set("outcomeDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcomeDesc: Self = this.set("outcomeDesc", js.undefined)
    @scala.inline
    def setPurposeOfEventVarargs(value: CodeableConcept*): Self = this.set("purposeOfEvent", js.Array(value :_*))
    @scala.inline
    def setPurposeOfEvent(value: js.Array[CodeableConcept]): Self = this.set("purposeOfEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurposeOfEvent: Self = this.set("purposeOfEvent", js.undefined)
    @scala.inline
    def setSubtypeVarargs(value: Coding*): Self = this.set("subtype", js.Array(value :_*))
    @scala.inline
    def setSubtype(value: js.Array[Coding]): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
  }
  
}

