package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Healthcare plan for patient or group
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait CarePlan extends DomainResource {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Action to occur as part of plan
    */
  var activity: js.UndefOr[js.Array[CarePlanActivity]] = js.native
  
  /**
    * Health issues this plan addresses
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Who is responsible for contents of the plan
    */
  var author: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Fulfills care plan
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Who's involved in plan?
    */
  var careTeam: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Type of plan
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Created in context of
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Summary of nature of plan
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Desired outcome of plan
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * External Ids for this plan
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * proposal | plan | order | option
    */
  var intent: code = js.native
  
  /**
    * Comments about the plan
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Part of referenced CarePlan
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Time period plan covers
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * CarePlan replaced by this CarePlan
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled | unknown
    */
  var status: code = js.native
  
  /**
    * Who care plan is for
    */
  var subject: Reference = js.native
  
  /**
    * Information considered as part of plan
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Human-friendly name for the CarePlan
    */
  var title: js.UndefOr[String] = js.native
}
object CarePlan {
  
  @scala.inline
  def apply(intent: code, status: code, subject: Reference): CarePlan = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlan]
  }
  
  @scala.inline
  implicit class CarePlanMutableBuilder[Self <: CarePlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: js.Array[CarePlanActivity]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    @scala.inline
    def setActivityVarargs(value: CarePlanActivity*): Self = StObject.set(x, "activity", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[Reference]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Reference*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value :_*))
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    @scala.inline
    def setCareTeam(value: js.Array[Reference]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    @scala.inline
    def setCareTeamVarargs(value: Reference*): Self = StObject.set(x, "careTeam", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGoal(value: js.Array[Reference]): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    @scala.inline
    def setGoalVarargs(value: Reference*): Self = StObject.set(x, "goal", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setIntent(value: code): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    @scala.inline
    def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
