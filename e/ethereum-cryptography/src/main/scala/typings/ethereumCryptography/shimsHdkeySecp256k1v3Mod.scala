package typings.ethereumCryptography

import typings.ethereumCryptography.anon.Recovery
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-cryptography/shims/hdkey-secp256k1v3", JSImport.Namespace)
@js.native
object shimsHdkeySecp256k1v3Mod extends js.Object {
  def privateKeyTweakAdd(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  def privateKeyVerify(privateKey: Buffer): Boolean = js.native
  def publicKeyConvert(publicKey: Buffer): Buffer = js.native
  def publicKeyConvert(publicKey: Buffer, compressed: Boolean): Buffer = js.native
  def publicKeyCreate(privateKey: Buffer): Buffer = js.native
  def publicKeyCreate(privateKey: Buffer, compressed: Boolean): Buffer = js.native
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer, compressed: Boolean): Buffer = js.native
  def publicKeyVerify(publicKey: Buffer): Boolean = js.native
  def sign(message: Buffer, privateKey: Buffer): Recovery = js.native
  def verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}

