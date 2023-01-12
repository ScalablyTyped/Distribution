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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto")
@js.native
open class FileDescriptorProto () extends Message {
  
  def addDependency(value: String): String = js.native
  def addDependency(value: String, index: Double): String = js.native
  
  def addEnumType(): EnumDescriptorProto = js.native
  def addEnumType(value: Unit, index: Double): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto, index: Double): EnumDescriptorProto = js.native
  
  def addExtension(): FieldDescriptorProto = js.native
  def addExtension(value: Unit, index: Double): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  
  def addMessageType(): DescriptorProto = js.native
  def addMessageType(value: Unit, index: Double): DescriptorProto = js.native
  def addMessageType(value: DescriptorProto): DescriptorProto = js.native
  def addMessageType(value: DescriptorProto, index: Double): DescriptorProto = js.native
  
  def addPublicDependency(value: Double): Double = js.native
  def addPublicDependency(value: Double, index: Double): Double = js.native
  
  def addService(): ServiceDescriptorProto = js.native
  def addService(value: Unit, index: Double): ServiceDescriptorProto = js.native
  def addService(value: ServiceDescriptorProto): ServiceDescriptorProto = js.native
  def addService(value: ServiceDescriptorProto, index: Double): ServiceDescriptorProto = js.native
  
  def addWeakDependency(value: Double): Double = js.native
  def addWeakDependency(value: Double, index: Double): Double = js.native
  
  def clearDependencyList(): FileDescriptorProto = js.native
  
  def clearEnumTypeList(): FileDescriptorProto = js.native
  
  def clearExtensionList(): FileDescriptorProto = js.native
  
  def clearMessageTypeList(): FileDescriptorProto = js.native
  
  def clearName(): FileDescriptorProto = js.native
  
  def clearOptions(): FileDescriptorProto = js.native
  
  def clearPackage(): FileDescriptorProto = js.native
  
  def clearPublicDependencyList(): FileDescriptorProto = js.native
  
  def clearServiceList(): FileDescriptorProto = js.native
  
  def clearSourceCodeInfo(): FileDescriptorProto = js.native
  
  def clearSyntax(): FileDescriptorProto = js.native
  
  def clearWeakDependencyList(): FileDescriptorProto = js.native
  
  def getDependencyList(): js.Array[String] = js.native
  
  def getEnumTypeList(): js.Array[EnumDescriptorProto] = js.native
  
  def getExtensionList(): js.Array[FieldDescriptorProto] = js.native
  
  def getMessageTypeList(): js.Array[DescriptorProto] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getOptions(): js.UndefOr[FileOptions] = js.native
  
  def getPackage(): js.UndefOr[String] = js.native
  
  def getPublicDependencyList(): js.Array[Double] = js.native
  
  def getServiceList(): js.Array[ServiceDescriptorProto] = js.native
  
  def getSourceCodeInfo(): js.UndefOr[SourceCodeInfo] = js.native
  
  def getSyntax(): js.UndefOr[String] = js.native
  
  def getWeakDependencyList(): js.Array[Double] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def hasPackage(): Boolean = js.native
  
  def hasSourceCodeInfo(): Boolean = js.native
  
  def hasSyntax(): Boolean = js.native
  
  def setDependencyList(value: js.Array[String]): FileDescriptorProto = js.native
  
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): FileDescriptorProto = js.native
  
  def setExtensionList(value: js.Array[FieldDescriptorProto]): FileDescriptorProto = js.native
  
  def setMessageTypeList(value: js.Array[DescriptorProto]): FileDescriptorProto = js.native
  
  def setName(value: String): FileDescriptorProto = js.native
  
  def setOptions(): FileDescriptorProto = js.native
  def setOptions(value: FileOptions): FileDescriptorProto = js.native
  
  def setPackage(value: String): FileDescriptorProto = js.native
  
  def setPublicDependencyList(value: js.Array[Double]): FileDescriptorProto = js.native
  
  def setServiceList(value: js.Array[ServiceDescriptorProto]): FileDescriptorProto = js.native
  
  def setSourceCodeInfo(): FileDescriptorProto = js.native
  def setSourceCodeInfo(value: SourceCodeInfo): FileDescriptorProto = js.native
  
  def setSyntax(value: String): FileDescriptorProto = js.native
  
  def setWeakDependencyList(value: js.Array[Double]): FileDescriptorProto = js.native
}
/* static members */
object FileDescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  inline def deserializeBinaryFromReader(message: FileDescriptorProto, reader: BinaryReader): FileDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorProto]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: FileDescriptorProto, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: FileDescriptorProto): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var dependencyList: js.Array[String]
    
    var enumTypeList: js.Array[
        typings.googleProtobuf.googleProtobufDescriptorPbMod.EnumDescriptorProto.AsObject
      ]
    
    var extensionList: js.Array[
        typings.googleProtobuf.googleProtobufDescriptorPbMod.FieldDescriptorProto.AsObject
      ]
    
    var messageTypeList: js.Array[typings.googleProtobuf.googleProtobufDescriptorPbMod.DescriptorProto.AsObject]
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[typings.googleProtobuf.googleProtobufDescriptorPbMod.FileOptions.AsObject] = js.undefined
    
    var pb_package: js.UndefOr[String] = js.undefined
    
    var publicDependencyList: js.Array[Double]
    
    var serviceList: js.Array[
        typings.googleProtobuf.googleProtobufDescriptorPbMod.ServiceDescriptorProto.AsObject
      ]
    
    var sourceCodeInfo: js.UndefOr[typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.AsObject] = js.undefined
    
    var syntax: js.UndefOr[String] = js.undefined
    
    var weakDependencyList: js.Array[Double]
  }
  object AsObject {
    
    inline def apply(
      dependencyList: js.Array[String],
      enumTypeList: js.Array[
          typings.googleProtobuf.googleProtobufDescriptorPbMod.EnumDescriptorProto.AsObject
        ],
      extensionList: js.Array[
          typings.googleProtobuf.googleProtobufDescriptorPbMod.FieldDescriptorProto.AsObject
        ],
      messageTypeList: js.Array[typings.googleProtobuf.googleProtobufDescriptorPbMod.DescriptorProto.AsObject],
      publicDependencyList: js.Array[Double],
      serviceList: js.Array[
          typings.googleProtobuf.googleProtobufDescriptorPbMod.ServiceDescriptorProto.AsObject
        ],
      weakDependencyList: js.Array[Double]
    ): AsObject = {
      val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], messageTypeList = messageTypeList.asInstanceOf[js.Any], publicDependencyList = publicDependencyList.asInstanceOf[js.Any], serviceList = serviceList.asInstanceOf[js.Any], weakDependencyList = weakDependencyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      inline def setDependencyList(value: js.Array[String]): Self = StObject.set(x, "dependencyList", value.asInstanceOf[js.Any])
      
      inline def setDependencyListVarargs(value: String*): Self = StObject.set(x, "dependencyList", js.Array(value*))
      
      inline def setEnumTypeList(
        value: js.Array[
              typings.googleProtobuf.googleProtobufDescriptorPbMod.EnumDescriptorProto.AsObject
            ]
      ): Self = StObject.set(x, "enumTypeList", value.asInstanceOf[js.Any])
      
      inline def setEnumTypeListVarargs(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.EnumDescriptorProto.AsObject*): Self = StObject.set(x, "enumTypeList", js.Array(value*))
      
      inline def setExtensionList(
        value: js.Array[
              typings.googleProtobuf.googleProtobufDescriptorPbMod.FieldDescriptorProto.AsObject
            ]
      ): Self = StObject.set(x, "extensionList", value.asInstanceOf[js.Any])
      
      inline def setExtensionListVarargs(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.FieldDescriptorProto.AsObject*): Self = StObject.set(x, "extensionList", js.Array(value*))
      
      inline def setMessageTypeList(value: js.Array[typings.googleProtobuf.googleProtobufDescriptorPbMod.DescriptorProto.AsObject]): Self = StObject.set(x, "messageTypeList", value.asInstanceOf[js.Any])
      
      inline def setMessageTypeListVarargs(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.DescriptorProto.AsObject*): Self = StObject.set(x, "messageTypeList", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.FileOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPb_package(value: String): Self = StObject.set(x, "pb_package", value.asInstanceOf[js.Any])
      
      inline def setPb_packageUndefined: Self = StObject.set(x, "pb_package", js.undefined)
      
      inline def setPublicDependencyList(value: js.Array[Double]): Self = StObject.set(x, "publicDependencyList", value.asInstanceOf[js.Any])
      
      inline def setPublicDependencyListVarargs(value: Double*): Self = StObject.set(x, "publicDependencyList", js.Array(value*))
      
      inline def setServiceList(
        value: js.Array[
              typings.googleProtobuf.googleProtobufDescriptorPbMod.ServiceDescriptorProto.AsObject
            ]
      ): Self = StObject.set(x, "serviceList", value.asInstanceOf[js.Any])
      
      inline def setServiceListVarargs(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.ServiceDescriptorProto.AsObject*): Self = StObject.set(x, "serviceList", js.Array(value*))
      
      inline def setSourceCodeInfo(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.AsObject): Self = StObject.set(x, "sourceCodeInfo", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeInfoUndefined: Self = StObject.set(x, "sourceCodeInfo", js.undefined)
      
      inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setWeakDependencyList(value: js.Array[Double]): Self = StObject.set(x, "weakDependencyList", value.asInstanceOf[js.Any])
      
      inline def setWeakDependencyListVarargs(value: Double*): Self = StObject.set(x, "weakDependencyList", js.Array(value*))
    }
  }
}
