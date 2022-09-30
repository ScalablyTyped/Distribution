package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CustomVoiceParams. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.CustomVoiceParams")
@js.native
/**
  * Constructs a new CustomVoiceParams.
  * @param [properties] Properties to set
  */
open class CustomVoiceParams ()
  extends StObject
     with ICustomVoiceParams {
  def this(properties: ICustomVoiceParams) = this()
  
  /** CustomVoiceParams model. */
  @JSName("model")
  var model_CustomVoiceParams: String = js.native
  
  /** CustomVoiceParams reportedUsage. */
  @JSName("reportedUsage")
  var reportedUsage_CustomVoiceParams: ReportedUsage | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage * / any */ String) = js.native
  
  /**
    * Converts this CustomVoiceParams to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CustomVoiceParams {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.CustomVoiceParams")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ReportedUsage extends StObject
  /** ReportedUsage enum. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage")
  @js.native
  object ReportedUsage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReportedUsage & Double] = js.native
    
    @js.native
    sealed trait OFFLINE
      extends StObject
         with ReportedUsage
    /* 2 */ val OFFLINE: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.OFFLINE & Double = js.native
    
    @js.native
    sealed trait REALTIME
      extends StObject
         with ReportedUsage
    /* 1 */ val REALTIME: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.REALTIME & Double = js.native
    
    @js.native
    sealed trait REPORTED_USAGE_UNSPECIFIED
      extends StObject
         with ReportedUsage
    /* 0 */ val REPORTED_USAGE_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.REPORTED_USAGE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new CustomVoiceParams instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CustomVoiceParams instance
    */
  /* static member */
  inline def create(): CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CustomVoiceParams]
  inline def create(properties: ICustomVoiceParams): CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CustomVoiceParams]
  
  inline def decode(reader: js.typedarray.Uint8Array): CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomVoiceParams]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CustomVoiceParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CustomVoiceParams]
  /**
    * Decodes a CustomVoiceParams message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CustomVoiceParams
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomVoiceParams]
  inline def decode(reader: Reader, length: Double): CustomVoiceParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CustomVoiceParams]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomVoiceParams]
  /**
    * Decodes a CustomVoiceParams message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CustomVoiceParams
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomVoiceParams]
  
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
  inline def fromObject(`object`: StringDictionary[Any]): CustomVoiceParams = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CustomVoiceParams]
  
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
  inline def toObject(message: CustomVoiceParams): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CustomVoiceParams, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CustomVoiceParams message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
