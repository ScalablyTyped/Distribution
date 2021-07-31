package typings.googleCloudTextToSpeech.srcMod.protos.google.cloud.texttospeech

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.IAudioConfig
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.IListVoicesRequest
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.IListVoicesResponse
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ISynthesisInput
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ISynthesizeSpeechRequest
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ISynthesizeSpeechResponse
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ITimepoint
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.IVoice
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.IVoiceSelectionParams
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace v1beta1. */
object v1beta1 {
  
  /** Represents an AudioConfig. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.AudioConfig")
  @js.native
  /**
    * Constructs a new AudioConfig.
    * @param [properties] Properties to set
    */
  class AudioConfig ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig {
    def this(properties: IAudioConfig) = this()
  }
  object AudioConfig {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.AudioConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new AudioConfig instance using the specified properties.
      * @param [properties] Properties to set
      * @returns AudioConfig instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    @scala.inline
    def create(properties: IAudioConfig): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    
    /**
      * Decodes an AudioConfig message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns AudioConfig
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    
    /**
      * Decodes an AudioConfig message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns AudioConfig
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    
    /**
      * Encodes the specified AudioConfig message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.AudioConfig.verify|verify} messages.
      * @param message AudioConfig message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified AudioConfig message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.AudioConfig.verify|verify} messages.
      * @param message AudioConfig message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an AudioConfig message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns AudioConfig
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig]
    
    /**
      * Creates a plain object from an AudioConfig message. Also converts values to other types if specified.
      * @param message AudioConfig
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioConfig,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an AudioConfig message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** AudioEncoding enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.AudioEncoding")
  @js.native
  object AudioEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioEncoding & Double
      ] = js.native
    
    /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED & Double = js.native
    
    /* 1 */ val LINEAR16: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioEncoding.LINEAR16 & Double = js.native
    
    /* 2 */ val MP3: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioEncoding.MP3 & Double = js.native
    
    /* 4 */ val MP3_64_KBPS: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioEncoding.MP3_64_KBPS & Double = js.native
    
    /* 5 */ val MULAW: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioEncoding.MULAW & Double = js.native
    
    /* 3 */ val OGG_OPUS: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.AudioEncoding.OGG_OPUS & Double = js.native
  }
  
  /** Represents a ListVoicesRequest. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.ListVoicesRequest")
  @js.native
  /**
    * Constructs a new ListVoicesRequest.
    * @param [properties] Properties to set
    */
  class ListVoicesRequest ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest {
    def this(properties: IListVoicesRequest) = this()
  }
  object ListVoicesRequest {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.ListVoicesRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ListVoicesRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ListVoicesRequest instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    @scala.inline
    def create(properties: IListVoicesRequest): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    
    /**
      * Decodes a ListVoicesRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListVoicesRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    
    /**
      * Decodes a ListVoicesRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListVoicesRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    
    /**
      * Encodes the specified ListVoicesRequest message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesRequest.verify|verify} messages.
      * @param message ListVoicesRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IListVoicesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IListVoicesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ListVoicesRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesRequest.verify|verify} messages.
      * @param message ListVoicesRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IListVoicesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IListVoicesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ListVoicesRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListVoicesRequest
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    
    /**
      * Creates a plain object from a ListVoicesRequest message. Also converts values to other types if specified.
      * @param message ListVoicesRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a ListVoicesRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ListVoicesResponse. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.ListVoicesResponse")
  @js.native
  /**
    * Constructs a new ListVoicesResponse.
    * @param [properties] Properties to set
    */
  class ListVoicesResponse ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse {
    def this(properties: IListVoicesResponse) = this()
  }
  object ListVoicesResponse {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.ListVoicesResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ListVoicesResponse instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ListVoicesResponse instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    @scala.inline
    def create(properties: IListVoicesResponse): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    
    /**
      * Decodes a ListVoicesResponse message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListVoicesResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    
    /**
      * Decodes a ListVoicesResponse message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListVoicesResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    
    /**
      * Encodes the specified ListVoicesResponse message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesResponse.verify|verify} messages.
      * @param message ListVoicesResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IListVoicesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IListVoicesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ListVoicesResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesResponse.verify|verify} messages.
      * @param message ListVoicesResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IListVoicesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IListVoicesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ListVoicesResponse message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListVoicesResponse
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    
    /**
      * Creates a plain object from a ListVoicesResponse message. Also converts values to other types if specified.
      * @param message ListVoicesResponse
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ListVoicesResponse,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a ListVoicesResponse message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** SsmlVoiceGender enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SsmlVoiceGender")
  @js.native
  object SsmlVoiceGender extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender & Double
      ] = js.native
    
    /* 2 */ val FEMALE: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.FEMALE & Double = js.native
    
