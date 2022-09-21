package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
open class MethodOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: Unit, index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearDeprecated(): MethodOptions = js.native
  
  def clearIdempotencyLevel(): MethodOptions = js.native
  
  def clearUninterpretedOptionList(): MethodOptions = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getIdempotencyLevel(): js.UndefOr[IdempotencyLevel] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasIdempotencyLevel(): Boolean = js.native
  
  def setDeprecated(value: Boolean): MethodOptions = js.native
  
  def setIdempotencyLevel(value: IdempotencyLevel): MethodOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): MethodOptions = js.native
}
/* static members */
object MethodOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait IdempotencyLevel extends StObject
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.IdempotencyLevel")
  @js.native
  object IdempotencyLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IdempotencyLevel & Double] = js.native
    
    @js.native
    sealed trait IDEMPOTENCY_UNKNOWN
      extends StObject
         with IdempotencyLevel
    /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN & Double = js.native
    
    @js.native
    sealed trait IDEMPOTENT
      extends StObject
         with IdempotencyLevel
    /* 2 */ val IDEMPOTENT: typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel.IDEMPOTENT & Double = js.native
    
    @js.native
    sealed trait NO_SIDE_EFFECTS
      extends StObject
         with IdempotencyLevel
    /* 1 */ val NO_SIDE_EFFECTS: typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  
  inline def deserializeBinaryFromReader(message: MethodOptions, reader: BinaryReader): MethodOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[MethodOptions]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: MethodOptions, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: MethodOptions): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var idempotencyLevel: js.UndefOr[IdempotencyLevel] = js.undefined
    
    var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
  }
  object AsObject {
    
    inline def apply(
      uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setIdempotencyLevel(value: IdempotencyLevel): Self = StObject.set(x, "idempotencyLevel", value.asInstanceOf[js.Any])
      
      inline def setIdempotencyLevelUndefined: Self = StObject.set(x, "idempotencyLevel", js.undefined)
      
      inline def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      inline def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value*))
    }
  }
}
