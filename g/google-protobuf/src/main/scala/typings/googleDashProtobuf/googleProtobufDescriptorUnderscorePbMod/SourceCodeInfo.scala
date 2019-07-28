package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.AsObject
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
class SourceCodeInfo () extends Message {
  def addLocation(): Location = js.native
  def addLocation(value: Location): Location = js.native
  def addLocation(value: Location, index: Double): Location = js.native
  def clearLocationList(): Unit = js.native
  def getLocationList(): js.Array[Location] = js.native
  def setLocationList(value: js.Array[Location]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
object SourceCodeInfo extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): SourceCodeInfo = js.native
  def deserializeBinaryFromReader(message: SourceCodeInfo, reader: BinaryReader): SourceCodeInfo = js.native
  def serializeBinaryToWriter(message: SourceCodeInfo, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: SourceCodeInfo): AsObject = js.native
}

