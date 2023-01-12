package typings.fhir.r2Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.proposed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarePlan
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _modified: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Allows systems to prompt for performance of planned activities, and validate plans against best practice.
    */
  var activity: js.UndefOr[js.Array[CarePlanActivity]] = js.undefined
  
  /**
    * Links plan to the conditions it manages.  Also scopes plans - multiple plans may exist addressing different concerns.
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifies the individual(s) or ogranization who is responsible for the content of the care plan.
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Used for filtering what plan(s) are retrieved and displayed to different types of users.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Identifies the context in which this particular CarePlan is defined.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Provides more detail than conveyed by category.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Provides context for plan.  Allows plan effectiveness to be evaluated by clinicians.
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Need to allow connection to a wider workflow.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Indicates how current the plan is.
    */
  var modified: js.UndefOr[String] = js.undefined
  
  /**
    * Used to capture information that applies to the plan as a whole that doesn't fit into discrete elements.
    */
  var note: js.UndefOr[Annotation] = js.undefined
  
  /**
    * Allows representation of care teams, helps scope care plan.  In some cases may be a determiner of access permissions.
    */
  var participant: js.UndefOr[js.Array[CarePlanParticipant]] = js.undefined
  
  /**
    * Allows tracking what plan(s) are in effect at a particular time.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Identifies CarePlans with some sort of formal relationship to the current plan.
    */
  var relatedPlan: js.UndefOr[js.Array[CarePlanRelatedPlan]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CarePlan: typings.fhir.fhirStrings.CarePlan
  
  /**
    * Allows clinicians to determine whether the plan is actionable or not.
    */
  var status: proposed | draft | active | completed | cancelled
  
  /**
    * Identifies the patient or group whose intended care is described by the plan.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies barriers and other considerations associated with the care plan.
    */
  var support: js.UndefOr[js.Array[Reference]] = js.undefined
}
object CarePlan {
  
  inline def apply(status: proposed | draft | active | completed | cancelled): CarePlan = {
    val __obj = js.Dynamic.literal(resourceType = "CarePlan", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CarePlan] (val x: Self) extends AnyVal {
    
    inline def setActivity(value: js.Array[CarePlanActivity]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setActivityVarargs(value: CarePlanActivity*): Self = StObject.set(x, "activity", js.Array(value*))
    
    inline def setAddresses(value: js.Array[Reference]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Reference*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGoal(value: js.Array[Reference]): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setGoalVarargs(value: Reference*): Self = StObject.set(x, "goal", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setNote(value: Annotation): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setParticipant(value: js.Array[CarePlanParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: CarePlanParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRelatedPlan(value: js.Array[CarePlanRelatedPlan]): Self = StObject.set(x, "relatedPlan", value.asInstanceOf[js.Any])
    
    inline def setRelatedPlanUndefined: Self = StObject.set(x, "relatedPlan", js.undefined)
    
    inline def setRelatedPlanVarargs(value: CarePlanRelatedPlan*): Self = StObject.set(x, "relatedPlan", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.CarePlan): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: proposed | draft | active | completed | cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSupport(value: js.Array[Reference]): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    inline def setSupportVarargs(value: Reference*): Self = StObject.set(x, "support", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_modified(value: Element): Self = StObject.set(x, "_modified", value.asInstanceOf[js.Any])
    
    inline def set_modifiedUndefined: Self = StObject.set(x, "_modified", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
