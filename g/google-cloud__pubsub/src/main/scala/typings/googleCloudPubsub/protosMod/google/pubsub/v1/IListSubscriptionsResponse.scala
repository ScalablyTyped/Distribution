package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSubscriptionsResponse. */
@js.native
trait IListSubscriptionsResponse extends StObject {
  
  /** ListSubscriptionsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
  
  /** ListSubscriptionsResponse subscriptions */
  var subscriptions: js.UndefOr[js.Array[ISubscription] | Null] = js.native
}
object IListSubscriptionsResponse {
  
  @scala.inline
  def apply(): IListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSubscriptionsResponse]
  }
  
  @scala.inline
  implicit class IListSubscriptionsResponseMutableBuilder[Self <: IListSubscriptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: js.Array[ISubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: ISubscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
