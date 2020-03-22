package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a StreamingDetectIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest")
@js.native
/**
  * Constructs a new StreamingDetectIntentRequest.
  * @param [properties] Properties to set
  */
class StreamingDetectIntentRequest () extends IStreamingDetectIntentRequest {
  def this(properties: IStreamingDetectIntentRequest) = this()
  /** StreamingDetectIntentRequest inputAudio. */
  @JSName("inputAudio")
  var inputAudio_StreamingDetectIntentRequest: Uint8Array | String = js.native
  /** StreamingDetectIntentRequest session. */
  @JSName("session")
  var session_StreamingDetectIntentRequest: String = js.native
  /** StreamingDetectIntentRequest singleUtterance. */
  @JSName("singleUtterance")
  var singleUtterance_StreamingDetectIntentRequest: Boolean = js.native
  /**
    * Converts this StreamingDetectIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest")
@js.native
object StreamingDetectIntentRequest extends js.Object {
  /**
    * Creates a new StreamingDetectIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingDetectIntentRequest instance
    */
  def create(): StreamingDetectIntentRequest = js.native
  def create(properties: IStreamingDetectIntentRequest): StreamingDetectIntentRequest = js.native
  /**
    * Decodes a StreamingDetectIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingDetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): StreamingDetectIntentRequest = js.native
  def decode(reader: Reader, length: Double): StreamingDetectIntentRequest = js.native
  def decode(reader: Uint8Array): StreamingDetectIntentRequest = js.native
  def decode(reader: Uint8Array, length: Double): StreamingDetectIntentRequest = js.native
  /**
    * Decodes a StreamingDetectIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingDetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): StreamingDetectIntentRequest = js.native
  def decodeDelimited(reader: Uint8Array): StreamingDetectIntentRequest = js.native
  /**
    * Encodes the specified StreamingDetectIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.verify|verify} messages.
    * @param message StreamingDetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStreamingDetectIntentRequest): Writer = js.native
  def encode(message: IStreamingDetectIntentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified StreamingDetectIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.verify|verify} messages.
    * @param message StreamingDetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStreamingDetectIntentRequest): Writer = js.native
  def encodeDelimited(message: IStreamingDetectIntentRequest, writer: Writer): Writer = js.native
  /**
    * Creates a StreamingDetectIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingDetectIntentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): StreamingDetectIntentRequest = js.native
  /**
    * Creates a plain object from a StreamingDetectIntentRequest message. Also converts values to other types if specified.
    * @param message StreamingDetectIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: StreamingDetectIntentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: StreamingDetectIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StreamingDetectIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

