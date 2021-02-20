package typings.googleGax.operationsMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.googleGaxStrings.custom
import typings.googleGax.googleGaxStrings.delete
import typings.googleGax.googleGaxStrings.get
import typings.googleGax.googleGaxStrings.patch
import typings.googleGax.googleGaxStrings.post
import typings.googleGax.googleGaxStrings.put
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern")
  @js.native
  /**
    * Constructs a new CustomHttpPattern.
    * @param [properties] Properties to set
    */
  class CustomHttpPattern () extends ICustomHttpPattern {
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
    
    /**
      * Creates a new CustomHttpPattern instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CustomHttpPattern instance
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.create")
    @js.native
    def create(): CustomHttpPattern = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.create")
    @js.native
    def create(properties: ICustomHttpPattern): CustomHttpPattern = js.native
    
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader): CustomHttpPattern = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader, length: Double): CustomHttpPattern = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Uint8Array): CustomHttpPattern = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): CustomHttpPattern = js.native
    
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): CustomHttpPattern = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): CustomHttpPattern = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomHttpPattern
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): CustomHttpPattern = js.native
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(message: CustomHttpPattern): StringDictionary[js.Any] = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(message: CustomHttpPattern, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a CustomHttpPattern message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.CustomHttpPattern.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Http. */
  @JSImport("google-gax/build/protos/operations", "google.api.Http")
  @js.native
  /**
    * Constructs a new Http.
    * @param [properties] Properties to set
    */
  class Http () extends IHttp {
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
    
    /**
      * Creates a new Http instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Http instance
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.Http.create")
    @js.native
    def create(): Http = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.Http.create")
    @js.native
    def create(properties: IHttp): Http = js.native
    
    /**
      * Decodes a Http message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.Http.decode")
    @js.native
    def decode(reader: Reader): Http = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.Http.decode")
    @js.native
    def decode(reader: Reader, length: Double): Http = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.Http.decode")
    @js.native
    def decode(reader: Uint8Array): Http = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.Http.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Http = js.native
    
    /**
      * Decodes a Http message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Http = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Http = js.native
    
    /**
      * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.Http.encode")
    @js.native
    def encode(message: IHttp): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.Http.encode")
    @js.native
    def encode(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Creates a Http message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Http
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.Http.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Http = js.native
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.Http.toObject")
    @js.native
    def toObject(message: Http): StringDictionary[js.Any] = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.Http.toObject")
    @js.native
    def toObject(message: Http, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Http message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.Http.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a HttpRule. */
  @JSImport("google-gax/build/protos/operations", "google.api.HttpRule")
  @js.native
  /**
    * Constructs a new HttpRule.
    * @param [properties] Properties to set
    */
  class HttpRule () extends IHttpRule {
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
    
    /**
      * Creates a new HttpRule instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HttpRule instance
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.create")
    @js.native
    def create(): HttpRule = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.create")
    @js.native
    def create(properties: IHttpRule): HttpRule = js.native
    
    /**
      * Decodes a HttpRule message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader): HttpRule = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader, length: Double): HttpRule = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.decode")
    @js.native
    def decode(reader: Uint8Array): HttpRule = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): HttpRule = js.native
    
    /**
      * Decodes a HttpRule message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): HttpRule = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): HttpRule = js.native
    
    /**
      * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HttpRule
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): HttpRule = js.native
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.toObject")
    @js.native
    def toObject(message: HttpRule): StringDictionary[js.Any] = js.native
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.toObject")
    @js.native
    def toObject(message: HttpRule, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a HttpRule message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.api.HttpRule.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Properties of a CustomHttpPattern. */
  @js.native
  trait ICustomHttpPattern extends StObject {
    
    /** CustomHttpPattern kind */
    var kind: js.UndefOr[String | Null] = js.native
    
    /** CustomHttpPattern path */
    var path: js.UndefOr[String | Null] = js.native
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
  @js.native
  trait IHttp extends StObject {
    
    /** Http fullyDecodeReservedExpansion */
    var fullyDecodeReservedExpansion: js.UndefOr[Boolean | Null] = js.native
    
    /** Http rules */
    var rules: js.UndefOr[js.Array[IHttpRule] | Null] = js.native
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
  @js.native
  trait IHttpRule extends StObject {
    
    /** HttpRule additionalBindings */
    var additionalBindings: js.UndefOr[js.Array[IHttpRule] | Null] = js.native
    
    /** HttpRule body */
    var body: js.UndefOr[String | Null] = js.native
    
    /** HttpRule custom */
    var custom: js.UndefOr[ICustomHttpPattern | Null] = js.native
    
    /** HttpRule delete */
    var delete: js.UndefOr[String | Null] = js.native
    
    /** HttpRule get */
    var get: js.UndefOr[String | Null] = js.native
    
    /** HttpRule patch */
    var patch: js.UndefOr[String | Null] = js.native
    
    /** HttpRule post */
    var post: js.UndefOr[String | Null] = js.native
    
    /** HttpRule put */
    var put: js.UndefOr[String | Null] = js.native
    
    /** HttpRule responseBody */
    var responseBody: js.UndefOr[String | Null] = js.native
    
    /** HttpRule selector */
    var selector: js.UndefOr[String | Null] = js.native
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
