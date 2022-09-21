package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListSubscribersResponse extends StObject {
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of service accounts which have subscriber access to the topic.
    */
  var serviceAccounts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Name of the topic registered with the reseller.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ListSubscribersResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListSubscribersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListSubscribersResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListSubscribersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountsNull: Self = StObject.set(x, "serviceAccounts", null)
    
    inline def setServiceAccountsUndefined: Self = StObject.set(x, "serviceAccounts", js.undefined)
    
    inline def setServiceAccountsVarargs(value: String*): Self = StObject.set(x, "serviceAccounts", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
