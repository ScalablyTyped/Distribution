package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for information to be sent to a receiver
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait CommunicationRequest extends DomainResource {
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * When request transitioned to being actionable
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  /**
    * Fulfills plan or proposal
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Message category
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Encounter or episode leading to message
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * A channel of communication
    */
  var medium: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Comments made about communication request
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When scheduled
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When scheduled
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  /**
    * Message payload
    */
  var payload: js.UndefOr[js.Array[CommunicationRequestPayload]] = js.native
  /**
    * Message urgency
    */
  var priority: js.UndefOr[code] = js.native
  /**
    * Why is communication needed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Why is communication needed?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Message recipient
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Request(s) replaced by this request
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who/what is requesting service
    */
  var requester: js.UndefOr[CommunicationRequestRequester] = js.native
  /**
    * Message sender
    */
  var sender: js.UndefOr[Reference] = js.native
  /**
    * draft | active | suspended | cancelled | completed | entered-in-error | unknown
    */
  var status: code = js.native
  /**
    * Focus of message
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * Focal resources
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.native
}

object CommunicationRequest {
  @scala.inline
  def apply(status: code): CommunicationRequest = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommunicationRequest]
  }
  @scala.inline
  implicit class CommunicationRequestOps[Self <: CommunicationRequest] (val x: Self) extends AnyVal {
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_authoredOn(value: Element): Self = this.set("_authoredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_authoredOn: Self = this.set("_authoredOn", js.undefined)
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = this.set("_occurrenceDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_occurrenceDateTime: Self = this.set("_occurrenceDateTime", js.undefined)
    @scala.inline
    def set_priority(value: Element): Self = this.set("_priority", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_priority: Self = this.set("_priority", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
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
    def setMediumVarargs(value: CodeableConcept*): Self = this.set("medium", js.Array(value :_*))
    @scala.inline
    def setMedium(value: js.Array[CodeableConcept]): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = this.set("occurrenceDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrenceDateTime: Self = this.set("occurrenceDateTime", js.undefined)
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = this.set("occurrencePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrencePeriod: Self = this.set("occurrencePeriod", js.undefined)
    @scala.inline
    def setPayloadVarargs(value: CommunicationRequestPayload*): Self = this.set("payload", js.Array(value :_*))
    @scala.inline
    def setPayload(value: js.Array[CommunicationRequestPayload]): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setPriority(value: code): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = this.set("reasonCode", js.Array(value :_*))
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = this.set("reasonReference", js.Array(value :_*))
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    @scala.inline
    def setRecipientVarargs(value: Reference*): Self = this.set("recipient", js.Array(value :_*))
    @scala.inline
    def setRecipient(value: js.Array[Reference]): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = this.set("replaces", js.Array(value :_*))
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = this.set("replaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaces: Self = this.set("replaces", js.undefined)
    @scala.inline
    def setRequester(value: CommunicationRequestRequester): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    @scala.inline
    def setSender(value: Reference): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTopicVarargs(value: Reference*): Self = this.set("topic", js.Array(value :_*))
    @scala.inline
    def setTopic(value: js.Array[Reference]): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

