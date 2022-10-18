package typings.googleCloudTextToSpeech.buildSrcMod.protos.google.cloud.texttospeech

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.IAudioConfig
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ICustomVoiceParams
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.IListVoicesRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.IListVoicesResponse
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ISynthesisInput
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ISynthesizeSpeechRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ISynthesizeSpeechResponse
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ITimepoint
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.IVoice
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.IVoiceSelectionParams
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
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
  open class AudioConfig ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig {
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
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    inline def create(properties: IAudioConfig): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    /**
      * Decodes an AudioConfig message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns AudioConfig
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    /**
      * Decodes an AudioConfig message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns AudioConfig
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    
    /**
      * Encodes the specified AudioConfig message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.AudioConfig.verify|verify} messages.
      * @param message AudioConfig message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified AudioConfig message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.AudioConfig.verify|verify} messages.
      * @param message AudioConfig message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an AudioConfig message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns AudioConfig
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig]
    
    /**
      * Gets the default type url for AudioConfig
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from an AudioConfig message. Also converts values to other types if specified.
      * @param message AudioConfig
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioConfig,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an AudioConfig message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** AudioEncoding enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.AudioEncoding")
  @js.native
  object AudioEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding & Double
      ] = js.native
    
    /* 6 */ val ALAW: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.ALAW & Double = js.native
    
    /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED & Double = js.native
    
    /* 1 */ val LINEAR16: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.LINEAR16 & Double = js.native
    
    /* 2 */ val MP3: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.MP3 & Double = js.native
    
    /* 4 */ val MP3_64_KBPS: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.MP3_64_KBPS & Double = js.native
    
    /* 5 */ val MULAW: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.MULAW & Double = js.native
    
    /* 3 */ val OGG_OPUS: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.OGG_OPUS & Double = js.native
  }
  
  /** Represents a CustomVoiceParams. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.CustomVoiceParams")
  @js.native
  /**
    * Constructs a new CustomVoiceParams.
    * @param [properties] Properties to set
    */
  open class CustomVoiceParams ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams {
    def this(properties: ICustomVoiceParams) = this()
  }
  object CustomVoiceParams {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.CustomVoiceParams")
    @js.native
    val ^ : js.Any = js.native
    
    /** ReportedUsage enum. */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage")
    @js.native
    object ReportedUsage extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage & Double
          ] = js.native
      
      /* 2 */ val OFFLINE: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.OFFLINE & Double = js.native
      
      /* 1 */ val REALTIME: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.REALTIME & Double = js.native
      
      /* 0 */ val REPORTED_USAGE_UNSPECIFIED: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.REPORTED_USAGE_UNSPECIFIED & Double = js.native
    }
    
    /**
      * Creates a new CustomVoiceParams instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CustomVoiceParams instance
      */
    /* static member */
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    inline def create(properties: ICustomVoiceParams): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    /**
      * Decodes a CustomVoiceParams message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CustomVoiceParams
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    /**
      * Decodes a CustomVoiceParams message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CustomVoiceParams
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    
    /**
      * Encodes the specified CustomVoiceParams message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.CustomVoiceParams.verify|verify} messages.
      * @param message CustomVoiceParams message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ICustomVoiceParams): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ICustomVoiceParams, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified CustomVoiceParams message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.CustomVoiceParams.verify|verify} messages.
      * @param message CustomVoiceParams message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ICustomVoiceParams): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ICustomVoiceParams, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a CustomVoiceParams message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomVoiceParams
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams]
    
    /**
      * Gets the default type url for CustomVoiceParams
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a CustomVoiceParams message. Also converts values to other types if specified.
      * @param message CustomVoiceParams
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.CustomVoiceParams,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a CustomVoiceParams message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ListVoicesRequest. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.ListVoicesRequest")
  @js.native
  /**
    * Constructs a new ListVoicesRequest.
    * @param [properties] Properties to set
    */
  open class ListVoicesRequest ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest {
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
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    inline def create(properties: IListVoicesRequest): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    /**
      * Decodes a ListVoicesRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListVoicesRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    /**
      * Decodes a ListVoicesRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListVoicesRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    
    /**
      * Encodes the specified ListVoicesRequest message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesRequest.verify|verify} messages.
      * @param message ListVoicesRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IListVoicesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IListVoicesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ListVoicesRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesRequest.verify|verify} messages.
      * @param message ListVoicesRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IListVoicesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IListVoicesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ListVoicesRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListVoicesRequest
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest]
    
    /**
      * Gets the default type url for ListVoicesRequest
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ListVoicesRequest message. Also converts values to other types if specified.
      * @param message ListVoicesRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesRequest,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ListVoicesRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ListVoicesResponse. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.ListVoicesResponse")
  @js.native
  /**
    * Constructs a new ListVoicesResponse.
    * @param [properties] Properties to set
    */
  open class ListVoicesResponse ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse {
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
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    inline def create(properties: IListVoicesResponse): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    /**
      * Decodes a ListVoicesResponse message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ListVoicesResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    /**
      * Decodes a ListVoicesResponse message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ListVoicesResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    
    /**
      * Encodes the specified ListVoicesResponse message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesResponse.verify|verify} messages.
      * @param message ListVoicesResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IListVoicesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IListVoicesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ListVoicesResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesResponse.verify|verify} messages.
      * @param message ListVoicesResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IListVoicesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IListVoicesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ListVoicesResponse message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ListVoicesResponse
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse]
    
    /**
      * Gets the default type url for ListVoicesResponse
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ListVoicesResponse message. Also converts values to other types if specified.
      * @param message ListVoicesResponse
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ListVoicesResponse,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ListVoicesResponse message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** SsmlVoiceGender enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SsmlVoiceGender")
  @js.native
  object SsmlVoiceGender extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender & Double
      ] = js.native
    
    /* 2 */ val FEMALE: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.FEMALE & Double = js.native
    
    /* 1 */ val MALE: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.MALE & Double = js.native
    
    /* 3 */ val NEUTRAL: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.NEUTRAL & Double = js.native
    
    /* 0 */ val SSML_VOICE_GENDER_UNSPECIFIED: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED & Double = js.native
  }
  
  /** Represents a SynthesisInput. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesisInput")
  @js.native
  /**
    * Constructs a new SynthesisInput.
    * @param [properties] Properties to set
    */
  open class SynthesisInput ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput {
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
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    inline def create(properties: ISynthesisInput): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    /**
      * Decodes a SynthesisInput message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesisInput
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    /**
      * Decodes a SynthesisInput message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesisInput
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    
    /**
      * Encodes the specified SynthesisInput message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesisInput.verify|verify} messages.
      * @param message SynthesisInput message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ISynthesisInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ISynthesisInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified SynthesisInput message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesisInput.verify|verify} messages.
      * @param message SynthesisInput message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ISynthesisInput): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ISynthesisInput, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a SynthesisInput message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesisInput
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput]
    
    /**
      * Gets the default type url for SynthesisInput
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a SynthesisInput message. Also converts values to other types if specified.
      * @param message SynthesisInput
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesisInput,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a SynthesisInput message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a SynthesizeSpeechRequest. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest")
  @js.native
  /**
    * Constructs a new SynthesizeSpeechRequest.
    * @param [properties] Properties to set
    */
  open class SynthesizeSpeechRequest ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest {
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
            typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType & Double
          ] = js.native
      
      /* 1 */ val SSML_MARK: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType.SSML_MARK & Double = js.native
      
      /* 0 */ val TIMEPOINT_TYPE_UNSPECIFIED: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType.TIMEPOINT_TYPE_UNSPECIFIED & Double = js.native
    }
    
    /**
      * Creates a new SynthesizeSpeechRequest instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SynthesizeSpeechRequest instance
      */
    /* static member */
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    inline def create(properties: ISynthesizeSpeechRequest): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    /**
      * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesizeSpeechRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    /**
      * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesizeSpeechRequest
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    
    /**
      * Encodes the specified SynthesizeSpeechRequest message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.verify|verify} messages.
      * @param message SynthesizeSpeechRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ISynthesizeSpeechRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ISynthesizeSpeechRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified SynthesizeSpeechRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.verify|verify} messages.
      * @param message SynthesizeSpeechRequest message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ISynthesizeSpeechRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ISynthesizeSpeechRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a SynthesizeSpeechRequest message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesizeSpeechRequest
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest]
    
    /**
      * Gets the default type url for SynthesizeSpeechRequest
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a SynthesizeSpeechRequest message. Also converts values to other types if specified.
      * @param message SynthesizeSpeechRequest
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a SynthesizeSpeechRequest message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a SynthesizeSpeechResponse. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse")
  @js.native
  /**
    * Constructs a new SynthesizeSpeechResponse.
    * @param [properties] Properties to set
    */
  open class SynthesizeSpeechResponse ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse {
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
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    inline def create(properties: ISynthesizeSpeechResponse): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    /**
      * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SynthesizeSpeechResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    /**
      * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SynthesizeSpeechResponse
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    
    /**
      * Encodes the specified SynthesizeSpeechResponse message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.verify|verify} messages.
      * @param message SynthesizeSpeechResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ISynthesizeSpeechResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ISynthesizeSpeechResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified SynthesizeSpeechResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.verify|verify} messages.
      * @param message SynthesizeSpeechResponse message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ISynthesizeSpeechResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ISynthesizeSpeechResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a SynthesizeSpeechResponse message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SynthesizeSpeechResponse
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse]
    
    /**
      * Gets the default type url for SynthesizeSpeechResponse
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a SynthesizeSpeechResponse message. Also converts values to other types if specified.
      * @param message SynthesizeSpeechResponse
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a SynthesizeSpeechResponse message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a TextToSpeech */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.TextToSpeech")
  @js.native
  open class TextToSpeech protected ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech {
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
    inline def create(rpcImpl: RPCImpl): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech]
    inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech]
    inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech]
    inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.TextToSpeech]
  }
  
  /** Represents a Timepoint. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.Timepoint")
  @js.native
  /**
    * Constructs a new Timepoint.
    * @param [properties] Properties to set
    */
  open class Timepoint ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint {
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
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    inline def create(properties: ITimepoint): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    /**
      * Decodes a Timepoint message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Timepoint
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    /**
      * Decodes a Timepoint message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Timepoint
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    
    /**
      * Encodes the specified Timepoint message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Timepoint.verify|verify} messages.
      * @param message Timepoint message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ITimepoint): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ITimepoint, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Timepoint message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Timepoint.verify|verify} messages.
      * @param message Timepoint message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ITimepoint): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ITimepoint, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Timepoint message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Timepoint
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint]
    
    /**
      * Gets the default type url for Timepoint
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Timepoint message. Also converts values to other types if specified.
      * @param message Timepoint
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Timepoint,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Timepoint message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Voice. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.Voice")
  @js.native
  /**
    * Constructs a new Voice.
    * @param [properties] Properties to set
    */
  open class Voice ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice {
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
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    inline def create(properties: IVoice): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    /**
      * Decodes a Voice message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Voice
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    /**
      * Decodes a Voice message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Voice
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    
    /**
      * Encodes the specified Voice message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Voice.verify|verify} messages.
      * @param message Voice message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IVoice): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IVoice, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Voice message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Voice.verify|verify} messages.
      * @param message Voice message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IVoice): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IVoice, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Voice message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Voice
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice]
    
    /**
      * Gets the default type url for Voice
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Voice message. Also converts values to other types if specified.
      * @param message Voice
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.Voice,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Voice message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a VoiceSelectionParams. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.cloud.texttospeech.v1beta1.VoiceSelectionParams")
  @js.native
  /**
    * Constructs a new VoiceSelectionParams.
    * @param [properties] Properties to set
    */
  open class VoiceSelectionParams ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams {
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
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    inline def create(properties: IVoiceSelectionParams): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    /**
      * Decodes a VoiceSelectionParams message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns VoiceSelectionParams
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    /**
      * Decodes a VoiceSelectionParams message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns VoiceSelectionParams
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    
    /**
      * Encodes the specified VoiceSelectionParams message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify|verify} messages.
      * @param message VoiceSelectionParams message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IVoiceSelectionParams): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IVoiceSelectionParams, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified VoiceSelectionParams message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.VoiceSelectionParams.verify|verify} messages.
      * @param message VoiceSelectionParams message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IVoiceSelectionParams): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IVoiceSelectionParams, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a VoiceSelectionParams message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns VoiceSelectionParams
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams]
    
    /**
      * Gets the default type url for VoiceSelectionParams
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a VoiceSelectionParams message. Also converts values to other types if specified.
      * @param message VoiceSelectionParams
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.VoiceSelectionParams,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a VoiceSelectionParams message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
}
