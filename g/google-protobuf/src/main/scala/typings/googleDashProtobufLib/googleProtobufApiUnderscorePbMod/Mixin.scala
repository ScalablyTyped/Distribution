package typings
package googleDashProtobufLib.googleProtobufApiUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/api_pb", "Mixin")
@js.native
class Mixin ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getName(): java.lang.String = js.native
  def getRoot(): java.lang.String = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setRoot(value: java.lang.String): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/api_pb", "Mixin")
@js.native
object Mixin extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Mixin = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Mixin,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Mixin = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Mixin,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(includeInstance: scala.Boolean, msg: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Mixin): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.MixinNs.AsObject = js.native
}

