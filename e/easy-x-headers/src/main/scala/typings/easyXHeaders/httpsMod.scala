package typings.easyXHeaders

import typings.easyXHeaders.httpMod.ClientRequest
import typings.easyXHeaders.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpsMod {
  
  @JSImport("https", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("https", "Agent")
  @js.native
  class AgentCls () extends Agent {
    def this(options: RequestOptions) = this()
  }
  
  @JSImport("https", "createServer")
  @js.native
  def createServer(options: ServerOptions): Server = js.native
  @JSImport("https", "createServer")
  @js.native
  def createServer(options: ServerOptions, requestListener: js.Function): Server = js.native
  
  @JSImport("https", "get")
  @js.native
  def get(options: RequestOptions): ClientRequest = js.native
  @JSImport("https", "get")
  @js.native
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  
  @JSImport("https", "globalAgent")
  @js.native
  def globalAgent: Agent = js.native
  @scala.inline
  def globalAgent_=(x: Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @JSImport("https", "request")
  @js.native
  def request(options: RequestOptions): ClientRequest = js.native
  @JSImport("https", "request")
  @js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  
  @js.native
  trait Agent extends StObject {
    
    var maxSockets: Double = js.native
    
    var requests: js.Any = js.native
    
    var sockets: js.Any = js.native
  }
  object Agent {
    
    @scala.inline
    def apply(maxSockets: Double, requests: js.Any, sockets: js.Any): Agent = {
      val __obj = js.Dynamic.literal(maxSockets = maxSockets.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent]
    }
    
    @scala.inline
    implicit class AgentMutableBuilder[Self <: Agent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequests(value: js.Any): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockets(value: js.Any): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    var agent: js.UndefOr[js.Any] = js.native
    
    var auth: js.UndefOr[String] = js.native
    
    var ca: js.UndefOr[js.Any] = js.native
    
    var cert: js.UndefOr[js.Any] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[js.Any] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pfx: js.UndefOr[js.Any] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCert(value: js.Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPfx(value: js.Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  type Server = typings.easyXHeaders.tlsMod.Server
  
  @js.native
  trait ServerOptions extends StObject {
    
    var NPNProtocols: js.UndefOr[js.Any] = js.native
    
    var SNICallback: js.UndefOr[js.Function1[/* servername */ String, _]] = js.native
    
    var ca: js.UndefOr[js.Any] = js.native
    
    var cert: js.UndefOr[js.Any] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var crl: js.UndefOr[js.Any] = js.native
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[js.Any] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var pfx: js.UndefOr[js.Any] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var requestCert: js.UndefOr[Boolean] = js.native
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCert(value: js.Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setCrl(value: js.Any): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      @scala.inline
      def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNPNProtocols(value: js.Any): Self = StObject.set(x, "NPNProtocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNPNProtocolsUndefined: Self = StObject.set(x, "NPNProtocols", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPfx(value: js.Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
      
      @scala.inline
      def setSNICallback(value: /* servername */ String => _): Self = StObject.set(x, "SNICallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSNICallbackUndefined: Self = StObject.set(x, "SNICallback", js.undefined)
    }
  }
}
