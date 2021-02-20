package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanClearBrowserCacheResponse extends StObject {
  
  /**
    * True if browser cache can be cleared.
    */
  var result: Boolean = js.native
}
object CanClearBrowserCacheResponse {
  
  @scala.inline
  def apply(result: Boolean): CanClearBrowserCacheResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanClearBrowserCacheResponse]
  }
  
  @scala.inline
  implicit class CanClearBrowserCacheResponseMutableBuilder[Self <: CanClearBrowserCacheResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
