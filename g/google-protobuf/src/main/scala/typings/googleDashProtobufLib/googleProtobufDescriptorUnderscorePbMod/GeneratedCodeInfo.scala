package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
class GeneratedCodeInfo ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addAnnotation(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation = js.native
  def addAnnotation(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation = js.native
  def addAnnotation(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation,
    index: scala.Double
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation = js.native
  def clearAnnotationList(): scala.Unit = js.native
  def getAnnotationList(): js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation
  ] = js.native
  def setAnnotationList(
    value: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation
    ]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
object GeneratedCodeInfo extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfo = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfo,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfo = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfo,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfo
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.AsObject = js.native
}

