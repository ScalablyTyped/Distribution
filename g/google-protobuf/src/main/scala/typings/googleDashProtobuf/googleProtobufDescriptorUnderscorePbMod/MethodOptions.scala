package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.AsObject
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
class MethodOptions () extends Message {
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  def clearDeprecated(): Unit = js.native
  def clearIdempotencyLevel(): Unit = js.native
  def clearUninterpretedOptionList(): Unit = js.native
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  def getIdempotencyLevel(): js.UndefOr[IdempotencyLevel] = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasDeprecated(): Boolean = js.native
  def hasIdempotencyLevel(): Boolean = js.native
  def setDeprecated(value: Boolean): Unit = js.native
  def setIdempotencyLevel(value: IdempotencyLevel): Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
object MethodOptions extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): MethodOptions = js.native
  def deserializeBinaryFromReader(message: MethodOptions, reader: BinaryReader): MethodOptions = js.native
  def serializeBinaryToWriter(message: MethodOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: MethodOptions): AsObject = js.native
}

