package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
open class GeneratedCodeInfo () extends Message {
  
  def addAnnotation(): Annotation = js.native
  def addAnnotation(value: Unit, index: Double): Annotation = js.native
  def addAnnotation(value: Annotation): Annotation = js.native
  def addAnnotation(value: Annotation, index: Double): Annotation = js.native
  
  def clearAnnotationList(): GeneratedCodeInfo = js.native
  
  def getAnnotationList(): js.Array[Annotation] = js.native
  
  def setAnnotationList(value: js.Array[Annotation]): GeneratedCodeInfo = js.native
}
/* static members */
object GeneratedCodeInfo {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo.Annotation")
  @js.native
  open class Annotation () extends Message {
    
    def addPath(value: Double): Double = js.native
    def addPath(value: Double, index: Double): Double = js.native
    
    def clearBegin(): Annotation = js.native
    
    def clearEnd(): Annotation = js.native
    
    def clearPathList(): Annotation = js.native
    
    def clearSourceFile(): Annotation = js.native
    
    def getBegin(): js.UndefOr[Double] = js.native
    
    def getEnd(): js.UndefOr[Double] = js.native
    
    def getPathList(): js.Array[Double] = js.native
    
    def getSourceFile(): js.UndefOr[String] = js.native
    
    def hasBegin(): Boolean = js.native
    
    def hasEnd(): Boolean = js.native
    
    def hasSourceFile(): Boolean = js.native
    
    def setBegin(value: Double): Annotation = js.native
    
    def setEnd(value: Double): Annotation = js.native
    
    def setPathList(value: js.Array[Double]): Annotation = js.native
    
    def setSourceFile(value: String): Annotation = js.native
  }
  /* static members */
  object Annotation {
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo.Annotation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Annotation]
    
    inline def deserializeBinaryFromReader(message: Annotation, reader: BinaryReader): Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Annotation]
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo.Annotation.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo.Annotation.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: Annotation, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: Annotation): typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject]
    
    trait AsObject extends StObject {
      
      var begin: js.UndefOr[Double] = js.undefined
      
      var end: js.UndefOr[Double] = js.undefined
      
      var pathList: js.Array[Double]
      
      var sourceFile: js.UndefOr[String] = js.undefined
    }
    object AsObject {
      
      inline def apply(pathList: js.Array[Double]): typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject = {
        val __obj = js.Dynamic.literal(pathList = pathList.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject]
      }
      
      extension [Self <: typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject](x: Self) {
        
        inline def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
        
        inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setPathList(value: js.Array[Double]): Self = StObject.set(x, "pathList", value.asInstanceOf[js.Any])
        
        inline def setPathListVarargs(value: Double*): Self = StObject.set(x, "pathList", js.Array(value*))
        
        inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
        
        inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
      }
    }
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  
  inline def deserializeBinaryFromReader(message: GeneratedCodeInfo, reader: BinaryReader): GeneratedCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfo]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: GeneratedCodeInfo, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: GeneratedCodeInfo): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var annotationList: js.Array[typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject]
  }
  object AsObject {
    
    inline def apply(
      annotationList: js.Array[typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(annotationList = annotationList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setAnnotationList(value: js.Array[typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject]): Self = StObject.set(x, "annotationList", value.asInstanceOf[js.Any])
      
      inline def setAnnotationListVarargs(value: typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject*): Self = StObject.set(x, "annotationList", js.Array(value*))
    }
  }
}
