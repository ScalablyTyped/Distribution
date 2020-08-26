package typings.ethereumCryptography

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-cryptography/pure/sha256", JSImport.Namespace)
@js.native
object sha256Mod extends js.Object {
  def sha256(msg: Buffer): Buffer = js.native
}

