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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tlsMod {
  
  @JSImport("tls", "connect")
  @js.native
  def connect(options: TlsOptions): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(options: TlsOptions, secureConnectionListener: js.Function0[Unit]): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(port: Double): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[Unit]
  ): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(port: Double, host: js.UndefOr[scala.Nothing], options: ConnectionOptions): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    options: ConnectionOptions,
    secureConnectListener: js.Function0[Unit]
  ): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(port: Double, host: String): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(
    port: Double,
    host: String,
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[Unit]
  ): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(port: Double, host: String, options: ConnectionOptions): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(port: Double, options: js.UndefOr[scala.Nothing], secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(port: Double, options: ConnectionOptions): ClearTextStream = js.native
  @JSImport("tls", "connect")
  @js.native
  def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
  
  @JSImport("tls", "createSecureContext")
  @js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
  
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: js.UndefOr[scala.Nothing], requestCert: Boolean): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: Boolean): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: Boolean,
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(credentials: Credentials): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(
    credentials: Credentials,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(credentials: Credentials, isServer: js.UndefOr[scala.Nothing], requestCert: Boolean): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(
    credentials: Credentials,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(credentials: Credentials, isServer: Boolean): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(
    credentials: Credentials,
    isServer: Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  @JSImport("tls", "createSecurePair")
  @js.native
  def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
  
  @JSImport("tls", "createServer")
  @js.native
  def createServer(options: TlsOptions): Server = js.native
  @JSImport("tls", "createServer")
  @js.native
  def createServer(
    options: TlsOptions,
    secureConnectionListener: js.Function1[/* cleartextStream */ ClearTextStream, Unit]
  ): Server = js.native
  
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
  
  @js.native
  trait ConnectionOptions extends StObject {
    
    var NPNProtocols: js.UndefOr[js.Any] = js.native
    
    //string | Buffer
    var ca: js.UndefOr[js.Any] = js.native
    
    var cert: js.UndefOr[js.Any] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    //string | Buffer
    var key: js.UndefOr[js.Any] = js.native
    
    //string | Buffer
    var passphrase: js.UndefOr[String] = js.native
    
    var pfx: js.UndefOr[js.Any] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    //Array of string | Buffer
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    //Array of string | Buffer
    var servername: js.UndefOr[String] = js.native
    
    var socket: js.UndefOr[Socket] = js.native
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
  
  @js.native
  trait SecureContext extends StObject {
    
    var context: js.Any = js.native
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
  
  @js.native
  trait SecureContextOptions extends StObject {
    
    // string | buffer
    var ca: js.UndefOr[js.Any] = js.native
    
    var cert: js.UndefOr[js.Any] = js.native
    
    // string | string[]
    var ciphers: js.UndefOr[String] = js.native
    
    // string | buffer
    var crl: js.UndefOr[js.Any] = js.native
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.native
    
    //string | buffer
    var key: js.UndefOr[js.Any] = js.native
    
    //string | buffer
    var passphrase: js.UndefOr[String] = js.native
    
    var pfx: js.UndefOr[js.Any] = js.native
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
  
  @js.native
  trait SecurePair extends StObject {
    
    var cleartext: js.Any = js.native
    
    var encrypted: js.Any = js.native
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
    
    def listen(port: Double, host: js.UndefOr[scala.Nothing], callback: js.Function): Server = js.native
    def listen(port: Double, host: String, callback: js.Function): Server = js.native
  }
  
  @js.native
  trait TlsOptions extends StObject {
    
    var NPNProtocols: js.UndefOr[js.Any] = js.native
    
    //array or Buffer;
    var SNICallback: js.UndefOr[js.Function1[/* servername */ String, _]] = js.native
    
    var ca: js.UndefOr[js.Any] = js.native
    
    var cert: js.UndefOr[js.Any] = js.native
    
    //string or string array
    var ciphers: js.UndefOr[String] = js.native
    
    //string or buffer
    var crl: js.UndefOr[js.Any] = js.native
    
    var honorCipherOrder: js.UndefOr[js.Any] = js.native
    
    //string or buffer
    var key: js.UndefOr[js.Any] = js.native
    
    //string or buffer
    var passphrase: js.UndefOr[String] = js.native
    
    var pfx: js.UndefOr[js.Any] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var requestCert: js.UndefOr[Boolean] = js.native
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
      def setSNICallback(value: /* servername */ String => _): Self = StObject.set(x, "SNICallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSNICallbackUndefined: Self = StObject.set(x, "SNICallback", js.undefined)
    }
  }
}
