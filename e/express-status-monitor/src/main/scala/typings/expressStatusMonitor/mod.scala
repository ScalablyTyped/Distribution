package typings.expressStatusMonitor

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressStatusMonitor.anon.Cpu
import typings.socketIo.mod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(config: ExpressStatusMonitorConfig): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
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
    
    var websocket: js.UndefOr[Server | Null] = js.undefined
  }
  object ExpressStatusMonitorConfig {
    
    @scala.inline
    def apply(): ExpressStatusMonitorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressStatusMonitorConfig]
    }
    
    @scala.inline
    implicit class ExpressStatusMonitorConfigMutableBuilder[Self <: ExpressStatusMonitorConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChartVisibility(value: Cpu): Self = StObject.set(x, "chartVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartVisibilityUndefined: Self = StObject.set(x, "chartVisibility", js.undefined)
      
      @scala.inline
      def setHealthChecks(value: js.Array[HealthCheck]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
      
      @scala.inline
      def setHealthChecksVarargs(value: HealthCheck*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreStartsWith(value: String): Self = StObject.set(x, "ignoreStartsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreStartsWithUndefined: Self = StObject.set(x, "ignoreStartsWith", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setSpans(value: js.Array[RetentionSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpansUndefined: Self = StObject.set(x, "spans", js.undefined)
      
      @scala.inline
      def setSpansVarargs(value: RetentionSpan*): Self = StObject.set(x, "spans", js.Array(value :_*))
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWebsocket(value: Server): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsocketNull: Self = StObject.set(x, "websocket", null)
      
      @scala.inline
      def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    }
  }
  
  trait HealthCheck extends StObject {
    
    var host: String
    
    var path: String
    
    var port: String | Double
    
    var protocol: String
  }
  object HealthCheck {
    
    @scala.inline
    def apply(host: String, path: String, port: String | Double, protocol: String): HealthCheck = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[HealthCheck]
    }
    
    @scala.inline
    implicit class HealthCheckMutableBuilder[Self <: HealthCheck] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetentionSpan extends StObject {
    
    var interval: Double
    
    var retention: Double
  }
  object RetentionSpan {
    
    @scala.inline
    def apply(interval: Double, retention: Double): RetentionSpan = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], retention = retention.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetentionSpan]
    }
    
    @scala.inline
    implicit class RetentionSpanMutableBuilder[Self <: RetentionSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetention(value: Double): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    }
  }
}
