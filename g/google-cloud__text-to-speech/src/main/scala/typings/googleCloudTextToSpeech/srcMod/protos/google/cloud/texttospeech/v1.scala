package typings.googleCloudTextToSpeech.srcMod.protos.google.cloud.texttospeech

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.IAudioConfig
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.IListVoicesRequest
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.IListVoicesResponse
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ISynthesisInput
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ISynthesizeSpeechRequest
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ISynthesizeSpeechResponse
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.IVoice
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.IVoiceSelectionParams
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace v1. */
object v1 {
  
  /** Represents an AudioConfig. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig")
  @js.native
  /**
    * Constructs a new AudioConfig.
    * @param [properties] Properties to set
    */
  class AudioConfig ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig {
    def this(properties: IAudioConfig) = this()
  }
  object AudioConfig {
    
    /**
      * Creates a new AudioConfig instance using the specified properties.
      * @param [properties] Properties to set
      * @returns AudioConfig instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.create")
    @js.native
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.create")
    @js.native
    def create(properties: IAudioConfig): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    
    /**
      * Decodes an AudioConfig message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns AudioConfig
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    
    /**
      * Decodes an AudioConfig message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns AudioConfig
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    
    /**
      * Encodes the specified AudioConfig message. Does not implicitly {@link google.cloud.texttospeech.v1.AudioConfig.verify|verify} messages.
      * @param message AudioConfig message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.encode")
    @js.native
    def encode(message: IAudioConfig): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.encode")
    @js.native
    def encode(message: IAudioConfig, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified AudioConfig message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.AudioConfig.verify|verify} messages.
      * @param message AudioConfig message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAudioConfig): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAudioConfig, writer: Writer): Writer = js.native
    
    /**
      * Creates an AudioConfig message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns AudioConfig
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig = js.native
    
    /**
      * Creates a plain object from an AudioConfig message. Also converts values to other types if specified.
      * @param message AudioConfig
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.toObject")
    @js.native
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioConfig,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an AudioConfig message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioConfig.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** AudioEncoding enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.AudioEncoding")
  @js.native
  object AudioEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding with Double
      ] = js.native
    
    /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED with Double = js.native
    
    /* 1 */ val LINEAR16: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.LINEAR16 with Double = js.native
    
    /* 2 */ val MP3: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.MP3 with Double = js.native
    
    /* 3 */ val OGG_OPUS: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.OGG_OPUS with Double = js.native
  }
  
  /** Represents a ListVoicesRequest. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest")
  @js.native
  /**
    * Constructs a new ListVoicesRequest.
    * @param [properties] Properties to set
    */
  class ListVoicesRequest ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest {
    def this(properties: IListVoicesRequest) = this()
  }
  object ListVoicesRequest {
    
    /**
      * Creates a new ListVoicesRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ListVoicesRequest instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.create")
    @js.native
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.create")
    @js.native
    def create(properties: IListVoicesRequest): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    
    /**
      * Decodes a ListVoicesRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListVoicesRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    
    /**
      * Decodes a ListVoicesRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListVoicesRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    
    /**
      * Encodes the specified ListVoicesRequest message. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesRequest.verify|verify} messages.
      * @param message ListVoicesRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.encode")
    @js.native
    def encode(message: IListVoicesRequest): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.encode")
    @js.native
    def encode(message: IListVoicesRequest, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ListVoicesRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesRequest.verify|verify} messages.
      * @param message ListVoicesRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IListVoicesRequest): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: IListVoicesRequest, writer: Writer): Writer = js.native
    
    /**
      * Creates a ListVoicesRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListVoicesRequest
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest = js.native
    
    /**
      * Creates a plain object from a ListVoicesRequest message. Also converts values to other types if specified.
      * @param message ListVoicesRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.toObject")
    @js.native
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ListVoicesRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesRequest.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ListVoicesResponse. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse")
  @js.native
  /**
    * Constructs a new ListVoicesResponse.
    * @param [properties] Properties to set
    */
  class ListVoicesResponse ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse {
    def this(properties: IListVoicesResponse) = this()
  }
  object ListVoicesResponse {
    
