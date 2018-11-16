package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
object UninterpretedOptionNs extends js.Object {
  
  trait AsObject extends js.Object {
    var aggregateValue: js.UndefOr[java.lang.String] = js.undefined
    var doubleValue: js.UndefOr[scala.Double] = js.undefined
    var identifierValue: js.UndefOr[java.lang.String] = js.undefined
    var nameList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePartNs.AsObject
      ]
    var negativeIntValue: js.UndefOr[scala.Double] = js.undefined
    var positiveIntValue: js.UndefOr[scala.Double] = js.undefined
    var stringValue: stdLib.Uint8Array | java.lang.String
  }
  
  @js.native
  class NamePart ()
    extends googleDashProtobufLib.googleDashProtobufMod.Message {
    def clearIsExtension(): scala.Unit = js.native
    def clearNamePart(): scala.Unit = js.native
    def getIsExtension(): scala.Boolean = js.native
    def getNamePart(): java.lang.String = js.native
    def hasIsExtension(): scala.Boolean = js.native
    def hasNamePart(): scala.Boolean = js.native
    def setIsExtension(value: scala.Boolean): scala.Unit = js.native
    def setNamePart(value: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  object NamePart extends js.Object {
    var extensions: ScalablyTyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart = js.native
    def deserializeBinaryFromReader(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart,
      reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart = js.native
    def serializeBinaryToWriter(
      message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart,
      writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
    ): scala.Unit = js.native
    def toObject(
      includeInstance: scala.Boolean,
      msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart
    ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePartNs.AsObject = js.native
  }
  
  @JSName("NamePart")
  @js.native
  object NamePartNs extends js.Object {
    
    trait AsObject extends js.Object {
      var isExtension: js.UndefOr[scala.Boolean] = js.undefined
      var namePart: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
}

