package typings.fsExtra.mod

import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "writeSync")
@js.native
object writeSync extends js.Object {
  def apply(fd: Double, buffer: ArrayBufferView): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
  def apply(fd: Double, string: String): Double = js.native
  def apply(fd: Double, string: String, position: Double): Double = js.native
  def apply(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
  def apply(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
}

