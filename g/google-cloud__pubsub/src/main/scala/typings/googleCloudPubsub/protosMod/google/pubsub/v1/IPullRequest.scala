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
  
  inline def apply(): IPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPullRequest]
  }
  
  extension [Self <: IPullRequest](x: Self) {
    
    inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxMessagesNull: Self = StObject.set(x, "maxMessages", null)
    
    inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    inline def setReturnImmediately(value: Boolean): Self = StObject.set(x, "returnImmediately", value.asInstanceOf[js.Any])
    
    inline def setReturnImmediatelyNull: Self = StObject.set(x, "returnImmediately", null)
    
    inline def setReturnImmediatelyUndefined: Self = StObject.set(x, "returnImmediately", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
