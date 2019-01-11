package typings
package ed25519Lib.ed25519Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed25519", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def MakeKeypair(seed: nodeLib.Buffer): ed25519Lib.ed25519Mod.CurveKeyPair = js.native
  def Sign(message: nodeLib.Buffer, privateKeyOrKeyPair: ed25519Lib.ed25519Mod.CurveKeyPair): nodeLib.Buffer = js.native
  def Sign(message: nodeLib.Buffer, privateKeyOrKeyPair: nodeLib.Buffer): nodeLib.Buffer = js.native
  def Verify(message: nodeLib.Buffer, signature: nodeLib.Buffer, publicKey: nodeLib.Buffer): scala.Boolean = js.native
}