    /* 1 */ val MALE: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.MALE & Double = js.native
    
    /* 3 */ val NEUTRAL: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.NEUTRAL & Double = js.native
    
    /* 0 */ val SSML_VOICE_GENDER_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED & Double = js.native
  }
  
  /** Represents a SynthesisInput. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesisInput")
  @js.native
  /**
    * Constructs a new SynthesisInput.
    * @param [properties] Properties to set
    */
  class SynthesisInput ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput {
    def this(properties: ISynthesisInput) = this()
  }
  object SynthesisInput {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesisInput")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SynthesisInput instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SynthesisInput instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    @scala.inline
    def create(properties: ISynthesisInput): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    
    /**
      * Decodes a SynthesisInput message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesisInput
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    
    /**
      * Decodes a SynthesisInput message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesisInput
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    
    /**
      * Encodes the specified SynthesisInput message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesisInput.verify|verify} messages.
      * @param message SynthesisInput message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ISynthesisInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ISynthesisInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified SynthesisInput message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesisInput.verify|verify} messages.
      * @param message SynthesisInput message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ISynthesisInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ISynthesisInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a SynthesisInput message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesisInput
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    
    /**
      * Creates a plain object from a SynthesisInput message. Also converts values to other types if specified.
      * @param message SynthesisInput
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesisInput,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a SynthesisInput message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a SynthesizeSpeechRequest. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest")
  @js.native
  /**
    * Constructs a new SynthesizeSpeechRequest.
    * @param [properties] Properties to set
    */
  class SynthesizeSpeechRequest ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest {
    def this(properties: ISynthesizeSpeechRequest) = this()
  }
  object SynthesizeSpeechRequest {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /** TimepointType enum. */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType")
    @js.native
    object TimepointType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType & Double
          ] = js.native
      
      /* 1 */ val SSML_MARK: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType.SSML_MARK & Double = js.native
      
      /* 0 */ val TIMEPOINT_TYPE_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType.TIMEPOINT_TYPE_UNSPECIFIED & Double = js.native
    }
    
