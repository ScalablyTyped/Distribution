package typings.dtype

import typings.dtype.dtypeStrings.Float64Array
import typings.dtype.dtypeStrings.array
import typings.dtype.dtypeStrings.float32
import typings.dtype.dtypeStrings.int16
import typings.dtype.dtypeStrings.int32
import typings.dtype.dtypeStrings.int8
import typings.dtype.dtypeStrings.uint16
import typings.dtype.dtypeStrings.uint32
import typings.dtype.dtypeStrings.uint8
import typings.dtype.dtypeStrings.uint8_clamped
import typings.std.ArrayConstructor
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dtype", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(`type`: js.Any): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: Float64Array): Float64ArrayConstructor = js.native
  def apply(`type`: array): ArrayConstructor = js.native
  def apply(`type`: float32): Float32ArrayConstructor = js.native
  def apply(`type`: int16): Int16ArrayConstructor = js.native
  def apply(`type`: int32): Int32ArrayConstructor = js.native
  def apply(`type`: int8): Int8ArrayConstructor = js.native
  def apply(`type`: uint16): Uint16ArrayConstructor = js.native
  def apply(`type`: uint32): Uint32ArrayConstructor = js.native
  def apply(`type`: uint8): Uint8ArrayConstructor = js.native
  def apply(`type`: uint8_clamped): Uint8ClampedArrayConstructor = js.native
}

