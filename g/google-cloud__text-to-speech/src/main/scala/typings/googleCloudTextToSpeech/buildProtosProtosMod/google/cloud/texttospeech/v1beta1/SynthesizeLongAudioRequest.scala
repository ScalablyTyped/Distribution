package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesizeLongAudioRequest. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeLongAudioRequest")
@js.native
/**
  * Constructs a new SynthesizeLongAudioRequest.
  * @param [properties] Properties to set
  */
open class SynthesizeLongAudioRequest ()
  extends StObject
     with ISynthesizeLongAudioRequest {
  def this(properties: ISynthesizeLongAudioRequest) = this()
  
  /** SynthesizeLongAudioRequest outputGcsUri. */
  @JSName("outputGcsUri")
  var outputGcsUri_SynthesizeLongAudioRequest: String = js.native
  
  /** SynthesizeLongAudioRequest parent. */
  @JSName("parent")
  var parent_SynthesizeLongAudioRequest: String = js.native
  
  /**
    * Converts this SynthesizeLongAudioRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SynthesizeLongAudioRequest {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesizeLongAudioRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SynthesizeLongAudioRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeLongAudioRequest instance
    */
  /* static member */
  inline def create(): SynthesizeLongAudioRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SynthesizeLongAudioRequest]
  inline def create(properties: ISynthesizeLongAudioRequest): SynthesizeLongAudioRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): SynthesizeLongAudioRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SynthesizeLongAudioRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeLongAudioRequest]
  /**
    * Decodes a SynthesizeLongAudioRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeLongAudioRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SynthesizeLongAudioRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioRequest]
  inline def decode(reader: Reader, length: Double): SynthesizeLongAudioRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeLongAudioRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SynthesizeLongAudioRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioRequest]
  /**
    * Decodes a SynthesizeLongAudioRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeLongAudioRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SynthesizeLongAudioRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioRequest]
  
  /**
    * Encodes the specified SynthesizeLongAudioRequest message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeLongAudioRequest.verify|verify} messages.
    * @param message SynthesizeLongAudioRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISynthesizeLongAudioRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISynthesizeLongAudioRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SynthesizeLongAudioRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesizeLongAudioRequest.verify|verify} messages.
    * @param message SynthesizeLongAudioRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISynthesizeLongAudioRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISynthesizeLongAudioRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SynthesizeLongAudioRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeLongAudioRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SynthesizeLongAudioRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SynthesizeLongAudioRequest]
  
  /**
    * Gets the default type url for SynthesizeLongAudioRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a SynthesizeLongAudioRequest message. Also converts values to other types if specified.
    * @param message SynthesizeLongAudioRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SynthesizeLongAudioRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SynthesizeLongAudioRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SynthesizeLongAudioRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
