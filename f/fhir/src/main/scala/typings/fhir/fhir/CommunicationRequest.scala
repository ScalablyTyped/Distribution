package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for information to be sent to a receiver
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait CommunicationRequest
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When request transitioned to being actionable
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Fulfills plan or proposal
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
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A channel of communication
    */
  var medium: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Comments made about communication request
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When scheduled
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When scheduled
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Message payload
    */
  var payload: js.UndefOr[js.Array[CommunicationRequestPayload]] = js.undefined
  
  /**
    * Message urgency
    */
  var priority: js.UndefOr[code] = js.undefined
  
  /**
    * Why is communication needed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Why is communication needed?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Message recipient
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Request(s) replaced by this request
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who/what is requesting service
    */
  var requester: js.UndefOr[CommunicationRequestRequester] = js.undefined
  
  /**
    * Message sender
    */
  var sender: js.UndefOr[Reference] = js.undefined
  
  /**
    * draft | active | suspended | cancelled | completed | entered-in-error | unknown
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
object CommunicationRequest {
  
  @scala.inline
  def apply(status: code): CommunicationRequest = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommunicationRequest]
  }
  
  @scala.inline
  implicit class CommunicationRequestMutableBuilder[Self <: CommunicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
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
    def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
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
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Array[CommunicationRequestPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPayloadVarargs(value: CommunicationRequestPayload*): Self = StObject.set(x, "payload", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
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
    def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    @scala.inline
    def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value :_*))
    
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value :_*))
    
    @scala.inline
    def setRequester(value: CommunicationRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    @scala.inline
    def setSender(value: Reference): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
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
    def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
