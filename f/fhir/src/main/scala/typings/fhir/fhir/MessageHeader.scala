package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource that describes a message that is exchanged between systems
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MessageHeader
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'timestamp'.
    */
  var _timestamp: js.UndefOr[Element] = js.undefined
  
  /**
    * The source of the decision
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Message destination application(s)
    */
  var destination: js.UndefOr[js.Array[MessageHeaderDestination]] = js.undefined
  
  /**
    * The source of the data entry
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Code for the event this message represents
    */
  var event: Coding
  
  /**
    * The actual content of the message
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Cause of event
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Intended "real-world" recipient for the data
    */
  var receiver: js.UndefOr[Reference] = js.undefined
  
  /**
    * If this is a reply to prior message
    */
  var response: js.UndefOr[MessageHeaderResponse] = js.undefined
  
  /**
    * Final responsibility for event
    */
  var responsible: js.UndefOr[Reference] = js.undefined
  
  /**
    * Real world sender of the message
    */
  var sender: js.UndefOr[Reference] = js.undefined
  
  /**
    * Message source application
    */
  var source: MessageHeaderSource
  
  /**
    * Time that the message was sent
    */
  var timestamp: instant
}
object MessageHeader {
  
  @scala.inline
  def apply(event: Coding, source: MessageHeaderSource, timestamp: instant): MessageHeader = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeader]
  }
  
  @scala.inline
  implicit class MessageHeaderMutableBuilder[Self <: MessageHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setDestination(value: js.Array[MessageHeaderDestination]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDestinationVarargs(value: MessageHeaderDestination*): Self = StObject.set(x, "destination", js.Array(value :_*))
    
    @scala.inline
    def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    @scala.inline
    def setEvent(value: Coding): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: js.Array[Reference]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setFocusVarargs(value: Reference*): Self = StObject.set(x, "focus", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setReceiver(value: Reference): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    @scala.inline
    def setResponse(value: MessageHeaderResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setResponsible(value: Reference): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    @scala.inline
    def setSender(value: Reference): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    @scala.inline
    def setSource(value: MessageHeaderSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: instant): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timestamp(value: Element): Self = StObject.set(x, "_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timestampUndefined: Self = StObject.set(x, "_timestamp", js.undefined)
  }
}
