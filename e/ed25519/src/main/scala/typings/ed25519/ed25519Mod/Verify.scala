package typings.ed25519.ed25519Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed25519", "Verify")
@js.native
object Verify extends js.Object {
  def apply(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}

