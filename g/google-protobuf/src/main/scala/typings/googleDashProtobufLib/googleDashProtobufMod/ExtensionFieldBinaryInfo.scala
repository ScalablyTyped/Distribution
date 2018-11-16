package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "ExtensionFieldBinaryInfo")
@js.native
class ExtensionFieldBinaryInfo[T] protected () extends js.Object {
  def this(fieldInfo: ExtensionFieldInfo[T], binaryReaderFn: googleDashProtobufLib.BinaryRead, binaryWriterFn: googleDashProtobufLib.BinaryWrite, opt_binaryMessageSerializeFn: js.Function2[/* msg */ Message, /* writer */ BinaryWriter, scala.Unit], opt_binaryMessageDeserializeFn: js.Function2[/* msg */ Message, /* reader */ BinaryReader, Message], opt_isPacked: scala.Boolean) = this()
  @JSName("binaryReaderFn")
  var binaryReaderFn_Original: googleDashProtobufLib.BinaryRead = js.native
  @JSName("binaryWriterFn")
  var binaryWriterFn_Original: googleDashProtobufLib.BinaryWrite = js.native
  var fieldInfo: ExtensionFieldInfo[T] = js.native
  var opt_isPacked: scala.Boolean = js.native
  def binaryReaderFn(msg: js.Any, reader: googleDashProtobufLib.BinaryReadReader): scala.Unit = js.native
  def binaryWriterFn(
    fieldNumber: scala.Double,
    value: js.Any,
    writerCallback: googleDashProtobufLib.BinaryWriteCallback
  ): scala.Unit = js.native
  def opt_binaryMessageDeserializeFn(msg: Message, reader: BinaryReader): Message = js.native
  def opt_binaryMessageSerializeFn(msg: Message, writer: BinaryWriter): scala.Unit = js.native
}