    /**
      * Creates a new ListVoicesResponse instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ListVoicesResponse instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.create")
    @js.native
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.create")
    @js.native
    def create(properties: IListVoicesResponse): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    
    /**
      * Decodes a ListVoicesResponse message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListVoicesResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    
    /**
      * Decodes a ListVoicesResponse message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListVoicesResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    
    /**
      * Encodes the specified ListVoicesResponse message. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesResponse.verify|verify} messages.
      * @param message ListVoicesResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.encode")
    @js.native
    def encode(message: IListVoicesResponse): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.encode")
    @js.native
    def encode(message: IListVoicesResponse, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ListVoicesResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesResponse.verify|verify} messages.
      * @param message ListVoicesResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.encodeDelimited")
    @js.native
    def encodeDelimited(message: IListVoicesResponse): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.encodeDelimited")
    @js.native
    def encodeDelimited(message: IListVoicesResponse, writer: Writer): Writer = js.native
    
    /**
      * Creates a ListVoicesResponse message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListVoicesResponse
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse = js.native
    
    /**
      * Creates a plain object from a ListVoicesResponse message. Also converts values to other types if specified.
      * @param message ListVoicesResponse
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.toObject")
    @js.native
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.ListVoicesResponse,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ListVoicesResponse message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.ListVoicesResponse.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** SsmlVoiceGender enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SsmlVoiceGender")
  @js.native
  object SsmlVoiceGender extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SsmlVoiceGender with Double
      ] = js.native
    
    /* 2 */ val FEMALE: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SsmlVoiceGender.FEMALE with Double = js.native
    
    /* 1 */ val MALE: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SsmlVoiceGender.MALE with Double = js.native
    
    /* 3 */ val NEUTRAL: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SsmlVoiceGender.NEUTRAL with Double = js.native
    
    /* 0 */ val SSML_VOICE_GENDER_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED with Double = js.native
  }
  
  /** Represents a SynthesisInput. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput")
  @js.native
  /**
    * Constructs a new SynthesisInput.
    * @param [properties] Properties to set
    */
  class SynthesisInput ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput {
    def this(properties: ISynthesisInput) = this()
  }
  object SynthesisInput {
    
    /**
      * Creates a new SynthesisInput instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SynthesisInput instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.create")
    @js.native
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.create")
    @js.native
    def create(properties: ISynthesisInput): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    
    /**
      * Decodes a SynthesisInput message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesisInput
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    
    /**
      * Decodes a SynthesisInput message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesisInput
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    
    /**
      * Encodes the specified SynthesisInput message. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesisInput.verify|verify} messages.
      * @param message SynthesisInput message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.encode")
    @js.native
    def encode(message: ISynthesisInput): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.encode")
    @js.native
    def encode(message: ISynthesisInput, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified SynthesisInput message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesisInput.verify|verify} messages.
      * @param message SynthesisInput message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISynthesisInput): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISynthesisInput, writer: Writer): Writer = js.native
    
    /**
      * Creates a SynthesisInput message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesisInput
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput = js.native
    
    /**
      * Creates a plain object from a SynthesisInput message. Also converts values to other types if specified.
      * @param message SynthesisInput
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.toObject")
    @js.native
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesisInput,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a SynthesisInput message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesisInput.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a SynthesizeSpeechRequest. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest")
  @js.native
  /**
    * Constructs a new SynthesizeSpeechRequest.
    * @param [properties] Properties to set
    */
  class SynthesizeSpeechRequest ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest {
    def this(properties: ISynthesizeSpeechRequest) = this()
  }
  object SynthesizeSpeechRequest {
    
    /**
      * Creates a new SynthesizeSpeechRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SynthesizeSpeechRequest instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.create")
    @js.native
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.create")
    @js.native
    def create(properties: ISynthesizeSpeechRequest): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    
    /**
      * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesizeSpeechRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    
    /**
      * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesizeSpeechRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    
    /**
      * Encodes the specified SynthesizeSpeechRequest message. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechRequest.verify|verify} messages.
      * @param message SynthesizeSpeechRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.encode")
    @js.native
    def encode(message: ISynthesizeSpeechRequest): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.encode")
    @js.native
    def encode(message: ISynthesizeSpeechRequest, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified SynthesizeSpeechRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechRequest.verify|verify} messages.
      * @param message SynthesizeSpeechRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISynthesizeSpeechRequest): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISynthesizeSpeechRequest, writer: Writer): Writer = js.native
    
    /**
      * Creates a SynthesizeSpeechRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesizeSpeechRequest
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest = js.native
    
    /**
      * Creates a plain object from a SynthesizeSpeechRequest message. Also converts values to other types if specified.
      * @param message SynthesizeSpeechRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.toObject")
    @js.native
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a SynthesizeSpeechRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a SynthesizeSpeechResponse. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse")
  @js.native
  /**
    * Constructs a new SynthesizeSpeechResponse.
    * @param [properties] Properties to set
    */
  class SynthesizeSpeechResponse ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse {
    def this(properties: ISynthesizeSpeechResponse) = this()
  }
  object SynthesizeSpeechResponse {
    
