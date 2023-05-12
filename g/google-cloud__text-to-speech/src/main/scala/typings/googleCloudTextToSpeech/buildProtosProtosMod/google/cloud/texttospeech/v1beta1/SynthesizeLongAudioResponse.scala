package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesizeLongAudioResponse. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeLongAudioResponse")
@js.native
/**
  * Constructs a new SynthesizeLongAudioResponse.
  * @param [properties] Properties to set
  */
open class SynthesizeLongAudioResponse ()
  extends StObject
     with ISynthesizeLongAudioResponse {
  def this(properties: ISynthesizeLongAudioResponse) = this()
  
  /**
    * Converts this SynthesizeLongAudioResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SynthesizeLongAudioResponse {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeLongAudioResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SynthesizeLongAudioResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeLongAudioResponse instance
    */
  /* static member */
  inline def create(): SynthesizeLongAudioResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SynthesizeLongAudioResponse]
  inline def create(properties: ISynthesizeLongAudioResponse): SynthesizeLongAudioResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): SynthesizeLongAudioResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SynthesizeLongAudioResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeLongAudioResponse]
  /**
    * Decodes a SynthesizeLongAudioResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeLongAudioResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SynthesizeLongAudioResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioResponse]
  inline def decode(reader: Reader, length: Double): SynthesizeLongAudioResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeLongAudioResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SynthesizeLongAudioResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioResponse]
  /**
    * Decodes a SynthesizeLongAudioResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeLongAudioResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SynthesizeLongAudioResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioResponse]
  
  /**
    * Encodes the specified SynthesizeLongAudioResponse message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeLongAudioResponse.verify|verify} messages.
    * @param message SynthesizeLongAudioResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISynthesizeLongAudioResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISynthesizeLongAudioResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SynthesizeLongAudioResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeLongAudioResponse.verify|verify} messages.
    * @param message SynthesizeLongAudioResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISynthesizeLongAudioResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISynthesizeLongAudioResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SynthesizeLongAudioResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeLongAudioResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SynthesizeLongAudioResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioResponse]
  
  /**
    * Gets the default type url for SynthesizeLongAudioResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a SynthesizeLongAudioResponse message. Also converts values to other types if specified.
    * @param message SynthesizeLongAudioResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SynthesizeLongAudioResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SynthesizeLongAudioResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SynthesizeLongAudioResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
