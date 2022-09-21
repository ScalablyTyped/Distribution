package typings.fhir.mod

import typings.fhir.fhirStrings.active
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
  
  var _criteria: js.UndefOr[Element] = js.undefined
  
  var _end: js.UndefOr[Element] = js.undefined
  
  var _error: js.UndefOr[Element] = js.undefined
  
  var _reason: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Details where to send notifications when resources are received that meet the criteria.
    */
  var channel: SubscriptionChannel
  
  /**
    * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * The rules that the server should use to determine when to generate notifications for this subscription.
    */
  var criteria: String
  
  /**
    * The time for the server to turn the subscription off.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * A record of the last error that occurred when the server processed a notification.
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * A description of why this subscription is defined.
    */
  var reason: String
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Subscription: typings.fhir.fhirStrings.Subscription
  
  /**
    * The status of the subscription, which marks the server state for managing the subscription.
    */
  var status: requested | active | error | off
  
  /**
    * A tag to add to any resource that matches the criteria, after the subscription is processed.
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.undefined
}
object Subscription {
  
  inline def apply(
    channel: SubscriptionChannel,
    criteria: String,
    reason: String,
    status: requested | active | error | off
  ): Subscription = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resourceType = "Subscription", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setChannel(value: SubscriptionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCriteria(value: String): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Subscription): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: requested | active | error | off): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTag(value: js.Array[Coding]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: Coding*): Self = StObject.set(x, "tag", js.Array(value*))
    
    inline def set_criteria(value: Element): Self = StObject.set(x, "_criteria", value.asInstanceOf[js.Any])
    
    inline def set_criteriaUndefined: Self = StObject.set(x, "_criteria", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_error(value: Element): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
    
    inline def set_errorUndefined: Self = StObject.set(x, "_error", js.undefined)
    
    inline def set_reason(value: Element): Self = StObject.set(x, "_reason", value.asInstanceOf[js.Any])
    
    inline def set_reasonUndefined: Self = StObject.set(x, "_reason", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
