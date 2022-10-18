package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.DescriptorProto.IReservedRange
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.DescriptorProto")
@js.native
/**
  * Constructs a new DescriptorProto.
  * @param [properties] Properties to set
  */
open class DescriptorProto ()
  extends StObject
     with IDescriptorProto {
  def this(properties: IDescriptorProto) = this()
  
  /** DescriptorProto enumType. */
  @JSName("enumType")
  var enumType_DescriptorProto: js.Array[IEnumDescriptorProto] = js.native
  
  /** DescriptorProto extensionRange. */
  @JSName("extensionRange")
  var extensionRange_DescriptorProto: js.Array[IExtensionRange] = js.native
  
  /** DescriptorProto extension. */
  @JSName("extension")
  var extension_DescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  
  /** DescriptorProto field. */
  @JSName("field")
  var field_DescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  
  /** DescriptorProto name. */
  @JSName("name")
  var name_DescriptorProto: String = js.native
  
  /** DescriptorProto nestedType. */
  @JSName("nestedType")
  var nestedType_DescriptorProto: js.Array[IDescriptorProto] = js.native
  
  /** DescriptorProto oneofDecl. */
  @JSName("oneofDecl")
  var oneofDecl_DescriptorProto: js.Array[IOneofDescriptorProto] = js.native
  
  /** DescriptorProto reservedName. */
  @JSName("reservedName")
  var reservedName_DescriptorProto: js.Array[String] = js.native
  
  /** DescriptorProto reservedRange. */
  @JSName("reservedRange")
  var reservedRange_DescriptorProto: js.Array[IReservedRange] = js.native
  
  /**
    * Converts this DescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DescriptorProto {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.DescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an ExtensionRange. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.DescriptorProto.ExtensionRange")
  @js.native
  /**
    * Constructs a new ExtensionRange.
    * @param [properties] Properties to set
    */
  open class ExtensionRange ()
    extends StObject
       with IExtensionRange {
    def this(properties: IExtensionRange) = this()
    
    /** ExtensionRange end. */
    @JSName("end")
    var end_ExtensionRange: Double = js.native
    
    /** ExtensionRange start. */
    @JSName("start")
    var start_ExtensionRange: Double = js.native
    
    /**
      * Converts this ExtensionRange to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ExtensionRange {
    
    @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.DescriptorProto.ExtensionRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ExtensionRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ExtensionRange instance
      */
    /* static member */
    inline def create(): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ExtensionRange]
    inline def create(properties: IExtensionRange): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ExtensionRange]
    
    inline def decode(reader: js.typedarray.Uint8Array): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExtensionRange]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ExtensionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExtensionRange]
    /**
      * Decodes an ExtensionRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ExtensionRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExtensionRange]
    inline def decode(reader: Reader, length: Double): ExtensionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExtensionRange]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExtensionRange]
    /**
      * Decodes an ExtensionRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ExtensionRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExtensionRange]
    
    /**
      * Encodes the specified ExtensionRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
      * @param message ExtensionRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IExtensionRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IExtensionRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ExtensionRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
      * @param message ExtensionRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IExtensionRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IExtensionRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ExtensionRange
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExtensionRange]
    
    /**
      * Gets the default type url for ExtensionRange
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
      * @param message ExtensionRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ExtensionRange): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ExtensionRange, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an ExtensionRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ReservedRange. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.DescriptorProto.ReservedRange")
  @js.native
  /**
    * Constructs a new ReservedRange.
    * @param [properties] Properties to set
    */
  open class ReservedRange ()
    extends StObject
       with IReservedRange {
    def this(properties: IReservedRange) = this()
    
    /** ReservedRange end. */
    @JSName("end")
    var end_ReservedRange: Double = js.native
    
    /** ReservedRange start. */
    @JSName("start")
    var start_ReservedRange: Double = js.native
    
    /**
      * Converts this ReservedRange to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ReservedRange {
    
    @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.DescriptorProto.ReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ReservedRange instance
      */
    /* static member */
    inline def create(): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ReservedRange]
    inline def create(properties: IReservedRange): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ReservedRange]
    
    inline def decode(reader: js.typedarray.Uint8Array): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReservedRange]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReservedRange]
    /**
      * Decodes a ReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReservedRange]
    inline def decode(reader: Reader, length: Double): ReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReservedRange]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReservedRange]
    /**
      * Decodes a ReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReservedRange]
    
    /**
      * Encodes the specified ReservedRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
      * @param message ReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ReservedRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
      * @param message ReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReservedRange
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReservedRange]
    
    /**
      * Gets the default type url for ReservedRange
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ReservedRange message. Also converts values to other types if specified.
      * @param message ReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ReservedRange): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ReservedRange, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new DescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DescriptorProto instance
    */
  /* static member */
  inline def create(): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DescriptorProto]
  inline def create(properties: IDescriptorProto): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  
  inline def decode(reader: js.typedarray.Uint8Array): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DescriptorProto]
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  inline def decode(reader: Reader, length: Double): DescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DescriptorProto]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  
  /**
    * Encodes the specified DescriptorProto message. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  
  /**
    * Gets the default type url for DescriptorProto
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
    * @param message DescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DescriptorProto): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DescriptorProto, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an ExtensionRange. */
  trait IExtensionRange extends StObject {
    
    /** ExtensionRange end */
    var end: js.UndefOr[Double | Null] = js.undefined
    
    /** ExtensionRange options */
    var options: js.UndefOr[IExtensionRangeOptions | Null] = js.undefined
    
    /** ExtensionRange start */
    var start: js.UndefOr[Double | Null] = js.undefined
  }
  object IExtensionRange {
    
    inline def apply(): IExtensionRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExtensionRange]
    }
    
    extension [Self <: IExtensionRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setOptions(value: IExtensionRangeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsNull: Self = StObject.set(x, "options", null)
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /** Properties of a ReservedRange. */
  trait IReservedRange extends StObject {
    
    /** ReservedRange end */
    var end: js.UndefOr[Double | Null] = js.undefined
    
    /** ReservedRange start */
    var start: js.UndefOr[Double | Null] = js.undefined
  }
  object IReservedRange {
    
    inline def apply(): IReservedRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReservedRange]
    }
    
    extension [Self <: IReservedRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
