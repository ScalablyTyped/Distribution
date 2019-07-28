package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
object EnumDescriptorProtoNs extends js.Object {
  trait AsObject extends js.Object {
    var name: js.UndefOr[String] = js.undefined
    var options: js.UndefOr[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumOptionsNs.AsObject
      ] = js.undefined
    var reservedNameList: js.Array[String]
    var reservedRangeList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRangeNs.AsObject
      ]
    var valueList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProtoNs.AsObject
      ]
  }
  
  @js.native
  class EnumReservedRange () extends Message {
    def clearEnd(): Unit = js.native
    def clearStart(): Unit = js.native
    def getEnd(): js.UndefOr[Double] = js.native
    def getStart(): js.UndefOr[Double] = js.native
    def hasEnd(): Boolean = js.native
    def hasStart(): Boolean = js.native
    def setEnd(value: Double): Unit = js.native
    def setStart(value: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object EnumReservedRange extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: Uint8Array): EnumReservedRange = js.native
    def deserializeBinaryFromReader(message: EnumReservedRange, reader: BinaryReader): EnumReservedRange = js.native
    def serializeBinaryToWriter(message: EnumReservedRange, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: EnumReservedRange): typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRangeNs.AsObject = js.native
  }
  
  @JSName("EnumReservedRange")
  @js.native
  object EnumReservedRangeNs extends js.Object {
    trait AsObject extends js.Object {
      var end: js.UndefOr[Double] = js.undefined
      var start: js.UndefOr[Double] = js.undefined
    }
    
  }
  
}

