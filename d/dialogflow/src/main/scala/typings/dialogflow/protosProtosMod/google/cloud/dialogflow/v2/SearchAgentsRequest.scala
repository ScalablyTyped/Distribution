package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SearchAgentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SearchAgentsRequest")
@js.native
/**
  * Constructs a new SearchAgentsRequest.
  * @param [properties] Properties to set
  */
class SearchAgentsRequest () extends ISearchAgentsRequest {
  def this(properties: ISearchAgentsRequest) = this()
  /** SearchAgentsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_SearchAgentsRequest: Double = js.native
  /** SearchAgentsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_SearchAgentsRequest: String = js.native
  /** SearchAgentsRequest parent. */
  @JSName("parent")
  var parent_SearchAgentsRequest: String = js.native
  /**
    * Converts this SearchAgentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SearchAgentsRequest")
@js.native
object SearchAgentsRequest extends js.Object {
  /**
    * Creates a new SearchAgentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SearchAgentsRequest instance
    */
  def create(): SearchAgentsRequest = js.native
  def create(properties: ISearchAgentsRequest): SearchAgentsRequest = js.native
  /**
    * Decodes a SearchAgentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SearchAgentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SearchAgentsRequest = js.native
  def decode(reader: Reader, length: Double): SearchAgentsRequest = js.native
  def decode(reader: Uint8Array): SearchAgentsRequest = js.native
  def decode(reader: Uint8Array, length: Double): SearchAgentsRequest = js.native
  /**
    * Decodes a SearchAgentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SearchAgentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SearchAgentsRequest = js.native
  def decodeDelimited(reader: Uint8Array): SearchAgentsRequest = js.native
  /**
    * Encodes the specified SearchAgentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.SearchAgentsRequest.verify|verify} messages.
    * @param message SearchAgentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISearchAgentsRequest): Writer = js.native
  def encode(message: ISearchAgentsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SearchAgentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SearchAgentsRequest.verify|verify} messages.
    * @param message SearchAgentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISearchAgentsRequest): Writer = js.native
  def encodeDelimited(message: ISearchAgentsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a SearchAgentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SearchAgentsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): SearchAgentsRequest = js.native
  /**
    * Creates a plain object from a SearchAgentsRequest message. Also converts values to other types if specified.
    * @param message SearchAgentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SearchAgentsRequest): StringDictionary[js.Any] = js.native
  def toObject(message: SearchAgentsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SearchAgentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

