package typings
package googleDashProtobufLib.googleProtobufApiUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/api_pb", "Api")
@js.native
class Api ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addMethods(): scala.Unit = js.native
  def addMethods(value: Method): scala.Unit = js.native
  def addMethods(value: Method, index: scala.Double): scala.Unit = js.native
  def addMixins(): scala.Unit = js.native
  def addMixins(value: Mixin): scala.Unit = js.native
  def addMixins(value: Mixin, index: scala.Double): scala.Unit = js.native
  def addOptions(): scala.Unit = js.native
  def addOptions(value: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option): scala.Unit = js.native
  def addOptions(value: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option, index: scala.Double): scala.Unit = js.native
  def clearMethodsList(): scala.Unit = js.native
  def clearMixinsList(): scala.Unit = js.native
  def clearOptionsList(): scala.Unit = js.native
  def clearSourceContext(): scala.Unit = js.native
  def getMethodsList(): js.Array[Method] = js.native
  def getMixinsList(): js.Array[Mixin] = js.native
  def getName(): java.lang.String = js.native
  def getOptionsList(): js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option] = js.native
  def getSourceContext(): js.UndefOr[
    googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext
  ] = js.native
  def getSyntax(): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax = js.native
  def getVersion(): java.lang.String = js.native
  def hasSourceContext(): scala.Boolean = js.native
  def setMethodsList(value: js.Array[Method]): scala.Unit = js.native
  def setMixinsList(value: js.Array[Mixin]): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOptionsList(value: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Option]): scala.Unit = js.native
  def setSourceContext(): scala.Unit = js.native
  def setSourceContext(value: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext): scala.Unit = js.native
  def setSyntax(value: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax): scala.Unit = js.native
  def setVersion(value: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/api_pb", "Api")
@js.native
object Api extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Api = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Api,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Api = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Api,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(includeInstance: scala.Boolean, msg: googleDashProtobufLib.googleProtobufApiUnderscorePbMod.Api): googleDashProtobufLib.googleProtobufApiUnderscorePbMod.ApiNs.AsObject = js.native
}

