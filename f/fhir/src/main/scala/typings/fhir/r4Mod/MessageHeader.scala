package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHeader
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _eventUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Usually only for the request but can be used in a response.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Permanent link to the MessageDefinition for this message.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * There SHOULD be at least one destination, but in some circumstances, the source system is unaware of any particular destination system.
    */
  var destination: js.UndefOr[js.Array[MessageHeaderDestination]] = js.undefined
  
  /**
    * Usually only for the request but can be used in a response.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The time of the event will be found in the focus resource. The time of the message will be found in [Bundle.timestamp](bundle-definitions.html#Bundle.timestamp).
    */
  var eventCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * The time of the event will be found in the focus resource. The time of the message will be found in [Bundle.timestamp](bundle-definitions.html#Bundle.timestamp).
    */
  var eventUri: js.UndefOr[String] = js.undefined
  
  /**
    * The data is defined where the transaction type is defined. The transaction data is always included in the bundle that is the full message.  Only the root resource is specified.  The resources it references should be contained in the bundle but are not also listed here.  Multiple repetitions are allowed to cater for merges and other situations with multiple focal targets.
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MessageHeader: typings.fhir.fhirStrings.MessageHeader
  
  /**
    * Information about the message that this message is a response to.  Only present if this message is a response.
    */
  var response: js.UndefOr[MessageHeaderResponse] = js.undefined
  
  /**
    * Usually only for the request but can be used in a response.
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
}
object MessageHeader {
  
  inline def apply(source: MessageHeaderSource): MessageHeader = {
    val __obj = js.Dynamic.literal(resourceType = "MessageHeader", source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageHeader] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDestination(value: js.Array[MessageHeaderDestination]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDestinationVarargs(value: MessageHeaderDestination*): Self = StObject.set(x, "destination", js.Array(value*))
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setEventCoding(value: Coding): Self = StObject.set(x, "eventCoding", value.asInstanceOf[js.Any])
    
    inline def setEventCodingUndefined: Self = StObject.set(x, "eventCoding", js.undefined)
    
    inline def setEventUri(value: String): Self = StObject.set(x, "eventUri", value.asInstanceOf[js.Any])
    
    inline def setEventUriUndefined: Self = StObject.set(x, "eventUri", js.undefined)
    
    inline def setFocus(value: js.Array[Reference]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: Reference*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MessageHeader): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: MessageHeaderResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponsible(value: Reference): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setSender(value: Reference): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSource(value: MessageHeaderSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_eventUri(value: Element): Self = StObject.set(x, "_eventUri", value.asInstanceOf[js.Any])
    
    inline def set_eventUriUndefined: Self = StObject.set(x, "_eventUri", js.undefined)
  }
}
