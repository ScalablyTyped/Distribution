package typings.googleCloudTextToSpeech.mod.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.custom
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.delete
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.get
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.patch
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.post
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.put
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.CustomHttpPattern")
  @js.native
  /**
    * Constructs a new CustomHttpPattern.
    * @param [properties] Properties to set
    */
  class CustomHttpPattern ()
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
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object CustomHttpPattern {
    
    @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.CustomHttpPattern")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new CustomHttpPattern instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CustomHttpPattern instance
      */
    /* static member */
    @scala.inline
    def create(): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CustomHttpPattern]
    @scala.inline
    def create(properties: ICustomHttpPattern): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    @scala.inline
    def decode(reader: Reader, length: Double): CustomHttpPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CustomHttpPattern]
    @scala.inline
    def decode(reader: Uint8Array): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): CustomHttpPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CustomHttpPattern]
    
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    
    /**
      * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ICustomHttpPattern): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ICustomHttpPattern, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ICustomHttpPattern): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomHttpPattern
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: CustomHttpPattern): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: CustomHttpPattern, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a CustomHttpPattern message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait FieldBehavior extends StObject
  /** FieldBehavior enum. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.FieldBehavior")
  @js.native
  object FieldBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FieldBehavior & Double] = js.native
    
    @js.native
    sealed trait FIELD_BEHAVIOR_UNSPECIFIED
      extends StObject
         with FieldBehavior
    /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait IMMUTABLE
      extends StObject
         with FieldBehavior
    /* 5 */ val IMMUTABLE: typings.googleCloudTextToSpeech.mod.google.api.FieldBehavior.IMMUTABLE & Double = js.native
    
    @js.native
    sealed trait INPUT_ONLY
      extends StObject
         with FieldBehavior
    /* 4 */ val INPUT_ONLY: typings.googleCloudTextToSpeech.mod.google.api.FieldBehavior.INPUT_ONLY & Double = js.native
    
    @js.native
    sealed trait OPTIONAL
      extends StObject
         with FieldBehavior
    /* 1 */ val OPTIONAL: typings.googleCloudTextToSpeech.mod.google.api.FieldBehavior.OPTIONAL & Double = js.native
    
    @js.native
    sealed trait OUTPUT_ONLY
      extends StObject
         with FieldBehavior
    /* 3 */ val OUTPUT_ONLY: typings.googleCloudTextToSpeech.mod.google.api.FieldBehavior.OUTPUT_ONLY & Double = js.native
    
    @js.native
    sealed trait REQUIRED
      extends StObject
         with FieldBehavior
    /* 2 */ val REQUIRED: typings.googleCloudTextToSpeech.mod.google.api.FieldBehavior.REQUIRED & Double = js.native
  }
  
  /** Represents a Http. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.Http")
  @js.native
  /**
    * Constructs a new Http.
    * @param [properties] Properties to set
    */
  class Http ()
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
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Http {
    
    @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.Http")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Http instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Http instance
      */
    /* static member */
    @scala.inline
    def create(): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Http]
    @scala.inline
    def create(properties: IHttp): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Http]
    
    /**
      * Decodes a Http message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Http]
    @scala.inline
    def decode(reader: Reader, length: Double): Http = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Http]
    @scala.inline
    def decode(reader: Uint8Array): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Http]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Http = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Http]
    
    /**
      * Decodes a Http message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Http]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Http]
    
    /**
      * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IHttp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IHttp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IHttp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IHttp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Http message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Http
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Http]
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Http): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Http, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Http message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a HttpRule. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.HttpRule")
  @js.native
  /**
    * Constructs a new HttpRule.
    * @param [properties] Properties to set
    */
  class HttpRule ()
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
    var pattern: js.UndefOr[get | put | post | delete | patch | custom] = js.native
    
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
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object HttpRule {
    
    @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.HttpRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new HttpRule instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HttpRule instance
      */
    /* static member */
    @scala.inline
    def create(): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[HttpRule]
    @scala.inline
    def create(properties: IHttpRule): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    
    /**
      * Decodes a HttpRule message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    @scala.inline
    def decode(reader: Reader, length: Double): HttpRule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HttpRule]
    @scala.inline
    def decode(reader: Uint8Array): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): HttpRule = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HttpRule]
    
    /**
      * Decodes a HttpRule message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    
    /**
      * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IHttpRule): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IHttpRule, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IHttpRule): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IHttpRule, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HttpRule
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: HttpRule): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: HttpRule, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a HttpRule message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Properties of a CustomHttpPattern. */
  trait ICustomHttpPattern extends StObject {
    
    /** CustomHttpPattern kind */
    var kind: js.UndefOr[String | Null] = js.undefined
    
    /** CustomHttpPattern path */
    var path: js.UndefOr[String | Null] = js.undefined
  }
  object ICustomHttpPattern {
    
    @scala.inline
    def apply(): ICustomHttpPattern = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomHttpPattern]
    }
    
    @scala.inline
    implicit class ICustomHttpPatternMutableBuilder[Self <: ICustomHttpPattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindNull: Self = StObject.set(x, "kind", null)
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
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
    
    @scala.inline
    def apply(): IHttp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHttp]
    }
    
    @scala.inline
    implicit class IHttpMutableBuilder[Self <: IHttp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullyDecodeReservedExpansion(value: Boolean): Self = StObject.set(x, "fullyDecodeReservedExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullyDecodeReservedExpansionNull: Self = StObject.set(x, "fullyDecodeReservedExpansion", null)
      
      @scala.inline
      def setFullyDecodeReservedExpansionUndefined: Self = StObject.set(x, "fullyDecodeReservedExpansion", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[IHttpRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesNull: Self = StObject.set(x, "rules", null)
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: IHttpRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
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
    
    @scala.inline
    def apply(): IHttpRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHttpRule]
    }
    
    @scala.inline
    implicit class IHttpRuleMutableBuilder[Self <: IHttpRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalBindings(value: js.Array[IHttpRule]): Self = StObject.set(x, "additionalBindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalBindingsNull: Self = StObject.set(x, "additionalBindings", null)
      
      @scala.inline
      def setAdditionalBindingsUndefined: Self = StObject.set(x, "additionalBindings", js.undefined)
      
      @scala.inline
      def setAdditionalBindingsVarargs(value: IHttpRule*): Self = StObject.set(x, "additionalBindings", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCustom(value: ICustomHttpPattern): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomNull: Self = StObject.set(x, "custom", null)
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteNull: Self = StObject.set(x, "delete", null)
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetNull: Self = StObject.set(x, "get", null)
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchNull: Self = StObject.set(x, "patch", null)
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostNull: Self = StObject.set(x, "post", null)
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPut(value: String): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPutNull: Self = StObject.set(x, "put", null)
      
      @scala.inline
      def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      @scala.inline
      def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseBodyNull: Self = StObject.set(x, "responseBody", null)
      
      @scala.inline
      def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorNull: Self = StObject.set(x, "selector", null)
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
}
