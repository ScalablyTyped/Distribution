package typings.dialogflow.mod.google

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.custom
import typings.dialogflow.dialogflowStrings.delete
import typings.dialogflow.dialogflowStrings.get
import typings.dialogflow.dialogflowStrings.patch
import typings.dialogflow.dialogflowStrings.post
import typings.dialogflow.dialogflowStrings.put
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.History
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern")
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
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.create")
    @js.native
    def create(): CustomHttpPattern = js.native
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.create")
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
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader): CustomHttpPattern = js.native
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader, length: Double): CustomHttpPattern = js.native
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Uint8Array): CustomHttpPattern = js.native
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.decode")
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
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): CustomHttpPattern = js.native
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): CustomHttpPattern = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomHttpPattern
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): CustomHttpPattern = js.native
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(message: CustomHttpPattern): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(message: CustomHttpPattern, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a CustomHttpPattern message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.CustomHttpPattern.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  @js.native
  sealed trait FieldBehavior extends StObject
  /** FieldBehavior enum. */
  @JSImport("dialogflow/protos/protos", "google.api.FieldBehavior")
  @js.native
  object FieldBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FieldBehavior with Double] = js.native
    
    @js.native
    sealed trait FIELD_BEHAVIOR_UNSPECIFIED extends FieldBehavior
    /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typings.dialogflow.mod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED with Double = js.native
    
    @js.native
    sealed trait IMMUTABLE extends FieldBehavior
    /* 5 */ val IMMUTABLE: typings.dialogflow.mod.google.api.FieldBehavior.IMMUTABLE with Double = js.native
    
    @js.native
    sealed trait INPUT_ONLY extends FieldBehavior
    /* 4 */ val INPUT_ONLY: typings.dialogflow.mod.google.api.FieldBehavior.INPUT_ONLY with Double = js.native
    
    @js.native
    sealed trait OPTIONAL extends FieldBehavior
    /* 1 */ val OPTIONAL: typings.dialogflow.mod.google.api.FieldBehavior.OPTIONAL with Double = js.native
    
    @js.native
    sealed trait OUTPUT_ONLY extends FieldBehavior
    /* 3 */ val OUTPUT_ONLY: typings.dialogflow.mod.google.api.FieldBehavior.OUTPUT_ONLY with Double = js.native
    
    @js.native
    sealed trait REQUIRED extends FieldBehavior
    /* 2 */ val REQUIRED: typings.dialogflow.mod.google.api.FieldBehavior.REQUIRED with Double = js.native
  }
  
  /** Represents a Http. */
  @JSImport("dialogflow/protos/protos", "google.api.Http")
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
    @JSImport("dialogflow/protos/protos", "google.api.Http.create")
    @js.native
    def create(): Http = js.native
    @JSImport("dialogflow/protos/protos", "google.api.Http.create")
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
    @JSImport("dialogflow/protos/protos", "google.api.Http.decode")
    @js.native
    def decode(reader: Reader): Http = js.native
    @JSImport("dialogflow/protos/protos", "google.api.Http.decode")
    @js.native
    def decode(reader: Reader, length: Double): Http = js.native
    @JSImport("dialogflow/protos/protos", "google.api.Http.decode")
    @js.native
    def decode(reader: Uint8Array): Http = js.native
    @JSImport("dialogflow/protos/protos", "google.api.Http.decode")
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
    @JSImport("dialogflow/protos/protos", "google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Http = js.native
    @JSImport("dialogflow/protos/protos", "google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Http = js.native
    
    /**
      * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.Http.encode")
    @js.native
    def encode(message: IHttp): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.Http.encode")
    @js.native
    def encode(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Creates a Http message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Http
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.Http.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Http = js.native
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.Http.toObject")
    @js.native
    def toObject(message: Http): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.api.Http.toObject")
    @js.native
    def toObject(message: Http, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Http message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.Http.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a HttpRule. */
  @JSImport("dialogflow/protos/protos", "google.api.HttpRule")
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
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.create")
    @js.native
    def create(): HttpRule = js.native
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.create")
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
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader): HttpRule = js.native
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader, length: Double): HttpRule = js.native
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.decode")
    @js.native
    def decode(reader: Uint8Array): HttpRule = js.native
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.decode")
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
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): HttpRule = js.native
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): HttpRule = js.native
    
    /**
      * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HttpRule
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): HttpRule = js.native
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.toObject")
    @js.native
    def toObject(message: HttpRule): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.toObject")
    @js.native
    def toObject(message: HttpRule, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a HttpRule message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.HttpRule.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ResourceDescriptor. */
  @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor")
  @js.native
  /**
    * Constructs a new ResourceDescriptor.
    * @param [properties] Properties to set
    */
  class ResourceDescriptor () extends IResourceDescriptor {
    def this(properties: IResourceDescriptor) = this()
    
    /** ResourceDescriptor history. */
    @JSName("history")
    var history_ResourceDescriptor: History | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.api.ResourceDescriptor.History * / any */ String) = js.native
    
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
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** ResourceDescriptor type. */
    @JSName("type")
    var type_ResourceDescriptor: String = js.native
  }
  object ResourceDescriptor {
    
    @js.native
    sealed trait History extends StObject
    /** History enum. */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.History")
    @js.native
    object History extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.dialogflow.mod.google.api.ResourceDescriptor.History with Double] = js.native
      
      @js.native
      sealed trait FUTURE_MULTI_PATTERN
        extends typings.dialogflow.mod.google.api.ResourceDescriptor.History
      /* 2 */ val FUTURE_MULTI_PATTERN: typings.dialogflow.mod.google.api.ResourceDescriptor.History.FUTURE_MULTI_PATTERN with Double = js.native
      
      @js.native
      sealed trait HISTORY_UNSPECIFIED
        extends typings.dialogflow.mod.google.api.ResourceDescriptor.History
      /* 0 */ val HISTORY_UNSPECIFIED: typings.dialogflow.mod.google.api.ResourceDescriptor.History.HISTORY_UNSPECIFIED with Double = js.native
      
      @js.native
      sealed trait ORIGINALLY_SINGLE_PATTERN
        extends typings.dialogflow.mod.google.api.ResourceDescriptor.History
      /* 1 */ val ORIGINALLY_SINGLE_PATTERN: typings.dialogflow.mod.google.api.ResourceDescriptor.History.ORIGINALLY_SINGLE_PATTERN with Double = js.native
    }
    
    /**
      * Creates a new ResourceDescriptor instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceDescriptor instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.create")
    @js.native
    def create(): ResourceDescriptor = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.create")
    @js.native
    def create(properties: IResourceDescriptor): ResourceDescriptor = js.native
    
    /**
      * Decodes a ResourceDescriptor message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceDescriptor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.decode")
    @js.native
    def decode(reader: Reader): ResourceDescriptor = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.decode")
    @js.native
    def decode(reader: Reader, length: Double): ResourceDescriptor = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.decode")
    @js.native
    def decode(reader: Uint8Array): ResourceDescriptor = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): ResourceDescriptor = js.native
    
    /**
      * Decodes a ResourceDescriptor message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceDescriptor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): ResourceDescriptor = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): ResourceDescriptor = js.native
    
    /**
      * Encodes the specified ResourceDescriptor message. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
      * @param message ResourceDescriptor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.encode")
    @js.native
    def encode(message: IResourceDescriptor): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.encode")
    @js.native
    def encode(message: IResourceDescriptor, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ResourceDescriptor message, length delimited. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
      * @param message ResourceDescriptor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.encodeDelimited")
    @js.native
    def encodeDelimited(message: IResourceDescriptor): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.encodeDelimited")
    @js.native
    def encodeDelimited(message: IResourceDescriptor, writer: Writer): Writer = js.native
    
    /**
      * Creates a ResourceDescriptor message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceDescriptor
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): ResourceDescriptor = js.native
    
    /**
      * Creates a plain object from a ResourceDescriptor message. Also converts values to other types if specified.
      * @param message ResourceDescriptor
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.toObject")
    @js.native
    def toObject(message: ResourceDescriptor): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.toObject")
    @js.native
    def toObject(message: ResourceDescriptor, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ResourceDescriptor message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ResourceReference. */
  @JSImport("dialogflow/protos/protos", "google.api.ResourceReference")
  @js.native
  /**
    * Constructs a new ResourceReference.
    * @param [properties] Properties to set
    */
  class ResourceReference () extends IResourceReference {
    def this(properties: IResourceReference) = this()
    
    /** ResourceReference childType. */
    @JSName("childType")
    var childType_ResourceReference: String = js.native
    
    /**
      * Converts this ResourceReference to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** ResourceReference type. */
    @JSName("type")
    var type_ResourceReference: String = js.native
  }
  object ResourceReference {
    
    /**
      * Creates a new ResourceReference instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceReference instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.create")
    @js.native
    def create(): ResourceReference = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.create")
    @js.native
    def create(properties: IResourceReference): ResourceReference = js.native
    
    /**
      * Decodes a ResourceReference message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceReference
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.decode")
    @js.native
    def decode(reader: Reader): ResourceReference = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.decode")
    @js.native
    def decode(reader: Reader, length: Double): ResourceReference = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.decode")
    @js.native
    def decode(reader: Uint8Array): ResourceReference = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): ResourceReference = js.native
    
    /**
      * Decodes a ResourceReference message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceReference
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): ResourceReference = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): ResourceReference = js.native
    
    /**
      * Encodes the specified ResourceReference message. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
      * @param message ResourceReference message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.encode")
    @js.native
    def encode(message: IResourceReference): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.encode")
    @js.native
    def encode(message: IResourceReference, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ResourceReference message, length delimited. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
      * @param message ResourceReference message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.encodeDelimited")
    @js.native
    def encodeDelimited(message: IResourceReference): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.encodeDelimited")
    @js.native
    def encodeDelimited(message: IResourceReference, writer: Writer): Writer = js.native
    
    /**
      * Creates a ResourceReference message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceReference
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): ResourceReference = js.native
    
    /**
      * Creates a plain object from a ResourceReference message. Also converts values to other types if specified.
      * @param message ResourceReference
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.toObject")
    @js.native
    def toObject(message: ResourceReference): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.toObject")
    @js.native
    def toObject(message: ResourceReference, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ResourceReference message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.api.ResourceReference.verify")
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
  
  /** Properties of a ResourceDescriptor. */
  @js.native
  trait IResourceDescriptor extends StObject {
    
    /** ResourceDescriptor history */
    var history: js.UndefOr[
        History | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.api.ResourceDescriptor.History * / any */ String) | Null
      ] = js.native
    
    /** ResourceDescriptor nameField */
    var nameField: js.UndefOr[String | Null] = js.native
    
    /** ResourceDescriptor pattern */
    var pattern: js.UndefOr[js.Array[String] | Null] = js.native
    
    /** ResourceDescriptor plural */
    var plural: js.UndefOr[String | Null] = js.native
    
    /** ResourceDescriptor singular */
    var singular: js.UndefOr[String | Null] = js.native
    
    /** ResourceDescriptor type */
    var `type`: js.UndefOr[String | Null] = js.native
  }
  object IResourceDescriptor {
    
    @scala.inline
    def apply(): IResourceDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResourceDescriptor]
    }
    
    @scala.inline
    implicit class IResourceDescriptorMutableBuilder[Self <: IResourceDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistory(
        value: History | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.api.ResourceDescriptor.History * / any */ String)
      ): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryNull: Self = StObject.set(x, "history", null)
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFieldNull: Self = StObject.set(x, "nameField", null)
      
      @scala.inline
      def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
      
      @scala.inline
      def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternNull: Self = StObject.set(x, "pattern", null)
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value :_*))
      
      @scala.inline
      def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralNull: Self = StObject.set(x, "plural", null)
      
      @scala.inline
      def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
      
      @scala.inline
      def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingularNull: Self = StObject.set(x, "singular", null)
      
      @scala.inline
      def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of a ResourceReference. */
  @js.native
  trait IResourceReference extends StObject {
    
    /** ResourceReference childType */
    var childType: js.UndefOr[String | Null] = js.native
    
    /** ResourceReference type */
    var `type`: js.UndefOr[String | Null] = js.native
  }
  object IResourceReference {
    
    @scala.inline
    def apply(): IResourceReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResourceReference]
    }
    
    @scala.inline
    implicit class IResourceReferenceMutableBuilder[Self <: IResourceReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildTypeNull: Self = StObject.set(x, "childType", null)
      
      @scala.inline
      def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
