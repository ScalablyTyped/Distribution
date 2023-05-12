package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`full-resource`
import typings.fhir.fhirStrings.`id-only`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.empty
import typings.fhir.fhirStrings.error
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
  
  var _name: js.UndefOr[Element] = js.undefined
  
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
    * The MIME type to send the payload in - e.g., `application/fhir+xml` or `application/fhir+json`. Note that:
    * * clients may request notifications in a specific FHIR version by using the [FHIR Version Parameter](http.html#version-parameter) - e.g., `application/fhir+json; fhirVersion=4.0`.
    * * additional MIME types can be allowed by channels - e.g., `text/plain` and `text/html` are defined by the Email channel.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The server is permitted to deviate from this time but should observe it.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * For rest-hook the end-point must be an `http:` or `https:` URL; for websockets, `ws:` or `wss:`; for email, a `mailto:` url; and for message the endpoint can be in any form of url the server understands (usually, `http/s`: or `mllp:`). The URI is allowed to be relative; in which case, it is relative to the server end-point (since there may be more than one, clients should avoid using relative URIs).
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The filter properties to be applied to narrow the subscription topic stream.  When multiple filters are applied, evaluates to true if all the conditions applicable to that resource are met; otherwise it returns false (i.e., logical AND).
    */
  var filterBy: js.UndefOr[js.Array[SubscriptionFilterBy]] = js.undefined
  
  /**
    * If present, a 'heartbeat' notification (keep-alive) is sent via this channel with an interval period equal to this elements integer value in seconds.  If not present, a heartbeat notification is not sent.
    */
  var heartbeatPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Entity with authorization to make subsequent revisions to the Subscription and also determines what data the subscription is authorized to disclose.
    */
  var managingEntity: js.UndefOr[Reference] = js.undefined
  
  /**
    * If present, the maximum number of events that will be included in a notification bundle. Note that this is not a strict limit on the number of entries in a bundle, as dependent resources can be included.
    */
  var maxCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A natural language name identifying the subscription.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Exactly what these mean depend on the channel type. They can convey additional information to the server or recipient and/or meet security requirements; for example, support of multiple headers in the outgoing notifications for rest-hook type subscriptions. Note that names are not required to be unique, but channel definitions can impose restrictions.
    */
  var parameter: js.UndefOr[js.Array[SubscriptionParameter]] = js.undefined
  
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
    
    inline def setHeartbeatPeriod(value: Double): Self = StObject.set(x, "heartbeatPeriod", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatPeriodUndefined: Self = StObject.set(x, "heartbeatPeriod", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManagingEntity(value: Reference): Self = StObject.set(x, "managingEntity", value.asInstanceOf[js.Any])
    
    inline def setManagingEntityUndefined: Self = StObject.set(x, "managingEntity", js.undefined)
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameter(value: js.Array[SubscriptionParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: SubscriptionParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
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
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_reason(value: Element): Self = StObject.set(x, "_reason", value.asInstanceOf[js.Any])
    
    inline def set_reasonUndefined: Self = StObject.set(x, "_reason", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_topic(value: Element): Self = StObject.set(x, "_topic", value.asInstanceOf[js.Any])
    
    inline def set_topicUndefined: Self = StObject.set(x, "_topic", js.undefined)
  }
}
