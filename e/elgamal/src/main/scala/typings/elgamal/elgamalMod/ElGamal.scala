package typings.elgamal.elgamalMod

import typings.jsbn.jsbnMod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElGamal extends js.Object {
  var g: BigInteger = js.native
  var p: BigInteger = js.native
  var x: BigInteger = js.native
  var y: BigInteger = js.native
  def decryptAsync(m: EncryptedValue): js.Promise[DecryptedValue] = js.native
  def encryptAsync(m: String): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: String, k: String): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: String, k: Double): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: String, k: BigInteger): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: Double): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: Double, k: String): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: Double, k: Double): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: Double, k: BigInteger): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: BigInteger): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: BigInteger, k: String): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: BigInteger, k: Double): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: BigInteger, k: BigInteger): js.Promise[EncryptedValue] = js.native
}

