package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Goal
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _lifecycleStatus: js.UndefOr[Element] = js.undefined
  
  var _startDate: js.UndefOr[Element] = js.undefined
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  var _statusReason: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the progression, or lack thereof, towards the goal against the target.
    */
  var achievementStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The identified conditions and other health record elements that are intended to be addressed by the goal.
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates a category the goal falls within.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If no code is available, use CodeableConcept.text.
    */
  var description: CodeableConcept
  
  /**
    * This is the individual responsible for establishing the goal, not necessarily who recorded it.  (For that, use the Provenance resource.).
    */
  var expressedBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the lifecycleStatus contains codes that mark the resource as not currently valid.
    */
  var lifecycleStatus: proposed | planned | accepted | active | `on-hold` | completed | cancelled | `entered-in-error` | rejected
  
  /**
    * May be used for progress notes, concerns or other related information that doesn't actually describe the goal itself.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Note that this should not duplicate the goal status.
    */
  var outcomeCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The goal outcome is independent of the outcome of the related activities.  For example, if the Goal is to achieve a target body weight of 150 lb and a care plan activity is defined to diet, then the care plan’s activity outcome could be calories consumed whereas goal outcome is an observation for the actual body weight measured.
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Extensions are available to track priorities as established by each participant (i.e. Priority from the patient's perspective, different practitioners' perspectives, family member's perspectives)
    * The ordinal extension on Coding can be used to convey a numerically comparable ranking to priority.  (Keep in mind that different coding systems may use a "low value=important".
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Goal: typings.fhir.fhirStrings.Goal
  
  /**
    * The date or event after which the goal should begin being pursued.
    */
  var startCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date or event after which the goal should begin being pursued.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * To see the date for past statuses, query history.
    */
  var statusDate: js.UndefOr[String] = js.undefined
  
  /**
    * This will typically be captured for statuses such as rejected, on-hold or cancelled, but could be present for others.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the patient, group or organization for whom the goal is being established.
    */
  var subject: Reference
  
  /**
    * When multiple targets are present for a single goal instance, all targets must be met for the overall goal to be met.
    */
  var target: js.UndefOr[js.Array[GoalTarget]] = js.undefined
}
object Goal {
  
  inline def apply(
    description: CodeableConcept,
    lifecycleStatus: proposed | planned | accepted | active | `on-hold` | completed | cancelled | `entered-in-error` | rejected,
    subject: Reference
  ): Goal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], lifecycleStatus = lifecycleStatus.asInstanceOf[js.Any], resourceType = "Goal", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Goal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Goal] (val x: Self) extends AnyVal {
    
    inline def setAchievementStatus(value: CodeableConcept): Self = StObject.set(x, "achievementStatus", value.asInstanceOf[js.Any])
    
    inline def setAchievementStatusUndefined: Self = StObject.set(x, "achievementStatus", js.undefined)
    
    inline def setAddresses(value: js.Array[Reference]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Reference*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setDescription(value: CodeableConcept): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExpressedBy(value: Reference): Self = StObject.set(x, "expressedBy", value.asInstanceOf[js.Any])
    
    inline def setExpressedByUndefined: Self = StObject.set(x, "expressedBy", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLifecycleStatus(
      value: proposed | planned | accepted | active | `on-hold` | completed | cancelled | `entered-in-error` | rejected
    ): Self = StObject.set(x, "lifecycleStatus", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutcomeCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "outcomeCode", value.asInstanceOf[js.Any])
    
    inline def setOutcomeCodeUndefined: Self = StObject.set(x, "outcomeCode", js.undefined)
    
    inline def setOutcomeCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "outcomeCode", js.Array(value*))
    
    inline def setOutcomeReference(value: js.Array[Reference]): Self = StObject.set(x, "outcomeReference", value.asInstanceOf[js.Any])
    
    inline def setOutcomeReferenceUndefined: Self = StObject.set(x, "outcomeReference", js.undefined)
    
    inline def setOutcomeReferenceVarargs(value: Reference*): Self = StObject.set(x, "outcomeReference", js.Array(value*))
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Goal): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStartCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "startCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setStartCodeableConceptUndefined: Self = StObject.set(x, "startCodeableConcept", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[GoalTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: GoalTarget*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_lifecycleStatus(value: Element): Self = StObject.set(x, "_lifecycleStatus", value.asInstanceOf[js.Any])
    
    inline def set_lifecycleStatusUndefined: Self = StObject.set(x, "_lifecycleStatus", js.undefined)
    
    inline def set_startDate(value: Element): Self = StObject.set(x, "_startDate", value.asInstanceOf[js.Any])
    
    inline def set_startDateUndefined: Self = StObject.set(x, "_startDate", js.undefined)
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
    
    inline def set_statusReason(value: Element): Self = StObject.set(x, "_statusReason", value.asInstanceOf[js.Any])
    
    inline def set_statusReasonUndefined: Self = StObject.set(x, "_statusReason", js.undefined)
  }
}