    /**
      * Creates a new SynthesizeSpeechRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SynthesizeSpeechRequest instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    @scala.inline
    def create(properties: ISynthesizeSpeechRequest): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    
    /**
      * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesizeSpeechRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    
    /**
      * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesizeSpeechRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    
    /**
      * Encodes the specified SynthesizeSpeechRequest message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.verify|verify} messages.
      * @param message SynthesizeSpeechRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ISynthesizeSpeechRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ISynthesizeSpeechRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified SynthesizeSpeechRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.verify|verify} messages.
      * @param message SynthesizeSpeechRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ISynthesizeSpeechRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ISynthesizeSpeechRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a SynthesizeSpeechRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesizeSpeechRequest
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    
    /**
      * Creates a plain object from a SynthesizeSpeechRequest message. Also converts values to other types if specified.
      * @param message SynthesizeSpeechRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest
    ): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a SynthesizeSpeechRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a SynthesizeSpeechResponse. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse")
  @js.native
  /**
    * Constructs a new SynthesizeSpeechResponse.
    * @param [properties] Properties to set
    */
  class SynthesizeSpeechResponse ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse {
    def this(properties: ISynthesizeSpeechResponse) = this()
  }
  object SynthesizeSpeechResponse {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SynthesizeSpeechResponse instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SynthesizeSpeechResponse instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    @scala.inline
    def create(properties: ISynthesizeSpeechResponse): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    
    /**
      * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesizeSpeechResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    
    /**
      * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesizeSpeechResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    
    /**
      * Encodes the specified SynthesizeSpeechResponse message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.verify|verify} messages.
      * @param message SynthesizeSpeechResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ISynthesizeSpeechResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ISynthesizeSpeechResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified SynthesizeSpeechResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.verify|verify} messages.
      * @param message SynthesizeSpeechResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ISynthesizeSpeechResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ISynthesizeSpeechResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a SynthesizeSpeechResponse message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesizeSpeechResponse
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    
    /**
      * Creates a plain object from a SynthesizeSpeechResponse message. Also converts values to other types if specified.
      * @param message SynthesizeSpeechResponse
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse
    ): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a SynthesizeSpeechResponse message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a TextToSpeech */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.TextToSpeech")
  @js.native
  class TextToSpeech protected ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech {
    /**
      * Constructs a new TextToSpeech service.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      */
    def this(rpcImpl: RPCImpl) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  }
  object TextToSpeech {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.TextToSpeech")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates new TextToSpeech service using the specified rpc implementation.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      * @returns RPC service. Useful where requests and/or responses are streamed.
      */
    /* static member */
    @scala.inline
    def create(rpcImpl: RPCImpl): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech]
    @scala.inline
    def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech]
    @scala.inline
    def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech]
    @scala.inline
    def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech]
  }
  
  /** Represents a Timepoint. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.Timepoint")
  @js.native
  /**
    * Constructs a new Timepoint.
    * @param [properties] Properties to set
    */
  class Timepoint ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint {
    def this(properties: ITimepoint) = this()
  }
  object Timepoint {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.Timepoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Timepoint instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Timepoint instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    @scala.inline
    def create(properties: ITimepoint): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    
    /**
      * Decodes a Timepoint message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Timepoint
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    
    /**
      * Decodes a Timepoint message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Timepoint
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    
    /**
      * Encodes the specified Timepoint message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Timepoint.verify|verify} messages.
      * @param message Timepoint message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ITimepoint): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ITimepoint, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Timepoint message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Timepoint.verify|verify} messages.
      * @param message Timepoint message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ITimepoint): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ITimepoint, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Timepoint message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Timepoint
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint]
    
    /**
      * Creates a plain object from a Timepoint message. Also converts values to other types if specified.
      * @param message Timepoint
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Timepoint,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Timepoint message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Voice. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.Voice")
  @js.native
  /**
    * Constructs a new Voice.
    * @param [properties] Properties to set
    */
  class Voice ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice {
    def this(properties: IVoice) = this()
  }
  object Voice {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.Voice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Voice instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Voice instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    @scala.inline
    def create(properties: IVoice): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    
    /**
      * Decodes a Voice message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Voice
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    
    /**
      * Decodes a Voice message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Voice
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    
    /**
      * Encodes the specified Voice message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Voice.verify|verify} messages.
      * @param message Voice message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IVoice): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IVoice, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Voice message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Voice.verify|verify} messages.
      * @param message Voice message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IVoice): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IVoice, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Voice message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Voice
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice]
    
    /**
      * Creates a plain object from a Voice message. Also converts values to other types if specified.
      * @param message Voice
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.Voice,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Voice message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a VoiceSelectionParams. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.VoiceSelectionParams")
  @js.native
  /**
    * Constructs a new VoiceSelectionParams.
    * @param [properties] Properties to set
    */
  class VoiceSelectionParams ()
    extends typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams {
    def this(properties: IVoiceSelectionParams) = this()
  }
  object VoiceSelectionParams {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.VoiceSelectionParams")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new VoiceSelectionParams instance using the specified properties.
      * @param [properties] Properties to set
      * @returns VoiceSelectionParams instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    @scala.inline
    def create(properties: IVoiceSelectionParams): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    
    /**
      * Decodes a VoiceSelectionParams message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns VoiceSelectionParams
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    
    /**
      * Decodes a VoiceSelectionParams message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns VoiceSelectionParams
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    
    /**
      * Encodes the specified VoiceSelectionParams message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify|verify} messages.
      * @param message VoiceSelectionParams message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IVoiceSelectionParams): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IVoiceSelectionParams, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified VoiceSelectionParams message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify|verify} messages.
      * @param message VoiceSelectionParams message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IVoiceSelectionParams): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IVoiceSelectionParams, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a VoiceSelectionParams message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns VoiceSelectionParams
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    
    /**
      * Creates a plain object from a VoiceSelectionParams message. Also converts values to other types if specified.
      * @param message VoiceSelectionParams
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams
    ): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a VoiceSelectionParams message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
}
