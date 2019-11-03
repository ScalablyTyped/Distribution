package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.entityTypeBatchInline
import typings.dialogflow.dialogflowStrings.entityTypeBatchUri
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BatchUpdateEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest")
@js.native
/**
  * Constructs a new BatchUpdateEntityTypesRequest.
  * @param [properties] Properties to set
  */
class BatchUpdateEntityTypesRequest () extends IBatchUpdateEntityTypesRequest {
  def this(properties: IBatchUpdateEntityTypesRequest) = this()
  /** BatchUpdateEntityTypesRequest entityTypeBatch. */
  var entityTypeBatch: js.UndefOr[entityTypeBatchUri | entityTypeBatchInline] = js.native
  /** BatchUpdateEntityTypesRequest entityTypeBatchUri. */
  @JSName("entityTypeBatchUri")
  var entityTypeBatchUri_BatchUpdateEntityTypesRequest: String = js.native
  /** BatchUpdateEntityTypesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchUpdateEntityTypesRequest: String = js.native
  /** BatchUpdateEntityTypesRequest parent. */
  @JSName("parent")
  var parent_BatchUpdateEntityTypesRequest: String = js.native
  /**
    * Converts this BatchUpdateEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest")
@js.native
object BatchUpdateEntityTypesRequest extends js.Object {
  /**
    * Creates a new BatchUpdateEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateEntityTypesRequest instance
    */
  def create(): BatchUpdateEntityTypesRequest = js.native
  def create(properties: IBatchUpdateEntityTypesRequest): BatchUpdateEntityTypesRequest = js.native
  /**
    * Decodes a BatchUpdateEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BatchUpdateEntityTypesRequest = js.native
  def decode(reader: Reader, length: Double): BatchUpdateEntityTypesRequest = js.native
  def decode(reader: Uint8Array): BatchUpdateEntityTypesRequest = js.native
  def decode(reader: Uint8Array, length: Double): BatchUpdateEntityTypesRequest = js.native
  /**
    * Decodes a BatchUpdateEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BatchUpdateEntityTypesRequest = js.native
  def decodeDelimited(reader: Uint8Array): BatchUpdateEntityTypesRequest = js.native
  /**
    * Encodes the specified BatchUpdateEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.verify|verify} messages.
    * @param message BatchUpdateEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchUpdateEntityTypesRequest): Writer = js.native
  def encode(message: IBatchUpdateEntityTypesRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BatchUpdateEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.verify|verify} messages.
    * @param message BatchUpdateEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchUpdateEntityTypesRequest): Writer = js.native
  def encodeDelimited(message: IBatchUpdateEntityTypesRequest, writer: Writer): Writer = js.native
  /**
    * Creates a BatchUpdateEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateEntityTypesRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateEntityTypesRequest = js.native
  /**
    * Creates a plain object from a BatchUpdateEntityTypesRequest message. Also converts values to other types if specified.
    * @param message BatchUpdateEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BatchUpdateEntityTypesRequest): StringDictionary[js.Any] = js.native
  def toObject(message: BatchUpdateEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BatchUpdateEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

