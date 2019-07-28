package typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.MethodNs.AsObject
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/api_pb", "Method")
@js.native
class Method () extends Message {
  def addOptions(): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  def clearOptionsList(): Unit = js.native
  def getName(): String = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getRequestStreaming(): Boolean = js.native
  def getRequestTypeUrl(): String = js.native
  def getResponseStreaming(): Boolean = js.native
  def getResponseTypeUrl(): String = js.native
  def getSyntax(): Syntax = js.native
  def setName(value: String): Unit = js.native
  def setOptionsList(value: js.Array[Option]): Unit = js.native
  def setRequestStreaming(value: Boolean): Unit = js.native
  def setRequestTypeUrl(value: String): Unit = js.native
  def setResponseStreaming(value: Boolean): Unit = js.native
  def setResponseTypeUrl(value: String): Unit = js.native
  def setSyntax(value: Syntax): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/api_pb", "Method")
@js.native
object Method extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Method = js.native
  def deserializeBinaryFromReader(message: Method, reader: BinaryReader): Method = js.native
  def serializeBinaryToWriter(message: Method, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Method): AsObject = js.native
}

