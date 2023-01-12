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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
@js.native
open class MethodDescriptorProto () extends Message {
  
  def clearClientStreaming(): MethodDescriptorProto = js.native
  
  def clearInputType(): MethodDescriptorProto = js.native
  
  def clearName(): MethodDescriptorProto = js.native
  
  def clearOptions(): MethodDescriptorProto = js.native
  
  def clearOutputType(): MethodDescriptorProto = js.native
  
  def clearServerStreaming(): MethodDescriptorProto = js.native
  
  def getClientStreaming(): js.UndefOr[Boolean] = js.native
  
  def getInputType(): js.UndefOr[String] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getOptions(): js.UndefOr[MethodOptions] = js.native
  
  def getOutputType(): js.UndefOr[String] = js.native
  
  def getServerStreaming(): js.UndefOr[Boolean] = js.native
  
  def hasClientStreaming(): Boolean = js.native
  
  def hasInputType(): Boolean = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def hasOutputType(): Boolean = js.native
  
  def hasServerStreaming(): Boolean = js.native
  
  def setClientStreaming(value: Boolean): MethodDescriptorProto = js.native
  
  def setInputType(value: String): MethodDescriptorProto = js.native
  
  def setName(value: String): MethodDescriptorProto = js.native
  
  def setOptions(): MethodDescriptorProto = js.native
  def setOptions(value: MethodOptions): MethodDescriptorProto = js.native
  
  def setOutputType(value: String): MethodDescriptorProto = js.native
  
  def setServerStreaming(value: Boolean): MethodDescriptorProto = js.native
}
/* static members */
object MethodDescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  
  inline def deserializeBinaryFromReader(message: MethodDescriptorProto, reader: BinaryReader): MethodDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[MethodDescriptorProto]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: MethodDescriptorProto, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: MethodDescriptorProto): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var clientStreaming: js.UndefOr[Boolean] = js.undefined
    
    var inputType: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[typings.googleProtobuf.googleProtobufDescriptorPbMod.MethodOptions.AsObject] = js.undefined
    
    var outputType: js.UndefOr[String] = js.undefined
    
    var serverStreaming: js.UndefOr[Boolean] = js.undefined
  }
  object AsObject {
    
    inline def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      inline def setClientStreaming(value: Boolean): Self = StObject.set(x, "clientStreaming", value.asInstanceOf[js.Any])
      
      inline def setClientStreamingUndefined: Self = StObject.set(x, "clientStreaming", js.undefined)
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.MethodOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOutputType(value: String): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
      
      inline def setServerStreaming(value: Boolean): Self = StObject.set(x, "serverStreaming", value.asInstanceOf[js.Any])
      
      inline def setServerStreamingUndefined: Self = StObject.set(x, "serverStreaming", js.undefined)
    }
  }
}
