package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1UnregisterSubscriberRequest extends StObject {
  
  /**
    * Required. Service account to unregister from subscriber access to the topic.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1UnregisterSubscriberRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1UnregisterSubscriberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1UnregisterSubscriberRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1UnregisterSubscriberRequest](x: Self) {
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
