package typings.ed25519.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed25519", "MakeKeypair")
@js.native
object MakeKeypair extends js.Object {
  def apply(seed: Buffer): CurveKeyPair = js.native
}

