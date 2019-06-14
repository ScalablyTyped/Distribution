package typings
package elgamalLib.elgamalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElGamal extends js.Object {
  var g: jsbnLib.jsbnMod.BigInteger = js.native
  var p: jsbnLib.jsbnMod.BigInteger = js.native
  var x: jsbnLib.jsbnMod.BigInteger = js.native
  var y: jsbnLib.jsbnMod.BigInteger = js.native
  def decryptAsync(m: EncryptedValue): js.Promise[DecryptedValue] = js.native
  def encryptAsync(m: java.lang.String): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: java.lang.String, k: java.lang.String): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: java.lang.String, k: jsbnLib.jsbnMod.BigInteger): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: java.lang.String, k: scala.Double): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: jsbnLib.jsbnMod.BigInteger): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: jsbnLib.jsbnMod.BigInteger, k: java.lang.String): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: jsbnLib.jsbnMod.BigInteger, k: jsbnLib.jsbnMod.BigInteger): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: jsbnLib.jsbnMod.BigInteger, k: scala.Double): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: scala.Double): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: scala.Double, k: java.lang.String): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: scala.Double, k: jsbnLib.jsbnMod.BigInteger): js.Promise[EncryptedValue] = js.native
  def encryptAsync(m: scala.Double, k: scala.Double): js.Promise[EncryptedValue] = js.native
}

