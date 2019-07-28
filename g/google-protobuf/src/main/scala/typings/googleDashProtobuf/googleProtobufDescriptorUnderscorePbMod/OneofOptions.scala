package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofOptionsNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofOptions")
@js.native
class OneofOptions () extends Message {
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  def clearUninterpretedOptionList(): Unit = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofOptions")
@js.native
object OneofOptions extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): OneofOptions = js.native
  def deserializeBinaryFromReader(message: OneofOptions, reader: BinaryReader): OneofOptions = js.native
  def serializeBinaryToWriter(message: OneofOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: OneofOptions): AsObject = js.native
}

