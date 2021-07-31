package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the intended objective(s) for a patient, group or organization
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Goal
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'startDate'.
    */
  var _startDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'statusDate'.
    */
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'statusReason'.
    */
  var _statusReason: js.UndefOr[Element] = js.undefined
  
  /**
    * Issues addressed by this goal
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * E.g. Treatment, dietary, behavioral, etc.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Code or text describing goal
    */
  var description: CodeableConcept
  
  /**
    * Who's responsible for creating Goal?
    */
  var expressedBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * External Ids for this goal
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Comments about the goal
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * What result was achieved regarding the goal?
    */
  var outcomeCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Observation that resulted from goal
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * high-priority | medium-priority | low-priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When goal pursuit begins
    */
  var startCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When goal pursuit begins
    */
  var startDate: js.UndefOr[date] = js.undefined
  
  /**
    * proposed | accepted | planned | in-progress | on-target | ahead-of-target | behind-target | sustaining | achieved | on-hold | cancelled | entered-in-error | rejected
    */
  var status: code
  
  /**
    * When goal status took effect
    */
  var statusDate: js.UndefOr[date] = js.undefined
  
  /**
    * Reason for current status
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * Who this goal is intended for
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Target outcome for the goal
    */
  var target: js.UndefOr[GoalTarget] = js.undefined
}
object Goal {
  
  @scala.inline
  def apply(description: CodeableConcept, status: code): Goal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Goal]
  }
  
  @scala.inline
  implicit class GoalMutableBuilder[Self <: Goal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[Reference]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Reference*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: CodeableConcept): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressedBy(value: Reference): Self = StObject.set(x, "expressedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressedByUndefined: Self = StObject.set(x, "expressedBy", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOutcomeCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "outcomeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeCodeUndefined: Self = StObject.set(x, "outcomeCode", js.undefined)
    
    @scala.inline
    def setOutcomeCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "outcomeCode", js.Array(value :_*))
    
    @scala.inline
    def setOutcomeReference(value: js.Array[Reference]): Self = StObject.set(x, "outcomeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeReferenceUndefined: Self = StObject.set(x, "outcomeReference", js.undefined)
    
    @scala.inline
    def setOutcomeReferenceVarargs(value: Reference*): Self = StObject.set(x, "outcomeReference", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setStartCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "startCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCodeableConceptUndefined: Self = StObject.set(x, "startCodeableConcept", js.undefined)
    
    @scala.inline
    def setStartDate(value: date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDate(value: date): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    @scala.inline
    def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTarget(value: GoalTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def set_startDate(value: Element): Self = StObject.set(x, "_startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startDateUndefined: Self = StObject.set(x, "_startDate", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
    
    @scala.inline
    def set_statusReason(value: Element): Self = StObject.set(x, "_statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusReasonUndefined: Self = StObject.set(x, "_statusReason", js.undefined)
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
