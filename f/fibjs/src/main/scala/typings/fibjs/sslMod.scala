package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief ssl/tls 模块，模块别名：tls
  * @detail 
  */
object sslMod {
  
  @JSImport("ssl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ssl", "BADCERT_CN_MISMATCH")
  @js.native
  val BADCERT_CN_MISMATCH: /* 4 */ Double = js.native
  
  @JSImport("ssl", "BADCERT_EXPIRED")
  @js.native
  val BADCERT_EXPIRED: /* 1 */ Double = js.native
  
  @JSImport("ssl", "BADCERT_NOT_TRUSTED")
  @js.native
  val BADCERT_NOT_TRUSTED: /* 8 */ Double = js.native
  
  @JSImport("ssl", "BADCERT_REVOKED")
  @js.native
  val BADCERT_REVOKED: /* 2 */ Double = js.native
  
  @JSImport("ssl", "Handler")
  @js.native
  open class Handler ()
    extends StObject
       with ClassSslHandler
  
  @JSImport("ssl", "Server")
  @js.native
  open class Server ()
    extends StObject
       with ClassSslServer
  
  @JSImport("ssl", "Socket")
  @js.native
  open class Socket ()
    extends StObject
       with ClassSslSocket
  
  @JSImport("ssl", "VERIFY_NONE")
  @js.native
  val VERIFY_NONE: /* 0 */ Double = js.native
  
  @JSImport("ssl", "VERIFY_OPTIONAL")
  @js.native
  val VERIFY_OPTIONAL: /* 1 */ Double = js.native
  
  @JSImport("ssl", "VERIFY_REQUIRED")
  @js.native
  val VERIFY_REQUIRED: /* 2 */ Double = js.native
  
  @JSImport("ssl", "ca")
  @js.native
  val ca: ClassX509Cert = js.native
  
  inline def connect(url: String): ClassStream = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[ClassStream]
  inline def connect(url: String, timeout: Double): ClassStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[ClassStream]
  
  inline def loadClientCertFile(crtFile: String, keyFile: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadClientCertFile")(crtFile.asInstanceOf[js.Any], keyFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadClientCertFile(crtFile: String, keyFile: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadClientCertFile")(crtFile.asInstanceOf[js.Any], keyFile.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadRootCerts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRootCerts")().asInstanceOf[Unit]
  
  @JSImport("ssl", "max_version")
  @js.native
  val maxVersion: Double = js.native
  
  @JSImport("ssl", "min_version")
  @js.native
  val minVersion: Double = js.native
  
  inline def setClientCert(crt: ClassX509Cert, key: ClassPKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setClientCert")(crt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ssl", "ssl3")
  @js.native
  val ssl3: /* 0 */ Double = js.native
  
  @JSImport("ssl", "tls1")
  @js.native
  val tls1: /* 1 */ Double = js.native
  
  @JSImport("ssl", "tls1_1")
  @js.native
  val tls11: /* 2 */ Double = js.native
  
  @JSImport("ssl", "tls1_2")
  @js.native
  val tls12: /* 3 */ Double = js.native
  
  @JSImport("ssl", "verification")
  @js.native
  val verification: Double = js.native
}
