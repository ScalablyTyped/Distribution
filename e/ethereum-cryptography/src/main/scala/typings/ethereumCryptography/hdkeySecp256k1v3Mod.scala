package typings.ethereumCryptography

import typings.ethereumCryptography.anon.Recovery
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdkeySecp256k1v3Mod {
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def privateKeyTweakAdd(publicKey: Buffer, tweak: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def privateKeyVerify(privateKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyVerify")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def publicKeyConvert(publicKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def publicKeyConvert(publicKey: Buffer, compressed: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def publicKeyCreate(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def publicKeyCreate(privateKey: Buffer, compressed: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer, compressed: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def publicKeyVerify(publicKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyVerify")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def sign(message: Buffer, privateKey: Buffer): Recovery = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Recovery]
  
  @scala.inline
  def verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
