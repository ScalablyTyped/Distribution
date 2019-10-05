package typings.doublearray.doublearray

import typings.doublearray.Anon_All
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAndCheck extends js.Object {
  def calc(): Anon_All = js.native
  def dump(): String = js.native
  def getBase(): Double = js.native
  def getBaseBuffer(): js.Any = js.native
  def getCheck(): Double = js.native
     // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
  def getCheckBuffer(): js.Any = js.native
  def getFirstUnusedNode(): Double = js.native
  def loadBaseBuffer(base_buffer: Int16Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: Int32Array): BaseAndCheck = js.native
    // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
  def loadBaseBuffer(base_buffer: Int8Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: Uint16Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: Uint32Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: Uint8Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: Int16Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: Int32Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: Int8Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: Uint16Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: Uint32Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: Uint8Array): BaseAndCheck = js.native
  def setBase(index: Double, base_value: Double): Unit = js.native
  def setCheck(index: Double, check_value: Double): Unit = js.native
  def setFirstUnusedNode(index: Double): Unit = js.native
  def shrink(): Unit = js.native
  def size(): Double = js.native
}

