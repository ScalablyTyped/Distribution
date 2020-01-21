package typings.googleGax.mod.fallback.protobuf.util

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.util.newBuffer")
@js.native
object newBuffer extends js.Object {
  /**
    * Creates a new buffer of whatever type supported by the environment.
    * @param [sizeOrArray=0] Buffer size or number array
    * @returns Buffer
    */
  def apply(): Uint8Array | typings.protobufjs.mod.Buffer = js.native
  def apply(sizeOrArray: js.Array[Double]): Uint8Array | typings.protobufjs.mod.Buffer = js.native
  def apply(sizeOrArray: Double): Uint8Array | typings.protobufjs.mod.Buffer = js.native
}

