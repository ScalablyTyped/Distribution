package typings.ethereumCryptography

import typings.ethereumCryptography.anon.Data
import typings.ethereumCryptography.anon.Hashfn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secp256k1CompatMod {
  
  @JSImport("ethereum-cryptography/secp256k1-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contextRandomize(seed: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("contextRandomize")(seed.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createPrivateKey(): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")().asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def createPrivateKeySync(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKeySync")().asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdh(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    options: Unit,
    out: Output
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, options: Hashfn): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdh(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    options: Hashfn,
    out: Output
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ecdsaRecover(signature: js.typedarray.Uint8Array, recid: Double, msgHash: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    msgHash: js.typedarray.Uint8Array,
    compressed: Boolean
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    msgHash: js.typedarray.Uint8Array,
    compressed: Boolean,
    out: Output
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    msgHash: js.typedarray.Uint8Array,
    compressed: Unit,
    out: Output
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ecdsaSign(msgHash: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Signature]
  inline def ecdsaSign(
    msgHash: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    options: Unit,
    out: Output
  ): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Signature]
  inline def ecdsaSign(msgHash: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, options: Data): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Signature]
  inline def ecdsaSign(
    msgHash: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    options: Data,
    out: Output
  ): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Signature]
  
  inline def ecdsaVerify(
    signature: js.typedarray.Uint8Array,
    msgHash: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaVerify")(signature.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def privateKeyNegate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyNegate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyTweakAdd(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyTweakAdd")(privateKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyTweakMul(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyTweakMul")(privateKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyVerify(privateKey: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyVerify")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array], compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array], compressed: Boolean, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array], compressed: Unit, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyConvert(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Boolean, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Unit, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyCreate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Boolean, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Unit, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyNegate(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyNegate(publicKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyNegate(publicKey: js.typedarray.Uint8Array, compressed: Boolean, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyNegate(publicKey: js.typedarray.Uint8Array, compressed: Unit, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakAdd(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Boolean,
    out: Output
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakAdd(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Unit,
    out: Output
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakMul(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Boolean,
    out: Output
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakMul(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Unit,
    out: Output
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyVerify(publicKey: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyVerify")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def signatureExport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureExport")(signature.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def signatureExport(signature: js.typedarray.Uint8Array, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signatureExport")(signature.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def signatureImport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureImport")(signature.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def signatureImport(signature: js.typedarray.Uint8Array, out: Output): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signatureImport")(signature.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def signatureNormalize(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureNormalize")(signature.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  type Output = js.typedarray.Uint8Array | (js.Function1[/* len */ Double, js.typedarray.Uint8Array])
  
  trait Signature extends StObject {
    
    var recid: Double
    
    var signature: js.typedarray.Uint8Array
  }
  object Signature {
    
    inline def apply(recid: Double, signature: js.typedarray.Uint8Array): Signature = {
      val __obj = js.Dynamic.literal(recid = recid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signature]
    }
    
    extension [Self <: Signature](x: Self) {
      
      inline def setRecid(value: Double): Self = StObject.set(x, "recid", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
