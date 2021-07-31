package typings.googleProtobuf.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "BinaryEncoder")
@js.native
class BinaryEncoder () extends StObject {
  
  def end(): js.Array[Double] = js.native
  
  def length(): Double = js.native
  
  def writeBool(value: Boolean): Unit = js.native
  
  def writeBytes(bytes: Uint8Array): Unit = js.native
  
  def writeDouble(value: Double): Unit = js.native
  
  def writeEnum(value: Double): Unit = js.native
  
  def writeFixedHash64(hash: String): Unit = js.native
  
  def writeFloat(value: Double): Unit = js.native
  
  def writeInt16(value: Double): Unit = js.native
  
  def writeInt32(value: Double): Unit = js.native
  
  def writeInt64(value: Double): Unit = js.native
  
  def writeInt64String(value: String): Unit = js.native
  
  def writeInt8(value: Double): Unit = js.native
  
  def writeSignedVarint32(value: Double): Unit = js.native
  
  def writeSignedVarint64(value: Double): Unit = js.native
  
  def writeSplitFixed64(lowBits: Double, highBits: Double): Unit = js.native
  
  def writeSplitVarint64(lowBits: Double, highBits: Double): Unit = js.native
  
  def writeString(value: String): Double = js.native
  
  def writeUint16(value: Double): Unit = js.native
  
  def writeUint32(value: Double): Unit = js.native
  
  def writeUint64(value: Double): Unit = js.native
  
  def writeUint8(value: Double): Unit = js.native
  
  def writeUnsignedVarint32(value: Double): Unit = js.native
  
  def writeUnsignedVarint64(value: Double): Unit = js.native
  
  def writeVarintHash64(hash: String): Unit = js.native
  
  def writeZigzagVarint32(value: Double): Unit = js.native
  
  def writeZigzagVarint64(value: Double): Unit = js.native
  
  def writeZigzagVarint64String(value: String): Unit = js.native
}
