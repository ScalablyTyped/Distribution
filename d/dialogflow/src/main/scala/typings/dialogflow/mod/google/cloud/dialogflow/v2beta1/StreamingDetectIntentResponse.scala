package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a StreamingDetectIntentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse")
@js.native
/**
  * Constructs a new StreamingDetectIntentResponse.
  * @param [properties] Properties to set
  */
class StreamingDetectIntentResponse () extends IStreamingDetectIntentResponse {
  def this(properties: IStreamingDetectIntentResponse) = this()
  /** StreamingDetectIntentResponse alternativeQueryResults. */
  @JSName("alternativeQueryResults")
  var alternativeQueryResults_StreamingDetectIntentResponse: js.Array[IQueryResult] = js.native
  /** StreamingDetectIntentResponse outputAudio. */
  @JSName("outputAudio")
  var outputAudio_StreamingDetectIntentResponse: Uint8Array | String = js.native
  /** StreamingDetectIntentResponse responseId. */
  @JSName("responseId")
  var responseId_StreamingDetectIntentResponse: String = js.native
  /**
    * Converts this StreamingDetectIntentResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse")
@js.native
object StreamingDetectIntentResponse extends js.Object {
  /**
    * Creates a new StreamingDetectIntentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingDetectIntentResponse instance
    */
  def create(): StreamingDetectIntentResponse = js.native
  def create(properties: IStreamingDetectIntentResponse): StreamingDetectIntentResponse = js.native
  /**
    * Decodes a StreamingDetectIntentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingDetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): StreamingDetectIntentResponse = js.native
  def decode(reader: Reader, length: Double): StreamingDetectIntentResponse = js.native
  def decode(reader: Uint8Array): StreamingDetectIntentResponse = js.native
  def decode(reader: Uint8Array, length: Double): StreamingDetectIntentResponse = js.native
  /**
    * Decodes a StreamingDetectIntentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingDetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): StreamingDetectIntentResponse = js.native
  def decodeDelimited(reader: Uint8Array): StreamingDetectIntentResponse = js.native
  /**
    * Encodes the specified StreamingDetectIntentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse.verify|verify} messages.
    * @param message StreamingDetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStreamingDetectIntentResponse): Writer = js.native
  def encode(message: IStreamingDetectIntentResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified StreamingDetectIntentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse.verify|verify} messages.
    * @param message StreamingDetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStreamingDetectIntentResponse): Writer = js.native
  def encodeDelimited(message: IStreamingDetectIntentResponse, writer: Writer): Writer = js.native
  /**
    * Creates a StreamingDetectIntentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingDetectIntentResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): StreamingDetectIntentResponse = js.native
  /**
    * Creates a plain object from a StreamingDetectIntentResponse message. Also converts values to other types if specified.
    * @param message StreamingDetectIntentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: StreamingDetectIntentResponse): StringDictionary[js.Any] = js.native
  def toObject(message: StreamingDetectIntentResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StreamingDetectIntentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

