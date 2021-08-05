package typings.elasticsearch.mod

import org.scalablytyped.runtime.Instantiable2
import typings.elasticsearch.httpMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigOptions extends StObject {
  
  var apiVersion: js.UndefOr[String] = js.undefined
  
  var connectionClass: js.UndefOr[String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^])] = js.undefined
  
  var createNodeAgent: js.UndefOr[js.Any] = js.undefined
  
  var deadTimeout: js.UndefOr[Double] = js.undefined
  
  var defer: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var host: js.UndefOr[js.Any] = js.undefined
  
  var hosts: js.UndefOr[js.Any] = js.undefined
  
  var httpAuth: js.UndefOr[String] = js.undefined
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[js.Any] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var maxSockets: js.UndefOr[Double] = js.undefined
  
  var nodesToHostCallback: js.UndefOr[js.Any] = js.undefined
  
  var pingTimeout: js.UndefOr[Double] = js.undefined
  
  var plugins: js.UndefOr[js.Any] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
  
  var selector: js.UndefOr[js.Any] = js.undefined
  
  var sniffInterval: js.UndefOr[Double] = js.undefined
  
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined
  
  var sniffOnStart: js.UndefOr[Boolean] = js.undefined
  
  var sniffedNodesProtocol: js.UndefOr[String] = js.undefined
  
  var ssl: js.UndefOr[js.Object] = js.undefined
  
  var suggestCompression: js.UndefOr[Boolean] = js.undefined
}
object ConfigOptions {
  
  inline def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  extension [Self <: ConfigOptions](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setConnectionClass(value: String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^])): Self = StObject.set(x, "connectionClass", value.asInstanceOf[js.Any])
    
    inline def setConnectionClassUndefined: Self = StObject.set(x, "connectionClass", js.undefined)
    
    inline def setCreateNodeAgent(value: js.Any): Self = StObject.set(x, "createNodeAgent", value.asInstanceOf[js.Any])
    
    inline def setCreateNodeAgentUndefined: Self = StObject.set(x, "createNodeAgent", js.undefined)
    
    inline def setDeadTimeout(value: Double): Self = StObject.set(x, "deadTimeout", value.asInstanceOf[js.Any])
    
    inline def setDeadTimeoutUndefined: Self = StObject.set(x, "deadTimeout", js.undefined)
    
    inline def setDefer(value: () => Unit): Self = StObject.set(x, "defer", js.Any.fromFunction0(value))
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setHost(value: js.Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHosts(value: js.Any): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setHttpAuth(value: String): Self = StObject.set(x, "httpAuth", value.asInstanceOf[js.Any])
    
    inline def setHttpAuthUndefined: Self = StObject.set(x, "httpAuth", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    
    inline def setNodesToHostCallback(value: js.Any): Self = StObject.set(x, "nodesToHostCallback", value.asInstanceOf[js.Any])
    
    inline def setNodesToHostCallbackUndefined: Self = StObject.set(x, "nodesToHostCallback", js.undefined)
    
    inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
    
    inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
    
    inline def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setSelector(value: js.Any): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSniffInterval(value: Double): Self = StObject.set(x, "sniffInterval", value.asInstanceOf[js.Any])
    
    inline def setSniffIntervalUndefined: Self = StObject.set(x, "sniffInterval", js.undefined)
    
    inline def setSniffOnConnectionFault(value: Boolean): Self = StObject.set(x, "sniffOnConnectionFault", value.asInstanceOf[js.Any])
    
    inline def setSniffOnConnectionFaultUndefined: Self = StObject.set(x, "sniffOnConnectionFault", js.undefined)
    
    inline def setSniffOnStart(value: Boolean): Self = StObject.set(x, "sniffOnStart", value.asInstanceOf[js.Any])
    
    inline def setSniffOnStartUndefined: Self = StObject.set(x, "sniffOnStart", js.undefined)
    
    inline def setSniffedNodesProtocol(value: String): Self = StObject.set(x, "sniffedNodesProtocol", value.asInstanceOf[js.Any])
    
    inline def setSniffedNodesProtocolUndefined: Self = StObject.set(x, "sniffedNodesProtocol", js.undefined)
    
    inline def setSsl(value: js.Object): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setSuggestCompression(value: Boolean): Self = StObject.set(x, "suggestCompression", value.asInstanceOf[js.Any])
    
    inline def setSuggestCompressionUndefined: Self = StObject.set(x, "suggestCompression", js.undefined)
  }
}
