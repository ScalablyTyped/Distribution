package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.AsObject
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
class FieldOptions () extends Message {
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  def clearCtype(): Unit = js.native
  def clearDeprecated(): Unit = js.native
  def clearJstype(): Unit = js.native
  def clearLazy(): Unit = js.native
  def clearPacked(): Unit = js.native
  def clearUninterpretedOptionList(): Unit = js.native
  def clearWeak(): Unit = js.native
  def getCtype(): js.UndefOr[CType] = js.native
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  def getJstype(): js.UndefOr[JSType] = js.native
  def getLazy(): js.UndefOr[Boolean] = js.native
  def getPacked(): js.UndefOr[Boolean] = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def getWeak(): js.UndefOr[Boolean] = js.native
  def hasCtype(): Boolean = js.native
  def hasDeprecated(): Boolean = js.native
  def hasJstype(): Boolean = js.native
  def hasLazy(): Boolean = js.native
  def hasPacked(): Boolean = js.native
  def hasWeak(): Boolean = js.native
  def setCtype(value: CType): Unit = js.native
  def setDeprecated(value: Boolean): Unit = js.native
  def setJstype(value: JSType): Unit = js.native
  def setLazy(value: Boolean): Unit = js.native
  def setPacked(value: Boolean): Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): Unit = js.native
  def setWeak(value: Boolean): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
object FieldOptions extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): FieldOptions = js.native
  def deserializeBinaryFromReader(message: FieldOptions, reader: BinaryReader): FieldOptions = js.native
  def serializeBinaryToWriter(message: FieldOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: FieldOptions): AsObject = js.native
}

