package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/empty_pb", JSImport.Namespace)
@js.native
object emptyPbMod extends js.Object {
  @js.native
  class Empty () extends Message
  
  /* static members */
  @js.native
  object Empty extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: Uint8Array): Empty = js.native
    def deserializeBinaryFromReader(message: Empty, reader: BinaryReader): Empty = js.native
    def serializeBinaryToWriter(message: Empty, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: Empty): AsObject = js.native
    type AsObject = js.Object
  }
  
}

