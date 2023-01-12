package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexRemoteSource extends StObject {
  
  var connect_timeout: js.UndefOr[Duration] = js.undefined
  
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  var host: Host
  
  var password: js.UndefOr[Password] = js.undefined
  
  var socket_timeout: js.UndefOr[Duration] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object ReindexRemoteSource {
  
  inline def apply(host: Host): ReindexRemoteSource = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRemoteSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReindexRemoteSource] (val x: Self) extends AnyVal {
    
    inline def setConnect_timeout(value: Duration): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
    
    inline def setConnect_timeoutUndefined: Self = StObject.set(x, "connect_timeout", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSocket_timeout(value: Duration): Self = StObject.set(x, "socket_timeout", value.asInstanceOf[js.Any])
    
    inline def setSocket_timeoutUndefined: Self = StObject.set(x, "socket_timeout", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
