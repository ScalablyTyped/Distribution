package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DetectIntentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentResponse")
@js.native
/**
  * Constructs a new DetectIntentResponse.
  * @param [properties] Properties to set
  */
class DetectIntentResponse () extends IDetectIntentResponse {
  def this(properties: IDetectIntentResponse) = this()
  /** DetectIntentResponse alternativeQueryResults. */
  @JSName("alternativeQueryResults")
  var alternativeQueryResults_DetectIntentResponse: js.Array[IQueryResult] = js.native
  /** DetectIntentResponse outputAudio. */
  @JSName("outputAudio")
  var outputAudio_DetectIntentResponse: Uint8Array = js.native
  /** DetectIntentResponse responseId. */
  @JSName("responseId")
  var responseId_DetectIntentResponse: String = js.native
  /**
    * Converts this DetectIntentResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DetectIntentResponse")
@js.native
object DetectIntentResponse extends js.Object {
  /**
    * Creates a new DetectIntentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetectIntentResponse instance
    */
  def create(): DetectIntentResponse = js.native
  def create(properties: IDetectIntentResponse): DetectIntentResponse = js.native
  /**
    * Decodes a DetectIntentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DetectIntentResponse = js.native
  def decode(reader: Reader, length: Double): DetectIntentResponse = js.native
  def decode(reader: Uint8Array): DetectIntentResponse = js.native
  def decode(reader: Uint8Array, length: Double): DetectIntentResponse = js.native
  /**
    * Decodes a DetectIntentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DetectIntentResponse = js.native
  def decodeDelimited(reader: Uint8Array): DetectIntentResponse = js.native
  /**
    * Encodes the specified DetectIntentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DetectIntentResponse.verify|verify} messages.
    * @param message DetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDetectIntentResponse): Writer = js.native
  def encode(message: IDetectIntentResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DetectIntentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DetectIntentResponse.verify|verify} messages.
    * @param message DetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDetectIntentResponse): Writer = js.native
  def encodeDelimited(message: IDetectIntentResponse, writer: Writer): Writer = js.native
  /**
    * Creates a DetectIntentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetectIntentResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): DetectIntentResponse = js.native
  /**
    * Creates a plain object from a DetectIntentResponse message. Also converts values to other types if specified.
    * @param message DetectIntentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DetectIntentResponse): StringDictionary[js.Any] = js.native
  def toObject(message: DetectIntentResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DetectIntentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

