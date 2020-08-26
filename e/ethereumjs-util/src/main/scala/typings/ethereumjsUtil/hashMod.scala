package typings.ethereumjsUtil

import typings.node.Buffer
import typings.rlp.typesMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util/dist/hash", JSImport.Namespace)
@js.native
object hashMod extends js.Object {
  def keccak(a: Buffer): Buffer = js.native
  def keccak(a: Buffer, bits: Double): Buffer = js.native
  def keccak256(a: Buffer): Buffer = js.native
  def keccakFromArray(a: js.Array[Double]): Buffer = js.native
  def keccakFromArray(a: js.Array[Double], bits: Double): Buffer = js.native
  def keccakFromHexString(a: String): Buffer = js.native
  def keccakFromHexString(a: String, bits: Double): Buffer = js.native
  def keccakFromString(a: String): Buffer = js.native
  def keccakFromString(a: String, bits: Double): Buffer = js.native
  def ripemd160(a: Buffer, padded: Boolean): Buffer = js.native
  def ripemd160FromArray(a: js.Array[Double], padded: Boolean): Buffer = js.native
  def ripemd160FromString(a: String, padded: Boolean): Buffer = js.native
  def rlphash(a: Input): Buffer = js.native
  def sha256(a: Buffer): Buffer = js.native
  def sha256FromArray(a: js.Array[Double]): Buffer = js.native
  def sha256FromString(a: String): Buffer = js.native
}

