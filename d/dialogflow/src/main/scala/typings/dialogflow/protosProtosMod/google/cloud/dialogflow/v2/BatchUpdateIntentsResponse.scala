package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BatchUpdateIntentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsResponse")
@js.native
/**
  * Constructs a new BatchUpdateIntentsResponse.
  * @param [properties] Properties to set
  */
class BatchUpdateIntentsResponse () extends IBatchUpdateIntentsResponse {
  def this(properties: IBatchUpdateIntentsResponse) = this()
  /** BatchUpdateIntentsResponse intents. */
  @JSName("intents")
  var intents_BatchUpdateIntentsResponse: js.Array[IIntent] = js.native
  /**
    * Converts this BatchUpdateIntentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsResponse")
@js.native
object BatchUpdateIntentsResponse extends js.Object {
  /**
    * Creates a new BatchUpdateIntentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateIntentsResponse instance
    */
  def create(): BatchUpdateIntentsResponse = js.native
  def create(properties: IBatchUpdateIntentsResponse): BatchUpdateIntentsResponse = js.native
  /**
    * Decodes a BatchUpdateIntentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BatchUpdateIntentsResponse = js.native
  def decode(reader: Reader, length: Double): BatchUpdateIntentsResponse = js.native
  def decode(reader: Uint8Array): BatchUpdateIntentsResponse = js.native
  def decode(reader: Uint8Array, length: Double): BatchUpdateIntentsResponse = js.native
  /**
    * Decodes a BatchUpdateIntentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BatchUpdateIntentsResponse = js.native
  def decodeDelimited(reader: Uint8Array): BatchUpdateIntentsResponse = js.native
  /**
    * Encodes the specified BatchUpdateIntentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateIntentsResponse.verify|verify} messages.
    * @param message BatchUpdateIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchUpdateIntentsResponse): Writer = js.native
  def encode(message: IBatchUpdateIntentsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BatchUpdateIntentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateIntentsResponse.verify|verify} messages.
    * @param message BatchUpdateIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchUpdateIntentsResponse): Writer = js.native
  def encodeDelimited(message: IBatchUpdateIntentsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a BatchUpdateIntentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateIntentsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateIntentsResponse = js.native
  /**
    * Creates a plain object from a BatchUpdateIntentsResponse message. Also converts values to other types if specified.
    * @param message BatchUpdateIntentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BatchUpdateIntentsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: BatchUpdateIntentsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BatchUpdateIntentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

