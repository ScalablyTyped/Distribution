package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest")
@js.native
/**
  * Constructs a new ListEntityTypesRequest.
  * @param [properties] Properties to set
  */
class ListEntityTypesRequest () extends IListEntityTypesRequest {
  def this(properties: IListEntityTypesRequest) = this()
  /** ListEntityTypesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_ListEntityTypesRequest: String = js.native
  /** ListEntityTypesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListEntityTypesRequest: Double = js.native
  /** ListEntityTypesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListEntityTypesRequest: String = js.native
  /** ListEntityTypesRequest parent. */
  @JSName("parent")
  var parent_ListEntityTypesRequest: String = js.native
  /**
    * Converts this ListEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListEntityTypesRequest")
@js.native
object ListEntityTypesRequest extends js.Object {
  /**
    * Creates a new ListEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListEntityTypesRequest instance
    */
  def create(): ListEntityTypesRequest = js.native
  def create(properties: IListEntityTypesRequest): ListEntityTypesRequest = js.native
  /**
    * Decodes a ListEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListEntityTypesRequest = js.native
  def decode(reader: Reader, length: Double): ListEntityTypesRequest = js.native
  def decode(reader: Uint8Array): ListEntityTypesRequest = js.native
  def decode(reader: Uint8Array, length: Double): ListEntityTypesRequest = js.native
  /**
    * Decodes a ListEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListEntityTypesRequest = js.native
  def decodeDelimited(reader: Uint8Array): ListEntityTypesRequest = js.native
  /**
    * Encodes the specified ListEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.verify|verify} messages.
    * @param message ListEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListEntityTypesRequest): Writer = js.native
  def encode(message: IListEntityTypesRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.verify|verify} messages.
    * @param message ListEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListEntityTypesRequest): Writer = js.native
  def encodeDelimited(message: IListEntityTypesRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ListEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListEntityTypesRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListEntityTypesRequest = js.native
  /**
    * Creates a plain object from a ListEntityTypesRequest message. Also converts values to other types if specified.
    * @param message ListEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListEntityTypesRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ListEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

