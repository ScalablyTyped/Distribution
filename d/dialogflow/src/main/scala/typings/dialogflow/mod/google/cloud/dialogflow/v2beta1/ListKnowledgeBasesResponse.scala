package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListKnowledgeBasesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse")
@js.native
/**
  * Constructs a new ListKnowledgeBasesResponse.
  * @param [properties] Properties to set
  */
class ListKnowledgeBasesResponse () extends IListKnowledgeBasesResponse {
  def this(properties: IListKnowledgeBasesResponse) = this()
  /** ListKnowledgeBasesResponse knowledgeBases. */
  @JSName("knowledgeBases")
  var knowledgeBases_ListKnowledgeBasesResponse: js.Array[IKnowledgeBase] = js.native
  /** ListKnowledgeBasesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListKnowledgeBasesResponse: String = js.native
  /**
    * Converts this ListKnowledgeBasesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse")
@js.native
object ListKnowledgeBasesResponse extends js.Object {
  /**
    * Creates a new ListKnowledgeBasesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListKnowledgeBasesResponse instance
    */
  def create(): ListKnowledgeBasesResponse = js.native
  def create(properties: IListKnowledgeBasesResponse): ListKnowledgeBasesResponse = js.native
  /**
    * Decodes a ListKnowledgeBasesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListKnowledgeBasesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListKnowledgeBasesResponse = js.native
  def decode(reader: Reader, length: Double): ListKnowledgeBasesResponse = js.native
  def decode(reader: Uint8Array): ListKnowledgeBasesResponse = js.native
  def decode(reader: Uint8Array, length: Double): ListKnowledgeBasesResponse = js.native
  /**
    * Decodes a ListKnowledgeBasesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListKnowledgeBasesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListKnowledgeBasesResponse = js.native
  def decodeDelimited(reader: Uint8Array): ListKnowledgeBasesResponse = js.native
  /**
    * Encodes the specified ListKnowledgeBasesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.verify|verify} messages.
    * @param message ListKnowledgeBasesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListKnowledgeBasesResponse): Writer = js.native
  def encode(message: IListKnowledgeBasesResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListKnowledgeBasesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.verify|verify} messages.
    * @param message ListKnowledgeBasesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListKnowledgeBasesResponse): Writer = js.native
  def encodeDelimited(message: IListKnowledgeBasesResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListKnowledgeBasesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListKnowledgeBasesResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListKnowledgeBasesResponse = js.native
  /**
    * Creates a plain object from a ListKnowledgeBasesResponse message. Also converts values to other types if specified.
    * @param message ListKnowledgeBasesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListKnowledgeBasesResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ListKnowledgeBasesResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListKnowledgeBasesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

