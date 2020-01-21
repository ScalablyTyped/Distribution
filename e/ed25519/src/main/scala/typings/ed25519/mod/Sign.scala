package typings.ed25519.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed25519", "Sign")
@js.native
object Sign extends js.Object {
  def apply(message: Buffer, privateKeyOrKeyPair: CurveKeyPair): Buffer = js.native
  def apply(message: Buffer, privateKeyOrKeyPair: Buffer): Buffer = js.native
}

