package typings.emscripten

import typings.emscripten.Emscripten.CType
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("allocate")
@js.native
object allocate extends js.Object {
  def apply(slab: js.Array[Double], types: js.Array[CType], allocator: Double): Double = js.native
  def apply(slab: js.Array[Double], types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def apply(slab: js.Array[Double], types: CType, allocator: Double): Double = js.native
  def apply(slab: js.Array[Double], types: CType, allocator: Double, ptr: Double): Double = js.native
  def apply(slab: Double, types: js.Array[CType], allocator: Double): Double = js.native
  def apply(slab: Double, types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def apply(slab: Double, types: CType, allocator: Double): Double = js.native
  def apply(slab: Double, types: CType, allocator: Double, ptr: Double): Double = js.native
  def apply(slab: ArrayBufferView, types: js.Array[CType], allocator: Double): Double = js.native
  def apply(slab: ArrayBufferView, types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def apply(slab: ArrayBufferView, types: CType, allocator: Double): Double = js.native
  def apply(slab: ArrayBufferView, types: CType, allocator: Double, ptr: Double): Double = js.native
}

