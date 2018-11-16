package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * @deprecated
 */
@js.native
trait NodeBuffer
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[scala.Double] {
  var length: scala.Double = js.native
  def compare(otherBuffer: Buffer): scala.Double = js.native
  def copy(targetBuffer: Buffer): scala.Double = js.native
  def copy(targetBuffer: Buffer, targetStart: scala.Double): scala.Double = js.native
  def copy(targetBuffer: Buffer, targetStart: scala.Double, sourceStart: scala.Double): scala.Double = js.native
  def copy(
    targetBuffer: Buffer,
    targetStart: scala.Double,
    sourceStart: scala.Double,
    sourceEnd: scala.Double
  ): scala.Double = js.native
  def equals(otherBuffer: Buffer): scala.Boolean = js.native
  def fill(value: js.Any): scala.Unit = js.native
  def fill(value: js.Any, offset: scala.Double): scala.Unit = js.native
  def fill(value: js.Any, offset: scala.Double, end: scala.Double): scala.Unit = js.native
  def readDoubleBE(offset: scala.Double): scala.Double = js.native
  def readDoubleBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readDoubleLE(offset: scala.Double): scala.Double = js.native
  def readDoubleLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readFloatBE(offset: scala.Double): scala.Double = js.native
  def readFloatBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readFloatLE(offset: scala.Double): scala.Double = js.native
  def readFloatLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt16BE(offset: scala.Double): scala.Double = js.native
  def readInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt16LE(offset: scala.Double): scala.Double = js.native
  def readInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt32BE(offset: scala.Double): scala.Double = js.native
  def readInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt32LE(offset: scala.Double): scala.Double = js.native
  def readInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt8(offset: scala.Double): scala.Double = js.native
  def readInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readIntBE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readIntBE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readIntLE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readIntLE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt16BE(offset: scala.Double): scala.Double = js.native
  def readUInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt16LE(offset: scala.Double): scala.Double = js.native
  def readUInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt32BE(offset: scala.Double): scala.Double = js.native
  def readUInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt32LE(offset: scala.Double): scala.Double = js.native
  def readUInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt8(offset: scala.Double): scala.Double = js.native
  def readUInt8(offset: scala.Double, noAsset: scala.Boolean): scala.Double = js.native
  def readUIntBE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readUIntBE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUIntLE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readUIntLE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def slice(): Buffer = js.native
  def slice(start: scala.Double): Buffer = js.native
  def slice(start: scala.Double, end: scala.Double): Buffer = js.native
  def toJSON(): js.Any = js.native
  def toString(encoding: java.lang.String): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = js.native
  def write(string: java.lang.String): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, length: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeInt8(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeInt8(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double): scala.Unit = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Unit = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
}

