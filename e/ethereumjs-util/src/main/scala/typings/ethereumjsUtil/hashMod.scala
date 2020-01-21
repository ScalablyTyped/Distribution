package typings.ethereumjsUtil

import typings.node.Buffer
import typings.rlp.typesMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util/dist/hash", JSImport.Namespace)
@js.native
object hashMod extends js.Object {
  def keccak(a: js.Any): Buffer = js.native
  def keccak(a: js.Any, bits: Double): Buffer = js.native
  def keccak256(a: js.Any): Buffer = js.native
  def ripemd160(a: js.Any, padded: Boolean): Buffer = js.native
  def rlphash(a: Input): Buffer = js.native
  def sha256(a: js.Any): Buffer = js.native
}

