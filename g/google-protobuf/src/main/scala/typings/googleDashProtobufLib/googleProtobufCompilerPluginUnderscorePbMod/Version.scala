package typings
package googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
@js.native
class Version ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def clearMajor(): scala.Unit = js.native
  def clearMinor(): scala.Unit = js.native
  def clearPatch(): scala.Unit = js.native
  def clearSuffix(): scala.Unit = js.native
  def getMajor(): scala.Double = js.native
  def getMinor(): scala.Double = js.native
  def getPatch(): scala.Double = js.native
  def getSuffix(): java.lang.String = js.native
  def hasMajor(): scala.Boolean = js.native
  def hasMinor(): scala.Boolean = js.native
  def hasPatch(): scala.Boolean = js.native
  def hasSuffix(): scala.Boolean = js.native
  def setMajor(value: scala.Double): scala.Unit = js.native
  def setMinor(value: scala.Double): scala.Unit = js.native
  def setPatch(value: scala.Double): scala.Unit = js.native
  def setSuffix(value: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
@js.native
object Version extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.Version = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.Version,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.Version = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.Version,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.Version
  ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.VersionNs.AsObject = js.native
}

