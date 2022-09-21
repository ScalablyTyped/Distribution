package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1RegisterSubscriberResponse extends StObject {
  
  /**
    * Name of the topic the subscriber will listen to.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1RegisterSubscriberResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1RegisterSubscriberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1RegisterSubscriberResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1RegisterSubscriberResponse](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
