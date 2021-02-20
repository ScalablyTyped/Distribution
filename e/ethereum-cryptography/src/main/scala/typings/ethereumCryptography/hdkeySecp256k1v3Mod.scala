package typings.ethereumCryptography

import typings.ethereumCryptography.anon.Recovery
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdkeySecp256k1v3Mod {
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "privateKeyTweakAdd")
  @js.native
  def privateKeyTweakAdd(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "privateKeyVerify")
  @js.native
  def privateKeyVerify(privateKey: Buffer): Boolean = js.native
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: Buffer): Buffer = js.native
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: Buffer, compressed: Boolean): Buffer = js.native
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: Buffer): Buffer = js.native
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: Buffer, compressed: Boolean): Buffer = js.native
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer, compressed: Boolean): Buffer = js.native
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "publicKeyVerify")
  @js.native
  def publicKeyVerify(publicKey: Buffer): Boolean = js.native
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "sign")
  @js.native
  def sign(message: Buffer, privateKey: Buffer): Recovery = js.native
  
  @JSImport("ethereum-cryptography/pure/shims/hdkey-secp256k1v3", "verify")
  @js.native
  def verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}
