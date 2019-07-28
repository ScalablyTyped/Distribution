package typings.googleDashProtobuf.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "ExtensionFieldBinaryInfo")
@js.native
class ExtensionFieldBinaryInfo[T] protected () extends js.Object {
  def this(
    fieldInfo: ExtensionFieldInfo[T],
    binaryReaderFn: BinaryRead,
    binaryWriterFn: BinaryWrite,
    opt_binaryMessageSerializeFn: js.Function2[/* msg */ Message, /* writer */ BinaryWriter, Unit],
    opt_binaryMessageDeserializeFn: js.Function2[/* msg */ Message, /* reader */ BinaryReader, Message],
    opt_isPacked: Boolean
  ) = this()
  @JSName("binaryReaderFn")
  var binaryReaderFn_Original: BinaryRead = js.native
  @JSName("binaryWriterFn")
  var binaryWriterFn_Original: BinaryWrite = js.native
  var fieldInfo: ExtensionFieldInfo[T] = js.native
  var opt_isPacked: Boolean = js.native
  def binaryReaderFn(msg: js.Any, reader: BinaryReadReader): Unit = js.native
  def binaryWriterFn(fieldNumber: Double, value: js.Any, writerCallback: BinaryWriteCallback): Unit = js.native
  def opt_binaryMessageDeserializeFn(msg: Message, reader: BinaryReader): Message = js.native
  def opt_binaryMessageSerializeFn(msg: Message, writer: BinaryWriter): Unit = js.native
}

