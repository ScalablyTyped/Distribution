package typings.googleGax.locationsMod.google

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("google-gax/build/protos/locations", "google.api.CustomHttpPattern")
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
    
    @JSImport("google-gax/build/protos/locations", "google.api.CustomHttpPattern")
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
  
  /** Represents a Http. */
  @JSImport("google-gax/build/protos/locations", "google.api.Http")
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
    
    @JSImport("google-gax/build/protos/locations", "google.api.Http")
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
  @JSImport("google-gax/build/protos/locations", "google.api.HttpRule")
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
    
    /** HttpRule pattern. */
    var pattern: js.UndefOr[get_ | put_ | post_ | delete_ | patch_ | custom] = js.native
    
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
    
    @JSImport("google-gax/build/protos/locations", "google.api.HttpRule")
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
}
