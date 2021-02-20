package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ModifyAckDeadlineRequest. */
@js.native
trait IModifyAckDeadlineRequest extends StObject {
  
  /** ModifyAckDeadlineRequest ackDeadlineSeconds */
  var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.native
  
  /** ModifyAckDeadlineRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ModifyAckDeadlineRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}
object IModifyAckDeadlineRequest {
  
  @scala.inline
  def apply(): IModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModifyAckDeadlineRequest]
  }
  
  @scala.inline
  implicit class IModifyAckDeadlineRequestMutableBuilder[Self <: IModifyAckDeadlineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckDeadlineSecondsNull: Self = StObject.set(x, "ackDeadlineSeconds", null)
    
    @scala.inline
    def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
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
