package typings.ffi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer extends js.Object {
  /** Shorthand for `ref.address`. */
  def address(): Double = js.native
  /** Shorthand for `ref.deref`. */
  def deref(): js.Any = js.native
  /**
    * Generate string for inspecting.
    * String includes the hex-encoded memory address of the Buffer instance.
    */
  def inspect(): String = js.native
  /** Shorthand for `ref.isNull`. */
  def isNull(): Boolean = js.native
  /** Shorthand for `ref.readCString`. */
  def readCString(): String = js.native
  def readCString(offset: Double): String = js.native
  /** Shorthand for `ref.readInt64BE`. */
  def readInt64BE(): String = js.native
  def readInt64BE(offset: Double): String = js.native
  /** Shorthand for `ref.readInt64LE`. */
  def readInt64LE(): String = js.native
  def readInt64LE(offset: Double): String = js.native
  /** Shorthand for `ref.readObject`. */
  def readObject(): String = js.native
  def readObject(offset: Double): String = js.native
  /** Shorthand for `ref.readPointer`. */
  def readPointer(): String = js.native
  def readPointer(offset: Double): String = js.native
  /** Shorthand for `ref.readUInt64BE`. */
  def readUInt64BE(): String = js.native
  def readUInt64BE(offset: Double): String = js.native
  /** Shorthand for `ref.readUInt64LE`. */
  def readUInt64LE(): String = js.native
  def readUInt64LE(offset: Double): String = js.native
  /** Shorthand for `ref.ref`. */
  def ref(): Buffer = js.native
  /** Shorthand for `ref.reinterpret`. */
  def reinterpret(size: Double): Buffer = js.native
  def reinterpret(size: Double, offset: Double): Buffer = js.native
  /** Shorthand for `ref.reinterpretUntilZeros`. */
  def reinterpretUntilZeros(size: Double): Buffer = js.native
  def reinterpretUntilZeros(size: Double, offset: Double): Buffer = js.native
  /** Shorthand for `ref.writeCString`. */
  def writeCString(offset: Double, input: String): Unit = js.native
  def writeCString(offset: Double, input: String, encoding: String): Unit = js.native
  def writeInt64BE(offset: Double, input: String): js.Any = js.native
  /** Shorthand for `ref.writeInt64BE`. */
  def writeInt64BE(offset: Double, input: Double): js.Any = js.native
  def writeInt64LE(offset: Double, input: String): js.Any = js.native
  /** Shorthand for `ref.writeInt64LE`. */
  def writeInt64LE(offset: Double, input: Double): js.Any = js.native
  /** Shorthand for `ref.writeObject`. */
  def writeObject(offset: Double, `object`: js.Object): Unit = js.native
  /** Shorthand for `ref.writePointer`. */
  def writePointer(offset: Double, pointer: Buffer): Unit = js.native
  def writeUInt64BE(offset: Double, input: String): js.Any = js.native
  /** Shorthand for `ref.writeUInt64BE`. */
  def writeUInt64BE(offset: Double, input: Double): js.Any = js.native
  def writeUInt64LE(offset: Double, input: String): js.Any = js.native
  /** Shorthand for `ref.writeUInt64LE`. */
  def writeUInt64LE(offset: Double, input: Double): js.Any = js.native
}

