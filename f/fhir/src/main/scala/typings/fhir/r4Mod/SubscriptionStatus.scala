package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`event-notification`
import typings.fhir.fhirStrings.`query-event`
import typings.fhir.fhirStrings.`query-status`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.handshake
import typings.fhir.fhirStrings.heartbeat
import typings.fhir.fhirStrings.off
import typings.fhir.fhirStrings.requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionStatus
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _eventsSinceSubscriptionStart: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _topic: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Recommended practice: clear errors when status is updated.
    */
  var error: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The total number of actual events represented within this notification.  For handshake and heartbeat notifications, this will be zero or not present.  For event-notifications, this number may be one or more, depending on server batching.
    */
  var eventsInNotification: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of actual events which have been generated since the Subscription was created (inclusive of this notification) - regardless of how many have been successfully communicated.  This number is NOT incremented for handshake and heartbeat notifications.
    */
  var eventsSinceSubscriptionStart: js.UndefOr[String] = js.undefined
  
  /**
    * Detailed information about events relevant to this subscription notification.
    */
  var notificationEvent: js.UndefOr[js.Array[SubscriptionStatusNotificationEvent]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SubscriptionStatus: typings.fhir.fhirStrings.SubscriptionStatus
  
  /**
    * The status of the subscription, which marks the server state for managing the subscription.
    */
  var status: js.UndefOr[requested | active | error | off] = js.undefined
  
  /**
    * The reference to the Subscription which generated this notification.
    */
  var subscription: Reference
  
  /**
    * This value SHOULD NOT be present when using `empty` payloads, MAY be present when using `id-only` payloads, and SHOULD be present when using `full-resource` payloads.
    */
  var topic: js.UndefOr[String] = js.undefined
  
  /**
    * The type of event being conveyed with this notificaiton.
    */
  var `type`: handshake | heartbeat | `event-notification` | `query-status` | `query-event`
}
object SubscriptionStatus {
  
  inline def apply(
    subscription: Reference,
    `type`: handshake | heartbeat | `event-notification` | `query-status` | `query-event`
  ): SubscriptionStatus = {
    val __obj = js.Dynamic.literal(resourceType = "SubscriptionStatus", subscription = subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionStatus] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Array[CodeableConcept]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: CodeableConcept*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setEventsInNotification(value: Double): Self = StObject.set(x, "eventsInNotification", value.asInstanceOf[js.Any])
    
    inline def setEventsInNotificationUndefined: Self = StObject.set(x, "eventsInNotification", js.undefined)
    
    inline def setEventsSinceSubscriptionStart(value: String): Self = StObject.set(x, "eventsSinceSubscriptionStart", value.asInstanceOf[js.Any])
    
    inline def setEventsSinceSubscriptionStartUndefined: Self = StObject.set(x, "eventsSinceSubscriptionStart", js.undefined)
    
    inline def setNotificationEvent(value: js.Array[SubscriptionStatusNotificationEvent]): Self = StObject.set(x, "notificationEvent", value.asInstanceOf[js.Any])
    
    inline def setNotificationEventUndefined: Self = StObject.set(x, "notificationEvent", js.undefined)
    
    inline def setNotificationEventVarargs(value: SubscriptionStatusNotificationEvent*): Self = StObject.set(x, "notificationEvent", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SubscriptionStatus): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: requested | active | error | off): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubscription(value: Reference): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setType(value: handshake | heartbeat | `event-notification` | `query-status` | `query-event`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_eventsSinceSubscriptionStart(value: Element): Self = StObject.set(x, "_eventsSinceSubscriptionStart", value.asInstanceOf[js.Any])
    
    inline def set_eventsSinceSubscriptionStartUndefined: Self = StObject.set(x, "_eventsSinceSubscriptionStart", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_topic(value: Element): Self = StObject.set(x, "_topic", value.asInstanceOf[js.Any])
    
    inline def set_topicUndefined: Self = StObject.set(x, "_topic", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
