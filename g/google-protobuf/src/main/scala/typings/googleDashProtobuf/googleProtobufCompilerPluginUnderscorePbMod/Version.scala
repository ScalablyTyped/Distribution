package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.VersionNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
@js.native
class Version () extends Message {
  def clearMajor(): Unit = js.native
  def clearMinor(): Unit = js.native
  def clearPatch(): Unit = js.native
  def clearSuffix(): Unit = js.native
  def getMajor(): js.UndefOr[Double] = js.native
  def getMinor(): js.UndefOr[Double] = js.native
  def getPatch(): js.UndefOr[Double] = js.native
  def getSuffix(): js.UndefOr[String] = js.native
  def hasMajor(): Boolean = js.native
  def hasMinor(): Boolean = js.native
  def hasPatch(): Boolean = js.native
  def hasSuffix(): Boolean = js.native
  def setMajor(value: Double): Unit = js.native
  def setMinor(value: Double): Unit = js.native
  def setPatch(value: Double): Unit = js.native
  def setSuffix(value: String): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
@js.native
object Version extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Version = js.native
  def deserializeBinaryFromReader(message: Version, reader: BinaryReader): Version = js.native
  def serializeBinaryToWriter(message: Version, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Version): AsObject = js.native
}

