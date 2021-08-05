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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
class FieldOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: Unit, index: Double): UninterpretedOption = js.native
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
    def apply(value: Double): js.UndefOr[CType & Double] = js.native
    
    @js.native
    sealed trait CORD
      extends StObject
         with CType
    /* 1 */ val CORD: typings.googleProtobuf.descriptorPbMod.FieldOptions.CType.CORD & Double = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with CType
    /* 0 */ val STRING: typings.googleProtobuf.descriptorPbMod.FieldOptions.CType.STRING & Double = js.native
    
    @js.native
    sealed trait STRING_PIECE
      extends StObject
         with CType
    /* 2 */ val STRING_PIECE: typings.googleProtobuf.descriptorPbMod.FieldOptions.CType.STRING_PIECE & Double = js.native
  }
  
  @js.native
  sealed trait JSType extends StObject
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.JSType")
  @js.native
  object JSType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JSType & Double] = js.native
    
    @js.native
    sealed trait JS_NORMAL
      extends StObject
         with JSType
    /* 0 */ val JS_NORMAL: typings.googleProtobuf.descriptorPbMod.FieldOptions.JSType.JS_NORMAL & Double = js.native
    
    @js.native
    sealed trait JS_NUMBER
      extends StObject
         with JSType
    /* 2 */ val JS_NUMBER: typings.googleProtobuf.descriptorPbMod.FieldOptions.JSType.JS_NUMBER & Double = js.native
    
    @js.native
    sealed trait JS_STRING
      extends StObject
         with JSType
    /* 1 */ val JS_STRING: typings.googleProtobuf.descriptorPbMod.FieldOptions.JSType.JS_STRING & Double = js.native
  }
  
  inline def deserializeBinary(bytes: Uint8Array): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  inline def deserializeBinaryFromReader(message: FieldOptions, reader: BinaryReader): FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[FieldOptions]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: FieldOptions, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: FieldOptions): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var ctype: js.UndefOr[CType] = js.undefined
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var jstype: js.UndefOr[JSType] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var packed: js.UndefOr[Boolean] = js.undefined
    
    var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
    
    var weak: js.UndefOr[Boolean] = js.undefined
  }
  object AsObject {
    
    inline def apply(
      uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setCtype(value: CType): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
      
      inline def setCtypeUndefined: Self = StObject.set(x, "ctype", js.undefined)
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setJstype(value: JSType): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
      
      inline def setJstypeUndefined: Self = StObject.set(x, "jstype", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
      
      inline def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      inline def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value :_*))
      
      inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
      
      inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
    }
  }
}
