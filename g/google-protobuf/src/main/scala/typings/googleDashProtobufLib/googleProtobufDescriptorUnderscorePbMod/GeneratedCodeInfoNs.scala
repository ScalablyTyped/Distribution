package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
object GeneratedCodeInfoNs extends js.Object {
  @js.native
  class Annotation ()
    extends googleDashProtobufLib.googleDashProtobufMod.Message {
    def addPath(value: scala.Double): scala.Unit = js.native
    def addPath(value: scala.Double, index: scala.Double): scala.Unit = js.native
    def clearBegin(): scala.Unit = js.native
    def clearEnd(): scala.Unit = js.native
    def clearPathList(): scala.Unit = js.native
    def clearSourceFile(): scala.Unit = js.native
    def getBegin(): scala.Double = js.native
    def getEnd(): scala.Double = js.native
    def getPathList(): js.Array[scala.Double] = js.native
    def getSourceFile(): java.lang.String = js.native
    def hasBegin(): scala.Boolean = js.native
    def hasEnd(): scala.Boolean = js.native
    def hasSourceFile(): scala.Boolean = js.native
    def setBegin(value: scala.Double): scala.Unit = js.native
    def setEnd(value: scala.Double): scala.Unit = js.native
    def setPathList(value: js.Array[scala.Double]): scala.Unit = js.native
    def setSourceFile(value: java.lang.String): scala.Unit = js.native
  }
  
  
  trait AsObject extends js.Object {
    var annotationList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.AnnotationNs.AsObject
      ]
  }
  
  @js.native
  object Annotation extends js.Object {
    var extensions: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation = js.native
    def deserializeBinaryFromReader(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation,
      reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation = js.native
    def serializeBinaryToWriter(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation,
      writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
    ): scala.Unit = js.native
    def toObject(
      includeInstance: scala.Boolean,
      msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.Annotation
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.GeneratedCodeInfoNs.AnnotationNs.AsObject = js.native
  }
  
  @JSName("Annotation")
  @js.native
  object AnnotationNs extends js.Object {
    
    trait AsObject extends js.Object {
      var begin: js.UndefOr[scala.Double] = js.undefined
      var end: js.UndefOr[scala.Double] = js.undefined
      var pathList: js.Array[scala.Double]
      var sourceFile: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
}

