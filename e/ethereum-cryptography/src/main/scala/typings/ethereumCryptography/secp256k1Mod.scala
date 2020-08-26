package typings.ethereumCryptography

import typings.secp256k1.anon.Recid
import typings.secp256k1.mod.SignOptions
import typings.secp256k1.mod.ecdhOptions
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-cryptography/secp256k1", JSImport.Namespace)
@js.native
object secp256k1Mod extends js.Object {
  def createPrivateKey(): js.Promise[Uint8Array] = js.native
  def createPrivateKeySync(): Uint8Array = js.native
  def ecdh(publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def ecdh(publicKey: Uint8Array, privateKey: Uint8Array, opt: ecdhOptions): Uint8Array = js.native
  def ecdsaRecover(signature: Uint8Array, recid: Double, message: Uint8Array): Uint8Array = js.native
  def ecdsaRecover(signature: Uint8Array, recid: Double, message: Uint8Array, compressed: Boolean): Uint8Array = js.native
  def ecdsaSign(message: Uint8Array, privateKey: Uint8Array): Recid = js.native
  def ecdsaSign(message: Uint8Array, privateKey: Uint8Array, options: SignOptions): Recid = js.native
  def ecdsaVerify(signature: Uint8Array, message: Uint8Array, publicKey: Uint8Array): Boolean = js.native
  def privateKeyExport(privateKey: Uint8Array): Uint8Array = js.native
  def privateKeyExport(privateKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  def privateKeyImport(privateKey: Uint8Array): Uint8Array = js.native
  def privateKeyModInverse(privateKey: Uint8Array): Uint8Array = js.native
  def privateKeyNegate(privateKey: Uint8Array): Uint8Array = js.native
  def privateKeyTweakAdd(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  def privateKeyTweakMul(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  def privateKeyVerify(privateKey: Uint8Array): Boolean = js.native
  def publicKeyCombine(publicKeys: js.Array[Uint8Array]): Uint8Array = js.native
  def publicKeyCombine(publicKeys: js.Array[Uint8Array], compressed: Boolean): Uint8Array = js.native
  def publicKeyConvert(publicKey: Uint8Array): Uint8Array = js.native
  def publicKeyConvert(publicKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  def publicKeyCreate(privateKey: Uint8Array): Uint8Array = js.native
  def publicKeyCreate(privateKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  def publicKeyTweakAdd(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  def publicKeyTweakAdd(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = js.native
  def publicKeyTweakMul(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  def publicKeyTweakMul(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = js.native
  def publicKeyVerify(publicKey: Uint8Array): Boolean = js.native
  def signatureExport(signature: Uint8Array): Uint8Array = js.native
  def signatureImport(signature: Uint8Array): Uint8Array = js.native
  def signatureNormalize(signature: Uint8Array): Uint8Array = js.native
}

