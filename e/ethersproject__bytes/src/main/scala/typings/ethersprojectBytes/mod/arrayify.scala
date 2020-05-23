package typings.ethersprojectBytes.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/bytes", "arrayify")
@js.native
object arrayify extends js.Object {
  def apply(value: Double): Uint8Array = js.native
  def apply(value: Double, options: DataOptions): Uint8Array = js.native
  def apply(value: BytesLike): Uint8Array = js.native
  def apply(value: BytesLike, options: DataOptions): Uint8Array = js.native
  def apply(value: Hexable): Uint8Array = js.native
  def apply(value: Hexable, options: DataOptions): Uint8Array = js.native
}

