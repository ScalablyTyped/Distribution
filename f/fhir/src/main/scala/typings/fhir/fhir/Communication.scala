package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A record of information transmitted from a sender to a receiver
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Communication
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'received'.
    */
  var _received: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sent'.
    */
  var _sent: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Request fulfilled by this communication
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Message category
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Encounter or episode leading to message
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A channel of communication
    */
  var medium: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Communication did not occur
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Why communication did not occur
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Comments made about the communication
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Part of this action
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Message payload
    */
  var payload: js.UndefOr[js.Array[CommunicationPayload]] = js.undefined
  
  /**
    * Indication for message
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Why was communication done?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * When received
    */
  var received: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Message recipient
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Message sender
    */
  var sender: js.UndefOr[Reference] = js.undefined
  
  /**
    * When sent
    */
  var sent: js.UndefOr[dateTime] = js.undefined
  
  /**
    * preparation | in-progress | suspended | aborted | completed | entered-in-error
    */
  var status: code
  
  /**
    * Focus of message
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Focal resources
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
}
object Communication {
  
  @scala.inline
  def apply(status: code): Communication = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Communication]
  }
  
  @scala.inline
  implicit class CommunicationMutableBuilder[Self <: Communication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
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
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setMedium(value: js.Array[CodeableConcept]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setMediumVarargs(value: CodeableConcept*): Self = StObject.set(x, "medium", js.Array(value :_*))
    
    @scala.inline
    def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotDoneReason(value: CodeableConcept): Self = StObject.set(x, "notDoneReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotDoneReasonUndefined: Self = StObject.set(x, "notDoneReason", js.undefined)
    
    @scala.inline
    def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
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
    def setPayload(value: js.Array[CommunicationPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPayloadVarargs(value: CommunicationPayload*): Self = StObject.set(x, "payload", js.Array(value :_*))
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setReceived(value: dateTime): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
    
    @scala.inline
    def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    @scala.inline
    def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value :_*))
    
    @scala.inline
    def setSender(value: Reference): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    @scala.inline
    def setSent(value: dateTime): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentUndefined: Self = StObject.set(x, "sent", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTopic(value: js.Array[Reference]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: Reference*): Self = StObject.set(x, "topic", js.Array(value :_*))
    
    @scala.inline
    def set_notDone(value: Element): Self = StObject.set(x, "_notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_notDoneUndefined: Self = StObject.set(x, "_notDone", js.undefined)
    
    @scala.inline
    def set_received(value: Element): Self = StObject.set(x, "_received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_receivedUndefined: Self = StObject.set(x, "_received", js.undefined)
    
    @scala.inline
    def set_sent(value: Element): Self = StObject.set(x, "_sent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sentUndefined: Self = StObject.set(x, "_sent", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
