package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that describes a message that is exchanged between systems
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait MessageHeader extends DomainResource {
  /**
    * Contains extended information for property 'timestamp'.
    */
  var _timestamp: js.UndefOr[Element] = js.native
  /**
    * The source of the decision
    */
  var author: js.UndefOr[Reference] = js.native
  /**
    * Message destination application(s)
    */
  var destination: js.UndefOr[js.Array[MessageHeaderDestination]] = js.native
  /**
    * The source of the data entry
    */
  var enterer: js.UndefOr[Reference] = js.native
  /**
    * Code for the event this message represents
    */
  var event: Coding = js.native
  /**
    * The actual content of the message
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Cause of event
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Intended "real-world" recipient for the data
    */
  var receiver: js.UndefOr[Reference] = js.native
  /**
    * If this is a reply to prior message
    */
  var response: js.UndefOr[MessageHeaderResponse] = js.native
  /**
    * Final responsibility for event
    */
  var responsible: js.UndefOr[Reference] = js.native
  /**
    * Real world sender of the message
    */
  var sender: js.UndefOr[Reference] = js.native
  /**
    * Message source application
    */
  var source: MessageHeaderSource = js.native
  /**
    * Time that the message was sent
    */
  var timestamp: instant = js.native
}

object MessageHeader {
  @scala.inline
  def apply(event: Coding, source: MessageHeaderSource, timestamp: instant): MessageHeader = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeader]
  }
  @scala.inline
  implicit class MessageHeaderOps[Self <: MessageHeader] (val x: Self) extends AnyVal {
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
    def setEvent(value: Coding): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: MessageHeaderSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: instant): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def set_timestamp(value: Element): Self = this.set("_timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_timestamp: Self = this.set("_timestamp", js.undefined)
    @scala.inline
    def setAuthor(value: Reference): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setDestinationVarargs(value: MessageHeaderDestination*): Self = this.set("destination", js.Array(value :_*))
    @scala.inline
    def setDestination(value: js.Array[MessageHeaderDestination]): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setEnterer(value: Reference): Self = this.set("enterer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterer: Self = this.set("enterer", js.undefined)
    @scala.inline
    def setFocusVarargs(value: Reference*): Self = this.set("focus", js.Array(value :_*))
    @scala.inline
    def setFocus(value: js.Array[Reference]): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setReason(value: CodeableConcept): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setReceiver(value: Reference): Self = this.set("receiver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    @scala.inline
    def setResponse(value: MessageHeaderResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResponsible(value: Reference): Self = this.set("responsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsible: Self = this.set("responsible", js.undefined)
    @scala.inline
    def setSender(value: Reference): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
  }
  
}

