package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IStreamingPullResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.IAcknowledgeConfirmation
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.IModifyAckDeadlineConfirmation
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ISubscriptionProperties
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingPullResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse")
@js.native
/**
  * Constructs a new StreamingPullResponse.
  * @param [properties] Properties to set
  */
open class StreamingPullResponse ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse {
  def this(properties: IStreamingPullResponse) = this()
}
object StreamingPullResponse {
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an AcknowledgeConfirmation. */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation")
  @js.native
  /**
    * Constructs a new AcknowledgeConfirmation.
    * @param [properties] Properties to set
    */
  open class AcknowledgeConfirmation ()
    extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation {
    def this(properties: IAcknowledgeConfirmation) = this()
  }
  object AcknowledgeConfirmation {
    
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new AcknowledgeConfirmation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns AcknowledgeConfirmation instance
      */
    /* static member */
    inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    inline def create(properties: IAcknowledgeConfirmation): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    /**
      * Decodes an AcknowledgeConfirmation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns AcknowledgeConfirmation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    /**
      * Decodes an AcknowledgeConfirmation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns AcknowledgeConfirmation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation]
    
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
    inline def toObject(
      message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.AcknowledgeConfirmation,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an AcknowledgeConfirmation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ModifyAckDeadlineConfirmation. */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation")
  @js.native
  /**
    * Constructs a new ModifyAckDeadlineConfirmation.
    * @param [properties] Properties to set
    */
  open class ModifyAckDeadlineConfirmation ()
    extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation {
    def this(properties: IModifyAckDeadlineConfirmation) = this()
  }
  object ModifyAckDeadlineConfirmation {
    
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ModifyAckDeadlineConfirmation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ModifyAckDeadlineConfirmation instance
      */
    /* static member */
    inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    inline def create(properties: IModifyAckDeadlineConfirmation): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    /**
      * Decodes a ModifyAckDeadlineConfirmation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ModifyAckDeadlineConfirmation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    /**
      * Decodes a ModifyAckDeadlineConfirmation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ModifyAckDeadlineConfirmation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation]
    
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
    inline def toObject(
      message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ModifyAckDeadlineConfirmation,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ModifyAckDeadlineConfirmation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a SubscriptionProperties. */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties")
  @js.native
  /**
    * Constructs a new SubscriptionProperties.
    * @param [properties] Properties to set
    */
  open class SubscriptionProperties ()
    extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties {
    def this(properties: ISubscriptionProperties) = this()
  }
  object SubscriptionProperties {
    
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SubscriptionProperties instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SubscriptionProperties instance
      */
    /* static member */
    inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    inline def create(properties: ISubscriptionProperties): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    /**
      * Decodes a SubscriptionProperties message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SubscriptionProperties
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    /**
      * Decodes a SubscriptionProperties message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SubscriptionProperties
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    
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
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties]
    
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
    inline def toObject(
      message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.SubscriptionProperties,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
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
  inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  inline def create(properties: IStreamingPullResponse): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  /**
    * Decodes a StreamingPullResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingPullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  /**
    * Decodes a StreamingPullResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingPullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  
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
  inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse]
  
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
  inline def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a StreamingPullResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
