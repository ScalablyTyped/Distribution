package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.protobuf.GeneratedCodeInfo.IAnnotation
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GeneratedCodeInfo. */
@JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo")
@js.native
/**
  * Constructs a new GeneratedCodeInfo.
  * @param [properties] Properties to set
  */
class GeneratedCodeInfo () extends IGeneratedCodeInfo {
  def this(properties: IGeneratedCodeInfo) = this()
  
  /** GeneratedCodeInfo annotation. */
  @JSName("annotation")
  var annotation_GeneratedCodeInfo: js.Array[IAnnotation] = js.native
  
  /**
    * Converts this GeneratedCodeInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GeneratedCodeInfo {
  
  /** Represents an Annotation. */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation")
  @js.native
  /**
    * Constructs a new Annotation.
    * @param [properties] Properties to set
    */
  class Annotation () extends IAnnotation {
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
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Annotation {
    
    /**
      * Creates a new Annotation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Annotation instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.create")
    @js.native
    def create(): Annotation = js.native
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.create")
    @js.native
    def create(properties: IAnnotation): Annotation = js.native
    
    /**
      * Decodes an Annotation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.decode")
    @js.native
    def decode(reader: Reader): Annotation = js.native
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.decode")
    @js.native
    def decode(reader: Reader, length: Double): Annotation = js.native
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.decode")
    @js.native
    def decode(reader: Uint8Array): Annotation = js.native
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Annotation = js.native
    
    /**
      * Decodes an Annotation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Annotation = js.native
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Annotation = js.native
    
    /**
      * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.encode")
    @js.native
    def encode(message: IAnnotation): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.encode")
    @js.native
    def encode(message: IAnnotation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAnnotation): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAnnotation, writer: Writer): Writer = js.native
    
    /**
      * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Annotation
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Annotation = js.native
    
    /**
      * Creates a plain object from an Annotation message. Also converts values to other types if specified.
      * @param message Annotation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.toObject")
    @js.native
    def toObject(message: Annotation): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.toObject")
    @js.native
    def toObject(message: Annotation, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Annotation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new GeneratedCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedCodeInfo instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.create")
  @js.native
  def create(): GeneratedCodeInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.create")
  @js.native
  def create(properties: IGeneratedCodeInfo): GeneratedCodeInfo = js.native
  
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.decode")
  @js.native
  def decode(reader: Reader): GeneratedCodeInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.decode")
  @js.native
  def decode(reader: Reader, length: Double): GeneratedCodeInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.decode")
  @js.native
  def decode(reader: Uint8Array): GeneratedCodeInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GeneratedCodeInfo = js.native
  
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GeneratedCodeInfo = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GeneratedCodeInfo = js.native
  
  /**
    * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.encode")
  @js.native
  def encode(message: IGeneratedCodeInfo): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.encode")
  @js.native
  def encode(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGeneratedCodeInfo): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedCodeInfo
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GeneratedCodeInfo = js.native
  
  /**
    * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
    * @param message GeneratedCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.toObject")
  @js.native
  def toObject(message: GeneratedCodeInfo): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.toObject")
  @js.native
  def toObject(message: GeneratedCodeInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GeneratedCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an Annotation. */
  @js.native
  trait IAnnotation extends StObject {
    
    /** Annotation begin */
    var begin: js.UndefOr[Double | Null] = js.native
    
    /** Annotation end */
    var end: js.UndefOr[Double | Null] = js.native
    
    /** Annotation path */
    var path: js.UndefOr[js.Array[Double] | Null] = js.native
    
    /** Annotation sourceFile */
    var sourceFile: js.UndefOr[String | Null] = js.native
  }
  object IAnnotation {
    
    @scala.inline
    def apply(): IAnnotation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnotation]
    }
    
    @scala.inline
    implicit class IAnnotationMutableBuilder[Self <: IAnnotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginNull: Self = StObject.set(x, "begin", null)
      
      @scala.inline
      def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndNull: Self = StObject.set(x, "end", null)
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFileNull: Self = StObject.set(x, "sourceFile", null)
      
      @scala.inline
      def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    }
  }
}
