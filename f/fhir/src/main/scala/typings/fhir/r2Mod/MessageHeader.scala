package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHeader
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _timestamp: js.UndefOr[Element] = js.undefined
  
  /**
    * Need to know for audit/traceback requirements and possibly for authorization.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Every message event is about actual data, a single resource, that is identified in the definition of the event, and perhaps some or all linked resources.
    */
  var data: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates where message is to be sent for routing purposes.  Allows verification of "am I the intended recipient".
    */
  var destination: js.UndefOr[js.Array[MessageHeaderDestination]] = js.undefined
  
  /**
    * Need to know for audit/traceback requirements and possibly for authorization.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Drives the behavior associated with this message.
    */
  var event: Coding
  
  /**
    * Need to be able to track why resources are being changed and report in the audit log/history of the resource.  May affect authorization.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Allows routing beyond just the application level.
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
    * Need to know for audit/traceback requirements and possibly for authorization.
    */
  var responsible: js.UndefOr[Reference] = js.undefined
  
  /**
    * Allows replies, supports audit.
    */
  var source: MessageHeaderSource
  
  /**
    * Allows limited detection of out-of-order and delayed transmission.  Also supports audit.
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
    
    inline def setData(value: js.Array[Reference]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Reference*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDestination(value: js.Array[MessageHeaderDestination]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDestinationVarargs(value: MessageHeaderDestination*): Self = StObject.set(x, "destination", js.Array(value*))
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setEvent(value: Coding): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReceiver(value: Reference): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MessageHeader): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: MessageHeaderResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponsible(value: Reference): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setSource(value: MessageHeaderSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def set_timestamp(value: Element): Self = StObject.set(x, "_timestamp", value.asInstanceOf[js.Any])
    
    inline def set_timestampUndefined: Self = StObject.set(x, "_timestamp", js.undefined)
  }
}
