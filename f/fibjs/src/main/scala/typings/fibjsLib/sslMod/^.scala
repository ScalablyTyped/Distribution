package typings
package fibjsLib.sslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BADCERT_CN_MISMATCH: /* 4 */ scala.Double = js.native
  val BADCERT_EXPIRED: /* 1 */ scala.Double = js.native
  val BADCERT_NOT_TRUSTED: /* 8 */ scala.Double = js.native
  val BADCERT_REVOKED: /* 2 */ scala.Double = js.native
  val VERIFY_NONE: /* 0 */ scala.Double = js.native
  val VERIFY_OPTIONAL: /* 1 */ scala.Double = js.native
  val VERIFY_REQUIRED: /* 2 */ scala.Double = js.native
  val ca: fibjsLib.Class_X509Cert = js.native
  val max_version: scala.Double = js.native
  val min_version: scala.Double = js.native
  val ssl3: /* 0 */ scala.Double = js.native
  val tls1: /* 1 */ scala.Double = js.native
  val tls1_1: /* 2 */ scala.Double = js.native
  val tls1_2: /* 3 */ scala.Double = js.native
  val verification: scala.Double = js.native
  def connect(url: java.lang.String): fibjsLib.Class_Stream = js.native
  def connect(url: java.lang.String, timeout: scala.Double): fibjsLib.Class_Stream = js.native
  def loadClientCertFile(crtFile: java.lang.String, keyFile: java.lang.String): scala.Unit = js.native
  def loadClientCertFile(crtFile: java.lang.String, keyFile: java.lang.String, password: java.lang.String): scala.Unit = js.native
  def loadRootCerts(): scala.Unit = js.native
  def setClientCert(crt: fibjsLib.Class_X509Cert, key: fibjsLib.Class_PKey): scala.Unit = js.native
}

