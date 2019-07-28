package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
object CodeGeneratorResponseNs extends js.Object {
  trait AsObject extends js.Object {
    var error: js.UndefOr[String] = js.undefined
    var fileList: js.Array[
        typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.FileNs.AsObject
      ]
  }
  
  @js.native
  class File () extends Message {
    def clearContent(): Unit = js.native
    def clearInsertionPoint(): Unit = js.native
    def clearName(): Unit = js.native
    def getContent(): js.UndefOr[String] = js.native
    def getInsertionPoint(): js.UndefOr[String] = js.native
    def getName(): js.UndefOr[String] = js.native
    def hasContent(): Boolean = js.native
    def hasInsertionPoint(): Boolean = js.native
    def hasName(): Boolean = js.native
    def setContent(value: String): Unit = js.native
    def setInsertionPoint(value: String): Unit = js.native
    def setName(value: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object File extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: Uint8Array): File = js.native
    def deserializeBinaryFromReader(message: File, reader: BinaryReader): File = js.native
    def serializeBinaryToWriter(message: File, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: File): typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.FileNs.AsObject = js.native
  }
  
  @JSName("File")
  @js.native
  object FileNs extends js.Object {
    trait AsObject extends js.Object {
      var content: js.UndefOr[String] = js.undefined
      var insertionPoint: js.UndefOr[String] = js.undefined
      var name: js.UndefOr[String] = js.undefined
    }
    
  }
  
}

