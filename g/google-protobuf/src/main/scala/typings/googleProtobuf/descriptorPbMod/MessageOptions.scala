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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
class MessageOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: Unit, index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearDeprecated(): MessageOptions = js.native
  
  def clearMapEntry(): MessageOptions = js.native
  
  def clearMessageSetWireFormat(): MessageOptions = js.native
  
  def clearNoStandardDescriptorAccessor(): MessageOptions = js.native
  
  def clearUninterpretedOptionList(): MessageOptions = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getMapEntry(): js.UndefOr[Boolean] = js.native
  
  def getMessageSetWireFormat(): js.UndefOr[Boolean] = js.native
  
  def getNoStandardDescriptorAccessor(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasMapEntry(): Boolean = js.native
  
  def hasMessageSetWireFormat(): Boolean = js.native
  
  def hasNoStandardDescriptorAccessor(): Boolean = js.native
  
  def setDeprecated(value: Boolean): MessageOptions = js.native
  
  def setMapEntry(value: Boolean): MessageOptions = js.native
  
  def setMessageSetWireFormat(value: Boolean): MessageOptions = js.native
  
  def setNoStandardDescriptorAccessor(value: Boolean): MessageOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): MessageOptions = js.native
}
/* static members */
object MessageOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  
  @scala.inline
  def deserializeBinaryFromReader(message: MessageOptions, reader: BinaryReader): MessageOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[MessageOptions]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: MessageOptions, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: MessageOptions): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var mapEntry: js.UndefOr[Boolean] = js.undefined
    
    var messageSetWireFormat: js.UndefOr[Boolean] = js.undefined
    
    var noStandardDescriptorAccessor: js.UndefOr[Boolean] = js.undefined
    
    var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
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
      def setMapEntry(value: Boolean): Self = StObject.set(x, "mapEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapEntryUndefined: Self = StObject.set(x, "mapEntry", js.undefined)
      
      @scala.inline
      def setMessageSetWireFormat(value: Boolean): Self = StObject.set(x, "messageSetWireFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageSetWireFormatUndefined: Self = StObject.set(x, "messageSetWireFormat", js.undefined)
      
      @scala.inline
      def setNoStandardDescriptorAccessor(value: Boolean): Self = StObject.set(x, "noStandardDescriptorAccessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStandardDescriptorAccessorUndefined: Self = StObject.set(x, "noStandardDescriptorAccessor", js.undefined)
      
      @scala.inline
      def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value :_*))
    }
  }
}
