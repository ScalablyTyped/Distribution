package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
class UninterpretedOption () extends Message {
  
  def addName(): NamePart = js.native
  def addName(value: Unit, index: Double): NamePart = js.native
  def addName(value: NamePart): NamePart = js.native
  def addName(value: NamePart, index: Double): NamePart = js.native
  
  def clearAggregateValue(): UninterpretedOption = js.native
  
  def clearDoubleValue(): UninterpretedOption = js.native
  
  def clearIdentifierValue(): UninterpretedOption = js.native
  
  def clearNameList(): UninterpretedOption = js.native
  
  def clearNegativeIntValue(): UninterpretedOption = js.native
  
  def clearPositiveIntValue(): UninterpretedOption = js.native
  
  def clearStringValue(): UninterpretedOption = js.native
  
  def getAggregateValue(): js.UndefOr[String] = js.native
  
  def getDoubleValue(): js.UndefOr[Double] = js.native
  
  def getIdentifierValue(): js.UndefOr[String] = js.native
  
  def getNameList(): js.Array[NamePart] = js.native
  
  def getNegativeIntValue(): js.UndefOr[Double] = js.native
  
  def getPositiveIntValue(): js.UndefOr[Double] = js.native
  
  def getStringValue(): Uint8Array | String = js.native
  
  def getStringValue_asB64(): String = js.native
  
  def getStringValue_asU8(): Uint8Array = js.native
  
  def hasAggregateValue(): Boolean = js.native
  
  def hasDoubleValue(): Boolean = js.native
  
  def hasIdentifierValue(): Boolean = js.native
  
  def hasNegativeIntValue(): Boolean = js.native
  
  def hasPositiveIntValue(): Boolean = js.native
  
  def hasStringValue(): Boolean = js.native
  
  def setAggregateValue(value: String): UninterpretedOption = js.native
  
  def setDoubleValue(value: Double): UninterpretedOption = js.native
  
  def setIdentifierValue(value: String): UninterpretedOption = js.native
  
  def setNameList(value: js.Array[NamePart]): UninterpretedOption = js.native
  
  def setNegativeIntValue(value: Double): UninterpretedOption = js.native
  
  def setPositiveIntValue(value: Double): UninterpretedOption = js.native
  
  def setStringValue(value: String): UninterpretedOption = js.native
  def setStringValue(value: Uint8Array): UninterpretedOption = js.native
}
/* static members */
object UninterpretedOption {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption.NamePart")
  @js.native
  class NamePart () extends Message {
    
    def clearIsExtension(): NamePart = js.native
    
    def clearNamePart(): NamePart = js.native
    
    def getIsExtension(): js.UndefOr[Boolean] = js.native
    
    def getNamePart(): js.UndefOr[String] = js.native
    
    def hasIsExtension(): Boolean = js.native
    
    def hasNamePart(): Boolean = js.native
    
    def setIsExtension(value: Boolean): NamePart = js.native
    
    def setNamePart(value: String): NamePart = js.native
  }
  /* static members */
  object NamePart {
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption.NamePart")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def deserializeBinary(bytes: Uint8Array): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[NamePart]
    
    @scala.inline
    def deserializeBinaryFromReader(message: NamePart, reader: BinaryReader): NamePart = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[NamePart]
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption.NamePart.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption.NamePart.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serializeBinaryToWriter(message: NamePart, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def toObject(includeInstance: Boolean, msg: NamePart): typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject]
    
    trait AsObject extends StObject {
      
      var isExtension: js.UndefOr[Boolean] = js.undefined
      
      var namePart: js.UndefOr[String] = js.undefined
    }
    object AsObject {
      
      @scala.inline
      def apply(): typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsExtension(value: Boolean): Self = StObject.set(x, "isExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsExtensionUndefined: Self = StObject.set(x, "isExtension", js.undefined)
        
        @scala.inline
        def setNamePart(value: String): Self = StObject.set(x, "namePart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamePartUndefined: Self = StObject.set(x, "namePart", js.undefined)
      }
    }
  }
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  
  @scala.inline
  def deserializeBinaryFromReader(message: UninterpretedOption, reader: BinaryReader): UninterpretedOption = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOption]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: UninterpretedOption, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: UninterpretedOption): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var aggregateValue: js.UndefOr[String] = js.undefined
    
    var doubleValue: js.UndefOr[Double] = js.undefined
    
    var identifierValue: js.UndefOr[String] = js.undefined
    
    var nameList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject]
    
    var negativeIntValue: js.UndefOr[Double] = js.undefined
    
    var positiveIntValue: js.UndefOr[Double] = js.undefined
    
    var stringValue: Uint8Array | String
  }
  object AsObject {
    
    @scala.inline
    def apply(
      nameList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject],
      stringValue: Uint8Array | String
    ): AsObject = {
      val __obj = js.Dynamic.literal(nameList = nameList.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregateValue(value: String): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateValueUndefined: Self = StObject.set(x, "aggregateValue", js.undefined)
      
      @scala.inline
      def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
      
      @scala.inline
      def setIdentifierValue(value: String): Self = StObject.set(x, "identifierValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierValueUndefined: Self = StObject.set(x, "identifierValue", js.undefined)
      
      @scala.inline
      def setNameList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject]): Self = StObject.set(x, "nameList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject*): Self = StObject.set(x, "nameList", js.Array(value :_*))
      
      @scala.inline
      def setNegativeIntValue(value: Double): Self = StObject.set(x, "negativeIntValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeIntValueUndefined: Self = StObject.set(x, "negativeIntValue", js.undefined)
      
      @scala.inline
      def setPositiveIntValue(value: Double): Self = StObject.set(x, "positiveIntValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveIntValueUndefined: Self = StObject.set(x, "positiveIntValue", js.undefined)
      
      @scala.inline
      def setStringValue(value: Uint8Array | String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    }
  }
}
