package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesizeSpeechRequest. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest")
@js.native
/**
  * Constructs a new SynthesizeSpeechRequest.
  * @param [properties] Properties to set
  */
class SynthesizeSpeechRequest () extends ISynthesizeSpeechRequest {
  def this(properties: ISynthesizeSpeechRequest) = this()
  
  /** SynthesizeSpeechRequest enableTimePointing. */
  @JSName("enableTimePointing")
  var enableTimePointing_SynthesizeSpeechRequest: js.Array[TimepointType] = js.native
  
  /**
    * Converts this SynthesizeSpeechRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SynthesizeSpeechRequest {
  
  @js.native
  sealed trait TimepointType extends StObject
  /** TimepointType enum. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType")
  @js.native
  object TimepointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TimepointType with Double] = js.native
    
    @js.native
    sealed trait SSML_MARK extends TimepointType
    /* 1 */ val SSML_MARK: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType.SSML_MARK with Double = js.native
    
    @js.native
    sealed trait TIMEPOINT_TYPE_UNSPECIFIED extends TimepointType
    /* 0 */ val TIMEPOINT_TYPE_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType.TIMEPOINT_TYPE_UNSPECIFIED with Double = js.native
  }
  
  /**
    * Creates a new SynthesizeSpeechRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeSpeechRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.create")
  @js.native
  def create(): SynthesizeSpeechRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.create")
  @js.native
  def create(properties: ISynthesizeSpeechRequest): SynthesizeSpeechRequest = js.native
  
  /**
    * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeSpeechRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.decode")
  @js.native
  def decode(reader: Reader): SynthesizeSpeechRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): SynthesizeSpeechRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.decode")
  @js.native
  def decode(reader: Uint8Array): SynthesizeSpeechRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SynthesizeSpeechRequest = js.native
  
  /**
    * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeSpeechRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SynthesizeSpeechRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SynthesizeSpeechRequest = js.native
  
  /**
    * Encodes the specified SynthesizeSpeechRequest message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.verify|verify} messages.
    * @param message SynthesizeSpeechRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.encode")
  @js.native
  def encode(message: ISynthesizeSpeechRequest): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.encode")
  @js.native
  def encode(message: ISynthesizeSpeechRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SynthesizeSpeechRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.verify|verify} messages.
    * @param message SynthesizeSpeechRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISynthesizeSpeechRequest): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISynthesizeSpeechRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a SynthesizeSpeechRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeSpeechRequest
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SynthesizeSpeechRequest = js.native
  
  /**
    * Creates a plain object from a SynthesizeSpeechRequest message. Also converts values to other types if specified.
    * @param message SynthesizeSpeechRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.toObject")
  @js.native
  def toObject(message: SynthesizeSpeechRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.toObject")
  @js.native
  def toObject(message: SynthesizeSpeechRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SynthesizeSpeechRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
