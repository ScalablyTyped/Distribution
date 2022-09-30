package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingPullResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullResponse")
@js.native
/**
  * Constructs a new StreamingPullResponse.
  * @param [properties] Properties to set
  */
open class StreamingPullResponse ()
  extends StObject
     with IStreamingPullResponse {
  def this(properties: IStreamingPullResponse) = this()
  
  /** StreamingPullResponse receivedMessages. */
  @JSName("receivedMessages")
  var receivedMessages_StreamingPullResponse: js.Array[IReceivedMessage] = js.native
  
  /**
    * Converts this StreamingPullResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object StreamingPullResponse {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an AcknowledgeConfirmation. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation")
  @js.native
  /**
    * Constructs a new AcknowledgeConfirmation.
    * @param [properties] Properties to set
    */
  open class AcknowledgeConfirmation ()
    extends StObject
       with IAcknowledgeConfirmation {
    def this(properties: IAcknowledgeConfirmation) = this()
    
    /** AcknowledgeConfirmation ackIds. */
    @JSName("ackIds")
    var ackIds_AcknowledgeConfirmation: js.Array[String] = js.native
    
    /** AcknowledgeConfirmation invalidAckIds. */
    @JSName("invalidAckIds")
    var invalidAckIds_AcknowledgeConfirmation: js.Array[String] = js.native
    
    /**
      * Converts this AcknowledgeConfirmation to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** AcknowledgeConfirmation unorderedAckIds. */
    @JSName("unorderedAckIds")
    var unorderedAckIds_AcknowledgeConfirmation: js.Array[String] = js.native
  }
  object AcknowledgeConfirmation {
    
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new AcknowledgeConfirmation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns AcknowledgeConfirmation instance
      */
    /* static member */
    inline def create(): AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AcknowledgeConfirmation]
    inline def create(properties: IAcknowledgeConfirmation): AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[AcknowledgeConfirmation]
    
    inline def decode(reader: js.typedarray.Uint8Array): AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AcknowledgeConfirmation]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): AcknowledgeConfirmation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AcknowledgeConfirmation]
    /**
      * Decodes an AcknowledgeConfirmation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns AcknowledgeConfirmation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AcknowledgeConfirmation]
    inline def decode(reader: Reader, length: Double): AcknowledgeConfirmation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AcknowledgeConfirmation]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AcknowledgeConfirmation]
    /**
      * Decodes an AcknowledgeConfirmation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns AcknowledgeConfirmation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AcknowledgeConfirmation]
    
    /**
      * Encodes the specified AcknowledgeConfirmation message. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation.verify|verify} messages.
      * @param message AcknowledgeConfirmation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IAcknowledgeConfirmation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IAcknowledgeConfirmation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified AcknowledgeConfirmation message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation.verify|verify} messages.
      * @param message AcknowledgeConfirmation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IAcknowledgeConfirmation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IAcknowledgeConfirmation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an AcknowledgeConfirmation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns AcknowledgeConfirmation
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[AcknowledgeConfirmation]
    
    /**
      * Gets the default type url for AcknowledgeConfirmation
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from an AcknowledgeConfirmation message. Also converts values to other types if specified.
      * @param message AcknowledgeConfirmation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: AcknowledgeConfirmation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: AcknowledgeConfirmation, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an AcknowledgeConfirmation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ModifyAckDeadlineConfirmation. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation")
  @js.native
  /**
    * Constructs a new ModifyAckDeadlineConfirmation.
    * @param [properties] Properties to set
    */
  open class ModifyAckDeadlineConfirmation ()
    extends StObject
       with IModifyAckDeadlineConfirmation {
    def this(properties: IModifyAckDeadlineConfirmation) = this()
    
    /** ModifyAckDeadlineConfirmation ackIds. */
    @JSName("ackIds")
    var ackIds_ModifyAckDeadlineConfirmation: js.Array[String] = js.native
    
    /** ModifyAckDeadlineConfirmation invalidAckIds. */
    @JSName("invalidAckIds")
    var invalidAckIds_ModifyAckDeadlineConfirmation: js.Array[String] = js.native
    
    /**
      * Converts this ModifyAckDeadlineConfirmation to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ModifyAckDeadlineConfirmation {
    
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ModifyAckDeadlineConfirmation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ModifyAckDeadlineConfirmation instance
      */
    /* static member */
    inline def create(): ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ModifyAckDeadlineConfirmation]
    inline def create(properties: IModifyAckDeadlineConfirmation): ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineConfirmation]
    
    inline def decode(reader: js.typedarray.Uint8Array): ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineConfirmation]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ModifyAckDeadlineConfirmation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ModifyAckDeadlineConfirmation]
    /**
      * Decodes a ModifyAckDeadlineConfirmation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ModifyAckDeadlineConfirmation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineConfirmation]
    inline def decode(reader: Reader, length: Double): ModifyAckDeadlineConfirmation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ModifyAckDeadlineConfirmation]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineConfirmation]
    /**
      * Decodes a ModifyAckDeadlineConfirmation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ModifyAckDeadlineConfirmation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineConfirmation]
    
    /**
      * Encodes the specified ModifyAckDeadlineConfirmation message. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation.verify|verify} messages.
      * @param message ModifyAckDeadlineConfirmation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IModifyAckDeadlineConfirmation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IModifyAckDeadlineConfirmation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ModifyAckDeadlineConfirmation message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation.verify|verify} messages.
      * @param message ModifyAckDeadlineConfirmation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IModifyAckDeadlineConfirmation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IModifyAckDeadlineConfirmation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ModifyAckDeadlineConfirmation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ModifyAckDeadlineConfirmation
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineConfirmation]
    
    /**
      * Gets the default type url for ModifyAckDeadlineConfirmation
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ModifyAckDeadlineConfirmation message. Also converts values to other types if specified.
      * @param message ModifyAckDeadlineConfirmation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ModifyAckDeadlineConfirmation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ModifyAckDeadlineConfirmation, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ModifyAckDeadlineConfirmation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a SubscriptionProperties. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullResponse.SubscriptionProperties")
  @js.native
  /**
    * Constructs a new SubscriptionProperties.
    * @param [properties] Properties to set
    */
  open class SubscriptionProperties ()
    extends StObject
       with ISubscriptionProperties {
    def this(properties: ISubscriptionProperties) = this()
    
    /** SubscriptionProperties exactlyOnceDeliveryEnabled. */
    @JSName("exactlyOnceDeliveryEnabled")
    var exactlyOnceDeliveryEnabled_SubscriptionProperties: Boolean = js.native
    
    /** SubscriptionProperties messageOrderingEnabled. */
    @JSName("messageOrderingEnabled")
    var messageOrderingEnabled_SubscriptionProperties: Boolean = js.native
    
    /**
      * Converts this SubscriptionProperties to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object SubscriptionProperties {
    
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.StreamingPullResponse.SubscriptionProperties")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SubscriptionProperties instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SubscriptionProperties instance
      */
    /* static member */
    inline def create(): SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SubscriptionProperties]
    inline def create(properties: ISubscriptionProperties): SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SubscriptionProperties]
    
    inline def decode(reader: js.typedarray.Uint8Array): SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SubscriptionProperties]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): SubscriptionProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SubscriptionProperties]
    /**
      * Decodes a SubscriptionProperties message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SubscriptionProperties
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SubscriptionProperties]
    inline def decode(reader: Reader, length: Double): SubscriptionProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SubscriptionProperties]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SubscriptionProperties]
    /**
      * Decodes a SubscriptionProperties message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SubscriptionProperties
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SubscriptionProperties]
    
    /**
      * Encodes the specified SubscriptionProperties message. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.SubscriptionProperties.verify|verify} messages.
      * @param message SubscriptionProperties message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ISubscriptionProperties): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ISubscriptionProperties, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified SubscriptionProperties message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.SubscriptionProperties.verify|verify} messages.
      * @param message SubscriptionProperties message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ISubscriptionProperties): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ISubscriptionProperties, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a SubscriptionProperties message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SubscriptionProperties
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SubscriptionProperties]
    
    /**
      * Gets the default type url for SubscriptionProperties
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a SubscriptionProperties message. Also converts values to other types if specified.
      * @param message SubscriptionProperties
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: SubscriptionProperties): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: SubscriptionProperties, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a SubscriptionProperties message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new StreamingPullResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingPullResponse instance
    */
  /* static member */
  inline def create(): StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StreamingPullResponse]
  inline def create(properties: IStreamingPullResponse): StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StreamingPullResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingPullResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): StreamingPullResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingPullResponse]
  /**
    * Decodes a StreamingPullResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingPullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingPullResponse]
  inline def decode(reader: Reader, length: Double): StreamingPullResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingPullResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingPullResponse]
  /**
    * Decodes a StreamingPullResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingPullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingPullResponse]
  
  /**
    * Encodes the specified StreamingPullResponse message. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.verify|verify} messages.
    * @param message StreamingPullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IStreamingPullResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStreamingPullResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StreamingPullResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.verify|verify} messages.
    * @param message StreamingPullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IStreamingPullResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStreamingPullResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StreamingPullResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingPullResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StreamingPullResponse]
  
  /**
    * Gets the default type url for StreamingPullResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a StreamingPullResponse message. Also converts values to other types if specified.
    * @param message StreamingPullResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: StreamingPullResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: StreamingPullResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a StreamingPullResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an AcknowledgeConfirmation. */
  trait IAcknowledgeConfirmation extends StObject {
    
    /** AcknowledgeConfirmation ackIds */
    var ackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** AcknowledgeConfirmation invalidAckIds */
    var invalidAckIds: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** AcknowledgeConfirmation unorderedAckIds */
    var unorderedAckIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  }
  object IAcknowledgeConfirmation {
    
    inline def apply(): IAcknowledgeConfirmation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAcknowledgeConfirmation]
    }
    
    extension [Self <: IAcknowledgeConfirmation](x: Self) {
      
      inline def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
      
      inline def setAckIdsNull: Self = StObject.set(x, "ackIds", null)
      
      inline def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
      
      inline def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value*))
      
      inline def setInvalidAckIds(value: js.Array[String]): Self = StObject.set(x, "invalidAckIds", value.asInstanceOf[js.Any])
      
      inline def setInvalidAckIdsNull: Self = StObject.set(x, "invalidAckIds", null)
      
      inline def setInvalidAckIdsUndefined: Self = StObject.set(x, "invalidAckIds", js.undefined)
      
      inline def setInvalidAckIdsVarargs(value: String*): Self = StObject.set(x, "invalidAckIds", js.Array(value*))
      
      inline def setUnorderedAckIds(value: js.Array[String]): Self = StObject.set(x, "unorderedAckIds", value.asInstanceOf[js.Any])
      
      inline def setUnorderedAckIdsNull: Self = StObject.set(x, "unorderedAckIds", null)
      
      inline def setUnorderedAckIdsUndefined: Self = StObject.set(x, "unorderedAckIds", js.undefined)
      
      inline def setUnorderedAckIdsVarargs(value: String*): Self = StObject.set(x, "unorderedAckIds", js.Array(value*))
    }
  }
  
  /** Properties of a ModifyAckDeadlineConfirmation. */
  trait IModifyAckDeadlineConfirmation extends StObject {
    
    /** ModifyAckDeadlineConfirmation ackIds */
    var ackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** ModifyAckDeadlineConfirmation invalidAckIds */
    var invalidAckIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  }
  object IModifyAckDeadlineConfirmation {
    
    inline def apply(): IModifyAckDeadlineConfirmation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModifyAckDeadlineConfirmation]
    }
    
    extension [Self <: IModifyAckDeadlineConfirmation](x: Self) {
      
      inline def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
      
      inline def setAckIdsNull: Self = StObject.set(x, "ackIds", null)
      
      inline def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
      
      inline def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value*))
      
      inline def setInvalidAckIds(value: js.Array[String]): Self = StObject.set(x, "invalidAckIds", value.asInstanceOf[js.Any])
      
      inline def setInvalidAckIdsNull: Self = StObject.set(x, "invalidAckIds", null)
      
      inline def setInvalidAckIdsUndefined: Self = StObject.set(x, "invalidAckIds", js.undefined)
      
      inline def setInvalidAckIdsVarargs(value: String*): Self = StObject.set(x, "invalidAckIds", js.Array(value*))
    }
  }
  
  /** Properties of a SubscriptionProperties. */
  trait ISubscriptionProperties extends StObject {
    
    /** SubscriptionProperties exactlyOnceDeliveryEnabled */
    var exactlyOnceDeliveryEnabled: js.UndefOr[Boolean | Null] = js.undefined
    
    /** SubscriptionProperties messageOrderingEnabled */
    var messageOrderingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  }
  object ISubscriptionProperties {
    
    inline def apply(): ISubscriptionProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISubscriptionProperties]
    }
    
    extension [Self <: ISubscriptionProperties](x: Self) {
      
      inline def setExactlyOnceDeliveryEnabled(value: Boolean): Self = StObject.set(x, "exactlyOnceDeliveryEnabled", value.asInstanceOf[js.Any])
      
      inline def setExactlyOnceDeliveryEnabledNull: Self = StObject.set(x, "exactlyOnceDeliveryEnabled", null)
      
      inline def setExactlyOnceDeliveryEnabledUndefined: Self = StObject.set(x, "exactlyOnceDeliveryEnabled", js.undefined)
      
      inline def setMessageOrderingEnabled(value: Boolean): Self = StObject.set(x, "messageOrderingEnabled", value.asInstanceOf[js.Any])
      
      inline def setMessageOrderingEnabledNull: Self = StObject.set(x, "messageOrderingEnabled", null)
      
      inline def setMessageOrderingEnabledUndefined: Self = StObject.set(x, "messageOrderingEnabled", js.undefined)
    }
  }
}
