package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
object SourceCodeInfoNs extends js.Object {
  
  trait AsObject extends js.Object {
    var locationList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.LocationNs.AsObject
      ]
  }
  
  @js.native
  class Location ()
    extends googleDashProtobufLib.googleDashProtobufMod.Message {
    def addLeadingDetachedComments(value: java.lang.String): scala.Unit = js.native
    def addLeadingDetachedComments(value: java.lang.String, index: scala.Double): scala.Unit = js.native
    def addPath(value: scala.Double): scala.Unit = js.native
    def addPath(value: scala.Double, index: scala.Double): scala.Unit = js.native
    def addSpan(value: scala.Double): scala.Unit = js.native
    def addSpan(value: scala.Double, index: scala.Double): scala.Unit = js.native
    def clearLeadingComments(): scala.Unit = js.native
    def clearLeadingDetachedCommentsList(): scala.Unit = js.native
    def clearPathList(): scala.Unit = js.native
    def clearSpanList(): scala.Unit = js.native
    def clearTrailingComments(): scala.Unit = js.native
    def getLeadingComments(): java.lang.String = js.native
    def getLeadingDetachedCommentsList(): js.Array[java.lang.String] = js.native
    def getPathList(): js.Array[scala.Double] = js.native
    def getSpanList(): js.Array[scala.Double] = js.native
    def getTrailingComments(): java.lang.String = js.native
    def hasLeadingComments(): scala.Boolean = js.native
    def hasTrailingComments(): scala.Boolean = js.native
    def setLeadingComments(value: java.lang.String): scala.Unit = js.native
    def setLeadingDetachedCommentsList(value: js.Array[java.lang.String]): scala.Unit = js.native
    def setPathList(value: js.Array[scala.Double]): scala.Unit = js.native
    def setSpanList(value: js.Array[scala.Double]): scala.Unit = js.native
    def setTrailingComments(value: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  object Location extends js.Object {
    var extensions: ScalablyTyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location = js.native
    def deserializeBinaryFromReader(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location,
      reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location = js.native
    def serializeBinaryToWriter(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location,
      writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
    ): scala.Unit = js.native
    def toObject(
      includeInstance: scala.Boolean,
      msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.LocationNs.AsObject = js.native
  }
  
  @JSName("Location")
  @js.native
  object LocationNs extends js.Object {
    
    trait AsObject extends js.Object {
      var leadingComments: js.UndefOr[java.lang.String] = js.undefined
      var leadingDetachedCommentsList: js.Array[java.lang.String]
      var pathList: js.Array[scala.Double]
      var spanList: js.Array[scala.Double]
      var trailingComments: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
}

