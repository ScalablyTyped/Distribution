package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListVoicesResponse. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse")
@js.native
/**
  * Constructs a new ListVoicesResponse.
  * @param [properties] Properties to set
  */
class ListVoicesResponse () extends IListVoicesResponse {
  def this(properties: IListVoicesResponse) = this()
  
  /**
    * Converts this ListVoicesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ListVoicesResponse voices. */
  @JSName("voices")
  var voices_ListVoicesResponse: js.Array[IVoice] = js.native
}
object ListVoicesResponse {
  
  /**
    * Creates a new ListVoicesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListVoicesResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.create")
  @js.native
  def create(): ListVoicesResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.create")
  @js.native
  def create(properties: IListVoicesResponse): ListVoicesResponse = js.native
  
  /**
    * Decodes a ListVoicesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListVoicesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.decode")
  @js.native
  def decode(reader: Reader): ListVoicesResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListVoicesResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ListVoicesResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListVoicesResponse = js.native
  
  /**
    * Decodes a ListVoicesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListVoicesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListVoicesResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListVoicesResponse = js.native
  
  /**
    * Encodes the specified ListVoicesResponse message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesResponse.verify|verify} messages.
    * @param message ListVoicesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.encode")
  @js.native
  def encode(message: IListVoicesResponse): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.encode")
  @js.native
  def encode(message: IListVoicesResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListVoicesResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.ListVoicesResponse.verify|verify} messages.
    * @param message ListVoicesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListVoicesResponse): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListVoicesResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListVoicesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListVoicesResponse
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListVoicesResponse = js.native
  
  /**
    * Creates a plain object from a ListVoicesResponse message. Also converts values to other types if specified.
    * @param message ListVoicesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.toObject")
  @js.native
  def toObject(message: ListVoicesResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.toObject")
  @js.native
  def toObject(message: ListVoicesResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListVoicesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.ListVoicesResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
