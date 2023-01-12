package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInterestGroupTrackingRequest extends StObject {
  
  var enable: Boolean
}
object SetInterestGroupTrackingRequest {
  
  inline def apply(enable: Boolean): SetInterestGroupTrackingRequest = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInterestGroupTrackingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetInterestGroupTrackingRequest] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
  }
}
