package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions")
@js.native
class EnumOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearAllowAlias(): EnumOptions = js.native
  
  def clearDeprecated(): EnumOptions = js.native
  
  def clearUninterpretedOptionList(): EnumOptions = js.native
  
  def getAllowAlias(): js.UndefOr[Boolean] = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasAllowAlias(): Boolean = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def setAllowAlias(value: Boolean): EnumOptions = js.native
  
  def setDeprecated(value: Boolean): EnumOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): EnumOptions = js.native
}
/* static members */
object EnumOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): EnumOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: EnumOptions, reader: BinaryReader): EnumOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: EnumOptions, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: EnumOptions): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var allowAlias: js.UndefOr[Boolean] = js.native
    
    var deprecated: js.UndefOr[Boolean] = js.native
    
    var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAlias(value: Boolean): Self = StObject.set(x, "allowAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAliasUndefined: Self = StObject.set(x, "allowAlias", js.undefined)
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value :_*))
    }
  }
}
