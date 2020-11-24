package typings.freedom.freedom.PgpProvider

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PgpProvider extends js.Object {
  
  def armor(data: ArrayBuffer): js.Promise[String] = js.native
  def armor(data: ArrayBuffer, `type`: String): js.Promise[String] = js.native
  
  def clear(): js.Promise[Unit] = js.native
  
  def dearmor(data: String): js.Promise[ArrayBuffer] = js.native
  
  def ecdhBob(curve: String, pubKey: String): js.Promise[ArrayBuffer] = js.native
  
  def exportKey(): js.Promise[PublicKey] = js.native
  
  def getFingerprint(publicKey: String): js.Promise[KeyFingerprint] = js.native
  
  // Standard freedom crypto API
  def setup(passphrase: String, userid: String): js.Promise[Unit] = js.native
  
  def signEncrypt(data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def signEncrypt(data: ArrayBuffer, encryptKey: js.UndefOr[scala.Nothing], sign: Boolean): js.Promise[ArrayBuffer] = js.native
  def signEncrypt(data: ArrayBuffer, encryptKey: String): js.Promise[ArrayBuffer] = js.native
  def signEncrypt(data: ArrayBuffer, encryptKey: String, sign: Boolean): js.Promise[ArrayBuffer] = js.native
  
  def verifyDecrypt(data: ArrayBuffer): js.Promise[VerifyDecryptResult] = js.native
  def verifyDecrypt(data: ArrayBuffer, verifyKey: String): js.Promise[VerifyDecryptResult] = js.native
}
