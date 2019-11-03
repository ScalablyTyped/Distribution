package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListSessionEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesRequest")
@js.native
/**
  * Constructs a new ListSessionEntityTypesRequest.
  * @param [properties] Properties to set
  */
class ListSessionEntityTypesRequest () extends IListSessionEntityTypesRequest {
  def this(properties: IListSessionEntityTypesRequest) = this()
  /** ListSessionEntityTypesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListSessionEntityTypesRequest: Double = js.native
  /** ListSessionEntityTypesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListSessionEntityTypesRequest: String = js.native
  /** ListSessionEntityTypesRequest parent. */
  @JSName("parent")
  var parent_ListSessionEntityTypesRequest: String = js.native
  /**
    * Converts this ListSessionEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListSessionEntityTypesRequest")
@js.native
object ListSessionEntityTypesRequest extends js.Object {
  /**
    * Creates a new ListSessionEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSessionEntityTypesRequest instance
    */
  def create(): ListSessionEntityTypesRequest = js.native
  def create(properties: IListSessionEntityTypesRequest): ListSessionEntityTypesRequest = js.native
  /**
    * Decodes a ListSessionEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSessionEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListSessionEntityTypesRequest = js.native
  def decode(reader: Reader, length: Double): ListSessionEntityTypesRequest = js.native
  def decode(reader: Uint8Array): ListSessionEntityTypesRequest = js.native
  def decode(reader: Uint8Array, length: Double): ListSessionEntityTypesRequest = js.native
  /**
    * Decodes a ListSessionEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSessionEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListSessionEntityTypesRequest = js.native
  def decodeDelimited(reader: Uint8Array): ListSessionEntityTypesRequest = js.native
  /**
    * Encodes the specified ListSessionEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.ListSessionEntityTypesRequest.verify|verify} messages.
    * @param message ListSessionEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListSessionEntityTypesRequest): Writer = js.native
  def encode(message: IListSessionEntityTypesRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListSessionEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListSessionEntityTypesRequest.verify|verify} messages.
    * @param message ListSessionEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListSessionEntityTypesRequest): Writer = js.native
  def encodeDelimited(message: IListSessionEntityTypesRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ListSessionEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSessionEntityTypesRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListSessionEntityTypesRequest = js.native
  /**
    * Creates a plain object from a ListSessionEntityTypesRequest message. Also converts values to other types if specified.
    * @param message ListSessionEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListSessionEntityTypesRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ListSessionEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListSessionEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

