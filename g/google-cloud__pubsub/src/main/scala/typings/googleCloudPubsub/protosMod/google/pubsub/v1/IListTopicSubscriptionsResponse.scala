package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListTopicSubscriptionsResponse. */
trait IListTopicSubscriptionsResponse extends StObject {
  
  /** ListTopicSubscriptionsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListTopicSubscriptionsResponse subscriptions */
  var subscriptions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IListTopicSubscriptionsResponse {
  
  @scala.inline
  def apply(): IListTopicSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicSubscriptionsResponse]
  }
  
  @scala.inline
  implicit class IListTopicSubscriptionsResponseMutableBuilder[Self <: IListTopicSubscriptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: js.Array[String]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: String*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
