package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A record of information transmitted from a sender to a receiver
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Communication extends DomainResource {
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'received'.
    */
  var _received: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sent'.
    */
  var _sent: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Request fulfilled by this communication
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
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * A channel of communication
    */
  var medium: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Communication did not occur
    */
  var notDone: js.UndefOr[Boolean] = js.native
  /**
    * Why communication did not occur
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Comments made about the communication
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Part of this action
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Message payload
    */
  var payload: js.UndefOr[js.Array[CommunicationPayload]] = js.native
  /**
    * Indication for message
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Why was communication done?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * When received
    */
  var received: js.UndefOr[dateTime] = js.native
  /**
    * Message recipient
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Message sender
    */
  var sender: js.UndefOr[Reference] = js.native
  /**
    * When sent
    */
  var sent: js.UndefOr[dateTime] = js.native
  /**
    * preparation | in-progress | suspended | aborted | completed | entered-in-error
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

object Communication {
  @scala.inline
  def apply(status: code): Communication = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Communication]
  }
  @scala.inline
  implicit class CommunicationOps[Self <: Communication] (val x: Self) extends AnyVal {
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
    def set_notDone(value: Element): Self = this.set("_notDone", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_notDone: Self = this.set("_notDone", js.undefined)
    @scala.inline
    def set_received(value: Element): Self = this.set("_received", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_received: Self = this.set("_received", js.undefined)
    @scala.inline
    def set_sent(value: Element): Self = this.set("_sent", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sent: Self = this.set("_sent", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
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
    def setDefinitionVarargs(value: Reference*): Self = this.set("definition", js.Array(value :_*))
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
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
    def setNotDone(value: Boolean): Self = this.set("notDone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotDone: Self = this.set("notDone", js.undefined)
    @scala.inline
    def setNotDoneReason(value: CodeableConcept): Self = this.set("notDoneReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotDoneReason: Self = this.set("notDoneReason", js.undefined)
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
    def setPayloadVarargs(value: CommunicationPayload*): Self = this.set("payload", js.Array(value :_*))
    @scala.inline
    def setPayload(value: js.Array[CommunicationPayload]): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
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
    def setReceived(value: dateTime): Self = this.set("received", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceived: Self = this.set("received", js.undefined)
    @scala.inline
    def setRecipientVarargs(value: Reference*): Self = this.set("recipient", js.Array(value :_*))
    @scala.inline
    def setRecipient(value: js.Array[Reference]): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    @scala.inline
    def setSender(value: Reference): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    @scala.inline
    def setSent(value: dateTime): Self = this.set("sent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSent: Self = this.set("sent", js.undefined)
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

