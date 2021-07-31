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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
@js.native
class ServiceDescriptorProto () extends Message {
  
  def addMethod(): MethodDescriptorProto = js.native
  def addMethod(value: Unit, index: Double): MethodDescriptorProto = js.native
  def addMethod(value: MethodDescriptorProto): MethodDescriptorProto = js.native
  def addMethod(value: MethodDescriptorProto, index: Double): MethodDescriptorProto = js.native
  
  def clearMethodList(): ServiceDescriptorProto = js.native
  
  def clearName(): ServiceDescriptorProto = js.native
  
  def clearOptions(): ServiceDescriptorProto = js.native
  
  def getMethodList(): js.Array[MethodDescriptorProto] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getOptions(): js.UndefOr[ServiceOptions] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def setMethodList(value: js.Array[MethodDescriptorProto]): ServiceDescriptorProto = js.native
  
  def setName(value: String): ServiceDescriptorProto = js.native
  
  def setOptions(): ServiceDescriptorProto = js.native
  def setOptions(value: ServiceOptions): ServiceDescriptorProto = js.native
}
/* static members */
object ServiceDescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  
  @scala.inline
  def deserializeBinaryFromReader(message: ServiceDescriptorProto, reader: BinaryReader): ServiceDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ServiceDescriptorProto]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: ServiceDescriptorProto, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: ServiceDescriptorProto): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var methodList: js.Array[typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject]
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.ServiceOptions.AsObject] = js.undefined
  }
  object AsObject {
    
    @scala.inline
    def apply(methodList: js.Array[typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject]): AsObject = {
      val __obj = js.Dynamic.literal(methodList = methodList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethodList(value: js.Array[typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject]): Self = StObject.set(x, "methodList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodListVarargs(value: typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject*): Self = StObject.set(x, "methodList", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: typings.googleProtobuf.descriptorPbMod.ServiceOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
