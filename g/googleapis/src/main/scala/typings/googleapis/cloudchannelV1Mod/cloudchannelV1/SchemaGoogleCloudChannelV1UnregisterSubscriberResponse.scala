package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1UnregisterSubscriberResponse extends StObject {
  
  /**
    * Name of the topic the service account subscriber access was removed from.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1UnregisterSubscriberResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1UnregisterSubscriberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1UnregisterSubscriberResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1UnregisterSubscriberResponse](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
