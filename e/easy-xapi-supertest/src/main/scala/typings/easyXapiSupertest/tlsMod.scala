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
  
  inline def connect(options: TlsOptions): ClearTextStream = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[ClearTextStream]
  inline def connect(options: TlsOptions, secureConnectionListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double): ClearTextStream = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, host: String): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, host: String, options: Unit, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, host: String, options: ConnectionOptions): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, host: Unit, options: Unit, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, host: Unit, options: ConnectionOptions): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, host: Unit, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, options: Unit, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, options: ConnectionOptions): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  inline def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[ClearTextStream]
  
  inline def createSecureContext(details: SecureContextOptions): SecureContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")(details.asInstanceOf[js.Any]).asInstanceOf[SecureContext]
  
  inline def createSecurePair(): SecurePair = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")().asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Unit, isServer: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Unit, isServer: Boolean, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Unit, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Unit, isServer: Boolean, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Unit, isServer: Unit, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Unit, isServer: Unit, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Unit, isServer: Unit, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Credentials): SecurePair = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any]).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Credentials, isServer: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Credentials, isServer: Unit, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Credentials, isServer: Unit, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  inline def createSecurePair(credentials: Credentials, isServer: Unit, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  
  inline def createServer(options: TlsOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createServer(
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
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCert(value: js.Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNPNProtocols(value: js.Any): Self = StObject.set(x, "NPNProtocols", value.asInstanceOf[js.Any])
      
      inline def setNPNProtocolsUndefined: Self = StObject.set(x, "NPNProtocols", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: js.Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait SecureContext extends StObject {
    
    var context: js.Any
  }
  object SecureContext {
    
    inline def apply(context: js.Any): SecureContext = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecureContext]
    }
    
    extension [Self <: SecureContext](x: Self) {
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
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
    
    inline def apply(): SecureContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecureContextOptions]
    }
    
    extension [Self <: SecureContextOptions](x: Self) {
      
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
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: js.Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    }
  }
  
  trait SecurePair extends StObject {
    
    var cleartext: js.Any
    
    var encrypted: js.Any
  }
  object SecurePair {
    
    inline def apply(cleartext: js.Any, encrypted: js.Any): SecurePair = {
      val __obj = js.Dynamic.literal(cleartext = cleartext.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurePair]
    }
    
    extension [Self <: SecurePair](x: Self) {
      
      inline def setCleartext(value: js.Any): Self = StObject.set(x, "cleartext", value.asInstanceOf[js.Any])
      
      inline def setEncrypted(value: js.Any): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
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
    
    inline def apply(): TlsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TlsOptions]
    }
    
    extension [Self <: TlsOptions](x: Self) {
      
      inline def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCert(value: js.Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setCrl(value: js.Any): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setHonorCipherOrder(value: js.Any): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
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
