package typings.ethereumCryptography

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-cryptography/keccak", JSImport.Namespace)
@js.native
object keccakMod extends js.Object {
  def keccak224(msg: Buffer): Buffer = js.native
  def keccak256(msg: Buffer): Buffer = js.native
  def keccak384(msg: Buffer): Buffer = js.native
  def keccak512(msg: Buffer): Buffer = js.native
}

