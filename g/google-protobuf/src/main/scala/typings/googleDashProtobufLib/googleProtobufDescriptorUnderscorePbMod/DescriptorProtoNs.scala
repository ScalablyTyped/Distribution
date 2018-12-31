package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
object DescriptorProtoNs extends js.Object {
  trait AsObject extends js.Object {
    var enumTypeList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.AsObject
      ]
    var extensionList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
      ]
    var extensionRangeList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRangeNs.AsObject
      ]
    var fieldList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
      ]
    var name: js.UndefOr[java.lang.String] = js.undefined
    var nestedTypeList: js.Array[js.Object]
    var oneofDeclList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProtoNs.AsObject
      ]
    var options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MessageOptionsNs.AsObject
    var reservedNameList: js.Array[java.lang.String]
    var reservedRangeList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRangeNs.AsObject
      ]
  }
  
  @js.native
  class ExtensionRange ()
    extends googleDashProtobufLib.googleDashProtobufMod.Message {
    def clearEnd(): scala.Unit = js.native
    def clearStart(): scala.Unit = js.native
    def getEnd(): scala.Double = js.native
    def getStart(): scala.Double = js.native
    def hasEnd(): scala.Boolean = js.native
    def hasStart(): scala.Boolean = js.native
    def setEnd(value: scala.Double): scala.Unit = js.native
    def setStart(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  class ReservedRange ()
    extends googleDashProtobufLib.googleDashProtobufMod.Message {
    def clearEnd(): scala.Unit = js.native
    def clearStart(): scala.Unit = js.native
    def getEnd(): scala.Double = js.native
    def getStart(): scala.Double = js.native
    def hasEnd(): scala.Boolean = js.native
    def hasStart(): scala.Boolean = js.native
    def setEnd(value: scala.Double): scala.Unit = js.native
    def setStart(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  object ExtensionRange extends js.Object {
    var extensions: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange = js.native
    def deserializeBinaryFromReader(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange,
      reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange = js.native
    def serializeBinaryToWriter(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange,
      writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
    ): scala.Unit = js.native
    def toObject(
      includeInstance: scala.Boolean,
      msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRangeNs.AsObject = js.native
  }
  
  @JSName("ExtensionRange")
  @js.native
  object ExtensionRangeNs extends js.Object {
    trait AsObject extends js.Object {
      var end: js.UndefOr[scala.Double] = js.undefined
      var start: js.UndefOr[scala.Double] = js.undefined
    }
    
  }
  
  @js.native
  object ReservedRange extends js.Object {
    var extensions: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange = js.native
    def deserializeBinaryFromReader(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange,
      reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange = js.native
    def serializeBinaryToWriter(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange,
      writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
    ): scala.Unit = js.native
    def toObject(
      includeInstance: scala.Boolean,
      msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRangeNs.AsObject = js.native
  }
  
  @JSName("ReservedRange")
  @js.native
  object ReservedRangeNs extends js.Object {
    trait AsObject extends js.Object {
      var end: js.UndefOr[scala.Double] = js.undefined
      var start: js.UndefOr[scala.Double] = js.undefined
    }
    
  }
  
}

