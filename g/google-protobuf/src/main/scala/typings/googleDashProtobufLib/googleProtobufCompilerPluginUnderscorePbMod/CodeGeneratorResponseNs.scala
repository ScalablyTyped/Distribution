package typings
package googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
object CodeGeneratorResponseNs extends js.Object {
  trait AsObject extends js.Object {
    var error: js.UndefOr[java.lang.String] = js.undefined
    var fileList: js.Array[
        googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.FileNs.AsObject
      ]
  }
  
  @js.native
  class File ()
    extends googleDashProtobufLib.googleDashProtobufMod.Message {
    def clearContent(): scala.Unit = js.native
    def clearInsertionPoint(): scala.Unit = js.native
    def clearName(): scala.Unit = js.native
    def getContent(): js.UndefOr[java.lang.String] = js.native
    def getInsertionPoint(): js.UndefOr[java.lang.String] = js.native
    def getName(): js.UndefOr[java.lang.String] = js.native
    def hasContent(): scala.Boolean = js.native
    def hasInsertionPoint(): scala.Boolean = js.native
    def hasName(): scala.Boolean = js.native
    def setContent(value: java.lang.String): scala.Unit = js.native
    def setInsertionPoint(value: java.lang.String): scala.Unit = js.native
    def setName(value: java.lang.String): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object File extends js.Object {
    var extensions: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
        googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
      ] = js.native
    def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File = js.native
    def deserializeBinaryFromReader(
      message: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File,
      reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
    ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File = js.native
    def serializeBinaryToWriter(
      message: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File,
      writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
    ): scala.Unit = js.native
    def toObject(
      includeInstance: scala.Boolean,
      msg: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File
    ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.FileNs.AsObject = js.native
  }
  
  @JSName("File")
  @js.native
  object FileNs extends js.Object {
    trait AsObject extends js.Object {
      var content: js.UndefOr[java.lang.String] = js.undefined
      var insertionPoint: js.UndefOr[java.lang.String] = js.undefined
      var name: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
}

