package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumOptionsNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions")
@js.native
class EnumOptions () extends Message {
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  def clearAllowAlias(): Unit = js.native
  def clearDeprecated(): Unit = js.native
  def clearUninterpretedOptionList(): Unit = js.native
  def getAllowAlias(): js.UndefOr[Boolean] = js.native
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasAllowAlias(): Boolean = js.native
  def hasDeprecated(): Boolean = js.native
  def setAllowAlias(value: Boolean): Unit = js.native
  def setDeprecated(value: Boolean): Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions")
@js.native
object EnumOptions extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): EnumOptions = js.native
  def deserializeBinaryFromReader(message: EnumOptions, reader: BinaryReader): EnumOptions = js.native
  def serializeBinaryToWriter(message: EnumOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: EnumOptions): AsObject = js.native
}

