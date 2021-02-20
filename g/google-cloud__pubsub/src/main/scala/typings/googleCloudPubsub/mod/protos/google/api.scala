package typings.googleCloudPubsub.mod.protos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.api.ICustomHttpPattern
import typings.googleCloudPubsub.protosMod.google.api.IHttp
import typings.googleCloudPubsub.protosMod.google.api.IHttpRule
import typings.googleCloudPubsub.protosMod.google.api.IResourceDescriptor
import typings.googleCloudPubsub.protosMod.google.api.IResourceReference
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern")
  @js.native
  /**
    * Constructs a new CustomHttpPattern.
    * @param [properties] Properties to set
    */
  class CustomHttpPattern ()
    extends typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern {
    def this(properties: ICustomHttpPattern) = this()
  }
  object CustomHttpPattern {
    
    /**
      * Creates a new CustomHttpPattern instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CustomHttpPattern instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.create")
    @js.native
    def create(): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.create")
    @js.native
    def create(properties: ICustomHttpPattern): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomHttpPattern
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern = js.native
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(message: typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudPubsub.protosMod.google.api.CustomHttpPattern,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a CustomHttpPattern message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.CustomHttpPattern.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** FieldBehavior enum. */
  @JSImport("@google-cloud/pubsub", "protos.google.api.FieldBehavior")
  @js.native
  object FieldBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleCloudPubsub.protosMod.google.api.FieldBehavior with Double] = js.native
    
    /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED with Double = js.native
    
    /* 5 */ val IMMUTABLE: typings.googleCloudPubsub.protosMod.google.api.FieldBehavior.IMMUTABLE with Double = js.native
    
    /* 4 */ val INPUT_ONLY: typings.googleCloudPubsub.protosMod.google.api.FieldBehavior.INPUT_ONLY with Double = js.native
    
    /* 1 */ val OPTIONAL: typings.googleCloudPubsub.protosMod.google.api.FieldBehavior.OPTIONAL with Double = js.native
    
    /* 3 */ val OUTPUT_ONLY: typings.googleCloudPubsub.protosMod.google.api.FieldBehavior.OUTPUT_ONLY with Double = js.native
    
    /* 2 */ val REQUIRED: typings.googleCloudPubsub.protosMod.google.api.FieldBehavior.REQUIRED with Double = js.native
  }
  
  /** Represents a Http. */
  @JSImport("@google-cloud/pubsub", "protos.google.api.Http")
  @js.native
  /**
    * Constructs a new Http.
    * @param [properties] Properties to set
    */
  class Http ()
    extends typings.googleCloudPubsub.protosMod.google.api.Http {
    def this(properties: IHttp) = this()
  }
  object Http {
    
    /**
      * Creates a new Http instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Http instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.create")
    @js.native
    def create(): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.create")
    @js.native
    def create(properties: IHttp): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    
    /**
      * Decodes a Http message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    
    /**
      * Decodes a Http message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    
    /**
      * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.encode")
    @js.native
    def encode(message: IHttp): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.encode")
    @js.native
    def encode(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Creates a Http message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Http
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.api.Http = js.native
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.toObject")
    @js.native
    def toObject(message: typings.googleCloudPubsub.protosMod.google.api.Http): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.toObject")
    @js.native
    def toObject(message: typings.googleCloudPubsub.protosMod.google.api.Http, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Http message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.Http.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a HttpRule. */
  @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule")
  @js.native
  /**
    * Constructs a new HttpRule.
    * @param [properties] Properties to set
    */
  class HttpRule ()
    extends typings.googleCloudPubsub.protosMod.google.api.HttpRule {
    def this(properties: IHttpRule) = this()
  }
  object HttpRule {
    
    /**
      * Creates a new HttpRule instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HttpRule instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.create")
    @js.native
    def create(): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.create")
    @js.native
    def create(properties: IHttpRule): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    
    /**
      * Decodes a HttpRule message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    
    /**
      * Decodes a HttpRule message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    
    /**
      * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HttpRule
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.api.HttpRule = js.native
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.toObject")
    @js.native
    def toObject(message: typings.googleCloudPubsub.protosMod.google.api.HttpRule): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.toObject")
    @js.native
    def toObject(message: typings.googleCloudPubsub.protosMod.google.api.HttpRule, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a HttpRule message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.HttpRule.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ResourceDescriptor. */
  @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor")
  @js.native
  /**
    * Constructs a new ResourceDescriptor.
    * @param [properties] Properties to set
    */
  class ResourceDescriptor ()
    extends typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor {
    def this(properties: IResourceDescriptor) = this()
  }
  object ResourceDescriptor {
    
    /** History enum. */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.History")
    @js.native
    object History extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor.History with Double
          ] = js.native
      
      /* 2 */ val FUTURE_MULTI_PATTERN: typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor.History.FUTURE_MULTI_PATTERN with Double = js.native
      
      /* 0 */ val HISTORY_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor.History.HISTORY_UNSPECIFIED with Double = js.native
      
      /* 1 */ val ORIGINALLY_SINGLE_PATTERN: typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor.History.ORIGINALLY_SINGLE_PATTERN with Double = js.native
    }
    
    /**
      * Creates a new ResourceDescriptor instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceDescriptor instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.create")
    @js.native
    def create(): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.create")
    @js.native
    def create(properties: IResourceDescriptor): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    
    /**
      * Decodes a ResourceDescriptor message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceDescriptor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    
    /**
      * Decodes a ResourceDescriptor message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceDescriptor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    
    /**
      * Encodes the specified ResourceDescriptor message. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
      * @param message ResourceDescriptor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.encode")
    @js.native
    def encode(message: IResourceDescriptor): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.encode")
    @js.native
    def encode(message: IResourceDescriptor, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ResourceDescriptor message, length delimited. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
      * @param message ResourceDescriptor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.encodeDelimited")
    @js.native
    def encodeDelimited(message: IResourceDescriptor): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.encodeDelimited")
    @js.native
    def encodeDelimited(message: IResourceDescriptor, writer: Writer): Writer = js.native
    
    /**
      * Creates a ResourceDescriptor message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceDescriptor
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor = js.native
    
    /**
      * Creates a plain object from a ResourceDescriptor message. Also converts values to other types if specified.
      * @param message ResourceDescriptor
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.toObject")
    @js.native
    def toObject(message: typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudPubsub.protosMod.google.api.ResourceDescriptor,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ResourceDescriptor message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceDescriptor.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ResourceReference. */
  @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference")
  @js.native
  /**
    * Constructs a new ResourceReference.
    * @param [properties] Properties to set
    */
  class ResourceReference ()
    extends typings.googleCloudPubsub.protosMod.google.api.ResourceReference {
    def this(properties: IResourceReference) = this()
  }
  object ResourceReference {
    
    /**
      * Creates a new ResourceReference instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResourceReference instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.create")
    @js.native
    def create(): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.create")
    @js.native
    def create(properties: IResourceReference): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    
    /**
      * Decodes a ResourceReference message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResourceReference
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    
    /**
      * Decodes a ResourceReference message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResourceReference
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    
    /**
      * Encodes the specified ResourceReference message. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
      * @param message ResourceReference message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.encode")
    @js.native
    def encode(message: IResourceReference): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.encode")
    @js.native
    def encode(message: IResourceReference, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ResourceReference message, length delimited. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
      * @param message ResourceReference message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.encodeDelimited")
    @js.native
    def encodeDelimited(message: IResourceReference): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.encodeDelimited")
    @js.native
    def encodeDelimited(message: IResourceReference, writer: Writer): Writer = js.native
    
    /**
      * Creates a ResourceReference message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceReference
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.api.ResourceReference = js.native
    
    /**
      * Creates a plain object from a ResourceReference message. Also converts values to other types if specified.
      * @param message ResourceReference
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.toObject")
    @js.native
    def toObject(message: typings.googleCloudPubsub.protosMod.google.api.ResourceReference): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudPubsub.protosMod.google.api.ResourceReference,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ResourceReference message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.api.ResourceReference.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
