package typings
package freedomLib.freedomNs.PgpProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PgpProvider extends js.Object {
  def armor(data: stdLib.ArrayBuffer): stdLib.Promise[java.lang.String] = js.native
  def armor(data: stdLib.ArrayBuffer, `type`: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def clear(): stdLib.Promise[scala.Unit] = js.native
  def dearmor(data: java.lang.String): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def ecdhBob(curve: java.lang.String, pubKey: java.lang.String): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def exportKey(): stdLib.Promise[PublicKey] = js.native
  def getFingerprint(publicKey: java.lang.String): stdLib.Promise[KeyFingerprint] = js.native
  // Standard freedom crypto API
  def setup(passphrase: java.lang.String, userid: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def signEncrypt(data: stdLib.ArrayBuffer): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def signEncrypt(data: stdLib.ArrayBuffer, encryptKey: java.lang.String): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def signEncrypt(data: stdLib.ArrayBuffer, encryptKey: java.lang.String, sign: scala.Boolean): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def verifyDecrypt(data: stdLib.ArrayBuffer): stdLib.Promise[VerifyDecryptResult] = js.native
  def verifyDecrypt(data: stdLib.ArrayBuffer, verifyKey: java.lang.String): stdLib.Promise[VerifyDecryptResult] = js.native
}

