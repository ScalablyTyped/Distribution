package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyPbMod {
  
  @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty")
  @js.native
  class Empty () extends Message
  /* static members */
  object Empty {
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): Empty = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: Empty, reader: BinaryReader): Empty = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: Empty, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: Empty): AsObject = js.native
    
    type AsObject = js.Object
  }
}
