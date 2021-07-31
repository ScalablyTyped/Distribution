package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
class SourceCodeInfo () extends Message {
  
  def addLocation(): Location = js.native
  def addLocation(value: Unit, index: Double): Location = js.native
  def addLocation(value: Location): Location = js.native
  def addLocation(value: Location, index: Double): Location = js.native
  
  def clearLocationList(): SourceCodeInfo = js.native
  
  def getLocationList(): js.Array[Location] = js.native
  
  def setLocationList(value: js.Array[Location]): SourceCodeInfo = js.native
}
/* static members */
object SourceCodeInfo {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location")
  @js.native
  class Location () extends Message {
    
    def addLeadingDetachedComments(value: String): String = js.native
    def addLeadingDetachedComments(value: String, index: Double): String = js.native
    
    def addPath(value: Double): Double = js.native
    def addPath(value: Double, index: Double): Double = js.native
    
    def addSpan(value: Double): Double = js.native
    def addSpan(value: Double, index: Double): Double = js.native
    
    def clearLeadingComments(): Location = js.native
    
    def clearLeadingDetachedCommentsList(): Location = js.native
    
    def clearPathList(): Location = js.native
    
    def clearSpanList(): Location = js.native
    
    def clearTrailingComments(): Location = js.native
    
    def getLeadingComments(): js.UndefOr[String] = js.native
    
    def getLeadingDetachedCommentsList(): js.Array[String] = js.native
    
    def getPathList(): js.Array[Double] = js.native
    
    def getSpanList(): js.Array[Double] = js.native
    
    def getTrailingComments(): js.UndefOr[String] = js.native
    
    def hasLeadingComments(): Boolean = js.native
    
    def hasTrailingComments(): Boolean = js.native
    
    def setLeadingComments(value: String): Location = js.native
    
    def setLeadingDetachedCommentsList(value: js.Array[String]): Location = js.native
    
    def setPathList(value: js.Array[Double]): Location = js.native
    
    def setSpanList(value: js.Array[Double]): Location = js.native
    
    def setTrailingComments(value: String): Location = js.native
  }
  /* static members */
  object Location {
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def deserializeBinary(bytes: Uint8Array): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    @scala.inline
    def deserializeBinaryFromReader(message: Location, reader: BinaryReader): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Location]
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serializeBinaryToWriter(message: Location, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def toObject(includeInstance: Boolean, msg: Location): typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject]
    
    trait AsObject extends StObject {
      
      var leadingComments: js.UndefOr[String] = js.undefined
      
      var leadingDetachedCommentsList: js.Array[String]
      
      var pathList: js.Array[Double]
      
      var spanList: js.Array[Double]
      
      var trailingComments: js.UndefOr[String] = js.undefined
    }
    object AsObject {
      
      @scala.inline
      def apply(
        leadingDetachedCommentsList: js.Array[String],
        pathList: js.Array[Double],
        spanList: js.Array[Double]
      ): typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject = {
        val __obj = js.Dynamic.literal(leadingDetachedCommentsList = leadingDetachedCommentsList.asInstanceOf[js.Any], pathList = pathList.asInstanceOf[js.Any], spanList = spanList.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLeadingComments(value: String): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
        
        @scala.inline
        def setLeadingDetachedCommentsList(value: js.Array[String]): Self = StObject.set(x, "leadingDetachedCommentsList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeadingDetachedCommentsListVarargs(value: String*): Self = StObject.set(x, "leadingDetachedCommentsList", js.Array(value :_*))
        
        @scala.inline
        def setPathList(value: js.Array[Double]): Self = StObject.set(x, "pathList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathListVarargs(value: Double*): Self = StObject.set(x, "pathList", js.Array(value :_*))
        
        @scala.inline
        def setSpanList(value: js.Array[Double]): Self = StObject.set(x, "spanList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpanListVarargs(value: Double*): Self = StObject.set(x, "spanList", js.Array(value :_*))
        
        @scala.inline
        def setTrailingComments(value: String): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
      }
    }
  }
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfo]
  
  @scala.inline
  def deserializeBinaryFromReader(message: SourceCodeInfo, reader: BinaryReader): SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SourceCodeInfo]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: SourceCodeInfo, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: SourceCodeInfo): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var locationList: js.Array[typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject]
  }
  object AsObject {
    
    @scala.inline
    def apply(locationList: js.Array[typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject]): AsObject = {
      val __obj = js.Dynamic.literal(locationList = locationList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationList(value: js.Array[typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject]): Self = StObject.set(x, "locationList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationListVarargs(value: typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject*): Self = StObject.set(x, "locationList", js.Array(value :_*))
    }
  }
}
