package typings.easyXapiSupertest

import org.scalablytyped.runtime.NumberDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  */
@js.native
trait NodeBuffer
  extends StObject
     with /* index */ NumberDictionary[Double] {
  
  def compare(otherBuffer: Buffer): Double = js.native
  
  def copy(targetBuffer: Buffer): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Double): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Double): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Double): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
  
  def equals(otherBuffer: Buffer): Boolean = js.native
  
  def fill(value: Any): Unit = js.native
  def fill(value: Any, offset: Double): Unit = js.native
  def fill(value: Any, offset: Double, end: Double): Unit = js.native
  def fill(value: Any, offset: Unit, end: Double): Unit = js.native
  
  var length: Double = js.native
  
  def readDoubleBE(offset: Double): Double = js.native
  def readDoubleBE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readDoubleLE(offset: Double): Double = js.native
  def readDoubleLE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readFloatBE(offset: Double): Double = js.native
  def readFloatBE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readFloatLE(offset: Double): Double = js.native
  def readFloatLE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt16BE(offset: Double): Double = js.native
  def readInt16BE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt16LE(offset: Double): Double = js.native
  def readInt16LE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt32BE(offset: Double): Double = js.native
  def readInt32BE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt32LE(offset: Double): Double = js.native
  def readInt32LE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readInt8(offset: Double): Double = js.native
  def readInt8(offset: Double, noAssert: Boolean): Double = js.native
  
  def readIntBE(offset: Double, byteLength: Double): Double = js.native
  def readIntBE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  
  def readIntLE(offset: Double, byteLength: Double): Double = js.native
  def readIntLE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  
  def readUInt16BE(offset: Double): Double = js.native
  def readUInt16BE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt16LE(offset: Double): Double = js.native
  def readUInt16LE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt32BE(offset: Double): Double = js.native
  def readUInt32BE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt32LE(offset: Double): Double = js.native
  def readUInt32LE(offset: Double, noAssert: Boolean): Double = js.native
  
  def readUInt8(offset: Double): Double = js.native
  def readUInt8(offset: Double, noAsset: Boolean): Double = js.native
  
  def readUIntBE(offset: Double, byteLength: Double): Double = js.native
  def readUIntBE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  
  def readUIntLE(offset: Double, byteLength: Double): Double = js.native
  def readUIntLE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  
  def slice(): Buffer = js.native
  def slice(start: Double): Buffer = js.native
  def slice(start: Double, end: Double): Buffer = js.native
  def slice(start: Unit, end: Double): Buffer = js.native
  
  def toJSON(): Any = js.native
  
  def toString(encoding: String): String = js.native
  def toString(encoding: String, start: Double): String = js.native
  def toString(encoding: String, start: Double, end: Double): String = js.native
  def toString(encoding: String, start: Unit, end: Double): String = js.native
  def toString(encoding: Unit, start: Double): String = js.native
  def toString(encoding: Unit, start: Double, end: Double): String = js.native
  def toString(encoding: Unit, start: Unit, end: Double): String = js.native
  
  def write(string: String): Double = js.native
  def write(string: String, offset: Double): Double = js.native
  def write(string: String, offset: Double, length: Double): Double = js.native
  def write(string: String, offset: Double, length: Double, encoding: String): Double = js.native
  def write(string: String, offset: Double, length: Unit, encoding: String): Double = js.native
  def write(string: String, offset: Unit, length: Double): Double = js.native
  def write(string: String, offset: Unit, length: Double, encoding: String): Double = js.native
  def write(string: String, offset: Unit, length: Unit, encoding: String): Double = js.native
  
  def writeDoubleBE(value: Double, offset: Double): Unit = js.native
  def writeDoubleBE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeDoubleLE(value: Double, offset: Double): Unit = js.native
  def writeDoubleLE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeFloatBE(value: Double, offset: Double): Unit = js.native
  def writeFloatBE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeFloatLE(value: Double, offset: Double): Unit = js.native
  def writeFloatLE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeInt16BE(value: Double, offset: Double): Unit = js.native
  def writeInt16BE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeInt16LE(value: Double, offset: Double): Unit = js.native
  def writeInt16LE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeInt32BE(value: Double, offset: Double): Unit = js.native
  def writeInt32BE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeInt32LE(value: Double, offset: Double): Unit = js.native
  def writeInt32LE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeInt8(value: Double, offset: Double): Unit = js.native
  def writeInt8(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeIntBE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  
  def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeIntLE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  
  def writeUInt16BE(value: Double, offset: Double): Unit = js.native
  def writeUInt16BE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeUInt16LE(value: Double, offset: Double): Unit = js.native
  def writeUInt16LE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeUInt32BE(value: Double, offset: Double): Unit = js.native
  def writeUInt32BE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeUInt32LE(value: Double, offset: Double): Unit = js.native
  def writeUInt32LE(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeUInt8(value: Double, offset: Double): Unit = js.native
  def writeUInt8(value: Double, offset: Double, noAssert: Boolean): Unit = js.native
  
  def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeUIntBE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  
  def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeUIntLE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
}
