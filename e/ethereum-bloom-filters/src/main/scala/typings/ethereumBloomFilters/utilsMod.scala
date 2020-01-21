package typings.ethereumBloomFilters

import typings.std.ArrayLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-bloom-filters/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def bytesToHex(bytes: Uint8Array): String = js.native
  def keccak256(data: String): String = js.native
  def keccak256(data: ArrayLike[Double]): String = js.native
  def padLeft(value: String, chars: Double): String = js.native
  def toByteArray(value: String): Uint8Array = js.native
  def toByteArray(value: ArrayLike[Double]): Uint8Array = js.native
}

