package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "BinaryReader")
@js.native
class BinaryReader () extends js.Object {
  def this(bytes: googleDashProtobufLib.ByteSource) = this()
  def this(bytes: googleDashProtobufLib.ByteSource, start: scala.Double) = this()
  def this(bytes: googleDashProtobufLib.ByteSource, start: scala.Double, length: scala.Double) = this()
  @JSName("readMessage")
  var readMessage_Original: googleDashProtobufLib.BinaryRead = js.native
  def advance(count: scala.Double): scala.Unit = js.native
  def alloc(): BinaryReader = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource): BinaryReader = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource, start: scala.Double): BinaryReader = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource, start: scala.Double, length: scala.Double): BinaryReader = js.native
  def free(): scala.Unit = js.native
  def getBuffer(): stdLib.Uint8Array = js.native
  def getCursor(): scala.Double = js.native
  def getError(): scala.Boolean = js.native
  def getFieldCursor(): scala.Double = js.native
  def getFieldDecoder(): BinaryDecoder = js.native
  def getFieldNumber(): scala.Double = js.native
  def getWireType(): googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType = js.native
  def isEndGroup(): scala.Boolean = js.native
  def nextField(): scala.Boolean = js.native
  def readAny(fieldType: googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType): googleDashProtobufLib.AnyFieldType = js.native
  def readBool(): scala.Boolean = js.native
  def readBytes(): stdLib.Uint8Array = js.native
  def readDouble(): scala.Double = js.native
  def readEnum(): scala.Double = js.native
  def readFixed32(): scala.Double = js.native
  def readFixed64(): scala.Double = js.native
  def readFixed64String(): java.lang.String = js.native
  def readFixedHash64(): java.lang.String = js.native
  def readFloat(): scala.Double = js.native
  def readGroup(field: scala.Double, message: Message, reader: googleDashProtobufLib.BinaryReadReader): scala.Unit = js.native
  def readInt32(): scala.Double = js.native
  def readInt32String(): java.lang.String = js.native
  def readInt64(): scala.Double = js.native
  def readInt64String(): java.lang.String = js.native
  def readMessage(msg: js.Any, reader: googleDashProtobufLib.BinaryReadReader): scala.Unit = js.native
  def readPackedBool(): js.Array[scala.Boolean] = js.native
  def readPackedDouble(): js.Array[scala.Double] = js.native
  def readPackedEnum(): js.Array[scala.Double] = js.native
  def readPackedFixed32(): js.Array[scala.Double] = js.native
  def readPackedFixed64(): js.Array[scala.Double] = js.native
  def readPackedFixed64String(): js.Array[java.lang.String] = js.native
  def readPackedFixedHash64(): js.Array[java.lang.String] = js.native
  def readPackedFloat(): js.Array[scala.Double] = js.native
  def readPackedInt32(): js.Array[scala.Double] = js.native
  def readPackedInt32String(): js.Array[java.lang.String] = js.native
  def readPackedInt64(): js.Array[scala.Double] = js.native
  def readPackedInt64String(): js.Array[java.lang.String] = js.native
  def readPackedSfixed32(): js.Array[scala.Double] = js.native
  def readPackedSfixed64(): js.Array[scala.Double] = js.native
  def readPackedSfixed64String(): js.Array[java.lang.String] = js.native
  def readPackedSint32(): js.Array[scala.Double] = js.native
  def readPackedSint64(): js.Array[scala.Double] = js.native
  def readPackedSint64String(): js.Array[java.lang.String] = js.native
  def readPackedUint32(): js.Array[scala.Double] = js.native
  def readPackedUint32String(): js.Array[java.lang.String] = js.native
  def readPackedUint64(): js.Array[scala.Double] = js.native
  def readPackedUint64String(): js.Array[java.lang.String] = js.native
  def readPackedVarintHash64(): js.Array[java.lang.String] = js.native
  def readSfixed32(): scala.Double = js.native
  def readSfixed32String(): java.lang.String = js.native
  def readSfixed64(): scala.Double = js.native
  def readSfixed64String(): java.lang.String = js.native
  def readSint32(): scala.Double = js.native
  def readSint64(): scala.Double = js.native
  def readSint64String(): java.lang.String = js.native
  def readString(): java.lang.String = js.native
  def readUint32(): scala.Double = js.native
  def readUint32String(): java.lang.String = js.native
  def readUint64(): scala.Double = js.native
  def readUint64String(): java.lang.String = js.native
  def readVarintHash64(): java.lang.String = js.native
  def registerReadCallback(callbackName: java.lang.String, callback: js.Function1[/* binaryReader */ this.type, _]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def runReadCallback(callbackName: java.lang.String): js.Any = js.native
  def setBlock(): scala.Unit = js.native
  def setBlock(bytes: googleDashProtobufLib.ByteSource): scala.Unit = js.native
  def setBlock(bytes: googleDashProtobufLib.ByteSource, start: scala.Double): scala.Unit = js.native
  def setBlock(bytes: googleDashProtobufLib.ByteSource, start: scala.Double, length: scala.Double): scala.Unit = js.native
  def skipDelimitedField(): scala.Unit = js.native
  def skipField(): scala.Unit = js.native
  def skipFixed32Field(): scala.Unit = js.native
  def skipFixed64Field(): scala.Unit = js.native
  def skipGroup(): scala.Unit = js.native
  def skipMatchingFields(): scala.Unit = js.native
  def skipVarintField(): scala.Unit = js.native
  def unskipHeader(): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf", "BinaryReader")
@js.native
object BinaryReader extends js.Object {
  def alloc(): googleDashProtobufLib.googleDashProtobufMod.BinaryReader = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource): googleDashProtobufLib.googleDashProtobufMod.BinaryReader = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource, start: scala.Double): googleDashProtobufLib.googleDashProtobufMod.BinaryReader = js.native
  def alloc(bytes: googleDashProtobufLib.ByteSource, start: scala.Double, length: scala.Double): googleDashProtobufLib.googleDashProtobufMod.BinaryReader = js.native
}

