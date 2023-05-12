package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStorageBucketTrackingRequest extends StObject {
  
  var enable: Boolean
  
  var storageKey: String
}
object SetStorageBucketTrackingRequest {
  
  inline def apply(enable: Boolean, storageKey: String): SetStorageBucketTrackingRequest = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStorageBucketTrackingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetStorageBucketTrackingRequest] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
  }
}
