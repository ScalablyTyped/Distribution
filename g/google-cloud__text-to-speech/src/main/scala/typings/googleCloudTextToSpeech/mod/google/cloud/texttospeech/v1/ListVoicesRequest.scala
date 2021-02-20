package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListVoicesRequest. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest")
@js.native
/**
  * Constructs a new ListVoicesRequest.
  * @param [properties] Properties to set
  */
class ListVoicesRequest () extends IListVoicesRequest {
  def this(properties: IListVoicesRequest) = this()
  
  /** ListVoicesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_ListVoicesRequest: String = js.native
  
  /**
    * Converts this ListVoicesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListVoicesRequest {
  
  /**
    * Creates a new ListVoicesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListVoicesRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.create")
  @js.native
  def create(): ListVoicesRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.create")
  @js.native
  def create(properties: IListVoicesRequest): ListVoicesRequest = js.native
  
  /**
    * Decodes a ListVoicesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListVoicesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.decode")
  @js.native
  def decode(reader: Reader): ListVoicesRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListVoicesRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ListVoicesRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListVoicesRequest = js.native
  
  /**
    * Decodes a ListVoicesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListVoicesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListVoicesRequest = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListVoicesRequest = js.native
  
  /**
    * Encodes the specified ListVoicesRequest message. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesRequest.verify|verify} messages.
    * @param message ListVoicesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.encode")
  @js.native
  def encode(message: IListVoicesRequest): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.encode")
  @js.native
  def encode(message: IListVoicesRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListVoicesRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.ListVoicesRequest.verify|verify} messages.
    * @param message ListVoicesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListVoicesRequest): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListVoicesRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListVoicesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListVoicesRequest
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListVoicesRequest = js.native
  
  /**
    * Creates a plain object from a ListVoicesRequest message. Also converts values to other types if specified.
    * @param message ListVoicesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.toObject")
  @js.native
  def toObject(message: ListVoicesRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.toObject")
  @js.native
  def toObject(message: ListVoicesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListVoicesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.ListVoicesRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
