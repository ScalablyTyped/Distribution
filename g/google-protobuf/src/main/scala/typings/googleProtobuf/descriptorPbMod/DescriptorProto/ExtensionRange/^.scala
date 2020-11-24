package typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: Uint8Array): typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange = js.native
  
  def deserializeBinaryFromReader(
    message: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange,
    reader: BinaryReader
  ): typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(
    message: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange,
    writer: BinaryWriter
  ): Unit = js.native
  
  def toObject(
    includeInstance: Boolean,
    msg: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange
  ): AsObject = js.native
}
