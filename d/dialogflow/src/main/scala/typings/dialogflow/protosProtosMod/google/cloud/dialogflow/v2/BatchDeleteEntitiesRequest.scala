package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BatchDeleteEntitiesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest")
@js.native
/**
  * Constructs a new BatchDeleteEntitiesRequest.
  * @param [properties] Properties to set
  */
class BatchDeleteEntitiesRequest () extends IBatchDeleteEntitiesRequest {
  def this(properties: IBatchDeleteEntitiesRequest) = this()
  /** BatchDeleteEntitiesRequest entityValues. */
  @JSName("entityValues")
  var entityValues_BatchDeleteEntitiesRequest: js.Array[String] = js.native
  /** BatchDeleteEntitiesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchDeleteEntitiesRequest: String = js.native
  /** BatchDeleteEntitiesRequest parent. */
  @JSName("parent")
  var parent_BatchDeleteEntitiesRequest: String = js.native
  /**
    * Converts this BatchDeleteEntitiesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest")
@js.native
object BatchDeleteEntitiesRequest extends js.Object {
  /**
    * Creates a new BatchDeleteEntitiesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchDeleteEntitiesRequest instance
    */
  def create(): BatchDeleteEntitiesRequest = js.native
  def create(properties: IBatchDeleteEntitiesRequest): BatchDeleteEntitiesRequest = js.native
  /**
    * Decodes a BatchDeleteEntitiesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchDeleteEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BatchDeleteEntitiesRequest = js.native
  def decode(reader: Reader, length: Double): BatchDeleteEntitiesRequest = js.native
  def decode(reader: Uint8Array): BatchDeleteEntitiesRequest = js.native
  def decode(reader: Uint8Array, length: Double): BatchDeleteEntitiesRequest = js.native
  /**
    * Decodes a BatchDeleteEntitiesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchDeleteEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BatchDeleteEntitiesRequest = js.native
  def decodeDelimited(reader: Uint8Array): BatchDeleteEntitiesRequest = js.native
  /**
    * Encodes the specified BatchDeleteEntitiesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.verify|verify} messages.
    * @param message BatchDeleteEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchDeleteEntitiesRequest): Writer = js.native
  def encode(message: IBatchDeleteEntitiesRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BatchDeleteEntitiesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.verify|verify} messages.
    * @param message BatchDeleteEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchDeleteEntitiesRequest): Writer = js.native
  def encodeDelimited(message: IBatchDeleteEntitiesRequest, writer: Writer): Writer = js.native
  /**
    * Creates a BatchDeleteEntitiesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchDeleteEntitiesRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): BatchDeleteEntitiesRequest = js.native
  /**
    * Creates a plain object from a BatchDeleteEntitiesRequest message. Also converts values to other types if specified.
    * @param message BatchDeleteEntitiesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BatchDeleteEntitiesRequest): StringDictionary[js.Any] = js.native
  def toObject(message: BatchDeleteEntitiesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BatchDeleteEntitiesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

