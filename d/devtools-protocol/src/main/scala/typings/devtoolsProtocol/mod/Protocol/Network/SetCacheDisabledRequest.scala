package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCacheDisabledRequest extends StObject {
  
  /**
    * Cache disabled state.
    */
  var cacheDisabled: Boolean
}
object SetCacheDisabledRequest {
  
  inline def apply(cacheDisabled: Boolean): SetCacheDisabledRequest = {
    val __obj = js.Dynamic.literal(cacheDisabled = cacheDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCacheDisabledRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetCacheDisabledRequest] (val x: Self) extends AnyVal {
    
    inline def setCacheDisabled(value: Boolean): Self = StObject.set(x, "cacheDisabled", value.asInstanceOf[js.Any])
  }
}
