package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListTopicSubscriptionsRequest. */
@js.native
trait IListTopicSubscriptionsRequest extends StObject {
  
  /** ListTopicSubscriptionsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.native
  
  /** ListTopicSubscriptionsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.native
  
  /** ListTopicSubscriptionsRequest topic */
  var topic: js.UndefOr[String | Null] = js.native
}
object IListTopicSubscriptionsRequest {
  
  @scala.inline
  def apply(): IListTopicSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicSubscriptionsRequest]
  }
  
  @scala.inline
  implicit class IListTopicSubscriptionsRequestMutableBuilder[Self <: IListTopicSubscriptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNull: Self = StObject.set(x, "topic", null)
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
