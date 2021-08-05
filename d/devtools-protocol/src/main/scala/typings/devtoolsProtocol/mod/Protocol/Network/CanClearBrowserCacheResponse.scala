package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanClearBrowserCacheResponse extends StObject {
  
  /**
    * True if browser cache can be cleared.
    */
  var result: Boolean
}
object CanClearBrowserCacheResponse {
  
  inline def apply(result: Boolean): CanClearBrowserCacheResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanClearBrowserCacheResponse]
  }
  
  extension [Self <: CanClearBrowserCacheResponse](x: Self) {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
