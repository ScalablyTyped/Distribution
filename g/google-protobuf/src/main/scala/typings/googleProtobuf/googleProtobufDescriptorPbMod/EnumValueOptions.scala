package typings.googleProtobuf.googleProtobufDescriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions")
@js.native
open class EnumValueOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: Unit, index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearDeprecated(): EnumValueOptions = js.native
  
  def clearUninterpretedOptionList(): EnumValueOptions = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def setDeprecated(value: Boolean): EnumValueOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): EnumValueOptions = js.native
}
/* static members */
object EnumValueOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  
  inline def deserializeBinaryFromReader(message: EnumValueOptions, reader: BinaryReader): EnumValueOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[EnumValueOptions]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: EnumValueOptions, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: EnumValueOptions): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var uninterpretedOptionList: js.Array[
        typings.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
      ]
  }
  object AsObject {
    
    inline def apply(
      uninterpretedOptionList: js.Array[
          typings.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
        ]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setUninterpretedOptionList(
        value: js.Array[
              typings.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
            ]
      ): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      inline def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value*))
    }
  }
}
