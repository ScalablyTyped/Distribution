package typings.ethereumCryptography

import typings.secp256k1.anon.Recid
import typings.secp256k1.mod.SignOptions
import typings.secp256k1.mod.ecdhOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secp256k1Mod {
  
  @JSImport("ethereum-cryptography/secp256k1", "createPrivateKey")
  @js.native
  def createPrivateKey(): js.Promise[Uint8Array] = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "createPrivateKeySync")
  @js.native
  def createPrivateKeySync(): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "ecdh")
  @js.native
  def ecdh(publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "ecdh")
  @js.native
  def ecdh(publicKey: Uint8Array, privateKey: Uint8Array, opt: ecdhOptions): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaRecover")
  @js.native
  def ecdsaRecover(signature: Uint8Array, recid: Double, message: Uint8Array): Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaRecover")
  @js.native
  def ecdsaRecover(signature: Uint8Array, recid: Double, message: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaSign")
  @js.native
  def ecdsaSign(message: Uint8Array, privateKey: Uint8Array): Recid = js.native
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaSign")
  @js.native
  def ecdsaSign(message: Uint8Array, privateKey: Uint8Array, options: SignOptions): Recid = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaVerify")
  @js.native
  def ecdsaVerify(signature: Uint8Array, message: Uint8Array, publicKey: Uint8Array): Boolean = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyExport")
  @js.native
  def privateKeyExport(privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyExport")
  @js.native
  def privateKeyExport(privateKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyImport")
  @js.native
  def privateKeyImport(privateKey: Uint8Array): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyModInverse")
  @js.native
  def privateKeyModInverse(privateKey: Uint8Array): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyNegate")
  @js.native
  def privateKeyNegate(privateKey: Uint8Array): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyTweakAdd")
  @js.native
  def privateKeyTweakAdd(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyTweakMul")
  @js.native
  def privateKeyTweakMul(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyVerify")
  @js.native
  def privateKeyVerify(privateKey: Uint8Array): Boolean = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyCombine")
  @js.native
  def publicKeyCombine(publicKeys: js.Array[Uint8Array]): Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyCombine")
  @js.native
  def publicKeyCombine(publicKeys: js.Array[Uint8Array], compressed: Boolean): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: Uint8Array): Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyTweakMul")
  @js.native
  def publicKeyTweakMul(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyTweakMul")
  @js.native
  def publicKeyTweakMul(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyVerify")
  @js.native
  def publicKeyVerify(publicKey: Uint8Array): Boolean = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "signatureExport")
  @js.native
  def signatureExport(signature: Uint8Array): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "signatureImport")
  @js.native
  def signatureImport(signature: Uint8Array): Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "signatureNormalize")
  @js.native
  def signatureNormalize(signature: Uint8Array): Uint8Array = js.native
}
