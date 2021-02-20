package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timestampPbMod {
  
  @JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
  @js.native
  class Timestamp () extends Message {
    
    def fromDate(date: Date): Unit = js.native
    
    def getNanos(): Double = js.native
    
    def getSeconds(): Double = js.native
    
    def setNanos(value: Double): Timestamp = js.native
    
    def setSeconds(value: Double): Timestamp = js.native
    
    def toDate(): Date = js.native
  }
  /* static members */
  object Timestamp {
    
    @JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): Timestamp = js.native
    
    @JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: Timestamp, reader: BinaryReader): Timestamp = js.native
    
    @JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: Timestamp, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: Timestamp): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var nanos: Double = js.native
      
      var seconds: Double = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(nanos: Double, seconds: Double): AsObject = {
        val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      }
    }
  }
}
