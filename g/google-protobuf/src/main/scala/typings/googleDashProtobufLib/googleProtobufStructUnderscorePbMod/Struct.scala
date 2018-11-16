package typings
package googleDashProtobufLib.googleProtobufStructUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
@js.native
class Struct ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def clearFieldsMap(): scala.Unit = js.native
  def getFieldsMap(): googleDashProtobufLib.googleDashProtobufMod.Map[java.lang.String, Value] = js.native
  def toJavaScript(): ScalablyTyped.runtime.StringDictionary[JavaScriptValue] = js.native
}

@JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
@js.native
object Struct extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Struct = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Struct,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Struct = js.native
  def fromJavaScript(
    value: ScalablyTyped.runtime.StringDictionary[googleDashProtobufLib.googleProtobufStructUnderscorePbMod.JavaScriptValue]
  ): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Struct = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Struct,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Struct
  ): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.StructNs.AsObject = js.native
}

