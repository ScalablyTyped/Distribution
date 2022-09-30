package typings.googleGax.iamServiceMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.googleGaxStrings.custom
import typings.googleGax.googleGaxStrings.delete_
import typings.googleGax.googleGaxStrings.get_
import typings.googleGax.googleGaxStrings.patch_
import typings.googleGax.googleGaxStrings.post_
import typings.googleGax.googleGaxStrings.put_
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("google-gax/build/protos/iam_service", "google.api.CustomHttpPattern")
  @js.native
  /**
    * Constructs a new CustomHttpPattern.
    * @param [properties] Properties to set
    */
  open class CustomHttpPattern ()
    extends StObject
       with ICustomHttpPattern {
    def this(properties: ICustomHttpPattern) = this()
    
    /** CustomHttpPattern kind. */
    @JSName("kind")
    var kind_CustomHttpPattern: String = js.native
    
    /** CustomHttpPattern path. */
    @JSName("path")
    var path_CustomHttpPattern: String = js.native
    
    /**
      * Converts this CustomHttpPattern to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object CustomHttpPattern {
    
    @JSImport("google-gax/build/protos/iam_service", "google.api.CustomHttpPattern")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new CustomHttpPattern instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CustomHttpPattern instance
      */
    /* static member */
    inline def create(): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CustomHttpPattern]
    inline def create(properties: ICustomHttpPattern): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    
    inline def decode(reader: js.typedarray.Uint8Array): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): CustomHttpPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CustomHttpPattern]
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    inline def decode(reader: Reader, length: Double): CustomHttpPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CustomHttpPattern]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: CustomHttpPattern): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: CustomHttpPattern, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a CustomHttpPattern message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait FieldBehavior extends StObject
  /** FieldBehavior enum. */
  @JSImport("google-gax/build/protos/iam_service", "google.api.FieldBehavior")
  @js.native
  object FieldBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FieldBehavior & Double] = js.native
    
    @js.native
    sealed trait FIELD_BEHAVIOR_UNSPECIFIED
      extends StObject
         with FieldBehavior
    /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typings.googleGax.iamServiceMod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait IMMUTABLE
      extends StObject
         with FieldBehavior
    /* 5 */ val IMMUTABLE: typings.googleGax.iamServiceMod.google.api.FieldBehavior.IMMUTABLE & Double = js.native
    
    @js.native
    sealed trait INPUT_ONLY
      extends StObject
         with FieldBehavior
    /* 4 */ val INPUT_ONLY: typings.googleGax.iamServiceMod.google.api.FieldBehavior.INPUT_ONLY & Double = js.native
    
    @js.native
    sealed trait OPTIONAL
      extends StObject
         with FieldBehavior
    /* 1 */ val OPTIONAL: typings.googleGax.iamServiceMod.google.api.FieldBehavior.OPTIONAL & Double = js.native
    
    @js.native
    sealed trait OUTPUT_ONLY
      extends StObject
         with FieldBehavior
    /* 3 */ val OUTPUT_ONLY: typings.googleGax.iamServiceMod.google.api.FieldBehavior.OUTPUT_ONLY & Double = js.native
    
    @js.native
    sealed trait REQUIRED
      extends StObject
         with FieldBehavior
    /* 2 */ val REQUIRED: typings.googleGax.iamServiceMod.google.api.FieldBehavior.REQUIRED & Double = js.native
  }
  
  /** Represents a Http. */
  @JSImport("google-gax/build/protos/iam_service", "google.api.Http")
  @js.native
  /**
    * Constructs a new Http.
    * @param [properties] Properties to set
    */
  open class Http ()
    extends StObject
       with IHttp {
    def this(properties: IHttp) = this()
    
    /** Http fullyDecodeReservedExpansion. */
    @JSName("fullyDecodeReservedExpansion")
    var fullyDecodeReservedExpansion_Http: Boolean = js.native
    
    /** Http rules. */
    @JSName("rules")
    var rules_Http: js.Array[IHttpRule] = js.native
    
    /**
      * Converts this Http to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Http {
    
    @JSImport("google-gax/build/protos/iam_service", "google.api.Http")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Http instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Http instance
      */
    /* static member */
    inline def create(): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Http]
    inline def create(properties: IHttp): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Http]
    
    inline def decode(reader: js.typedarray.Uint8Array): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Http]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Http = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Http]
    /**
      * Decodes a Http message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Http]
    inline def decode(reader: Reader, length: Double): Http = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Http]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Http]
    /**
      * Decodes a Http message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Http]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Http]
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Http): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Http, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Http message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a HttpRule. */
  @JSImport("google-gax/build/protos/iam_service", "google.api.HttpRule")
  @js.native
  /**
    * Constructs a new HttpRule.
    * @param [properties] Properties to set
    */
  open class HttpRule ()
    extends StObject
       with IHttpRule {
    def this(properties: IHttpRule) = this()
    
    /** HttpRule additionalBindings. */
    @JSName("additionalBindings")
    var additionalBindings_HttpRule: js.Array[IHttpRule] = js.native
    
    /** HttpRule body. */
    @JSName("body")
    var body_HttpRule: String = js.native
    
    /** HttpRule delete. */
    @JSName("delete")
    var delete_HttpRule: String = js.native
    
    /** HttpRule get. */
    @JSName("get")
    var get_HttpRule: String = js.native
    
    /** HttpRule patch. */
    @JSName("patch")
    var patch_HttpRule: String = js.native
    
    /** HttpRule pattern. */
    var pattern: js.UndefOr[get_ | put_ | post_ | delete_ | patch_ | custom] = js.native
    
    /** HttpRule post. */
    @JSName("post")
    var post_HttpRule: String = js.native
    
    /** HttpRule put. */
    @JSName("put")
    var put_HttpRule: String = js.native
    
    /** HttpRule responseBody. */
    @JSName("responseBody")
    var responseBody_HttpRule: String = js.native
    
    /** HttpRule selector. */
    @JSName("selector")
    var selector_HttpRule: String = js.native
    
    /**
      * Converts this HttpRule to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object HttpRule {
    
    @JSImport("google-gax/build/protos/iam_service", "google.api.HttpRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new HttpRule instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HttpRule instance
      */
    /* static member */
    inline def create(): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[HttpRule]
    inline def create(properties: IHttpRule): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    
    inline def decode(reader: js.typedarray.Uint8Array): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): HttpRule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HttpRule]
    /**
      * Decodes a HttpRule message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    inline def decode(reader: Reader, length: Double): HttpRule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HttpRule]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    /**
      * Decodes a HttpRule message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: HttpRule): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: HttpRule, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a HttpRule message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ResourceDescriptor. */
  @JSImport("google-gax/build/protos/iam_service", "google.api.ResourceDescriptor")
  @js.native
  /**
    * Constructs a new ResourceDescriptor.
    * @param [properties] Properties to set
    */
  open class ResourceDescriptor ()
    extends StObject
       with IResourceDescriptor {
    def this(properties: IResourceDescriptor) = this()
    
    /** ResourceDescriptor history. */
    @JSName("history")
    var history_ResourceDescriptor: History = js.native
    
    /** ResourceDescriptor nameField. */
    @JSName("nameField")
    var nameField_ResourceDescriptor: String = js.native
    
    /** ResourceDescriptor pattern. */
    @JSName("pattern")
    var pattern_ResourceDescriptor: js.Array[String] = js.native
    
    /** ResourceDescriptor plural. */
    @JSName("plural")
    var plural_ResourceDescriptor: String = js.native
    
    /** ResourceDescriptor singular. */
    @JSName("singular")
    var singular_ResourceDescriptor: String = js.native
    
    /**
      * Converts this ResourceDescriptor to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** ResourceDescriptor type. */
    @JSName("type")
    var type_ResourceDescriptor: String = js.native
  }
  object ResourceDescriptor {
    
    @JSImport("google-gax/build/protos/iam_service", "google.api.ResourceDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait History extends StObject
    /** History enum. */
    @JSImport("google-gax/build/protos/iam_service", "google.api.ResourceDescriptor.History")
    @js.native
    object History extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History & Double] = js.native
      
      @js.native
      sealed trait FUTURE_MULTI_PATTERN
        extends StObject
           with typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History
      /* 2 */ val FUTURE_MULTI_PATTERN: typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History.FUTURE_MULTI_PATTERN & Double = js.native
      
      @js.native
      sealed trait HISTORY_UNSPECIFIED
        extends StObject
           with typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History
      /* 0 */ val HISTORY_UNSPECIFIED: typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History.HISTORY_UNSPECIFIED & Double = js.native
      
      @js.native
      sealed trait ORIGINALLY_SINGLE_PATTERN
        extends StObject
           with typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History
      /* 1 */ val ORIGINALLY_SINGLE_PATTERN: typings.googleGax.iamServiceMod.google.api.ResourceDescriptor.History.ORIGINALLY_SINGLE_PATTERN & Double = js.native
    }
    
    /**
      * Creates a new ResourceDescriptor instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceDescriptor instance
      */
    /* static member */
    inline def create(): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResourceDescriptor]
    inline def create(properties: IResourceDescriptor): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
    
    inline def decode(reader: js.typedarray.Uint8Array): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ResourceDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResourceDescriptor]
    /**
      * Decodes a ResourceDescriptor message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceDescriptor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
    inline def decode(reader: Reader, length: Double): ResourceDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResourceDescriptor]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
    /**
      * Decodes a ResourceDescriptor message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceDescriptor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
    
    /**
      * Creates a plain object from a ResourceDescriptor message. Also converts values to other types if specified.
      * @param message ResourceDescriptor
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ResourceDescriptor): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ResourceDescriptor, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ResourceDescriptor message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ResourceReference. */
  @JSImport("google-gax/build/protos/iam_service", "google.api.ResourceReference")
  @js.native
  /**
    * Constructs a new ResourceReference.
    * @param [properties] Properties to set
    */
  open class ResourceReference ()
    extends StObject
       with IResourceReference {
    def this(properties: IResourceReference) = this()
    
    /** ResourceReference childType. */
    @JSName("childType")
    var childType_ResourceReference: String = js.native
    
    /**
      * Converts this ResourceReference to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** ResourceReference type. */
    @JSName("type")
    var type_ResourceReference: String = js.native
  }
  object ResourceReference {
    
    @JSImport("google-gax/build/protos/iam_service", "google.api.ResourceReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ResourceReference instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceReference instance
      */
    /* static member */
    inline def create(): ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResourceReference]
    inline def create(properties: IResourceReference): ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ResourceReference]
    
    inline def decode(reader: js.typedarray.Uint8Array): ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceReference]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ResourceReference = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResourceReference]
    /**
      * Decodes a ResourceReference message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceReference
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceReference]
    inline def decode(reader: Reader, length: Double): ResourceReference = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResourceReference]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceReference]
    /**
      * Decodes a ResourceReference message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceReference
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceReference]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResourceReference]
    
    /**
      * Creates a plain object from a ResourceReference message. Also converts values to other types if specified.
      * @param message ResourceReference
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ResourceReference): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ResourceReference, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ResourceReference message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Properties of a CustomHttpPattern. */
  trait ICustomHttpPattern extends StObject {
    
    /** CustomHttpPattern kind */
    var kind: js.UndefOr[String | Null] = js.undefined
    
    /** CustomHttpPattern path */
    var path: js.UndefOr[String | Null] = js.undefined
  }
  object ICustomHttpPattern {
    
    inline def apply(): ICustomHttpPattern = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomHttpPattern]
    }
    
    extension [Self <: ICustomHttpPattern](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindNull: Self = StObject.set(x, "kind", null)
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  /** Properties of a Http. */
  trait IHttp extends StObject {
    
    /** Http fullyDecodeReservedExpansion */
    var fullyDecodeReservedExpansion: js.UndefOr[Boolean | Null] = js.undefined
    
    /** Http rules */
    var rules: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
  }
  object IHttp {
    
    inline def apply(): IHttp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHttp]
    }
    
    extension [Self <: IHttp](x: Self) {
      
      inline def setFullyDecodeReservedExpansion(value: Boolean): Self = StObject.set(x, "fullyDecodeReservedExpansion", value.asInstanceOf[js.Any])
      
      inline def setFullyDecodeReservedExpansionNull: Self = StObject.set(x, "fullyDecodeReservedExpansion", null)
      
      inline def setFullyDecodeReservedExpansionUndefined: Self = StObject.set(x, "fullyDecodeReservedExpansion", js.undefined)
      
      inline def setRules(value: js.Array[IHttpRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesNull: Self = StObject.set(x, "rules", null)
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: IHttpRule*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  /** Properties of a HttpRule. */
  trait IHttpRule extends StObject {
    
    /** HttpRule additionalBindings */
    var additionalBindings: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
    
    /** HttpRule body */
    var body: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule custom */
    var custom: js.UndefOr[ICustomHttpPattern | Null] = js.undefined
    
    /** HttpRule delete */
    var delete: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule get */
    var get: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule patch */
    var patch: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule post */
    var post: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule put */
    var put: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule responseBody */
    var responseBody: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule selector */
    var selector: js.UndefOr[String | Null] = js.undefined
  }
  object IHttpRule {
    
    inline def apply(): IHttpRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHttpRule]
    }
    
    extension [Self <: IHttpRule](x: Self) {
      
      inline def setAdditionalBindings(value: js.Array[IHttpRule]): Self = StObject.set(x, "additionalBindings", value.asInstanceOf[js.Any])
      
      inline def setAdditionalBindingsNull: Self = StObject.set(x, "additionalBindings", null)
      
      inline def setAdditionalBindingsUndefined: Self = StObject.set(x, "additionalBindings", js.undefined)
      
      inline def setAdditionalBindingsVarargs(value: IHttpRule*): Self = StObject.set(x, "additionalBindings", js.Array(value*))
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCustom(value: ICustomHttpPattern): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomNull: Self = StObject.set(x, "custom", null)
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteNull: Self = StObject.set(x, "delete", null)
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetNull: Self = StObject.set(x, "get", null)
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchNull: Self = StObject.set(x, "patch", null)
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostNull: Self = StObject.set(x, "post", null)
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPut(value: String): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setPutNull: Self = StObject.set(x, "put", null)
      
      inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      inline def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
      
      inline def setResponseBodyNull: Self = StObject.set(x, "responseBody", null)
      
      inline def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorNull: Self = StObject.set(x, "selector", null)
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  /** Properties of a ResourceDescriptor. */
  trait IResourceDescriptor extends StObject {
    
    /** ResourceDescriptor history */
    var history: js.UndefOr[History | Null] = js.undefined
    
    /** ResourceDescriptor nameField */
    var nameField: js.UndefOr[String | Null] = js.undefined
    
    /** ResourceDescriptor pattern */
    var pattern: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** ResourceDescriptor plural */
    var plural: js.UndefOr[String | Null] = js.undefined
    
    /** ResourceDescriptor singular */
    var singular: js.UndefOr[String | Null] = js.undefined
    
    /** ResourceDescriptor type */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object IResourceDescriptor {
    
    inline def apply(): IResourceDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResourceDescriptor]
    }
    
    extension [Self <: IResourceDescriptor](x: Self) {
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryNull: Self = StObject.set(x, "history", null)
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
      
      inline def setNameFieldNull: Self = StObject.set(x, "nameField", null)
      
      inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
      
      inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternNull: Self = StObject.set(x, "pattern", null)
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setPluralNull: Self = StObject.set(x, "plural", null)
      
      inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
      
      inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      inline def setSingularNull: Self = StObject.set(x, "singular", null)
      
      inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of a ResourceReference. */
  trait IResourceReference extends StObject {
    
    /** ResourceReference childType */
    var childType: js.UndefOr[String | Null] = js.undefined
    
    /** ResourceReference type */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object IResourceReference {
    
    inline def apply(): IResourceReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResourceReference]
    }
    
    extension [Self <: IResourceReference](x: Self) {
      
      inline def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      inline def setChildTypeNull: Self = StObject.set(x, "childType", null)
      
      inline def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
