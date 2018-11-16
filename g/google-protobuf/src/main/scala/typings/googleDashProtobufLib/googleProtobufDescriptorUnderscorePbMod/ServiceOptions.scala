package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceOptions")
@js.native
class ServiceOptions ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addUninterpretedOption(): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: scala.Double): scala.Unit = js.native
  def clearDeprecated(): scala.Unit = js.native
  def clearUninterpretedOptionList(): scala.Unit = js.native
  def getDeprecated(): scala.Boolean = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasDeprecated(): scala.Boolean = js.native
  def setDeprecated(value: scala.Boolean): scala.Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceOptions")
@js.native
object ServiceOptions extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptions = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptions,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptions = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptions,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptions
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptionsNs.AsObject = js.native
}

