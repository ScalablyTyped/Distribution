package typings.fhir.mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.achieved
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.sustaining
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Goal
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _startDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  var _targetDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Allows specific goals to explicitly linked to the concerns they're dealing with - makes the goal more understandable.
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates whose goal this is - patient goal, practitioner goal, etc.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Allows goals to be filtered and sorted.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Without a description of what's trying to be achieved, element has no purpose.
    */
  var description: String
  
  /**
    * Need to allow connection to a wider workflow.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * There's a need to capture information about the goal that doesn't actually describe the goal.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Outcome tracking is a key aspect of care planning.
    */
  var outcome: js.UndefOr[js.Array[GoalOutcome]] = js.undefined
  
  /**
    * Used for sorting and presenting goals.
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Goal: typings.fhir.fhirStrings.Goal
  
  /**
    * Goals can be established prior to there being an intention to start pursuing them; e.g. Goals for post-surgical recovery established prior to surgery.
    */
  var startCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Goals can be established prior to there being an intention to start pursuing them; e.g. Goals for post-surgical recovery established prior to surgery.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * Allows measuring outcome and whether goal needs to be further tracked.
    */
  var status: proposed | planned | accepted | rejected | `in-progress` | achieved | sustaining | `on-hold` | cancelled
  
  /**
    * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
    */
  var statusDate: js.UndefOr[String] = js.undefined
  
  /**
    * Captures the reason for the current status.
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Subject is optional to support annonymized reporting.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies when the goal should be evaluated.
    */
  var targetDate: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies when the goal should be evaluated.
    */
  var targetQuantity: js.UndefOr[Quantity] = js.undefined
}
object Goal {
  
  inline def apply(
    description: String,
    status: proposed | planned | accepted | rejected | `in-progress` | achieved | sustaining | `on-hold` | cancelled
  ): Goal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], resourceType = "Goal", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Goal]
  }
  
  extension [Self <: Goal](x: Self) {
    
    inline def setAddresses(value: js.Array[Reference]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Reference*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutcome(value: js.Array[GoalOutcome]): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setOutcomeVarargs(value: GoalOutcome*): Self = StObject.set(x, "outcome", js.Array(value*))
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Goal): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStartCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "startCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setStartCodeableConceptUndefined: Self = StObject.set(x, "startCodeableConcept", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStatus(
      value: proposed | planned | accepted | rejected | `in-progress` | achieved | sustaining | `on-hold` | cancelled
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTargetDate(value: String): Self = StObject.set(x, "targetDate", value.asInstanceOf[js.Any])
    
    inline def setTargetDateUndefined: Self = StObject.set(x, "targetDate", js.undefined)
    
    inline def setTargetQuantity(value: Quantity): Self = StObject.set(x, "targetQuantity", value.asInstanceOf[js.Any])
    
    inline def setTargetQuantityUndefined: Self = StObject.set(x, "targetQuantity", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_startDate(value: Element): Self = StObject.set(x, "_startDate", value.asInstanceOf[js.Any])
    
    inline def set_startDateUndefined: Self = StObject.set(x, "_startDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_targetDate(value: Element): Self = StObject.set(x, "_targetDate", value.asInstanceOf[js.Any])
    
    inline def set_targetDateUndefined: Self = StObject.set(x, "_targetDate", js.undefined)
  }
}
