package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GeneratedCodeInfo. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.GeneratedCodeInfo")
@js.native
/**
  * Constructs a new GeneratedCodeInfo.
  * @param [properties] Properties to set
  */
open class GeneratedCodeInfo ()
  extends StObject
     with IGeneratedCodeInfo {
  def this(properties: IGeneratedCodeInfo) = this()
  
  /** GeneratedCodeInfo annotation. */
  @JSName("annotation")
  var annotation_GeneratedCodeInfo: js.Array[IAnnotation] = js.native
  
  /**
    * Converts this GeneratedCodeInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object GeneratedCodeInfo {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.GeneratedCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an Annotation. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.GeneratedCodeInfo.Annotation")
  @js.native
  /**
    * Constructs a new Annotation.
    * @param [properties] Properties to set
    */
  open class Annotation ()
    extends StObject
       with IAnnotation {
    def this(properties: IAnnotation) = this()
    
    /** Annotation begin. */
    @JSName("begin")
    var begin_Annotation: Double = js.native
    
    /** Annotation end. */
    @JSName("end")
    var end_Annotation: Double = js.native
    
    /** Annotation path. */
    @JSName("path")
    var path_Annotation: js.Array[Double] = js.native
    
    /** Annotation sourceFile. */
    @JSName("sourceFile")
    var sourceFile_Annotation: String = js.native
    
    /**
      * Converts this Annotation to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[scala.Any] = js.native
  }
  object Annotation {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.GeneratedCodeInfo.Annotation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Annotation
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[scala.Any]): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Annotation]
    
    /**
      * Creates a plain object from an Annotation message. Also converts values to other types if specified.
      * @param message Annotation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Annotation): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
    inline def toObject(message: Annotation, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  }
  
  /**
    * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedCodeInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  
  /**
    * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
    * @param message GeneratedCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GeneratedCodeInfo): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: GeneratedCodeInfo, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /** Properties of an Annotation. */
  trait IAnnotation extends StObject {
    
    /** Annotation begin */
    var begin: js.UndefOr[Double | Null] = js.undefined
    
    /** Annotation end */
    var end: js.UndefOr[Double | Null] = js.undefined
    
    /** Annotation path */
    var path: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /** Annotation sourceFile */
    var sourceFile: js.UndefOr[String | Null] = js.undefined
  }
  object IAnnotation {
    
    inline def apply(): IAnnotation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnotation]
    }
    
    extension [Self <: IAnnotation](x: Self) {
      
      inline def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginNull: Self = StObject.set(x, "begin", null)
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      inline def setSourceFileNull: Self = StObject.set(x, "sourceFile", null)
      
      inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    }
  }
}
