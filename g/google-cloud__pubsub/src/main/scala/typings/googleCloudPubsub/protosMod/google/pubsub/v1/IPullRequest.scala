package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PullRequest. */
trait IPullRequest extends StObject {
  
  /** PullRequest maxMessages */
  var maxMessages: js.UndefOr[Double | Null] = js.undefined
  
  /** PullRequest returnImmediately */
  var returnImmediately: js.UndefOr[Boolean | Null] = js.undefined
  
  /** PullRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object IPullRequest {
  
  @scala.inline
  def apply(): IPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPullRequest]
  }
  
  @scala.inline
  implicit class IPullRequestMutableBuilder[Self <: IPullRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessagesNull: Self = StObject.set(x, "maxMessages", null)
    
    @scala.inline
    def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    @scala.inline
    def setReturnImmediately(value: Boolean): Self = StObject.set(x, "returnImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnImmediatelyNull: Self = StObject.set(x, "returnImmediately", null)
    
    @scala.inline
    def setReturnImmediatelyUndefined: Self = StObject.set(x, "returnImmediately", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
