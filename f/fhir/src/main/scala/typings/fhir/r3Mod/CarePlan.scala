package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.option
import typings.fhir.fhirStrings.order_
import typings.fhir.fhirStrings.plan
import typings.fhir.fhirStrings.proposal
import typings.fhir.fhirStrings.suspended
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarePlan
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
    */
  var activity: js.UndefOr[js.Array[CarePlanActivity]] = js.undefined
  
  /**
    * Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Collaborative care plans may have multiple authors.
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A care plan that is fulfilled in whole or in part by this care plan.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
    */
  var careTeam: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * There may be multiple axis of categorization and one plan may serve multiple purposes.  In some cases, this may be redundant with references to CarePlan.concern.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Activities conducted as a result of the care plan may well occur as part of other encounters/episodes.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the protocol, questionnaire, guideline or other specification the care plan should be conducted in accordance with.
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A description of the scope and nature of the plan.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Goal can be achieving a particular change or merely maintaining a current state or even slowing a decline.
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the intent alters when and how the resource is actually applicable.
    */
  var intent: proposal | plan | order_ | option
  
  /**
    * General notes about the care plan not covered elsewhere.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Each care plan is an independent request, such that having a care plan be part of another care plan can cause issues with cascading statuses.  As such, this element is still being discussed.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Any activities scheduled as part of the plan should be constrained to the specified period regardless of whether the activities are planned within a single encounter/episode or across multiple encounters/episodes (e.g. the longitudinal management of a chronic condition).
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The replacement could be because the initial care plan was immediately rejected (due to an issue) or because the previous care plan was completed, but the need for the action described by the care plan remains ongoing.
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CarePlan: typings.fhir.fhirStrings.CarePlan
  
  /**
    * The unknown code is not to be used to convey other statuses.  The unknown code should be used when one of the statuses applies, but the authoring system doesn't know the current state of the care plan.
    * This element is labeled as a modifier because the status contains the code entered-in-error] that marks the plan as not currently valid.
    */
  var status: draft | active | suspended | completed | `entered-in-error` | cancelled | unknown
  
  /**
    * Identifies the patient or group whose intended care is described by the plan.
    */
  var subject: Reference
  
  /**
    * Use "concern" to identify specific conditions addressed by the care plan.
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Human-friendly name for the CarePlan.
    */
  var title: js.UndefOr[String] = js.undefined
}
object CarePlan {
  
  inline def apply(
    intent: proposal | plan | order_ | option,
    status: draft | active | suspended | completed | `entered-in-error` | cancelled | unknown,
    subject: Reference
  ): CarePlan = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], resourceType = "CarePlan", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlan]
  }
  
  extension [Self <: CarePlan](x: Self) {
    
    inline def setActivity(value: js.Array[CarePlanActivity]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setActivityVarargs(value: CarePlanActivity*): Self = StObject.set(x, "activity", js.Array(value*))
    
    inline def setAddresses(value: js.Array[Reference]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Reference*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCareTeam(value: js.Array[Reference]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: Reference*): Self = StObject.set(x, "careTeam", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGoal(value: js.Array[Reference]): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setGoalVarargs(value: Reference*): Self = StObject.set(x, "goal", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIntent(value: proposal | plan | order_ | option): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    inline def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.CarePlan): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | suspended | completed | `entered-in-error` | cancelled | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
