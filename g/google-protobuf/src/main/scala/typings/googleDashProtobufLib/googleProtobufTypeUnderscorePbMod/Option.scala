package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Option")
@js.native
class Option ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def clearValue(): scala.Unit = js.native
  def getName(): java.lang.String = js.native
  def getValue(): js.UndefOr[googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.Any] = js.native
  def hasValue(): scala.Boolean = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setValue(): scala.Unit = js.native
  def setValue(value: googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.Any): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/type_pb", "Option")
@js.native
object Option extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option
  ): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject = js.native
}

