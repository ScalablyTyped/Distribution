package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "BinaryDecoder")
@js.native
class BinaryDecoder () extends js.Object {
  def this(bytes: googleDashProtobufLib.ByteSource) = this()
  def this(bytes: googleDashProtobufLib.ByteSource, start: scala.Double) = this()
  def this(bytes: googleDashProtobufLib.ByteSource, start: scala.Double, length: scala.Double) = this()
  def advance(count: scala.Double): scala.Unit = js.native
  def atEnd(): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def free(): scala.Unit = js.native
  def getBuffer(): stdLib.Uint8Array = js.native
  def getCursor(): scala.Double = js.native
  def getEnd(): scala.Double = js.native
  def getError(): scala.Boolean = js.native
  def pastEnd(): scala.Boolean = js.native
  def readBool(): scala.Boolean = js.native
  def readBytes(length: scala.Double): stdLib.Uint8Array = js.native
  def readDouble(): scala.Double = js.native
  def readEnum(): scala.Double = js.native
  def readFixedHash64(): java.lang.String = js.native
  def readFloat(): scala.Double = js.native
  def readInt16(): scala.Double = js.native
  def readInt32(): scala.Double = js.native
  def readInt64(): scala.Double = js.native
  def readInt64String(): java.lang.String = js.native
  def readInt8(): scala.Double = js.native
  def readSignedVarint32(): scala.Double = js.native
  def readSignedVarint32String(): scala.Double = js.native
  def readSignedVarint64(): scala.Double = js.native
  def readSignedVarint64String(): scala.Double = js.native
  def readString(length: scala.Double): java.lang.String = js.native
  def readStringWithLength(): java.lang.String = js.native
  def readUint16(): scala.Double = js.native
  def readUint32(): scala.Double = js.native
  def readUint64(): scala.Double = js.native
  def readUint64String(): java.lang.String = js.native
  def readUint8(): scala.Double = js.native
  def readUnsignedVarint32(): scala.Double = js.native
  def readUnsignedVarint32String(): scala.Double = js.native
  def readUnsignedVarint64(): scala.Double = js.native
  def readUnsignedVarint64String(): scala.Double = js.native
  def readVarintHash64(): java.lang.String = js.native
  def readZigzagVarint32(): scala.Double = js.native
  def readZigzagVarint64(): scala.Double = js.native
  def readZigzagVarint64String(): scala.Double = js.native
  def reset(): scala.Unit = js.native
  def setBlock(data: googleDashProtobufLib.ByteSource): scala.Unit = js.native
  def setBlock(data: googleDashProtobufLib.ByteSource, start: scala.Double): scala.Unit = js.native
  def setBlock(data: googleDashProtobufLib.ByteSource, start: scala.Double, length: scala.Double): scala.Unit = js.native
  def setCursor(cursor: scala.Double): scala.Unit = js.native
  def setEnd(end: scala.Double): scala.Unit = js.native
  def skipVarint(): scala.Unit = js.native
  def unskipVarint(value: scala.Double): scala.Unit = js.native
}

@JSImport("google-protobuf", "BinaryDecoder")
@js.native
object BinaryDecoder extends js.Object {
  def alloc(): googleDashProtobufLib.googleDashProtobufMod.BinaryDecoder = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource): googleDashProtobufLib.googleDashProtobufMod.BinaryDecoder = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource, start: scala.Double): googleDashProtobufLib.googleDashProtobufMod.BinaryDecoder = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource, start: scala.Double, length: scala.Double): googleDashProtobufLib.googleDashProtobufMod.BinaryDecoder = js.native
}

