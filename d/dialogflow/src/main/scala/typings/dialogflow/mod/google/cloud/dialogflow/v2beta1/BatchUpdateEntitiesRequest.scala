package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BatchUpdateEntitiesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest")
@js.native
/**
  * Constructs a new BatchUpdateEntitiesRequest.
  * @param [properties] Properties to set
  */
class BatchUpdateEntitiesRequest () extends IBatchUpdateEntitiesRequest {
  def this(properties: IBatchUpdateEntitiesRequest) = this()
  /** BatchUpdateEntitiesRequest entities. */
  @JSName("entities")
  var entities_BatchUpdateEntitiesRequest: js.Array[IEntity] = js.native
  /** BatchUpdateEntitiesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchUpdateEntitiesRequest: String = js.native
  /** BatchUpdateEntitiesRequest parent. */
  @JSName("parent")
  var parent_BatchUpdateEntitiesRequest: String = js.native
  /**
    * Converts this BatchUpdateEntitiesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest")
@js.native
object BatchUpdateEntitiesRequest extends js.Object {
  /**
    * Creates a new BatchUpdateEntitiesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateEntitiesRequest instance
    */
  def create(): BatchUpdateEntitiesRequest = js.native
  def create(properties: IBatchUpdateEntitiesRequest): BatchUpdateEntitiesRequest = js.native
  /**
    * Decodes a BatchUpdateEntitiesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BatchUpdateEntitiesRequest = js.native
  def decode(reader: Reader, length: Double): BatchUpdateEntitiesRequest = js.native
  def decode(reader: Uint8Array): BatchUpdateEntitiesRequest = js.native
  def decode(reader: Uint8Array, length: Double): BatchUpdateEntitiesRequest = js.native
  /**
    * Decodes a BatchUpdateEntitiesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BatchUpdateEntitiesRequest = js.native
  def decodeDelimited(reader: Uint8Array): BatchUpdateEntitiesRequest = js.native
  /**
    * Encodes the specified BatchUpdateEntitiesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest.verify|verify} messages.
    * @param message BatchUpdateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchUpdateEntitiesRequest): Writer = js.native
  def encode(message: IBatchUpdateEntitiesRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BatchUpdateEntitiesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest.verify|verify} messages.
    * @param message BatchUpdateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchUpdateEntitiesRequest): Writer = js.native
  def encodeDelimited(message: IBatchUpdateEntitiesRequest, writer: Writer): Writer = js.native
  /**
    * Creates a BatchUpdateEntitiesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateEntitiesRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateEntitiesRequest = js.native
  /**
    * Creates a plain object from a BatchUpdateEntitiesRequest message. Also converts values to other types if specified.
    * @param message BatchUpdateEntitiesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BatchUpdateEntitiesRequest): StringDictionary[js.Any] = js.native
  def toObject(message: BatchUpdateEntitiesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BatchUpdateEntitiesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

