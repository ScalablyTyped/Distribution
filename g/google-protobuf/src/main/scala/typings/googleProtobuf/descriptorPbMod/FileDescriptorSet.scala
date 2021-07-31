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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet")
@js.native
class FileDescriptorSet () extends Message {
  
  def addFile(): FileDescriptorProto = js.native
  def addFile(value: Unit, index: Double): FileDescriptorProto = js.native
  def addFile(value: FileDescriptorProto): FileDescriptorProto = js.native
  def addFile(value: FileDescriptorProto, index: Double): FileDescriptorProto = js.native
  
  def clearFileList(): FileDescriptorSet = js.native
  
  def getFileList(): js.Array[FileDescriptorProto] = js.native
  
  def setFileList(value: js.Array[FileDescriptorProto]): FileDescriptorSet = js.native
}
/* static members */
object FileDescriptorSet {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorSet]
  
  @scala.inline
  def deserializeBinaryFromReader(message: FileDescriptorSet, reader: BinaryReader): FileDescriptorSet = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorSet]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: FileDescriptorSet, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: FileDescriptorSet): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var fileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]
  }
  object AsObject {
    
    @scala.inline
    def apply(fileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]): AsObject = {
      val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListVarargs(value: typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject*): Self = StObject.set(x, "fileList", js.Array(value :_*))
    }
  }
}
