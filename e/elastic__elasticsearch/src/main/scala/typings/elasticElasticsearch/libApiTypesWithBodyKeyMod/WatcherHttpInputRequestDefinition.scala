package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHttpInputRequestDefinition extends StObject {
  
  var auth: js.UndefOr[WatcherHttpInputAuthentication] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var connection_timeout: js.UndefOr[Duration] = js.undefined
  
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  var host: js.UndefOr[Host] = js.undefined
  
  var method: js.UndefOr[WatcherHttpInputMethod] = js.undefined
  
  var params: js.UndefOr[Record[String, String]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[uint] = js.undefined
  
  var proxy: js.UndefOr[WatcherHttpInputProxy] = js.undefined
  
  var read_timeout: js.UndefOr[Duration] = js.undefined
  
  var scheme: js.UndefOr[WatcherConnectionScheme] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object WatcherHttpInputRequestDefinition {
  
  inline def apply(): WatcherHttpInputRequestDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherHttpInputRequestDefinition]
  }
  
  extension [Self <: WatcherHttpInputRequestDefinition](x: Self) {
    
    inline def setAuth(value: WatcherHttpInputAuthentication): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setConnection_timeout(value: Duration): Self = StObject.set(x, "connection_timeout", value.asInstanceOf[js.Any])
    
    inline def setConnection_timeoutUndefined: Self = StObject.set(x, "connection_timeout", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setMethod(value: WatcherHttpInputMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParams(value: Record[String, String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: uint): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProxy(value: WatcherHttpInputProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRead_timeout(value: Duration): Self = StObject.set(x, "read_timeout", value.asInstanceOf[js.Any])
    
    inline def setRead_timeoutUndefined: Self = StObject.set(x, "read_timeout", js.undefined)
    
    inline def setScheme(value: WatcherConnectionScheme): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
