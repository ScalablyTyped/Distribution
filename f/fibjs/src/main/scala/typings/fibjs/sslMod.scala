package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief ssl/tls 模块，模块别名：tls
  * @detail 
  */
object sslMod {
  
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
  class Handler () extends ClassSslHandler
  
  @JSImport("ssl", "Server")
  @js.native
  class Server () extends ClassSslServer
  
  @JSImport("ssl", "Socket")
  @js.native
  class Socket () extends ClassSslSocket
  
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
  
  @JSImport("ssl", "connect")
  @js.native
  def connect(url: String): ClassStream = js.native
  @JSImport("ssl", "connect")
  @js.native
  def connect(url: String, timeout: Double): ClassStream = js.native
  
  @JSImport("ssl", "loadClientCertFile")
  @js.native
  def loadClientCertFile(crtFile: String, keyFile: String): Unit = js.native
  @JSImport("ssl", "loadClientCertFile")
  @js.native
  def loadClientCertFile(crtFile: String, keyFile: String, password: String): Unit = js.native
  
  @JSImport("ssl", "loadRootCerts")
  @js.native
  def loadRootCerts(): Unit = js.native
  
  @JSImport("ssl", "max_version")
  @js.native
  val maxVersion: Double = js.native
  
  @JSImport("ssl", "min_version")
  @js.native
  val minVersion: Double = js.native
  
  @JSImport("ssl", "setClientCert")
  @js.native
  def setClientCert(crt: ClassX509Cert, key: ClassPKey): Unit = js.native
  
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
