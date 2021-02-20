package typings.elasticsearch.mod

import org.scalablytyped.runtime.Instantiable2
import typings.elasticsearch.httpMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends StObject {
  
  var apiVersion: js.UndefOr[String] = js.native
  
  var connectionClass: js.UndefOr[String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^])] = js.native
  
  var createNodeAgent: js.UndefOr[js.Any] = js.native
  
  var deadTimeout: js.UndefOr[Double] = js.native
  
  var defer: js.UndefOr[js.Function0[Unit]] = js.native
  
  var host: js.UndefOr[js.Any] = js.native
  
  var hosts: js.UndefOr[js.Any] = js.native
  
  var httpAuth: js.UndefOr[String] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var log: js.UndefOr[js.Any] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var maxSockets: js.UndefOr[Double] = js.native
  
  var nodesToHostCallback: js.UndefOr[js.Any] = js.native
  
  var pingTimeout: js.UndefOr[Double] = js.native
  
  var plugins: js.UndefOr[js.Any] = js.native
  
  var requestTimeout: js.UndefOr[Double] = js.native
  
  var selector: js.UndefOr[js.Any] = js.native
  
  var sniffInterval: js.UndefOr[Double] = js.native
  
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.native
  
  var sniffOnStart: js.UndefOr[Boolean] = js.native
  
  var sniffedNodesProtocol: js.UndefOr[String] = js.native
  
  var ssl: js.UndefOr[js.Object] = js.native
  
  var suggestCompression: js.UndefOr[Boolean] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setConnectionClass(value: String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^])): Self = StObject.set(x, "connectionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionClassUndefined: Self = StObject.set(x, "connectionClass", js.undefined)
    
    @scala.inline
    def setCreateNodeAgent(value: js.Any): Self = StObject.set(x, "createNodeAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateNodeAgentUndefined: Self = StObject.set(x, "createNodeAgent", js.undefined)
    
    @scala.inline
    def setDeadTimeout(value: Double): Self = StObject.set(x, "deadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadTimeoutUndefined: Self = StObject.set(x, "deadTimeout", js.undefined)
    
    @scala.inline
    def setDefer(value: () => Unit): Self = StObject.set(x, "defer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    @scala.inline
    def setHost(value: js.Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHosts(value: js.Any): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    @scala.inline
    def setHttpAuth(value: String): Self = StObject.set(x, "httpAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpAuthUndefined: Self = StObject.set(x, "httpAuth", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    
    @scala.inline
    def setNodesToHostCallback(value: js.Any): Self = StObject.set(x, "nodesToHostCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesToHostCallbackUndefined: Self = StObject.set(x, "nodesToHostCallback", js.undefined)
    
    @scala.inline
    def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    @scala.inline
    def setSelector(value: js.Any): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSniffInterval(value: Double): Self = StObject.set(x, "sniffInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSniffIntervalUndefined: Self = StObject.set(x, "sniffInterval", js.undefined)
    
    @scala.inline
    def setSniffOnConnectionFault(value: Boolean): Self = StObject.set(x, "sniffOnConnectionFault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSniffOnConnectionFaultUndefined: Self = StObject.set(x, "sniffOnConnectionFault", js.undefined)
    
    @scala.inline
    def setSniffOnStart(value: Boolean): Self = StObject.set(x, "sniffOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSniffOnStartUndefined: Self = StObject.set(x, "sniffOnStart", js.undefined)
    
    @scala.inline
    def setSniffedNodesProtocol(value: String): Self = StObject.set(x, "sniffedNodesProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSniffedNodesProtocolUndefined: Self = StObject.set(x, "sniffedNodesProtocol", js.undefined)
    
    @scala.inline
    def setSsl(value: js.Object): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setSuggestCompression(value: Boolean): Self = StObject.set(x, "suggestCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestCompressionUndefined: Self = StObject.set(x, "suggestCompression", js.undefined)
  }
}
