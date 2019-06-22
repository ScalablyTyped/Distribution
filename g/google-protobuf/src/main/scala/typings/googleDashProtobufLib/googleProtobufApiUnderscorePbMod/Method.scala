package typings
package googleDashProtobufLib.googleProtobufApiUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/api_pb", "Method")
@js.native
class Method ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addOptions(): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option = js.native
  def addOptions(value: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option = js.native
  def addOptions(value: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option, index: scala.Double): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option = js.native
  def clearOptionsList(): scala.Unit = js.native
  def getName(): java.lang.String = js.native
  def getOptionsList(): js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option] = js.native
  def getRequestStreaming(): scala.Boolean = js.native
  def getRequestTypeUrl(): java.lang.String = js.native
  def getResponseStreaming(): scala.Boolean = js.native
  def getResponseTypeUrl(): java.lang.String = js.native
  def getSyntax(): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOptionsList(value: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option]): scala.Unit = js.native
  def setRequestStreaming(value: scala.Boolean): scala.Unit = js.native
  def setRequestTypeUrl(value: java.lang.String): scala.Unit = js.native
  def setResponseStreaming(value: scala.Boolean): scala.Unit = js.native
  def setResponseTypeUrl(value: java.lang.String): scala.Unit = js.native
  def setSyntax(value: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/api_pb", "Method")
@js.native
object Method extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Method = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Method,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Method = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Method,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(includeInstance: scala.Boolean, msg: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Method): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.MethodNs.AsObject = js.native
}

