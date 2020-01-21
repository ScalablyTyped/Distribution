package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SearchAgentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse")
@js.native
/**
  * Constructs a new SearchAgentsResponse.
  * @param [properties] Properties to set
  */
class SearchAgentsResponse () extends ISearchAgentsResponse {
  def this(properties: ISearchAgentsResponse) = this()
  /** SearchAgentsResponse agents. */
  @JSName("agents")
  var agents_SearchAgentsResponse: js.Array[IAgent] = js.native
  /** SearchAgentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_SearchAgentsResponse: String = js.native
  /**
    * Converts this SearchAgentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SearchAgentsResponse")
@js.native
object SearchAgentsResponse extends js.Object {
  /**
    * Creates a new SearchAgentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SearchAgentsResponse instance
    */
  def create(): SearchAgentsResponse = js.native
  def create(properties: ISearchAgentsResponse): SearchAgentsResponse = js.native
  /**
    * Decodes a SearchAgentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SearchAgentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SearchAgentsResponse = js.native
  def decode(reader: Reader, length: Double): SearchAgentsResponse = js.native
  def decode(reader: Uint8Array): SearchAgentsResponse = js.native
  def decode(reader: Uint8Array, length: Double): SearchAgentsResponse = js.native
  /**
    * Decodes a SearchAgentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SearchAgentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SearchAgentsResponse = js.native
  def decodeDelimited(reader: Uint8Array): SearchAgentsResponse = js.native
  /**
    * Encodes the specified SearchAgentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SearchAgentsResponse.verify|verify} messages.
    * @param message SearchAgentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISearchAgentsResponse): Writer = js.native
  def encode(message: ISearchAgentsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SearchAgentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.SearchAgentsResponse.verify|verify} messages.
    * @param message SearchAgentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISearchAgentsResponse): Writer = js.native
  def encodeDelimited(message: ISearchAgentsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a SearchAgentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SearchAgentsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): SearchAgentsResponse = js.native
  /**
    * Creates a plain object from a SearchAgentsResponse message. Also converts values to other types if specified.
    * @param message SearchAgentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SearchAgentsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: SearchAgentsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SearchAgentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

