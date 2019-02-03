package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
class MethodOptions ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addUninterpretedOption(): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: scala.Double): scala.Unit = js.native
  def clearDeprecated(): scala.Unit = js.native
  def clearIdempotencyLevel(): scala.Unit = js.native
  def clearUninterpretedOptionList(): scala.Unit = js.native
  def getDeprecated(): scala.Boolean = js.native
  def getIdempotencyLevel(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasDeprecated(): scala.Boolean = js.native
  def hasIdempotencyLevel(): scala.Boolean = js.native
  def setDeprecated(value: scala.Boolean): scala.Unit = js.native
  def setIdempotencyLevel(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel
  ): scala.Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
object MethodOptions extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptions = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptions,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptions = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptions,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptions
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.AsObject = js.native
}

