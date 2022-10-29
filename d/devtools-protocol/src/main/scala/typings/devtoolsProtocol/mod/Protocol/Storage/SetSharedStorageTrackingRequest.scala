package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSharedStorageTrackingRequest extends StObject {
  
  var enable: Boolean
}
object SetSharedStorageTrackingRequest {
  
  inline def apply(enable: Boolean): SetSharedStorageTrackingRequest = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSharedStorageTrackingRequest]
  }
  
  extension [Self <: SetSharedStorageTrackingRequest](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
  }
}
