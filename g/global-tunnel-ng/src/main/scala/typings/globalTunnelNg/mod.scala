package typings.globalTunnelNg

import org.scalablytyped.runtime.StringDictionary
import typings.globalTunnelNg.globalTunnelNgStrings.both
import typings.globalTunnelNg.globalTunnelNgStrings.httpColon
import typings.globalTunnelNg.globalTunnelNgStrings.https
import typings.globalTunnelNg.globalTunnelNgStrings.httpsColon
import typings.globalTunnelNg.globalTunnelNgStrings.neither
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("global-tunnel-ng", "end")
  @js.native
  def end(): Unit = js.native
  
  @JSImport("global-tunnel-ng", "initialize")
  @js.native
  def initialize(): Unit = js.native
  @JSImport("global-tunnel-ng", "initialize")
  @js.native
  def initialize(options: String): Unit = js.native
  @JSImport("global-tunnel-ng", "initialize")
  @js.native
  def initialize(options: Options): Unit = js.native
  
  @JSImport("global-tunnel-ng", "isProxying")
  @js.native
  val isProxying: Boolean = js.native
  
  @JSImport("global-tunnel-ng", "proxyConfig")
  @js.native
  val proxyConfig: Options | Null = js.native
  
  @JSImport("global-tunnel-ng", "proxyUrl")
  @js.native
  val proxyUrl: String | Null = js.native
  
  @js.native
  trait Options extends StObject {
    
    var connect: js.UndefOr[neither | https | both] = js.native
    
    var host: String = js.native
    
    var originHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var port: Double = js.native
    
    var protocol: js.UndefOr[httpColon | httpsColon] = js.native
    
    var proxyAuth: js.UndefOr[String] = js.native
    
    var proxyHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var sockets: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(host: String, port: Double): Options = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: neither | https | both): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginHttpsOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "originHttpsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginHttpsOptionsUndefined: Self = StObject.set(x, "originHttpsOptions", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: httpColon | httpsColon): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setProxyAuth(value: String): Self = StObject.set(x, "proxyAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyAuthUndefined: Self = StObject.set(x, "proxyAuth", js.undefined)
      
      @scala.inline
      def setProxyHttpsOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "proxyHttpsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyHttpsOptionsUndefined: Self = StObject.set(x, "proxyHttpsOptions", js.undefined)
      
      @scala.inline
      def setSockets(value: Double): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketsUndefined: Self = StObject.set(x, "sockets", js.undefined)
    }
  }
}
