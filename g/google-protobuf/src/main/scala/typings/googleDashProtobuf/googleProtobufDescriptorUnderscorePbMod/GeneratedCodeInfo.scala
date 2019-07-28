package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
class GeneratedCodeInfo () extends Message {
  def addAnnotation(): Annotation = js.native
  def addAnnotation(value: Annotation): Annotation = js.native
  def addAnnotation(value: Annotation, index: Double): Annotation = js.native
  def clearAnnotationList(): Unit = js.native
  def getAnnotationList(): js.Array[Annotation] = js.native
  def setAnnotationList(value: js.Array[Annotation]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
object GeneratedCodeInfo extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): GeneratedCodeInfo = js.native
  def deserializeBinaryFromReader(message: GeneratedCodeInfo, reader: BinaryReader): GeneratedCodeInfo = js.native
  def serializeBinaryToWriter(message: GeneratedCodeInfo, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: GeneratedCodeInfo): AsObject = js.native
}

