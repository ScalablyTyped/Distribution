package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a QueryResult. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryResult")
@js.native
/**
  * Constructs a new QueryResult.
  * @param [properties] Properties to set
  */
class QueryResult () extends IQueryResult {
  def this(properties: IQueryResult) = this()
  /** QueryResult action. */
  @JSName("action")
  var action_QueryResult: String = js.native
  /** QueryResult allRequiredParamsPresent. */
  @JSName("allRequiredParamsPresent")
  var allRequiredParamsPresent_QueryResult: Boolean = js.native
  /** QueryResult fulfillmentMessages. */
  @JSName("fulfillmentMessages")
  var fulfillmentMessages_QueryResult: js.Array[IMessage] = js.native
  /** QueryResult fulfillmentText. */
  @JSName("fulfillmentText")
  var fulfillmentText_QueryResult: String = js.native
  /** QueryResult intentDetectionConfidence. */
  @JSName("intentDetectionConfidence")
  var intentDetectionConfidence_QueryResult: Double = js.native
  /** QueryResult languageCode. */
  @JSName("languageCode")
  var languageCode_QueryResult: String = js.native
  /** QueryResult outputContexts. */
  @JSName("outputContexts")
  var outputContexts_QueryResult: js.Array[IContext] = js.native
  /** QueryResult queryText. */
  @JSName("queryText")
  var queryText_QueryResult: String = js.native
  /** QueryResult speechRecognitionConfidence. */
  @JSName("speechRecognitionConfidence")
  var speechRecognitionConfidence_QueryResult: Double = js.native
  /** QueryResult webhookSource. */
  @JSName("webhookSource")
  var webhookSource_QueryResult: String = js.native
  /**
    * Converts this QueryResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryResult")
@js.native
object QueryResult extends js.Object {
  /**
    * Creates a new QueryResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryResult instance
    */
  def create(): QueryResult = js.native
  def create(properties: IQueryResult): QueryResult = js.native
  /**
    * Decodes a QueryResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): QueryResult = js.native
  def decode(reader: Reader, length: Double): QueryResult = js.native
  def decode(reader: Uint8Array): QueryResult = js.native
  def decode(reader: Uint8Array, length: Double): QueryResult = js.native
  /**
    * Decodes a QueryResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): QueryResult = js.native
  def decodeDelimited(reader: Uint8Array): QueryResult = js.native
  /**
    * Encodes the specified QueryResult message. Does not implicitly {@link google.cloud.dialogflow.v2.QueryResult.verify|verify} messages.
    * @param message QueryResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IQueryResult): Writer = js.native
  def encode(message: IQueryResult, writer: Writer): Writer = js.native
  /**
    * Encodes the specified QueryResult message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.QueryResult.verify|verify} messages.
    * @param message QueryResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IQueryResult): Writer = js.native
  def encodeDelimited(message: IQueryResult, writer: Writer): Writer = js.native
  /**
    * Creates a QueryResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryResult
    */
  def fromObject(`object`: StringDictionary[js.Any]): QueryResult = js.native
  /**
    * Creates a plain object from a QueryResult message. Also converts values to other types if specified.
    * @param message QueryResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: QueryResult): StringDictionary[js.Any] = js.native
  def toObject(message: QueryResult, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a QueryResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

