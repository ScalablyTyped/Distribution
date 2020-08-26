package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group of related requests
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait RequestGroup extends DomainResource {
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Proposed actions, if any
    */
  var action: js.UndefOr[js.Array[RequestGroupAction]] = js.native
  /**
    * Device or practitioner that authored the request group
    */
  var author: js.UndefOr[Reference] = js.native
  /**
    * When the request group was authored
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  /**
    * Fulfills plan, proposal, or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Encounter or Episode for the request group
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * proposal | plan | order
    */
  var intent: code = js.native
  /**
    * Additional notes about the response
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.native
  /**
    * Reason for the request group
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Reason for the request group
    */
  var reasonReference: js.UndefOr[Reference] = js.native
  /**
    * Request(s) replaced by this request
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * draft | active | suspended | cancelled | completed | entered-in-error | unknown
    */
  var status: code = js.native
  /**
    * Who the request group is about
    */
  var subject: js.UndefOr[Reference] = js.native
}

object RequestGroup {
  @scala.inline
  def apply(intent: code, status: code): RequestGroup = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroup]
  }
  @scala.inline
  implicit class RequestGroupOps[Self <: RequestGroup] (val x: Self) extends AnyVal {
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
    def set_authoredOn(value: Element): Self = this.set("_authoredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_authoredOn: Self = this.set("_authoredOn", js.undefined)
    @scala.inline
    def set_intent(value: Element): Self = this.set("_intent", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_intent: Self = this.set("_intent", js.undefined)
    @scala.inline
    def set_priority(value: Element): Self = this.set("_priority", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_priority: Self = this.set("_priority", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setActionVarargs(value: RequestGroupAction*): Self = this.set("action", js.Array(value :_*))
    @scala.inline
    def setAction(value: js.Array[RequestGroupAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAuthor(value: Reference): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = this.set("authoredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthoredOn: Self = this.set("authoredOn", js.undefined)
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
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
    def setGroupIdentifier(value: Identifier): Self = this.set("groupIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIdentifier: Self = this.set("groupIdentifier", js.undefined)
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
    def setPriority(value: code): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = this.set("reasonCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonCodeableConcept: Self = this.set("reasonCodeableConcept", js.undefined)
    @scala.inline
    def setReasonReference(value: Reference): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = this.set("replaces", js.Array(value :_*))
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = this.set("replaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaces: Self = this.set("replaces", js.undefined)
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

