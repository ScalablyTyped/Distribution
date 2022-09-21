package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHeader
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _timestamp: js.UndefOr[Element] = js.undefined
  
  /**
    * Usually only for the request, but can be used in a response.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * There SHOULD be at least one destination, but in some circumstances, the source system is unaware of any particular destination system.
    */
  var destination: js.UndefOr[js.Array[MessageHeaderDestination]] = js.undefined
  
  /**
    * Usually only for the request, but can be used in a response.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value "http://hl7.org/fhir/message-events".
    */
  var event: Coding
  
  /**
    * The data is defined where the transaction type is defined. The transaction data is always included in the bundle that is the full message.  Only the root resource is specified.  The resources it references should be contained in the bundle but are not also listed here.  Multiple repetitions are allowed to cater for merges and other situations with multiple focal targets.
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.
    */
  var receiver: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MessageHeader: typings.fhir.fhirStrings.MessageHeader
  
  /**
    * Information about the message that this message is a response to.  Only present if this message is a response.
    */
  var response: js.UndefOr[MessageHeaderResponse] = js.undefined
  
  /**
    * Usually only for the request, but can be used in a response.
    */
  var responsible: js.UndefOr[Reference] = js.undefined
  
  /**
    * Use case is for where a (trusted) sending system is responsible for multiple organizations, and therefore cannot differentiate based on source endpoint / authentication alone.
    */
  var sender: js.UndefOr[Reference] = js.undefined
  
  /**
    * The source application from which this message originated.
    */
  var source: MessageHeaderSource
  
  /**
    * The time that the message was sent.
    */
  var timestamp: String
}
object MessageHeader {
  
  inline def apply(event: Coding, source: MessageHeaderSource, timestamp: String): MessageHeader = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceType = "MessageHeader", source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeader]
  }
  
  extension [Self <: MessageHeader](x: Self) {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setDestination(value: js.Array[MessageHeaderDestination]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDestinationVarargs(value: MessageHeaderDestination*): Self = StObject.set(x, "destination", js.Array(value*))
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setEvent(value: Coding): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: js.Array[Reference]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: Reference*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReceiver(value: Reference): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MessageHeader): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: MessageHeaderResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponsible(value: Reference): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setSender(value: Reference): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSource(value: MessageHeaderSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def set_timestamp(value: Element): Self = StObject.set(x, "_timestamp", value.asInstanceOf[js.Any])
    
    inline def set_timestampUndefined: Self = StObject.set(x, "_timestamp", js.undefined)
  }
}