    /**
      * Creates a new SynthesizeSpeechResponse instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SynthesizeSpeechResponse instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.create")
    @js.native
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.create")
    @js.native
    def create(properties: ISynthesizeSpeechResponse): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    
    /**
      * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesizeSpeechResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    
    /**
      * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesizeSpeechResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    
    /**
      * Encodes the specified SynthesizeSpeechResponse message. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify|verify} messages.
      * @param message SynthesizeSpeechResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.encode")
    @js.native
    def encode(message: ISynthesizeSpeechResponse): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.encode")
    @js.native
    def encode(message: ISynthesizeSpeechResponse, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified SynthesizeSpeechResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify|verify} messages.
      * @param message SynthesizeSpeechResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISynthesizeSpeechResponse): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISynthesizeSpeechResponse, writer: Writer): Writer = js.native
    
    /**
      * Creates a SynthesizeSpeechResponse message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesizeSpeechResponse
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse = js.native
    
    /**
      * Creates a plain object from a SynthesizeSpeechResponse message. Also converts values to other types if specified.
      * @param message SynthesizeSpeechResponse
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.toObject")
    @js.native
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.SynthesizeSpeechResponse,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a SynthesizeSpeechResponse message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a TextToSpeech */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.TextToSpeech")
  @js.native
  class TextToSpeech protected ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.TextToSpeech {
    /**
      * Constructs a new TextToSpeech service.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      */
    def this(rpcImpl: RPCImpl) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  }
  object TextToSpeech {
    
    /**
      * Creates new TextToSpeech service using the specified rpc implementation.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      * @returns RPC service. Useful where requests and/or responses are streamed.
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.TextToSpeech.create")
    @js.native
    def create(rpcImpl: RPCImpl): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.TextToSpeech = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.TextToSpeech.create")
    @js.native
    def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.TextToSpeech = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.TextToSpeech.create")
    @js.native
    def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.TextToSpeech = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.TextToSpeech.create")
    @js.native
    def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.TextToSpeech = js.native
  }
  
  /** Represents a Voice. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice")
  @js.native
  /**
    * Constructs a new Voice.
    * @param [properties] Properties to set
    */
  class Voice ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice {
    def this(properties: IVoice) = this()
  }
  object Voice {
    
    /**
      * Creates a new Voice instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Voice instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.create")
    @js.native
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.create")
    @js.native
    def create(properties: IVoice): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    
    /**
      * Decodes a Voice message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Voice
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    
    /**
      * Decodes a Voice message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Voice
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    
    /**
      * Encodes the specified Voice message. Does not implicitly {@link google.cloud.texttospeech.v1.Voice.verify|verify} messages.
      * @param message Voice message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.encode")
    @js.native
    def encode(message: IVoice): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.encode")
    @js.native
    def encode(message: IVoice, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Voice message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.Voice.verify|verify} messages.
      * @param message Voice message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.encodeDelimited")
    @js.native
    def encodeDelimited(message: IVoice): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.encodeDelimited")
    @js.native
    def encodeDelimited(message: IVoice, writer: Writer): Writer = js.native
    
    /**
      * Creates a Voice message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Voice
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice = js.native
    
    /**
      * Creates a plain object from a Voice message. Also converts values to other types if specified.
      * @param message Voice
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.toObject")
    @js.native
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.Voice,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Voice message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.Voice.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a VoiceSelectionParams. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams")
  @js.native
  /**
    * Constructs a new VoiceSelectionParams.
    * @param [properties] Properties to set
    */
  class VoiceSelectionParams ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams {
    def this(properties: IVoiceSelectionParams) = this()
  }
  object VoiceSelectionParams {
    
    /**
      * Creates a new VoiceSelectionParams instance using the specified properties.
      * @param [properties] Properties to set
      * @returns VoiceSelectionParams instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.create")
    @js.native
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.create")
    @js.native
    def create(properties: IVoiceSelectionParams): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    
    /**
      * Decodes a VoiceSelectionParams message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns VoiceSelectionParams
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.decode")
    @js.native
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    
    /**
      * Decodes a VoiceSelectionParams message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns VoiceSelectionParams
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    
    /**
      * Encodes the specified VoiceSelectionParams message. Does not implicitly {@link google.cloud.texttospeech.v1.VoiceSelectionParams.verify|verify} messages.
      * @param message VoiceSelectionParams message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.encode")
    @js.native
    def encode(message: IVoiceSelectionParams): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.encode")
    @js.native
    def encode(message: IVoiceSelectionParams, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified VoiceSelectionParams message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.VoiceSelectionParams.verify|verify} messages.
      * @param message VoiceSelectionParams message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.encodeDelimited")
    @js.native
    def encodeDelimited(message: IVoiceSelectionParams): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.encodeDelimited")
    @js.native
    def encodeDelimited(message: IVoiceSelectionParams, writer: Writer): Writer = js.native
    
    /**
      * Creates a VoiceSelectionParams message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns VoiceSelectionParams
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams = js.native
    
    /**
      * Creates a plain object from a VoiceSelectionParams message. Also converts values to other types if specified.
      * @param message VoiceSelectionParams
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.toObject")
    @js.native
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.toObject")
    @js.native
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.VoiceSelectionParams,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a VoiceSelectionParams message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1.VoiceSelectionParams.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
