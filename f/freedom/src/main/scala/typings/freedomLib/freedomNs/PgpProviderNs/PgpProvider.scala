package typings
package freedomLib.freedomNs.PgpProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PgpProvider extends js.Object {
  def armor(data: stdLib.ArrayBuffer): js.Promise[java.lang.String] = js.native
  def armor(data: stdLib.ArrayBuffer, `type`: java.lang.String): js.Promise[java.lang.String] = js.native
  def clear(): js.Promise[scala.Unit] = js.native
  def dearmor(data: java.lang.String): js.Promise[stdLib.ArrayBuffer] = js.native
  def ecdhBob(curve: java.lang.String, pubKey: java.lang.String): js.Promise[stdLib.ArrayBuffer] = js.native
  def exportKey(): js.Promise[PublicKey] = js.native
  def getFingerprint(publicKey: java.lang.String): js.Promise[KeyFingerprint] = js.native
  // Standard freedom crypto API
  def setup(passphrase: java.lang.String, userid: java.lang.String): js.Promise[scala.Unit] = js.native
  def signEncrypt(data: stdLib.ArrayBuffer): js.Promise[stdLib.ArrayBuffer] = js.native
  def signEncrypt(data: stdLib.ArrayBuffer, encryptKey: java.lang.String): js.Promise[stdLib.ArrayBuffer] = js.native
  def signEncrypt(data: stdLib.ArrayBuffer, encryptKey: java.lang.String, sign: scala.Boolean): js.Promise[stdLib.ArrayBuffer] = js.native
  def verifyDecrypt(data: stdLib.ArrayBuffer): js.Promise[VerifyDecryptResult] = js.native
  def verifyDecrypt(data: stdLib.ArrayBuffer, verifyKey: java.lang.String): js.Promise[VerifyDecryptResult] = js.native
}

