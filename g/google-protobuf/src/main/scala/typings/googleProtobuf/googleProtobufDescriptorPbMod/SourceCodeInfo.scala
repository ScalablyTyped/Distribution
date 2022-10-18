package typings.googleProtobuf.googleProtobufDescriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
open class SourceCodeInfo () extends Message {
  
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
  open class Location () extends Message {
    
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
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    inline def deserializeBinaryFromReader(message: Location, reader: BinaryReader): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Location]
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: Location, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: Location): typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject]
    
    trait AsObject extends StObject {
      
      var leadingComments: js.UndefOr[String] = js.undefined
      
      var leadingDetachedCommentsList: js.Array[String]
      
      var pathList: js.Array[Double]
      
      var spanList: js.Array[Double]
      
      var trailingComments: js.UndefOr[String] = js.undefined
    }
    object AsObject {
      
      inline def apply(
        leadingDetachedCommentsList: js.Array[String],
        pathList: js.Array[Double],
        spanList: js.Array[Double]
      ): typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject = {
        val __obj = js.Dynamic.literal(leadingDetachedCommentsList = leadingDetachedCommentsList.asInstanceOf[js.Any], pathList = pathList.asInstanceOf[js.Any], spanList = spanList.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject]
      }
      
      extension [Self <: typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject](x: Self) {
        
        inline def setLeadingComments(value: String): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
        
        inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
        
        inline def setLeadingDetachedCommentsList(value: js.Array[String]): Self = StObject.set(x, "leadingDetachedCommentsList", value.asInstanceOf[js.Any])
        
        inline def setLeadingDetachedCommentsListVarargs(value: String*): Self = StObject.set(x, "leadingDetachedCommentsList", js.Array(value*))
        
        inline def setPathList(value: js.Array[Double]): Self = StObject.set(x, "pathList", value.asInstanceOf[js.Any])
        
        inline def setPathListVarargs(value: Double*): Self = StObject.set(x, "pathList", js.Array(value*))
        
        inline def setSpanList(value: js.Array[Double]): Self = StObject.set(x, "spanList", value.asInstanceOf[js.Any])
        
        inline def setSpanListVarargs(value: Double*): Self = StObject.set(x, "spanList", js.Array(value*))
        
        inline def setTrailingComments(value: String): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
        
        inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
      }
    }
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfo]
  
  inline def deserializeBinaryFromReader(message: SourceCodeInfo, reader: BinaryReader): SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SourceCodeInfo]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: SourceCodeInfo, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: SourceCodeInfo): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var locationList: js.Array[
        typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject
      ]
  }
  object AsObject {
    
    inline def apply(
      locationList: js.Array[
          typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject
        ]
    ): AsObject = {
      val __obj = js.Dynamic.literal(locationList = locationList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setLocationList(
        value: js.Array[
              typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject
            ]
      ): Self = StObject.set(x, "locationList", value.asInstanceOf[js.Any])
      
      inline def setLocationListVarargs(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.SourceCodeInfo.Location.AsObject*): Self = StObject.set(x, "locationList", js.Array(value*))
    }
  }
}
