package typings.easyXapiSupertest

import typings.easyXapiSupertest.httpMod.ClientRequest
import typings.easyXapiSupertest.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpsMod {
  
  @JSImport("https", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("https", "Agent")
  @js.native
  class AgentCls ()
    extends StObject
       with Agent {
    def this(options: RequestOptions) = this()
    
    /* CompleteClass */
    var maxSockets: Double = js.native
    
    /* CompleteClass */
    var requests: js.Any = js.native
    
    /* CompleteClass */
    var sockets: js.Any = js.native
  }
  
  inline def createServer(options: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createServer(options: ServerOptions, requestListener: js.Function): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], requestListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  inline def get(options: RequestOptions): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  inline def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  @JSImport("https", "globalAgent")
  @js.native
  def globalAgent: Agent = js.native
  inline def globalAgent_=(x: Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  inline def request(options: RequestOptions): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  inline def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  trait Agent extends StObject {
    
    var maxSockets: Double
    
    var requests: js.Any
    
    var sockets: js.Any
  }
  object Agent {
    
    inline def apply(maxSockets: Double, requests: js.Any, sockets: js.Any): Agent = {
      val __obj = js.Dynamic.literal(maxSockets = maxSockets.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent]
    }
    
    extension [Self <: Agent](x: Self) {
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setRequests(value: js.Any): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setSockets(value: js.Any): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOptions extends StObject {
    
    var agent: js.UndefOr[js.Any] = js.undefined
    
    var auth: js.UndefOr[String] = js.undefined
    
    var ca: js.UndefOr[js.Any] = js.undefined
    
    var cert: js.UndefOr[js.Any] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[js.Any] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[js.Any] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCert(value: js.Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPfx(value: js.Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  type Server = typings.easyXapiSupertest.tlsMod.Server
  
  trait ServerOptions extends StObject {
    
    var NPNProtocols: js.UndefOr[js.Any] = js.undefined
    
    var SNICallback: js.UndefOr[js.Function1[/* servername */ String, js.Any]] = js.undefined
    
    var ca: js.UndefOr[js.Any] = js.undefined
    
    var cert: js.UndefOr[js.Any] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var crl: js.UndefOr[js.Any] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[js.Any] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[js.Any] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var requestCert: js.UndefOr[Boolean] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCert(value: js.Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setCrl(value: js.Any): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNPNProtocols(value: js.Any): Self = StObject.set(x, "NPNProtocols", value.asInstanceOf[js.Any])
      
      inline def setNPNProtocolsUndefined: Self = StObject.set(x, "NPNProtocols", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: js.Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
      
      inline def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
      
      inline def setSNICallback(value: /* servername */ String => js.Any): Self = StObject.set(x, "SNICallback", js.Any.fromFunction1(value))
      
      inline def setSNICallbackUndefined: Self = StObject.set(x, "SNICallback", js.undefined)
    }
  }
}
