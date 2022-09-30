package typings.googleGax.mod.fallback.IamProtos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.api.ICustomHttpPattern
import typings.googleGax.iamServiceMod.google.api.IHttp
import typings.googleGax.iamServiceMod.google.api.IHttpRule
import typings.googleGax.iamServiceMod.google.api.IResourceDescriptor
import typings.googleGax.iamServiceMod.google.api.IResourceReference
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("google-gax", "fallback.IamProtos.google.api.CustomHttpPattern")
  @js.native
  /**
    * Constructs a new CustomHttpPattern.
    * @param [properties] Properties to set
    */
  open class CustomHttpPattern ()
    extends typings.googleGax.fallbackMod.IamProtos.google.api.CustomHttpPattern {
    def this(properties: ICustomHttpPattern) = this()
  }
  object CustomHttpPattern {
    
    @JSImport("google-gax", "fallback.IamProtos.google.api.CustomHttpPattern")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new CustomHttpPattern instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CustomHttpPattern instance
      */
    /* static member */
    inline def create(): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    inline def create(properties: ICustomHttpPattern): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    inline def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    
    /**
      * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ICustomHttpPattern): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ICustomHttpPattern, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ICustomHttpPattern): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomHttpPattern
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.iamServiceMod.google.api.CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.CustomHttpPattern]
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.CustomHttpPattern): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.CustomHttpPattern, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a CustomHttpPattern message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** FieldBehavior enum. */
  @JSImport("google-gax", "fallback.IamProtos.google.api.FieldBehavior")
  @js.native
  object FieldBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleGax.iamServiceMod.google.api.FieldBehavior & Double] = js.native
    
    /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typings.googleGax.iamServiceMod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED & Double = js.native
    
    /* 5 */ val IMMUTABLE: typings.googleGax.iamServiceMod.google.api.FieldBehavior.IMMUTABLE & Double = js.native
    
    /* 4 */ val INPUT_ONLY: typings.googleGax.iamServiceMod.google.api.FieldBehavior.INPUT_ONLY & Double = js.native
    
    /* 1 */ val OPTIONAL: typings.googleGax.iamServiceMod.google.api.FieldBehavior.OPTIONAL & Double = js.native
    
    /* 3 */ val OUTPUT_ONLY: typings.googleGax.iamServiceMod.google.api.FieldBehavior.OUTPUT_ONLY & Double = js.native
    
    /* 2 */ val REQUIRED: typings.googleGax.iamServiceMod.google.api.FieldBehavior.REQUIRED & Double = js.native
  }
  
  /** Represents a Http. */
  @JSImport("google-gax", "fallback.IamProtos.google.api.Http")
  @js.native
  /**
    * Constructs a new Http.
    * @param [properties] Properties to set
    */
  open class Http ()
    extends typings.googleGax.fallbackMod.IamProtos.google.api.Http {
    def this(properties: IHttp) = this()
  }
  object Http {
    
    @JSImport("google-gax", "fallback.IamProtos.google.api.Http")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Http instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Http instance
      */
    /* static member */
    inline def create(): typings.googleGax.iamServiceMod.google.api.Http = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    inline def create(properties: IHttp): typings.googleGax.iamServiceMod.google.api.Http = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.api.Http = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    /**
      * Decodes a Http message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleGax.iamServiceMod.google.api.Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    inline def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.api.Http = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    /**
      * Decodes a Http message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.api.Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    
    /**
      * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IHttp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IHttp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IHttp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IHttp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Http message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Http
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.iamServiceMod.google.api.Http = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.Http]
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.Http): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.Http, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Http message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a HttpRule. */
  @JSImport("google-gax", "fallback.IamProtos.google.api.HttpRule")
  @js.native
  /**
    * Constructs a new HttpRule.
    * @param [properties] Properties to set
    */
  open class HttpRule ()
    extends typings.googleGax.fallbackMod.IamProtos.google.api.HttpRule {
    def this(properties: IHttpRule) = this()
  }
  object HttpRule {
    
    @JSImport("google-gax", "fallback.IamProtos.google.api.HttpRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new HttpRule instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HttpRule instance
      */
    /* static member */
    inline def create(): typings.googleGax.iamServiceMod.google.api.HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    inline def create(properties: IHttpRule): typings.googleGax.iamServiceMod.google.api.HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.api.HttpRule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    /**
      * Decodes a HttpRule message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleGax.iamServiceMod.google.api.HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    inline def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.api.HttpRule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    /**
      * Decodes a HttpRule message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.api.HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    
    /**
      * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IHttpRule): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IHttpRule, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IHttpRule): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IHttpRule, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HttpRule
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.iamServiceMod.google.api.HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.HttpRule]
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.HttpRule): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.HttpRule, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a HttpRule message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ResourceDescriptor. */
  @JSImport("google-gax", "fallback.IamProtos.google.api.ResourceDescriptor")
  @js.native
  /**
    * Constructs a new ResourceDescriptor.
    * @param [properties] Properties to set
    */
  open class ResourceDescriptor ()
    extends typings.googleGax.fallbackMod.IamProtos.google.api.ResourceDescriptor {
    def this(properties: IResourceDescriptor) = this()
  }
  object ResourceDescriptor {
    
    @JSImport("google-gax", "fallback.IamProtos.google.api.ResourceDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    /** History enum. */
    @JSImport("google-gax", "fallback.IamProtos.google.api.ResourceDescriptor.History")
    @js.native
    object History extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History & Double] = js.native
      
      /* 2 */ val FUTURE_MULTI_PATTERN: typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History.FUTURE_MULTI_PATTERN & Double = js.native
      
      /* 0 */ val HISTORY_UNSPECIFIED: typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History.HISTORY_UNSPECIFIED & Double = js.native
      
      /* 1 */ val ORIGINALLY_SINGLE_PATTERN: typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History.ORIGINALLY_SINGLE_PATTERN & Double = js.native
    }
    
    /**
      * Creates a new ResourceDescriptor instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceDescriptor instance
      */
    /* static member */
    inline def create(): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    inline def create(properties: IResourceDescriptor): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    /**
      * Decodes a ResourceDescriptor message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceDescriptor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    inline def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    /**
      * Decodes a ResourceDescriptor message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceDescriptor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    
    /**
      * Encodes the specified ResourceDescriptor message. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
      * @param message ResourceDescriptor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IResourceDescriptor): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IResourceDescriptor, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ResourceDescriptor message, length delimited. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
      * @param message ResourceDescriptor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IResourceDescriptor): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IResourceDescriptor, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ResourceDescriptor message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceDescriptor
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.iamServiceMod.google.api.ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor]
    
    /**
      * Creates a plain object from a ResourceDescriptor message. Also converts values to other types if specified.
      * @param message ResourceDescriptor
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.ResourceDescriptor): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleGax.iamServiceMod.google.api.ResourceDescriptor,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ResourceDescriptor message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ResourceReference. */
  @JSImport("google-gax", "fallback.IamProtos.google.api.ResourceReference")
  @js.native
  /**
    * Constructs a new ResourceReference.
    * @param [properties] Properties to set
    */
  open class ResourceReference ()
    extends typings.googleGax.fallbackMod.IamProtos.google.api.ResourceReference {
    def this(properties: IResourceReference) = this()
  }
  object ResourceReference {
    
    @JSImport("google-gax", "fallback.IamProtos.google.api.ResourceReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ResourceReference instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceReference instance
      */
    /* static member */
    inline def create(): typings.googleGax.iamServiceMod.google.api.ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    inline def create(properties: IResourceReference): typings.googleGax.iamServiceMod.google.api.ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.api.ResourceReference = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    /**
      * Decodes a ResourceReference message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceReference
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleGax.iamServiceMod.google.api.ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    inline def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.api.ResourceReference = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.iamServiceMod.google.api.ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    /**
      * Decodes a ResourceReference message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceReference
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.api.ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    
    /**
      * Encodes the specified ResourceReference message. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
      * @param message ResourceReference message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IResourceReference): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IResourceReference, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ResourceReference message, length delimited. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
      * @param message ResourceReference message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IResourceReference): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IResourceReference, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ResourceReference message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceReference
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.iamServiceMod.google.api.ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.api.ResourceReference]
    
    /**
      * Creates a plain object from a ResourceReference message. Also converts values to other types if specified.
      * @param message ResourceReference
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.ResourceReference): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.googleGax.iamServiceMod.google.api.ResourceReference, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ResourceReference message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
}
