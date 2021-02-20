package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPushConfig
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.IOidcToken
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PushConfig. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig")
@js.native
/**
  * Constructs a new PushConfig.
  * @param [properties] Properties to set
  */
class PushConfig ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig {
  def this(properties: IPushConfig) = this()
}
object PushConfig {
  
  /** Represents an OidcToken. */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken")
  @js.native
  /**
    * Constructs a new OidcToken.
    * @param [properties] Properties to set
    */
  class OidcToken ()
    extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken {
    def this(properties: IOidcToken) = this()
  }
  object OidcToken {
    
    /**
      * Creates a new OidcToken instance using the specified properties.
      * @param [properties] Properties to set
      * @returns OidcToken instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.create")
    @js.native
    def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.create")
    @js.native
    def create(properties: IOidcToken): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    
    /**
      * Decodes an OidcToken message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns OidcToken
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    
    /**
      * Decodes an OidcToken message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns OidcToken
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    
    /**
      * Encodes the specified OidcToken message. Does not implicitly {@link google.pubsub.v1.PushConfig.OidcToken.verify|verify} messages.
      * @param message OidcToken message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.encode")
    @js.native
    def encode(message: IOidcToken): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.encode")
    @js.native
    def encode(message: IOidcToken, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified OidcToken message, length delimited. Does not implicitly {@link google.pubsub.v1.PushConfig.OidcToken.verify|verify} messages.
      * @param message OidcToken message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.encodeDelimited")
    @js.native
    def encodeDelimited(message: IOidcToken): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.encodeDelimited")
    @js.native
    def encodeDelimited(message: IOidcToken, writer: Writer): Writer = js.native
    
    /**
      * Creates an OidcToken message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns OidcToken
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken = js.native
    
    /**
      * Creates a plain object from an OidcToken message. Also converts values to other types if specified.
      * @param message OidcToken
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.toObject")
    @js.native
    def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.OidcToken,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an OidcToken message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.OidcToken.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new PushConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PushConfig instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.create")
  @js.native
  def create(properties: IPushConfig): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  
  /**
    * Decodes a PushConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PushConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  
  /**
    * Decodes a PushConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PushConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  
  /**
    * Encodes the specified PushConfig message. Does not implicitly {@link google.pubsub.v1.PushConfig.verify|verify} messages.
    * @param message PushConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.encode")
  @js.native
  def encode(message: IPushConfig): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.encode")
  @js.native
  def encode(message: IPushConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PushConfig message, length delimited. Does not implicitly {@link google.pubsub.v1.PushConfig.verify|verify} messages.
    * @param message PushConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPushConfig): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPushConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a PushConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PushConfig
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig = js.native
  
  /**
    * Creates a plain object from a PushConfig message. Also converts values to other types if specified.
    * @param message PushConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PushConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PushConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
