package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListTopicSubscriptionsRequest. */
trait IListTopicSubscriptionsRequest extends StObject {
  
  /** ListTopicSubscriptionsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListTopicSubscriptionsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListTopicSubscriptionsRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object IListTopicSubscriptionsRequest {
  
  inline def apply(): IListTopicSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicSubscriptionsRequest]
  }
  
  extension [Self <: IListTopicSubscriptionsRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
