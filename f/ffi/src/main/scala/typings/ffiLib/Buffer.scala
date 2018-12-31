package typings
package ffiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer extends js.Object {
  /** Shorthand for `ref.address`. */
  def address(): scala.Double = js.native
  /** Shorthand for `ref.deref`. */
  def deref(): js.Any = js.native
  /**
  	 * Generate string for inspecting.
  	 * String includes the hex-encoded memory address of the Buffer instance.
  	 */
  def inspect(): java.lang.String = js.native
  /** Shorthand for `ref.isNull`. */
  def isNull(): scala.Boolean = js.native
  /** Shorthand for `ref.readCString`. */
  def readCString(): java.lang.String = js.native
  def readCString(offset: scala.Double): java.lang.String = js.native
  /** Shorthand for `ref.readInt64BE`. */
  def readInt64BE(): java.lang.String = js.native
  def readInt64BE(offset: scala.Double): java.lang.String = js.native
  /** Shorthand for `ref.readInt64LE`. */
  def readInt64LE(): java.lang.String = js.native
  def readInt64LE(offset: scala.Double): java.lang.String = js.native
  /** Shorthand for `ref.readObject`. */
  def readObject(): java.lang.String = js.native
  def readObject(offset: scala.Double): java.lang.String = js.native
  /** Shorthand for `ref.readPointer`. */
  def readPointer(): java.lang.String = js.native
  def readPointer(offset: scala.Double): java.lang.String = js.native
  /** Shorthand for `ref.readUInt64BE`. */
  def readUInt64BE(): java.lang.String = js.native
  def readUInt64BE(offset: scala.Double): java.lang.String = js.native
  /** Shorthand for `ref.readUInt64LE`. */
  def readUInt64LE(): java.lang.String = js.native
  def readUInt64LE(offset: scala.Double): java.lang.String = js.native
  /** Shorthand for `ref.ref`. */
  def ref(): Buffer = js.native
  /** Shorthand for `ref.reinterpret`. */
  def reinterpret(size: scala.Double): Buffer = js.native
  def reinterpret(size: scala.Double, offset: scala.Double): Buffer = js.native
  /** Shorthand for `ref.reinterpretUntilZeros`. */
  def reinterpretUntilZeros(size: scala.Double): Buffer = js.native
  def reinterpretUntilZeros(size: scala.Double, offset: scala.Double): Buffer = js.native
  /** Shorthand for `ref.writeCString`. */
  def writeCString(offset: scala.Double, input: java.lang.String): scala.Unit = js.native
  def writeCString(offset: scala.Double, input: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def writeInt64BE(offset: scala.Double, input: java.lang.String): js.Any = js.native
  /** Shorthand for `ref.writeInt64BE`. */
  def writeInt64BE(offset: scala.Double, input: scala.Double): js.Any = js.native
  def writeInt64LE(offset: scala.Double, input: java.lang.String): js.Any = js.native
  /** Shorthand for `ref.writeInt64LE`. */
  def writeInt64LE(offset: scala.Double, input: scala.Double): js.Any = js.native
  /** Shorthand for `ref.writeObject`. */
  def writeObject(offset: scala.Double, `object`: js.Object): scala.Unit = js.native
  /** Shorthand for `ref.writePointer`. */
  def writePointer(offset: scala.Double, pointer: Buffer): scala.Unit = js.native
  def writeUInt64BE(offset: scala.Double, input: java.lang.String): js.Any = js.native
  /** Shorthand for `ref.writeUInt64BE`. */
  def writeUInt64BE(offset: scala.Double, input: scala.Double): js.Any = js.native
  def writeUInt64LE(offset: scala.Double, input: java.lang.String): js.Any = js.native
  /** Shorthand for `ref.writeUInt64LE`. */
  def writeUInt64LE(offset: scala.Double, input: scala.Double): js.Any = js.native
}

