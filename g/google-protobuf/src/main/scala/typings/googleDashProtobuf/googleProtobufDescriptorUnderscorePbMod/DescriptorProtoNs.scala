package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.AsObject
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
object DescriptorProtoNs extends js.Object {
  trait AsObject extends js.Object {
    var enumTypeList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.AsObject
      ]
    var extensionList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
      ]
    var extensionRangeList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRangeNs.AsObject
      ]
    var fieldList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
      ]
    var name: js.UndefOr[String] = js.undefined
    var nestedTypeList: js.Array[AsObject]
    var oneofDeclList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProtoNs.AsObject
      ]
    var options: js.UndefOr[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MessageOptionsNs.AsObject
      ] = js.undefined
    var reservedNameList: js.Array[String]
    var reservedRangeList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRangeNs.AsObject
      ]
  }
  
  @js.native
  class ExtensionRange () extends Message {
    def clearEnd(): Unit = js.native
    def clearOptions(): Unit = js.native
    def clearStart(): Unit = js.native
    def getEnd(): js.UndefOr[Double] = js.native
    def getOptions(): js.UndefOr[ExtensionRangeOptions] = js.native
    def getStart(): js.UndefOr[Double] = js.native
    def hasEnd(): Boolean = js.native
    def hasOptions(): Boolean = js.native
    def hasStart(): Boolean = js.native
    def setEnd(value: Double): Unit = js.native
    def setOptions(): Unit = js.native
    def setOptions(value: ExtensionRangeOptions): Unit = js.native
    def setStart(value: Double): Unit = js.native
  }
  
  @js.native
  class ReservedRange () extends Message {
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
  object ExtensionRange extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: Uint8Array): ExtensionRange = js.native
    def deserializeBinaryFromReader(message: ExtensionRange, reader: BinaryReader): ExtensionRange = js.native
    def serializeBinaryToWriter(message: ExtensionRange, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: ExtensionRange): typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRangeNs.AsObject = js.native
  }
  
  @JSName("ExtensionRange")
  @js.native
  object ExtensionRangeNs extends js.Object {
    trait AsObject extends js.Object {
      var end: js.UndefOr[Double] = js.undefined
      var options: js.UndefOr[
            typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ExtensionRangeOptionsNs.AsObject
          ] = js.undefined
      var start: js.UndefOr[Double] = js.undefined
    }
    
  }
  
  /* static members */
  @js.native
  object ReservedRange extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: Uint8Array): ReservedRange = js.native
    def deserializeBinaryFromReader(message: ReservedRange, reader: BinaryReader): ReservedRange = js.native
    def serializeBinaryToWriter(message: ReservedRange, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: ReservedRange): typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRangeNs.AsObject = js.native
  }
  
  @JSName("ReservedRange")
  @js.native
  object ReservedRangeNs extends js.Object {
    trait AsObject extends js.Object {
      var end: js.UndefOr[Double] = js.undefined
      var start: js.UndefOr[Double] = js.undefined
    }
    
  }
  
}

