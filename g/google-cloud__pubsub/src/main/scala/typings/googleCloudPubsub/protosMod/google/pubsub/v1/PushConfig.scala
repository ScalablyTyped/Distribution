package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.googleCloudPubsubStrings.oidcToken
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PushConfig. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig")
@js.native
/**
  * Constructs a new PushConfig.
  * @param [properties] Properties to set
  */
class PushConfig () extends IPushConfig {
  def this(properties: IPushConfig) = this()
  
  /** PushConfig attributes. */
  @JSName("attributes")
  var attributes_PushConfig: StringDictionary[String] = js.native
  
  /** PushConfig authenticationMethod. */
  var authenticationMethod: js.UndefOr[oidcToken] = js.native
  
  /** PushConfig pushEndpoint. */
  @JSName("pushEndpoint")
  var pushEndpoint_PushConfig: String = js.native
  
  /**
    * Converts this PushConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PushConfig {
  
  /** Represents an OidcToken. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken")
  @js.native
  /**
    * Constructs a new OidcToken.
    * @param [properties] Properties to set
    */
  class OidcToken () extends IOidcToken {
    def this(properties: IOidcToken) = this()
    
    /** OidcToken audience. */
    @JSName("audience")
    var audience_OidcToken: String = js.native
    
    /** OidcToken serviceAccountEmail. */
    @JSName("serviceAccountEmail")
    var serviceAccountEmail_OidcToken: String = js.native
    
    /**
      * Converts this OidcToken to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object OidcToken {
    
    /**
      * Creates a new OidcToken instance using the specified properties.
      * @param [properties] Properties to set
      * @returns OidcToken instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.create")
    @js.native
    def create(): OidcToken = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.create")
    @js.native
    def create(properties: IOidcToken): OidcToken = js.native
    
    /**
      * Decodes an OidcToken message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns OidcToken
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.decode")
    @js.native
    def decode(reader: Reader): OidcToken = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.decode")
    @js.native
    def decode(reader: Reader, length: Double): OidcToken = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.decode")
    @js.native
    def decode(reader: Uint8Array): OidcToken = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): OidcToken = js.native
    
    /**
      * Decodes an OidcToken message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns OidcToken
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): OidcToken = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): OidcToken = js.native
    
    /**
      * Encodes the specified OidcToken message. Does not implicitly {@link google.pubsub.v1.PushConfig.OidcToken.verify|verify} messages.
      * @param message OidcToken message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.encode")
    @js.native
    def encode(message: IOidcToken): Writer = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.encode")
    @js.native
    def encode(message: IOidcToken, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified OidcToken message, length delimited. Does not implicitly {@link google.pubsub.v1.PushConfig.OidcToken.verify|verify} messages.
      * @param message OidcToken message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.encodeDelimited")
    @js.native
    def encodeDelimited(message: IOidcToken): Writer = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.encodeDelimited")
    @js.native
    def encodeDelimited(message: IOidcToken, writer: Writer): Writer = js.native
    
    /**
      * Creates an OidcToken message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns OidcToken
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): OidcToken = js.native
    
    /**
      * Creates a plain object from an OidcToken message. Also converts values to other types if specified.
      * @param message OidcToken
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.toObject")
    @js.native
    def toObject(message: OidcToken): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.toObject")
    @js.native
    def toObject(message: OidcToken, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an OidcToken message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.OidcToken.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new PushConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PushConfig instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.create")
  @js.native
  def create(): PushConfig = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.create")
  @js.native
  def create(properties: IPushConfig): PushConfig = js.native
  
  /**
    * Decodes a PushConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PushConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.decode")
  @js.native
  def decode(reader: Reader): PushConfig = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): PushConfig = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.decode")
  @js.native
  def decode(reader: Uint8Array): PushConfig = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): PushConfig = js.native
  
  /**
    * Decodes a PushConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PushConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): PushConfig = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): PushConfig = js.native
  
  /**
    * Encodes the specified PushConfig message. Does not implicitly {@link google.pubsub.v1.PushConfig.verify|verify} messages.
    * @param message PushConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.encode")
  @js.native
  def encode(message: IPushConfig): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.encode")
  @js.native
  def encode(message: IPushConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PushConfig message, length delimited. Does not implicitly {@link google.pubsub.v1.PushConfig.verify|verify} messages.
    * @param message PushConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPushConfig): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPushConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a PushConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PushConfig
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): PushConfig = js.native
  
  /**
    * Creates a plain object from a PushConfig message. Also converts values to other types if specified.
    * @param message PushConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.toObject")
  @js.native
  def toObject(message: PushConfig): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.toObject")
  @js.native
  def toObject(message: PushConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PushConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PushConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an OidcToken. */
  @js.native
  trait IOidcToken extends StObject {
    
    /** OidcToken audience */
    var audience: js.UndefOr[String | Null] = js.native
    
    /** OidcToken serviceAccountEmail */
    var serviceAccountEmail: js.UndefOr[String | Null] = js.native
  }
  object IOidcToken {
    
    @scala.inline
    def apply(): IOidcToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOidcToken]
    }
    
    @scala.inline
    implicit class IOidcTokenMutableBuilder[Self <: IOidcToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceNull: Self = StObject.set(x, "audience", null)
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAccountEmailNull: Self = StObject.set(x, "serviceAccountEmail", null)
      
      @scala.inline
      def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    }
  }
}
