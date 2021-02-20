package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AcknowledgeRequest. */
@js.native
trait IAcknowledgeRequest extends StObject {
  
  /** AcknowledgeRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** AcknowledgeRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}
object IAcknowledgeRequest {
  
  @scala.inline
  def apply(): IAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAcknowledgeRequest]
  }
  
  @scala.inline
  implicit class IAcknowledgeRequestMutableBuilder[Self <: IAcknowledgeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdsNull: Self = StObject.set(x, "ackIds", null)
    
    @scala.inline
    def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    @scala.inline
    def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value :_*))
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
