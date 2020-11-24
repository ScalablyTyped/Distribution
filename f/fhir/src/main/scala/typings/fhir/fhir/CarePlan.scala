package typings.fhir.fhir

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
  implicit class CarePlanOps[Self <: CarePlan] (val x: Self) extends AnyVal {
    
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
    def setIntent(value: code): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_intent(value: Element): Self = this.set("_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_intent: Self = this.set("_intent", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    
    @scala.inline
    def setActivityVarargs(value: CarePlanActivity*): Self = this.set("activity", js.Array(value :_*))
    
    @scala.inline
    def setActivity(value: js.Array[CarePlanActivity]): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Reference*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[Reference]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setAuthorVarargs(value: Reference*): Self = this.set("author", js.Array(value :_*))
    
    @scala.inline
    def setAuthor(value: js.Array[Reference]): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    
    @scala.inline
    def setCareTeamVarargs(value: Reference*): Self = this.set("careTeam", js.Array(value :_*))
    
    @scala.inline
    def setCareTeam(value: js.Array[Reference]): Self = this.set("careTeam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCareTeam: Self = this.set("careTeam", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: Reference*): Self = this.set("definition", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGoalVarargs(value: Reference*): Self = this.set("goal", js.Array(value :_*))
    
    @scala.inline
    def setGoal(value: js.Array[Reference]): Self = this.set("goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoal: Self = this.set("goal", js.undefined)
    
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
    def setPartOfVarargs(value: Reference*): Self = this.set("partOf", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = this.set("partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = this.set("replaces", js.Array(value :_*))
    
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = this.set("replaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaces: Self = this.set("replaces", js.undefined)
    
    @scala.inline
    def setSupportingInfoVarargs(value: Reference*): Self = this.set("supportingInfo", js.Array(value :_*))
    
    @scala.inline
    def setSupportingInfo(value: js.Array[Reference]): Self = this.set("supportingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportingInfo: Self = this.set("supportingInfo", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
