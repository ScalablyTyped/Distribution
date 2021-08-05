package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetNavigatorOverridesRequest extends StObject {
  
  /**
    * The platform navigator.platform should return.
    */
  var platform: String
}
object SetNavigatorOverridesRequest {
  
  inline def apply(platform: String): SetNavigatorOverridesRequest = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigatorOverridesRequest]
  }
  
  extension [Self <: SetNavigatorOverridesRequest](x: Self) {
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
