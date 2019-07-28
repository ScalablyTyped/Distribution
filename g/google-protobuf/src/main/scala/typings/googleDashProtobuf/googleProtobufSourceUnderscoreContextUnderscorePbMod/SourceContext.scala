package typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext")
@js.native
class SourceContext () extends Message {
  def getFileName(): String = js.native
  def setFileName(value: String): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext")
@js.native
object SourceContext extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): SourceContext = js.native
  def deserializeBinaryFromReader(message: SourceContext, reader: BinaryReader): SourceContext = js.native
  def serializeBinaryToWriter(message: SourceContext, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: SourceContext): AsObject = js.native
}

