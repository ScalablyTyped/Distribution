package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBrowserContextRequest extends StObject {
  
  /**
    * If specified, disposes this context when debugging session disconnects.
    */
  var disposeOnDetach: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional list of origins to grant unlimited cross-origin access to.
    * Parts of the URL other than those constituting origin are ignored.
    */
  var originsWithUniversalNetworkAccess: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Proxy bypass list, similar to the one passed to --proxy-bypass-list
    */
  var proxyBypassList: js.UndefOr[String] = js.undefined
  
  /**
    * Proxy server, similar to the one passed to --proxy-server
    */
  var proxyServer: js.UndefOr[String] = js.undefined
}
object CreateBrowserContextRequest {
  
  inline def apply(): CreateBrowserContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBrowserContextRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBrowserContextRequest] (val x: Self) extends AnyVal {
    
    inline def setDisposeOnDetach(value: Boolean): Self = StObject.set(x, "disposeOnDetach", value.asInstanceOf[js.Any])
    
    inline def setDisposeOnDetachUndefined: Self = StObject.set(x, "disposeOnDetach", js.undefined)
    
    inline def setOriginsWithUniversalNetworkAccess(value: js.Array[String]): Self = StObject.set(x, "originsWithUniversalNetworkAccess", value.asInstanceOf[js.Any])
    
    inline def setOriginsWithUniversalNetworkAccessUndefined: Self = StObject.set(x, "originsWithUniversalNetworkAccess", js.undefined)
    
    inline def setOriginsWithUniversalNetworkAccessVarargs(value: String*): Self = StObject.set(x, "originsWithUniversalNetworkAccess", js.Array(value*))
    
    inline def setProxyBypassList(value: String): Self = StObject.set(x, "proxyBypassList", value.asInstanceOf[js.Any])
    
    inline def setProxyBypassListUndefined: Self = StObject.set(x, "proxyBypassList", js.undefined)
    
    inline def setProxyServer(value: String): Self = StObject.set(x, "proxyServer", value.asInstanceOf[js.Any])
    
    inline def setProxyServerUndefined: Self = StObject.set(x, "proxyServer", js.undefined)
  }
}
