package typings.futoinHkdf.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("futoin-hkdf", "extract")
@js.native
object extract extends js.Object {
  def apply(hash: String, hash_len: Double, ikm: String, salt: String): Buffer = js.native
  def apply(hash: String, hash_len: Double, ikm: String, salt: Buffer): Buffer = js.native
  def apply(hash: String, hash_len: Double, ikm: Buffer, salt: String): Buffer = js.native
  def apply(hash: String, hash_len: Double, ikm: Buffer, salt: Buffer): Buffer = js.native
}

