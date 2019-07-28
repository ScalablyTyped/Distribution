package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
object GeneratedCodeInfoNs extends js.Object {
  @js.native
  class Annotation () extends Message {
    def addPath(value: Double): Double = js.native
    def addPath(value: Double, index: Double): Double = js.native
    def clearBegin(): Unit = js.native
    def clearEnd(): Unit = js.native
    def clearPathList(): Unit = js.native
    def clearSourceFile(): Unit = js.native
    def getBegin(): js.UndefOr[Double] = js.native
    def getEnd(): js.UndefOr[Double] = js.native
    def getPathList(): js.Array[Double] = js.native
    def getSourceFile(): js.UndefOr[String] = js.native
    def hasBegin(): Boolean = js.native
    def hasEnd(): Boolean = js.native
    def hasSourceFile(): Boolean = js.native
    def setBegin(value: Double): Unit = js.native
    def setEnd(value: Double): Unit = js.native
    def setPathList(value: js.Array[Double]): Unit = js.native
    def setSourceFile(value: String): Unit = js.native
  }
  
  trait AsObject extends js.Object {
    var annotationList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.AnnotationNs.AsObject
      ]
  }
  
  /* static members */
  @js.native
  object Annotation extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: Uint8Array): Annotation = js.native
    def deserializeBinaryFromReader(message: Annotation, reader: BinaryReader): Annotation = js.native
    def serializeBinaryToWriter(message: Annotation, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: Annotation): typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.AnnotationNs.AsObject = js.native
  }
  
  @JSName("Annotation")
  @js.native
  object AnnotationNs extends js.Object {
    trait AsObject extends js.Object {
      var begin: js.UndefOr[Double] = js.undefined
      var end: js.UndefOr[Double] = js.undefined
      var pathList: js.Array[Double]
      var sourceFile: js.UndefOr[String] = js.undefined
    }
    
  }
  
}

