package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1RegisterSubscriberRequest extends StObject {
  
  /**
    * Required. Service account that provides subscriber access to the registered topic.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1RegisterSubscriberRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1RegisterSubscriberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1RegisterSubscriberRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1RegisterSubscriberRequest](x: Self) {
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
