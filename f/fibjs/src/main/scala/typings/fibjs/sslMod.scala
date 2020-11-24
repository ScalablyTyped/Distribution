package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief ssl/tls 模块，模块别名：tls
  * @detail 
  */
@JSImport("ssl", JSImport.Namespace)
@js.native
object sslMod extends js.Object {
  
  val BADCERT_CN_MISMATCH: /* 4 */ Double = js.native
  
  val BADCERT_EXPIRED: /* 1 */ Double = js.native
  
  val BADCERT_NOT_TRUSTED: /* 8 */ Double = js.native
  
  val BADCERT_REVOKED: /* 2 */ Double = js.native
  
  val VERIFY_NONE: /* 0 */ Double = js.native
  
  val VERIFY_OPTIONAL: /* 1 */ Double = js.native
  
  val VERIFY_REQUIRED: /* 2 */ Double = js.native
  
  val ca: ClassX509Cert = js.native
  
  def connect(url: String): ClassStream = js.native
  def connect(url: String, timeout: Double): ClassStream = js.native
  
  def loadClientCertFile(crtFile: String, keyFile: String): Unit = js.native
  def loadClientCertFile(crtFile: String, keyFile: String, password: String): Unit = js.native
  
  def loadRootCerts(): Unit = js.native
  
  @JSName("max_version")
  val maxVersion: Double = js.native
  
  @JSName("min_version")
  val minVersion: Double = js.native
  
  def setClientCert(crt: ClassX509Cert, key: ClassPKey): Unit = js.native
  
  val ssl3: /* 0 */ Double = js.native
  
  val tls1: /* 1 */ Double = js.native
  
  @JSName("tls1_1")
  val tls11: /* 2 */ Double = js.native
  
  @JSName("tls1_2")
  val tls12: /* 3 */ Double = js.native
  
  val verification: Double = js.native
  
  @js.native
  class Handler () extends ClassSslHandler
  
  @js.native
  class Server () extends ClassSslServer
  
  @js.native
  class Socket () extends ClassSslSocket
}
