package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel
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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
class MethodOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
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
    def apply(value: Double): js.UndefOr[IdempotencyLevel with Double] = js.native
    
    @js.native
    sealed trait IDEMPOTENCY_UNKNOWN extends IdempotencyLevel
    /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN with Double = js.native
    
    @js.native
    sealed trait IDEMPOTENT extends IdempotencyLevel
    /* 2 */ val IDEMPOTENT: typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel.IDEMPOTENT with Double = js.native
    
    @js.native
    sealed trait NO_SIDE_EFFECTS extends IdempotencyLevel
    /* 1 */ val NO_SIDE_EFFECTS: typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS with Double = js.native
  }
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): MethodOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: MethodOptions, reader: BinaryReader): MethodOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: MethodOptions, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: MethodOptions): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var deprecated: js.UndefOr[Boolean] = js.native
    
    var idempotencyLevel: js.UndefOr[IdempotencyLevel] = js.native
    
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
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setIdempotencyLevel(value: IdempotencyLevel): Self = StObject.set(x, "idempotencyLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdempotencyLevelUndefined: Self = StObject.set(x, "idempotencyLevel", js.undefined)
      
      @scala.inline
      def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value :_*))
    }
  }
}
