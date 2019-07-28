package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MessageOptionsNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
class MessageOptions () extends Message {
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  def clearDeprecated(): Unit = js.native
  def clearMapEntry(): Unit = js.native
  def clearMessageSetWireFormat(): Unit = js.native
  def clearNoStandardDescriptorAccessor(): Unit = js.native
  def clearUninterpretedOptionList(): Unit = js.native
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  def getMapEntry(): js.UndefOr[Boolean] = js.native
  def getMessageSetWireFormat(): js.UndefOr[Boolean] = js.native
  def getNoStandardDescriptorAccessor(): js.UndefOr[Boolean] = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasDeprecated(): Boolean = js.native
  def hasMapEntry(): Boolean = js.native
  def hasMessageSetWireFormat(): Boolean = js.native
  def hasNoStandardDescriptorAccessor(): Boolean = js.native
  def setDeprecated(value: Boolean): Unit = js.native
  def setMapEntry(value: Boolean): Unit = js.native
  def setMessageSetWireFormat(value: Boolean): Unit = js.native
  def setNoStandardDescriptorAccessor(value: Boolean): Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
object MessageOptions extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): MessageOptions = js.native
  def deserializeBinaryFromReader(message: MessageOptions, reader: BinaryReader): MessageOptions = js.native
  def serializeBinaryToWriter(message: MessageOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: MessageOptions): AsObject = js.native
}

