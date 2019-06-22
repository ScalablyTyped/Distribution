package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
class SourceCodeInfo ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addLocation(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location = js.native
  def addLocation(value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location = js.native
  def addLocation(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location,
    index: scala.Double
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location = js.native
  def clearLocationList(): scala.Unit = js.native
  def getLocationList(): js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location
  ] = js.native
  def setLocationList(
    value: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location
    ]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
object SourceCodeInfo extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.AsObject = js.native
}

