package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief ssl/tls 模块，模块别名：tls
	* @detail 
	*/
@JSImport("ssl", JSImport.Namespace)
@js.native
object sslMod extends js.Object {
  @js.native
  class Handler () extends Class_SslHandler
  
  @js.native
  class Server () extends Class_SslServer
  
  @js.native
  class Socket () extends Class_SslSocket
  
  val BADCERT_CN_MISMATCH: `4` = js.native
  val BADCERT_EXPIRED: `1` = js.native
  val BADCERT_NOT_TRUSTED: `8` = js.native
  val BADCERT_REVOKED: `2` = js.native
  val VERIFY_NONE: `0` = js.native
  val VERIFY_OPTIONAL: `1` = js.native
  val VERIFY_REQUIRED: `2` = js.native
  val ca: Class_X509Cert = js.native
  val max_version: Double = js.native
  val min_version: Double = js.native
  val ssl3: `0` = js.native
  val tls1: `1` = js.native
  val tls1_1: `2` = js.native
  val tls1_2: `3` = js.native
  val verification: Double = js.native
  def connect(url: String): Class_Stream = js.native
  def connect(url: String, timeout: Double): Class_Stream = js.native
  def loadClientCertFile(crtFile: String, keyFile: String): Unit = js.native
  def loadClientCertFile(crtFile: String, keyFile: String, password: String): Unit = js.native
  def loadRootCerts(): Unit = js.native
  def setClientCert(crt: Class_X509Cert, key: Class_PKey): Unit = js.native
}

