package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetCacheDisabledRequest extends StObject {
  
  /**
    * Cache disabled state.
    */
  var cacheDisabled: Boolean = js.native
}
object SetCacheDisabledRequest {
  
  @scala.inline
  def apply(cacheDisabled: Boolean): SetCacheDisabledRequest = {
    val __obj = js.Dynamic.literal(cacheDisabled = cacheDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCacheDisabledRequest]
  }
  
  @scala.inline
  implicit class SetCacheDisabledRequestMutableBuilder[Self <: SetCacheDisabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheDisabled(value: Boolean): Self = StObject.set(x, "cacheDisabled", value.asInstanceOf[js.Any])
  }
}
