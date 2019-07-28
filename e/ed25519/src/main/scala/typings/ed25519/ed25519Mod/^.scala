package typings.ed25519.ed25519Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed25519", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def MakeKeypair(seed: Buffer): CurveKeyPair = js.native
  def Sign(message: Buffer, privateKeyOrKeyPair: CurveKeyPair): Buffer = js.native
  def Sign(message: Buffer, privateKeyOrKeyPair: Buffer): Buffer = js.native
  def Verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}

