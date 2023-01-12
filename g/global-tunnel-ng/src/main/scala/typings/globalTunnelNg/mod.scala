package typings.globalTunnelNg

import org.scalablytyped.runtime.StringDictionary
import typings.globalTunnelNg.globalTunnelNgStrings.both
import typings.globalTunnelNg.globalTunnelNgStrings.httpColon
import typings.globalTunnelNg.globalTunnelNgStrings.https
import typings.globalTunnelNg.globalTunnelNgStrings.httpsColon
import typings.globalTunnelNg.globalTunnelNgStrings.neither
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("global-tunnel-ng", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def end(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[Unit]
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  inline def initialize(options: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initialize(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("global-tunnel-ng", "isProxying")
  @js.native
  val isProxying: Boolean = js.native
  
  @JSImport("global-tunnel-ng", "proxyConfig")
  @js.native
  val proxyConfig: Options | Null = js.native
  
  @JSImport("global-tunnel-ng", "proxyUrl")
  @js.native
  val proxyUrl: String | Null = js.native
  
  trait Options extends StObject {
    
    var connect: js.UndefOr[neither | https | both] = js.undefined
    
    var host: String
    
    var originHttpsOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var port: Double
    
    var protocol: js.UndefOr[httpColon | httpsColon] = js.undefined
    
    var proxyAuth: js.UndefOr[String] = js.undefined
    
    var proxyHttpsOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var sockets: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(host: String, port: Double): Options = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: neither | https | both): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOriginHttpsOptions(value: StringDictionary[Any]): Self = StObject.set(x, "originHttpsOptions", value.asInstanceOf[js.Any])
      
      inline def setOriginHttpsOptionsUndefined: Self = StObject.set(x, "originHttpsOptions", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: httpColon | httpsColon): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProxyAuth(value: String): Self = StObject.set(x, "proxyAuth", value.asInstanceOf[js.Any])
      
      inline def setProxyAuthUndefined: Self = StObject.set(x, "proxyAuth", js.undefined)
      
      inline def setProxyHttpsOptions(value: StringDictionary[Any]): Self = StObject.set(x, "proxyHttpsOptions", value.asInstanceOf[js.Any])
      
      inline def setProxyHttpsOptionsUndefined: Self = StObject.set(x, "proxyHttpsOptions", js.undefined)
      
      inline def setSockets(value: Double): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
      
      inline def setSocketsUndefined: Self = StObject.set(x, "sockets", js.undefined)
    }
  }
}
