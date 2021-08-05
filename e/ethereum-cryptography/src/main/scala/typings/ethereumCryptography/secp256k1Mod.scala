package typings.ethereumCryptography

import typings.secp256k1.anon.Recid
import typings.secp256k1.mod.SignOptions
import typings.secp256k1.mod.ecdhOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secp256k1Mod {
  
  @JSImport("ethereum-cryptography/secp256k1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPrivateKey(): js.Promise[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")().asInstanceOf[js.Promise[Uint8Array]]
  
  inline def createPrivateKeySync(): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKeySync")().asInstanceOf[Uint8Array]
  
  inline def ecdh(publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  inline def ecdh(publicKey: Uint8Array, privateKey: Uint8Array, opt: ecdhOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def ecdsaRecover(signature: Uint8Array, recid: Double, message: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  inline def ecdsaRecover(signature: Uint8Array, recid: Double, message: Uint8Array, compressed: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], message.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def ecdsaSign(message: Uint8Array, privateKey: Uint8Array): Recid = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Recid]
  inline def ecdsaSign(message: Uint8Array, privateKey: Uint8Array, options: SignOptions): Recid = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Recid]
  
  inline def ecdsaVerify(signature: Uint8Array, message: Uint8Array, publicKey: Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaVerify")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def privateKeyExport(privateKey: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyExport")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def privateKeyExport(privateKey: Uint8Array, compressed: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyExport")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def privateKeyImport(privateKey: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyImport")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def privateKeyModInverse(privateKey: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyModInverse")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def privateKeyNegate(privateKey: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyNegate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def privateKeyTweakAdd(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyTweakAdd")(privateKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def privateKeyTweakMul(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyTweakMul")(privateKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def privateKeyVerify(privateKey: Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyVerify")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def publicKeyCombine(publicKeys: js.Array[Uint8Array]): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def publicKeyCombine(publicKeys: js.Array[Uint8Array], compressed: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def publicKeyConvert(publicKey: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def publicKeyConvert(publicKey: Uint8Array, compressed: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def publicKeyCreate(privateKey: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def publicKeyCreate(privateKey: Uint8Array, compressed: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def publicKeyTweakAdd(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  inline def publicKeyTweakAdd(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def publicKeyTweakMul(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  inline def publicKeyTweakMul(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def publicKeyVerify(publicKey: Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyVerify")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def signatureExport(signature: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureExport")(signature.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def signatureImport(signature: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureImport")(signature.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def signatureNormalize(signature: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureNormalize")(signature.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
