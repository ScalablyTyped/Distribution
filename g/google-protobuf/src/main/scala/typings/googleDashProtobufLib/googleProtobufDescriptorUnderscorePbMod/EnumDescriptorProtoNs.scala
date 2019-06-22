package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
object EnumDescriptorProtoNs extends js.Object {
  trait AsObject extends js.Object {
    var name: js.UndefOr[java.lang.String] = js.undefined
    var options: js.UndefOr[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptionsNs.AsObject
      ] = js.undefined
    var reservedNameList: js.Array[java.lang.String]
    var reservedRangeList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRangeNs.AsObject
      ]
    var valueList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProtoNs.AsObject
      ]
  }
  
  @js.native
  class EnumReservedRange ()
    extends googleDashProtobufLib.googleDashProtobufMod.Message {
    def clearEnd(): scala.Unit = js.native
    def clearStart(): scala.Unit = js.native
    def getEnd(): js.UndefOr[scala.Double] = js.native
    def getStart(): js.UndefOr[scala.Double] = js.native
    def hasEnd(): scala.Boolean = js.native
    def hasStart(): scala.Boolean = js.native
    def setEnd(value: scala.Double): scala.Unit = js.native
    def setStart(value: scala.Double): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object EnumReservedRange extends js.Object {
    var extensions: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange = js.native
    def deserializeBinaryFromReader(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange,
      reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange = js.native
    def serializeBinaryToWriter(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange,
      writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
    ): scala.Unit = js.native
    def toObject(
      includeInstance: scala.Boolean,
      msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRangeNs.AsObject = js.native
  }
  
  @JSName("EnumReservedRange")
  @js.native
  object EnumReservedRangeNs extends js.Object {
    trait AsObject extends js.Object {
      var end: js.UndefOr[scala.Double] = js.undefined
      var start: js.UndefOr[scala.Double] = js.undefined
    }
    
  }
  
}

