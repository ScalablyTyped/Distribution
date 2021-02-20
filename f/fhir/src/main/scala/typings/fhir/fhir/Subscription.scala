package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A server push subscription criteria
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Subscription extends DomainResource {
  
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'error'.
    */
  var _error: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'reason'.
    */
  var _reason: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * The channel on which to report matches to the criteria
    */
  var channel: SubscriptionChannel = js.native
  
  /**
    * Contact details for source (e.g. troubleshooting)
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.native
  
  /**
    * Rule for server push criteria
    */
  var criteria: String = js.native
  
  /**
    * When to automatically delete the subscription
    */
  var end: js.UndefOr[instant] = js.native
  
  /**
    * Latest error note
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Description of why this subscription was created
    */
  var reason: String = js.native
  
  /**
    * requested | active | error | off
    */
  var status: code = js.native
  
  /**
    * A tag to add to matching resources
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(channel: SubscriptionChannel, criteria: String, reason: String, status: code): Subscription = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: SubscriptionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setCriteria(value: String): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: instant): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: js.Array[Coding]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: Coding*): Self = StObject.set(x, "tag", js.Array(value :_*))
    
    @scala.inline
    def set_criteria(value: Element): Self = StObject.set(x, "_criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_criteriaUndefined: Self = StObject.set(x, "_criteria", js.undefined)
    
    @scala.inline
    def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    @scala.inline
    def set_error(value: Element): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_errorUndefined: Self = StObject.set(x, "_error", js.undefined)
    
    @scala.inline
    def set_reason(value: Element): Self = StObject.set(x, "_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_reasonUndefined: Self = StObject.set(x, "_reason", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
