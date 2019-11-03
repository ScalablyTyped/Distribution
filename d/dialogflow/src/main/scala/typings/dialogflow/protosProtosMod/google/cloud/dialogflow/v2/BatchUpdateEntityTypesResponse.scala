package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BatchUpdateEntityTypesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse")
@js.native
/**
  * Constructs a new BatchUpdateEntityTypesResponse.
  * @param [properties] Properties to set
  */
class BatchUpdateEntityTypesResponse () extends IBatchUpdateEntityTypesResponse {
  def this(properties: IBatchUpdateEntityTypesResponse) = this()
  /** BatchUpdateEntityTypesResponse entityTypes. */
  @JSName("entityTypes")
  var entityTypes_BatchUpdateEntityTypesResponse: js.Array[IEntityType] = js.native
  /**
    * Converts this BatchUpdateEntityTypesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse")
@js.native
object BatchUpdateEntityTypesResponse extends js.Object {
  /**
    * Creates a new BatchUpdateEntityTypesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateEntityTypesResponse instance
    */
  def create(): BatchUpdateEntityTypesResponse = js.native
  def create(properties: IBatchUpdateEntityTypesResponse): BatchUpdateEntityTypesResponse = js.native
  /**
    * Decodes a BatchUpdateEntityTypesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BatchUpdateEntityTypesResponse = js.native
  def decode(reader: Reader, length: Double): BatchUpdateEntityTypesResponse = js.native
  def decode(reader: Uint8Array): BatchUpdateEntityTypesResponse = js.native
  def decode(reader: Uint8Array, length: Double): BatchUpdateEntityTypesResponse = js.native
  /**
    * Decodes a BatchUpdateEntityTypesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BatchUpdateEntityTypesResponse = js.native
  def decodeDelimited(reader: Uint8Array): BatchUpdateEntityTypesResponse = js.native
  /**
    * Encodes the specified BatchUpdateEntityTypesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.verify|verify} messages.
    * @param message BatchUpdateEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchUpdateEntityTypesResponse): Writer = js.native
  def encode(message: IBatchUpdateEntityTypesResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BatchUpdateEntityTypesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.verify|verify} messages.
    * @param message BatchUpdateEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchUpdateEntityTypesResponse): Writer = js.native
  def encodeDelimited(message: IBatchUpdateEntityTypesResponse, writer: Writer): Writer = js.native
  /**
    * Creates a BatchUpdateEntityTypesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateEntityTypesResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateEntityTypesResponse = js.native
  /**
    * Creates a plain object from a BatchUpdateEntityTypesResponse message. Also converts values to other types if specified.
    * @param message BatchUpdateEntityTypesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BatchUpdateEntityTypesResponse): StringDictionary[js.Any] = js.native
  def toObject(message: BatchUpdateEntityTypesResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BatchUpdateEntityTypesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

