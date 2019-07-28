package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.Location
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
object SourceCodeInfoNs extends js.Object {
  trait AsObject extends js.Object {
    var locationList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.LocationNs.AsObject
      ]
  }
  
  @js.native
  class Location () extends Message {
    def addLeadingDetachedComments(value: String): String = js.native
    def addLeadingDetachedComments(value: String, index: Double): String = js.native
    def addPath(value: Double): Double = js.native
    def addPath(value: Double, index: Double): Double = js.native
    def addSpan(value: Double): Double = js.native
    def addSpan(value: Double, index: Double): Double = js.native
    def clearLeadingComments(): Unit = js.native
    def clearLeadingDetachedCommentsList(): Unit = js.native
    def clearPathList(): Unit = js.native
    def clearSpanList(): Unit = js.native
    def clearTrailingComments(): Unit = js.native
    def getLeadingComments(): js.UndefOr[String] = js.native
    def getLeadingDetachedCommentsList(): js.Array[String] = js.native
    def getPathList(): js.Array[Double] = js.native
    def getSpanList(): js.Array[Double] = js.native
    def getTrailingComments(): js.UndefOr[String] = js.native
    def hasLeadingComments(): Boolean = js.native
    def hasTrailingComments(): Boolean = js.native
    def setLeadingComments(value: String): Unit = js.native
    def setLeadingDetachedCommentsList(value: js.Array[String]): Unit = js.native
    def setPathList(value: js.Array[Double]): Unit = js.native
    def setSpanList(value: js.Array[Double]): Unit = js.native
    def setTrailingComments(value: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Location extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: Uint8Array): Location = js.native
    def deserializeBinaryFromReader(message: Location, reader: BinaryReader): Location = js.native
    def serializeBinaryToWriter(message: Location, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: Location): typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.LocationNs.AsObject = js.native
  }
  
  @JSName("Location")
  @js.native
  object LocationNs extends js.Object {
    trait AsObject extends js.Object {
      var leadingComments: js.UndefOr[String] = js.undefined
      var leadingDetachedCommentsList: js.Array[String]
      var pathList: js.Array[Double]
      var spanList: js.Array[Double]
      var trailingComments: js.UndefOr[String] = js.undefined
    }
    
  }
  
}

