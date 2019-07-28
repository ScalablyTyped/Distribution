package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
object UninterpretedOptionNs extends js.Object {
  trait AsObject extends js.Object {
    var aggregateValue: js.UndefOr[String] = js.undefined
    var doubleValue: js.UndefOr[Double] = js.undefined
    var identifierValue: js.UndefOr[String] = js.undefined
    var nameList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePartNs.AsObject
      ]
    var negativeIntValue: js.UndefOr[Double] = js.undefined
    var positiveIntValue: js.UndefOr[Double] = js.undefined
    var stringValue: Uint8Array | String
  }
  
  @js.native
  class NamePart () extends Message {
    def clearIsExtension(): Unit = js.native
    def clearNamePart(): Unit = js.native
    def getIsExtension(): js.UndefOr[Boolean] = js.native
    def getNamePart(): js.UndefOr[String] = js.native
    def hasIsExtension(): Boolean = js.native
    def hasNamePart(): Boolean = js.native
    def setIsExtension(value: Boolean): Unit = js.native
    def setNamePart(value: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object NamePart extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: Uint8Array): NamePart = js.native
    def deserializeBinaryFromReader(message: NamePart, reader: BinaryReader): NamePart = js.native
    def serializeBinaryToWriter(message: NamePart, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: NamePart): typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePartNs.AsObject = js.native
  }
  
  @JSName("NamePart")
  @js.native
  object NamePartNs extends js.Object {
    trait AsObject extends js.Object {
      var isExtension: js.UndefOr[Boolean] = js.undefined
      var namePart: js.UndefOr[String] = js.undefined
    }
    
  }
  
}

