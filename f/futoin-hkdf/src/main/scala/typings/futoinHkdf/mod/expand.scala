package typings.futoinHkdf.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("futoin-hkdf", "expand")
@js.native
object expand extends js.Object {
  def apply(hash: String, hash_len: Double, prk: String, length: Double, info: String): Buffer = js.native
  def apply(hash: String, hash_len: Double, prk: String, length: Double, info: Buffer): Buffer = js.native
  def apply(hash: String, hash_len: Double, prk: Buffer, length: Double, info: String): Buffer = js.native
  def apply(hash: String, hash_len: Double, prk: Buffer, length: Double, info: Buffer): Buffer = js.native
}

