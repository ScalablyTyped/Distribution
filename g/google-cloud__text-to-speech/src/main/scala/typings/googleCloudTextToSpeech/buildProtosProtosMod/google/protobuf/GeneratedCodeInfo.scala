package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation.Semantic
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GeneratedCodeInfo. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.GeneratedCodeInfo")
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
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.GeneratedCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an Annotation. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation")
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
    
    /** Annotation semantic. */
    @JSName("semantic")
    var semantic_Annotation: Semantic | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.GeneratedCodeInfo.Annotation.Semantic * / any */ String) = js.native
    
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
    
    @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait Semantic extends StObject
    /** Semantic enum. */
    @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.Semantic")
    @js.native
    object Semantic extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Semantic & Double] = js.native
      
      @js.native
      sealed trait ALIAS
        extends StObject
           with Semantic
      /* 2 */ val ALIAS: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation.Semantic.ALIAS & Double = js.native
      
      @js.native
      sealed trait NONE
        extends StObject
           with Semantic
      /* 0 */ val NONE: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation.Semantic.NONE & Double = js.native
      
      @js.native
      sealed trait SET
        extends StObject
           with Semantic
      /* 1 */ val SET: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation.Semantic.SET & Double = js.native
    }
    
    /**
      * Creates a new Annotation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Annotation instance
      */
    /* static member */
    inline def create(): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Annotation]
    inline def create(properties: IAnnotation): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Annotation]
    
    inline def decode(reader: js.typedarray.Uint8Array): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Annotation]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Annotation]
    /**
      * Decodes an Annotation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Annotation]
    inline def decode(reader: Reader, length: Double): Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Annotation]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Annotation]
    /**
      * Decodes an Annotation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Annotation]
    
    /**
      * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IAnnotation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IAnnotation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IAnnotation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IAnnotation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Annotation
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[scala.Any]): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Annotation]
    
    /**
      * Gets the default type url for Annotation
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from an Annotation message. Also converts values to other types if specified.
      * @param message Annotation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Annotation): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
    inline def toObject(message: Annotation, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
    
    /**
      * Verifies an Annotation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[scala.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new GeneratedCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedCodeInfo instance
    */
  /* static member */
  inline def create(): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GeneratedCodeInfo]
  inline def create(properties: IGeneratedCodeInfo): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GeneratedCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfo]
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  inline def decode(reader: Reader, length: Double): GeneratedCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  
  /**
    * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGeneratedCodeInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGeneratedCodeInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGeneratedCodeInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGeneratedCodeInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedCodeInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  
  /**
    * Gets the default type url for GeneratedCodeInfo
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
    * @param message GeneratedCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GeneratedCodeInfo): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: GeneratedCodeInfo, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /**
    * Verifies a GeneratedCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[scala.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an Annotation. */
  trait IAnnotation extends StObject {
    
    /** Annotation begin */
    var begin: js.UndefOr[Double | Null] = js.undefined
    
    /** Annotation end */
    var end: js.UndefOr[Double | Null] = js.undefined
    
    /** Annotation path */
    var path: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /** Annotation semantic */
    var semantic: js.UndefOr[
        Semantic | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.GeneratedCodeInfo.Annotation.Semantic * / any */ String) | Null
      ] = js.undefined
    
    /** Annotation sourceFile */
    var sourceFile: js.UndefOr[String | Null] = js.undefined
  }
  object IAnnotation {
    
    inline def apply(): IAnnotation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnotation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAnnotation] (val x: Self) extends AnyVal {
      
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
      
      inline def setSemantic(
        value: Semantic | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.GeneratedCodeInfo.Annotation.Semantic * / any */ String)
      ): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
      
      inline def setSemanticNull: Self = StObject.set(x, "semantic", null)
      
      inline def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
      
      inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      inline def setSourceFileNull: Self = StObject.set(x, "sourceFile", null)
      
      inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    }
  }
}
