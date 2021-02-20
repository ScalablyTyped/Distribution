package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.FieldOptions.CType
import typings.googleProtobuf.descriptorPbMod.FieldOptions.JSType
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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
class FieldOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearCtype(): FieldOptions = js.native
  
  def clearDeprecated(): FieldOptions = js.native
  
  def clearJstype(): FieldOptions = js.native
  
  def clearLazy(): FieldOptions = js.native
  
  def clearPacked(): FieldOptions = js.native
  
  def clearUninterpretedOptionList(): FieldOptions = js.native
  
  def clearWeak(): FieldOptions = js.native
  
  def getCtype(): js.UndefOr[CType] = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getJstype(): js.UndefOr[JSType] = js.native
  
  def getLazy(): js.UndefOr[Boolean] = js.native
  
  def getPacked(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def getWeak(): js.UndefOr[Boolean] = js.native
  
  def hasCtype(): Boolean = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasJstype(): Boolean = js.native
  
  def hasLazy(): Boolean = js.native
  
  def hasPacked(): Boolean = js.native
  
  def hasWeak(): Boolean = js.native
  
  def setCtype(value: CType): FieldOptions = js.native
  
  def setDeprecated(value: Boolean): FieldOptions = js.native
  
  def setJstype(value: JSType): FieldOptions = js.native
  
  def setLazy(value: Boolean): FieldOptions = js.native
  
  def setPacked(value: Boolean): FieldOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): FieldOptions = js.native
  
  def setWeak(value: Boolean): FieldOptions = js.native
}
/* static members */
object FieldOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CType extends StObject
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.CType")
  @js.native
  object CType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CType with Double] = js.native
    
    @js.native
    sealed trait CORD extends CType
    /* 1 */ val CORD: typings.googleProtobuf.descriptorPbMod.FieldOptions.CType.CORD with Double = js.native
    
    @js.native
    sealed trait STRING extends CType
    /* 0 */ val STRING: typings.googleProtobuf.descriptorPbMod.FieldOptions.CType.STRING with Double = js.native
    
    @js.native
    sealed trait STRING_PIECE extends CType
    /* 2 */ val STRING_PIECE: typings.googleProtobuf.descriptorPbMod.FieldOptions.CType.STRING_PIECE with Double = js.native
  }
  
  @js.native
  sealed trait JSType extends StObject
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.JSType")
  @js.native
  object JSType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JSType with Double] = js.native
    
    @js.native
    sealed trait JS_NORMAL extends JSType
    /* 0 */ val JS_NORMAL: typings.googleProtobuf.descriptorPbMod.FieldOptions.JSType.JS_NORMAL with Double = js.native
    
    @js.native
    sealed trait JS_NUMBER extends JSType
    /* 2 */ val JS_NUMBER: typings.googleProtobuf.descriptorPbMod.FieldOptions.JSType.JS_NUMBER with Double = js.native
    
    @js.native
    sealed trait JS_STRING extends JSType
    /* 1 */ val JS_STRING: typings.googleProtobuf.descriptorPbMod.FieldOptions.JSType.JS_STRING with Double = js.native
  }
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): FieldOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: FieldOptions, reader: BinaryReader): FieldOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: FieldOptions, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: FieldOptions): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var ctype: js.UndefOr[CType] = js.native
    
    var deprecated: js.UndefOr[Boolean] = js.native
    
    var jstype: js.UndefOr[JSType] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var packed: js.UndefOr[Boolean] = js.native
    
    var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
    
    var weak: js.UndefOr[Boolean] = js.native
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
      def setCtype(value: CType): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtypeUndefined: Self = StObject.set(x, "ctype", js.undefined)
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setJstype(value: JSType): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJstypeUndefined: Self = StObject.set(x, "jstype", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
      
      @scala.inline
      def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value :_*))
      
      @scala.inline
      def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
    }
  }
}
