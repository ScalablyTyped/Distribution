package typings
package googleDashAuthDashLibraryLib.buildSrcCryptoCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crypto extends js.Object {
  def createSign(algorithm: java.lang.String): CryptoSigner = js.native
  def decodeBase64StringUtf8(base64: java.lang.String): java.lang.String = js.native
  def encodeBase64StringUtf8(text: java.lang.String): java.lang.String = js.native
  def randomBytesBase64(n: scala.Double): java.lang.String = js.native
  def sha256DigestBase64(str: java.lang.String): js.Promise[java.lang.String] = js.native
  def verify(pubkey: JwkCertificate, data: java.lang.String, signature: java.lang.String): js.Promise[scala.Boolean] = js.native
  def verify(pubkey: JwkCertificate, data: nodeLib.Buffer, signature: java.lang.String): js.Promise[scala.Boolean] = js.native
  def verify(pubkey: java.lang.String, data: java.lang.String, signature: java.lang.String): js.Promise[scala.Boolean] = js.native
  def verify(pubkey: java.lang.String, data: nodeLib.Buffer, signature: java.lang.String): js.Promise[scala.Boolean] = js.native
}

