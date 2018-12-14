package typings
package googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext")
@js.native
class SourceContext ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getFileName(): java.lang.String = js.native
  def setFileName(value: java.lang.String): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext")
@js.native
object SourceContext extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext
  ): googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject = js.native
}

