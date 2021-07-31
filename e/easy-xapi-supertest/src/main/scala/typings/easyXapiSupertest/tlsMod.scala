package typings.easyXapiSupertest

import typings.easyXapiSupertest.anon.Address
import typings.easyXapiSupertest.anon.Ca
import typings.easyXapiSupertest.anon.Name
import typings.easyXapiSupertest.cryptoMod.Credentials
import typings.easyXapiSupertest.netMod.Socket
import typings.easyXapiSupertest.streamMod.Duplex
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tlsMod {
  
  @JSImport("tls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def connect(options: TlsOptions): ClearTextStream = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(options: TlsOptions, secureConnectionListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double): ClearTextStream = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, host: String): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, host: String, options: Unit, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, host: String, options: ConnectionOptions): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, host: Unit, options: Unit, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, host: Unit, options: ConnectionOptions): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, host: Unit, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, options: Unit, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, options: ConnectionOptions): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  @scala.inline
  def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  
  @scala.inline
  def createSecureContext(details: SecureContextOptions): SecureContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")(details.asInstanceOf[js.Any]).asInstanceOf[SecureContext]
  
  @scala.inline
  def createSecurePair(): SecurePair = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")().asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Unit, isServer: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Unit, isServer: Boolean, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Unit, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Unit, isServer: Boolean, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Unit, isServer: Unit, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Unit, isServer: Unit, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Unit, isServer: Unit, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Credentials): SecurePair = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any]).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Credentials, isServer: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Credentials, isServer: Unit, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Credentials, isServer: Unit, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: Credentials, isServer: Unit, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  
  @scala.inline
  def createServer(options: TlsOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(
    options: TlsOptions,
    secureConnectionListener: js.Function1[/* cleartextStream */ ClearTextStream, Unit]
  ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @js.native
  trait ClearTextStream extends Duplex {
    
    var address: Address = js.native
    
    var authorizationError: Error = js.native
    
    var authorized: Boolean = js.native
    
    var getCipher: Name = js.native
    
    def getPeerCertificate(): js.Any = js.native
    
    var remoteAddress: String = js.native
    
    var remotePort: Double = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    var NPNProtocols: js.UndefOr[js.Any] = js.undefined
    
    //string | Buffer
    var ca: js.UndefOr[js.Any] = js.undefined
    
    var cert: js.UndefOr[js.Any] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    //string | Buffer
    var key: js.UndefOr[js.Any] = js.undefined
    
    //string | Buffer
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[js.Any] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    //Array of string | Buffer
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    //Array of string | Buffer
    var servername: js.UndefOr[String] = js.undefined
    
    var socket: js.UndefOr[Socket] = js.undefined
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCert(value: js.Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
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
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait SecureContext extends StObject {
    
    var context: js.Any
  }
  object SecureContext {
    
    @scala.inline
    def apply(context: js.Any): SecureContext = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecureContext]
    }
    
    @scala.inline
    implicit class SecureContextMutableBuilder[Self <: SecureContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecureContextOptions extends StObject {
    
    // string | buffer
    var ca: js.UndefOr[js.Any] = js.undefined
    
    var cert: js.UndefOr[js.Any] = js.undefined
    
    // string | string[]
    var ciphers: js.UndefOr[String] = js.undefined
    
    // string | buffer
    var crl: js.UndefOr[js.Any] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    //string | buffer
    var key: js.UndefOr[js.Any] = js.undefined
    
    //string | buffer
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[js.Any] = js.undefined
  }
  object SecureContextOptions {
    
    @scala.inline
    def apply(): SecureContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecureContextOptions]
    }
    
    @scala.inline
    implicit class SecureContextOptionsMutableBuilder[Self <: SecureContextOptions] (val x: Self) extends AnyVal {
      
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
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPfx(value: js.Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    }
  }
  
  trait SecurePair extends StObject {
    
    var cleartext: js.Any
    
    var encrypted: js.Any
  }
  object SecurePair {
    
    @scala.inline
    def apply(cleartext: js.Any, encrypted: js.Any): SecurePair = {
      val __obj = js.Dynamic.literal(cleartext = cleartext.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurePair]
    }
    
    @scala.inline
    implicit class SecurePairMutableBuilder[Self <: SecurePair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleartext(value: js.Any): Self = StObject.set(x, "cleartext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: js.Any): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Server
    extends typings.easyXapiSupertest.netMod.Server {
    
    def addContext(hostName: String, credentials: Ca): Unit = js.native
    
    def listen(port: Double, host: String, callback: js.Function): Server = js.native
    def listen(port: Double, host: Unit, callback: js.Function): Server = js.native
  }
  
  trait TlsOptions extends StObject {
    
    var NPNProtocols: js.UndefOr[js.Any] = js.undefined
    
    //array or Buffer;
    var SNICallback: js.UndefOr[js.Function1[/* servername */ String, js.Any]] = js.undefined
    
    var ca: js.UndefOr[js.Any] = js.undefined
    
    var cert: js.UndefOr[js.Any] = js.undefined
    
    //string or string array
    var ciphers: js.UndefOr[String] = js.undefined
    
    //string or buffer
    var crl: js.UndefOr[js.Any] = js.undefined
    
    var honorCipherOrder: js.UndefOr[js.Any] = js.undefined
    
    //string or buffer
    var key: js.UndefOr[js.Any] = js.undefined
    
    //string or buffer
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[js.Any] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var requestCert: js.UndefOr[Boolean] = js.undefined
  }
  object TlsOptions {
    
    @scala.inline
    def apply(): TlsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TlsOptions]
    }
    
    @scala.inline
    implicit class TlsOptionsMutableBuilder[Self <: TlsOptions] (val x: Self) extends AnyVal {
      
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
      def setHonorCipherOrder(value: js.Any): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
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
      def setSNICallback(value: /* servername */ String => js.Any): Self = StObject.set(x, "SNICallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSNICallbackUndefined: Self = StObject.set(x, "SNICallback", js.undefined)
    }
  }
}
