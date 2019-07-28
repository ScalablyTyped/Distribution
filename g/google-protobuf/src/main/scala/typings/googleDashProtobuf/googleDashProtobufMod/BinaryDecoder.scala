package typings.googleDashProtobuf.googleDashProtobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "BinaryDecoder")
@js.native
class BinaryDecoder () extends js.Object {
  def this(bytes: ByteSource) = this()
  def this(bytes: ByteSource, start: Double) = this()
  def this(bytes: ByteSource, start: Double, length: Double) = this()
  def advance(count: Double): Unit = js.native
  def atEnd(): Boolean = js.native
  def clear(): Unit = js.native
  def free(): Unit = js.native
  def getBuffer(): Uint8Array = js.native
  def getCursor(): Double = js.native
  def getEnd(): Double = js.native
  def getError(): Boolean = js.native
  def pastEnd(): Boolean = js.native
  def readBool(): Boolean = js.native
  def readBytes(length: Double): Uint8Array = js.native
  def readDouble(): Double = js.native
  def readEnum(): Double = js.native
  def readFixedHash64(): String = js.native
  def readFloat(): Double = js.native
  def readInt16(): Double = js.native
  def readInt32(): Double = js.native
  def readInt64(): Double = js.native
  def readInt64String(): String = js.native
  def readInt8(): Double = js.native
  def readSignedVarint32(): Double = js.native
  def readSignedVarint32String(): Double = js.native
  def readSignedVarint64(): Double = js.native
  def readSignedVarint64String(): Double = js.native
  def readString(length: Double): String = js.native
  def readStringWithLength(): String = js.native
  def readUint16(): Double = js.native
  def readUint32(): Double = js.native
  def readUint64(): Double = js.native
  def readUint64String(): String = js.native
  def readUint8(): Double = js.native
  def readUnsignedVarint32(): Double = js.native
  def readUnsignedVarint32String(): Double = js.native
  def readUnsignedVarint64(): Double = js.native
  def readUnsignedVarint64String(): Double = js.native
  def readVarintHash64(): String = js.native
  def readZigzagVarint32(): Double = js.native
  def readZigzagVarint64(): Double = js.native
  def readZigzagVarint64String(): Double = js.native
  def reset(): Unit = js.native
  def setBlock(data: ByteSource): Unit = js.native
  def setBlock(data: ByteSource, start: Double): Unit = js.native
  def setBlock(data: ByteSource, start: Double, length: Double): Unit = js.native
  def setCursor(cursor: Double): Unit = js.native
  def setEnd(end: Double): Unit = js.native
  def skipVarint(): Unit = js.native
  def unskipVarint(value: Double): Unit = js.native
}

/* static members */
@JSImport("google-protobuf", "BinaryDecoder")
@js.native
object BinaryDecoder extends js.Object {
  def alloc(): BinaryDecoder = js.native
  def alloc(bytes: ByteSource): BinaryDecoder = js.native
  def alloc(bytes: ByteSource, start: Double): BinaryDecoder = js.native
  def alloc(bytes: ByteSource, start: Double, length: Double): BinaryDecoder = js.native
}

