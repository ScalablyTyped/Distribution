package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the intended objective(s) for a patient, group or organization
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Goal extends DomainResource {
  /**
    * Contains extended information for property 'startDate'.
    */
  var _startDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'statusDate'.
    */
  var _statusDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'statusReason'.
    */
  var _statusReason: js.UndefOr[Element] = js.native
  /**
    * Issues addressed by this goal
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * E.g. Treatment, dietary, behavioral, etc.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Code or text describing goal
    */
  var description: CodeableConcept = js.native
  /**
    * Who's responsible for creating Goal?
    */
  var expressedBy: js.UndefOr[Reference] = js.native
  /**
    * External Ids for this goal
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Comments about the goal
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * What result was achieved regarding the goal?
    */
  var outcomeCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Observation that resulted from goal
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * high-priority | medium-priority | low-priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.native
  /**
    * When goal pursuit begins
    */
  var startCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * When goal pursuit begins
    */
  var startDate: js.UndefOr[date] = js.native
  /**
    * proposed | accepted | planned | in-progress | on-target | ahead-of-target | behind-target | sustaining | achieved | on-hold | cancelled | entered-in-error | rejected
    */
  var status: code = js.native
  /**
    * When goal status took effect
    */
  var statusDate: js.UndefOr[date] = js.native
  /**
    * Reason for current status
    */
  var statusReason: js.UndefOr[String] = js.native
  /**
    * Who this goal is intended for
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * Target outcome for the goal
    */
  var target: js.UndefOr[GoalTarget] = js.native
}

object Goal {
  @scala.inline
  def apply(description: CodeableConcept, status: code): Goal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Goal]
  }
  @scala.inline
  implicit class GoalOps[Self <: Goal] (val x: Self) extends AnyVal {
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
    def setDescription(value: CodeableConcept): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_startDate(value: Element): Self = this.set("_startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_startDate: Self = this.set("_startDate", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_statusDate(value: Element): Self = this.set("_statusDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_statusDate: Self = this.set("_statusDate", js.undefined)
    @scala.inline
    def set_statusReason(value: Element): Self = this.set("_statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_statusReason: Self = this.set("_statusReason", js.undefined)
    @scala.inline
    def setAddressesVarargs(value: Reference*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[Reference]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setExpressedBy(value: Reference): Self = this.set("expressedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressedBy: Self = this.set("expressedBy", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setOutcomeCodeVarargs(value: CodeableConcept*): Self = this.set("outcomeCode", js.Array(value :_*))
    @scala.inline
    def setOutcomeCode(value: js.Array[CodeableConcept]): Self = this.set("outcomeCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcomeCode: Self = this.set("outcomeCode", js.undefined)
    @scala.inline
    def setOutcomeReferenceVarargs(value: Reference*): Self = this.set("outcomeReference", js.Array(value :_*))
    @scala.inline
    def setOutcomeReference(value: js.Array[Reference]): Self = this.set("outcomeReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcomeReference: Self = this.set("outcomeReference", js.undefined)
    @scala.inline
    def setPriority(value: CodeableConcept): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setStartCodeableConcept(value: CodeableConcept): Self = this.set("startCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCodeableConcept: Self = this.set("startCodeableConcept", js.undefined)
    @scala.inline
    def setStartDate(value: date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setStatusDate(value: date): Self = this.set("statusDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDate: Self = this.set("statusDate", js.undefined)
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTarget(value: GoalTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

