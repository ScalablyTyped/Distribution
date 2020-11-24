package typings.ed25519.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ed25519", "Verify")
@js.native
object Verify extends js.Object {
  
  def apply(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}
