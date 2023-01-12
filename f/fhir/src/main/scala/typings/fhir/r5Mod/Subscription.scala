package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`full-resource`
import typings.fhir.fhirStrings.`full-url`
import typings.fhir.fhirStrings.`id-only`
import typings.fhir.fhirStrings.`request-response`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.all
import typings.fhir.fhirStrings.empty
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.none
import typings.fhir.fhirStrings.off
import typings.fhir.fhirStrings.requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _content: js.UndefOr[Element] = js.undefined
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  var _end: js.UndefOr[Element] = js.undefined
  
  var _endpoint: js.UndefOr[Element] = js.undefined
  
  var _header: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _notificationUrlLocation: js.UndefOr[Element] = js.undefined
  
  var _reason: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _topic: js.UndefOr[Element] = js.undefined
  
  /**
    * The type of channel to send notifications on.
    */
  var channelType: Coding
  
  /**
    * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * Sending the payload has obvious security implications. The server is responsible for ensuring that the content is appropriately secured.
    */
  var content: js.UndefOr[empty | `id-only` | `full-resource`] = js.undefined
  
  /**
    * The mime type to send the payload in - either application/fhir+xml, or application/fhir+json. The MIME types "text/plain" and "text/html" may also be used for Email subscriptions.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The server is permitted to deviate from this time but should observe it.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * For rest-hook the end-point must be an http: or https: URL; for websocket ws: or wss:; for email, a mailto: url; and for message the endpoint can be in any form of url the server understands (usually, http/s: or mllp:). The URI is allowed to be relative; in which case, it is relative to the server end-point (since there may be more than one, clients should avoid using relative URIs).
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The filter properties to be applied to narrow the subscription topic stream.  When multiple filters are applied, evaluates to true if all the conditions are met; otherwise it returns false.   (i.e., logical AND).
    */
  var filterBy: js.UndefOr[js.Array[SubscriptionFilterBy]] = js.undefined
  
  /**
    * Exactly what these mean depend on the channel type. They can convey additional information to the recipient and/or meet security requirements; for example, support of multiple headers in the outgoing notifications for rest-hook type subscriptions.
    */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If present,  a 'hearbeat" notification (keepalive) is sent via this channel with an the interval period equal to this elements integer value in seconds.    If not present, a heartbeat notification is not sent.
    */
  var heartbeatPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If present, the maximum number of triggering resources that will be included in a notification bundle (e.g., a server will not include more than this number of trigger resources in a single notification).  Note that this is not a strict limit on the number of entries in a bundle, as dependent resources can be included.
    */
  var maxCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A natural language name identifying the subscription.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If present, where to place URLs of resources in notifications.
    */
  var notificationUrlLocation: js.UndefOr[none | `full-url` | `request-response` | all] = js.undefined
  
  /**
    * A description of why this subscription is defined.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Subscription: typings.fhir.fhirStrings.Subscription
  
  /**
    * A client can only submit subscription resources in the requested or off state. Only the server can  move a subscription from requested to active, and then to error. Either the server or the client can turn a subscription off.
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: requested | active | error | off | `entered-in-error`
  
  /**
    * If present, the maximum amount of time a server will allow before failing a notification attempt.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The reference to the subscription topic to be notified about.
    */
  var topic: String
}
object Subscription {
  
  inline def apply(channelType: Coding, status: requested | active | error | off | `entered-in-error`, topic: String): Subscription = {
    val __obj = js.Dynamic.literal(channelType = channelType.asInstanceOf[js.Any], resourceType = "Subscription", status = status.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    inline def setChannelType(value: Coding): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setContent(value: empty | `id-only` | `full-resource`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setFilterBy(value: js.Array[SubscriptionFilterBy]): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
    
    inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    inline def setFilterByVarargs(value: SubscriptionFilterBy*): Self = StObject.set(x, "filterBy", js.Array(value*))
    
    inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setHeartbeatPeriod(value: Double): Self = StObject.set(x, "heartbeatPeriod", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatPeriodUndefined: Self = StObject.set(x, "heartbeatPeriod", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationUrlLocation(value: none | `full-url` | `request-response` | all): Self = StObject.set(x, "notificationUrlLocation", value.asInstanceOf[js.Any])
    
    inline def setNotificationUrlLocationUndefined: Self = StObject.set(x, "notificationUrlLocation", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Subscription): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: requested | active | error | off | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def set_content(value: Element): Self = StObject.set(x, "_content", value.asInstanceOf[js.Any])
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_contentUndefined: Self = StObject.set(x, "_content", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    inline def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    inline def set_header(value: js.Array[Element]): Self = StObject.set(x, "_header", value.asInstanceOf[js.Any])
    
    inline def set_headerUndefined: Self = StObject.set(x, "_header", js.undefined)
    
    inline def set_headerVarargs(value: Element*): Self = StObject.set(x, "_header", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_notificationUrlLocation(value: Element): Self = StObject.set(x, "_notificationUrlLocation", value.asInstanceOf[js.Any])
    
    inline def set_notificationUrlLocationUndefined: Self = StObject.set(x, "_notificationUrlLocation", js.undefined)
    
    inline def set_reason(value: Element): Self = StObject.set(x, "_reason", value.asInstanceOf[js.Any])
    
    inline def set_reasonUndefined: Self = StObject.set(x, "_reason", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_topic(value: Element): Self = StObject.set(x, "_topic", value.asInstanceOf[js.Any])
    
    inline def set_topicUndefined: Self = StObject.set(x, "_topic", js.undefined)
  }
}
