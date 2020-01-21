package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BatchDeleteIntentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest")
@js.native
/**
  * Constructs a new BatchDeleteIntentsRequest.
  * @param [properties] Properties to set
  */
class BatchDeleteIntentsRequest () extends IBatchDeleteIntentsRequest {
  def this(properties: IBatchDeleteIntentsRequest) = this()
  /** BatchDeleteIntentsRequest intents. */
  @JSName("intents")
  var intents_BatchDeleteIntentsRequest: js.Array[IIntent] = js.native
  /** BatchDeleteIntentsRequest parent. */
  @JSName("parent")
  var parent_BatchDeleteIntentsRequest: String = js.native
  /**
    * Converts this BatchDeleteIntentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest")
@js.native
object BatchDeleteIntentsRequest extends js.Object {
  /**
    * Creates a new BatchDeleteIntentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchDeleteIntentsRequest instance
    */
  def create(): BatchDeleteIntentsRequest = js.native
  def create(properties: IBatchDeleteIntentsRequest): BatchDeleteIntentsRequest = js.native
  /**
    * Decodes a BatchDeleteIntentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchDeleteIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BatchDeleteIntentsRequest = js.native
  def decode(reader: Reader, length: Double): BatchDeleteIntentsRequest = js.native
  def decode(reader: Uint8Array): BatchDeleteIntentsRequest = js.native
  def decode(reader: Uint8Array, length: Double): BatchDeleteIntentsRequest = js.native
  /**
    * Decodes a BatchDeleteIntentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchDeleteIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BatchDeleteIntentsRequest = js.native
  def decodeDelimited(reader: Uint8Array): BatchDeleteIntentsRequest = js.native
  /**
    * Encodes the specified BatchDeleteIntentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.verify|verify} messages.
    * @param message BatchDeleteIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchDeleteIntentsRequest): Writer = js.native
  def encode(message: IBatchDeleteIntentsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BatchDeleteIntentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.verify|verify} messages.
    * @param message BatchDeleteIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchDeleteIntentsRequest): Writer = js.native
  def encodeDelimited(message: IBatchDeleteIntentsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a BatchDeleteIntentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchDeleteIntentsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): BatchDeleteIntentsRequest = js.native
  /**
    * Creates a plain object from a BatchDeleteIntentsRequest message. Also converts values to other types if specified.
    * @param message BatchDeleteIntentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BatchDeleteIntentsRequest): StringDictionary[js.Any] = js.native
  def toObject(message: BatchDeleteIntentsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BatchDeleteIntentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

