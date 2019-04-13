package typings
package fibjsLib.sslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BADCERT_CN_MISMATCH: fibjsLib.fibjsLibNumbers.`4` = js.native
  val BADCERT_EXPIRED: fibjsLib.fibjsLibNumbers.`1` = js.native
  val BADCERT_NOT_TRUSTED: fibjsLib.fibjsLibNumbers.`8` = js.native
  val BADCERT_REVOKED: fibjsLib.fibjsLibNumbers.`2` = js.native
  val VERIFY_NONE: fibjsLib.fibjsLibNumbers.`0` = js.native
  val VERIFY_OPTIONAL: fibjsLib.fibjsLibNumbers.`1` = js.native
  val VERIFY_REQUIRED: fibjsLib.fibjsLibNumbers.`2` = js.native
  val ca: fibjsLib.Class_X509Cert = js.native
  val max_version: scala.Double = js.native
  val min_version: scala.Double = js.native
  val ssl3: fibjsLib.fibjsLibNumbers.`0` = js.native
  val tls1: fibjsLib.fibjsLibNumbers.`1` = js.native
  val tls1_1: fibjsLib.fibjsLibNumbers.`2` = js.native
  val tls1_2: fibjsLib.fibjsLibNumbers.`3` = js.native
  val verification: scala.Double = js.native
  def connect(url: java.lang.String): fibjsLib.Class_Stream = js.native
  def connect(url: java.lang.String, timeout: scala.Double): fibjsLib.Class_Stream = js.native
  def loadClientCertFile(crtFile: java.lang.String, keyFile: java.lang.String): scala.Unit = js.native
  def loadClientCertFile(crtFile: java.lang.String, keyFile: java.lang.String, password: java.lang.String): scala.Unit = js.native
  def loadRootCerts(): scala.Unit = js.native
  def setClientCert(crt: fibjsLib.Class_X509Cert, key: fibjsLib.Class_PKey): scala.Unit = js.native
}

