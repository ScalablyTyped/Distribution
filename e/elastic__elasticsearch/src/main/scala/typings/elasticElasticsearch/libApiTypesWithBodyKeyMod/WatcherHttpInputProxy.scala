package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHttpInputProxy extends StObject {
  
  var host: Host
  
  var port: uint
}
object WatcherHttpInputProxy {
  
  inline def apply(host: Host, port: uint): WatcherHttpInputProxy = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherHttpInputProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherHttpInputProxy] (val x: Self) extends AnyVal {
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: uint): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
