package typings.expressStatusMonitor

import typings.express.mod.RequestHandler
import typings.expressStatusMonitor.anon.Cpu
import typings.socketIo.mod.Server
import typings.socketIo.typedEventsMod.DefaultEventsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(config: ExpressStatusMonitorConfig): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-status-monitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ExpressStatusMonitorConfig extends StObject {
    
    var chartVisibility: js.UndefOr[Cpu] = js.undefined
    
    var healthChecks: js.UndefOr[js.Array[HealthCheck]] = js.undefined
    
    var ignoreStartsWith: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    // References a socket.io instance
    var spans: js.UndefOr[js.Array[RetentionSpan]] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var websocket: js.UndefOr[(Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]) | Null] = js.undefined
  }
  object ExpressStatusMonitorConfig {
    
    inline def apply(): ExpressStatusMonitorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressStatusMonitorConfig]
    }
    
    extension [Self <: ExpressStatusMonitorConfig](x: Self) {
      
      inline def setChartVisibility(value: Cpu): Self = StObject.set(x, "chartVisibility", value.asInstanceOf[js.Any])
      
      inline def setChartVisibilityUndefined: Self = StObject.set(x, "chartVisibility", js.undefined)
      
      inline def setHealthChecks(value: js.Array[HealthCheck]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
      
      inline def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
      
      inline def setHealthChecksVarargs(value: HealthCheck*): Self = StObject.set(x, "healthChecks", js.Array(value*))
      
      inline def setIgnoreStartsWith(value: String): Self = StObject.set(x, "ignoreStartsWith", value.asInstanceOf[js.Any])
      
      inline def setIgnoreStartsWithUndefined: Self = StObject.set(x, "ignoreStartsWith", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setSpans(value: js.Array[RetentionSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
      
      inline def setSpansUndefined: Self = StObject.set(x, "spans", js.undefined)
      
      inline def setSpansVarargs(value: RetentionSpan*): Self = StObject.set(x, "spans", js.Array(value*))
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWebsocket(value: Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      inline def setWebsocketNull: Self = StObject.set(x, "websocket", null)
      
      inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    }
  }
  
  trait HealthCheck extends StObject {
    
    var host: String
    
    var path: String
    
    var port: String | Double
    
    var protocol: String
  }
  object HealthCheck {
    
    inline def apply(host: String, path: String, port: String | Double, protocol: String): HealthCheck = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[HealthCheck]
    }
    
    extension [Self <: HealthCheck](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetentionSpan extends StObject {
    
    var interval: Double
    
    var retention: Double
  }
  object RetentionSpan {
    
    inline def apply(interval: Double, retention: Double): RetentionSpan = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], retention = retention.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetentionSpan]
    }
    
    extension [Self <: RetentionSpan](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setRetention(value: Double): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    }
  }
}
