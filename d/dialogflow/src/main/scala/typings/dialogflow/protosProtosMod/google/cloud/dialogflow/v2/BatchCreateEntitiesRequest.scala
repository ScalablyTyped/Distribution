package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BatchCreateEntitiesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchCreateEntitiesRequest")
@js.native
/**
  * Constructs a new BatchCreateEntitiesRequest.
  * @param [properties] Properties to set
  */
class BatchCreateEntitiesRequest () extends IBatchCreateEntitiesRequest {
  def this(properties: IBatchCreateEntitiesRequest) = this()
  /** BatchCreateEntitiesRequest entities. */
  @JSName("entities")
  var entities_BatchCreateEntitiesRequest: js.Array[IEntity] = js.native
  /** BatchCreateEntitiesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchCreateEntitiesRequest: String = js.native
  /** BatchCreateEntitiesRequest parent. */
  @JSName("parent")
  var parent_BatchCreateEntitiesRequest: String = js.native
  /**
    * Converts this BatchCreateEntitiesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchCreateEntitiesRequest")
@js.native
object BatchCreateEntitiesRequest extends js.Object {
  /**
    * Creates a new BatchCreateEntitiesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchCreateEntitiesRequest instance
    */
  def create(): BatchCreateEntitiesRequest = js.native
  def create(properties: IBatchCreateEntitiesRequest): BatchCreateEntitiesRequest = js.native
  /**
    * Decodes a BatchCreateEntitiesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchCreateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BatchCreateEntitiesRequest = js.native
  def decode(reader: Reader, length: Double): BatchCreateEntitiesRequest = js.native
  def decode(reader: Uint8Array): BatchCreateEntitiesRequest = js.native
  def decode(reader: Uint8Array, length: Double): BatchCreateEntitiesRequest = js.native
  /**
    * Decodes a BatchCreateEntitiesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchCreateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BatchCreateEntitiesRequest = js.native
  def decodeDelimited(reader: Uint8Array): BatchCreateEntitiesRequest = js.native
  /**
    * Encodes the specified BatchCreateEntitiesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchCreateEntitiesRequest.verify|verify} messages.
    * @param message BatchCreateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchCreateEntitiesRequest): Writer = js.native
  def encode(message: IBatchCreateEntitiesRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BatchCreateEntitiesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchCreateEntitiesRequest.verify|verify} messages.
    * @param message BatchCreateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchCreateEntitiesRequest): Writer = js.native
  def encodeDelimited(message: IBatchCreateEntitiesRequest, writer: Writer): Writer = js.native
  /**
    * Creates a BatchCreateEntitiesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchCreateEntitiesRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): BatchCreateEntitiesRequest = js.native
  /**
    * Creates a plain object from a BatchCreateEntitiesRequest message. Also converts values to other types if specified.
    * @param message BatchCreateEntitiesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BatchCreateEntitiesRequest): StringDictionary[js.Any] = js.native
  def toObject(message: BatchCreateEntitiesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BatchCreateEntitiesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

