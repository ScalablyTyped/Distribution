package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a QueryParameters. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryParameters")
@js.native
/**
  * Constructs a new QueryParameters.
  * @param [properties] Properties to set
  */
class QueryParameters () extends IQueryParameters {
  def this(properties: IQueryParameters) = this()
  /** QueryParameters contexts. */
  @JSName("contexts")
  var contexts_QueryParameters: js.Array[IContext] = js.native
  /** QueryParameters resetContexts. */
  @JSName("resetContexts")
  var resetContexts_QueryParameters: Boolean = js.native
  /** QueryParameters sessionEntityTypes. */
  @JSName("sessionEntityTypes")
  var sessionEntityTypes_QueryParameters: js.Array[ISessionEntityType] = js.native
  /** QueryParameters timeZone. */
  @JSName("timeZone")
  var timeZone_QueryParameters: String = js.native
  /**
    * Converts this QueryParameters to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryParameters")
@js.native
object QueryParameters extends js.Object {
  /**
    * Creates a new QueryParameters instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryParameters instance
    */
  def create(): QueryParameters = js.native
  def create(properties: IQueryParameters): QueryParameters = js.native
  /**
    * Decodes a QueryParameters message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryParameters
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): QueryParameters = js.native
  def decode(reader: Reader, length: Double): QueryParameters = js.native
  def decode(reader: Uint8Array): QueryParameters = js.native
  def decode(reader: Uint8Array, length: Double): QueryParameters = js.native
  /**
    * Decodes a QueryParameters message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryParameters
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): QueryParameters = js.native
  def decodeDelimited(reader: Uint8Array): QueryParameters = js.native
  /**
    * Encodes the specified QueryParameters message. Does not implicitly {@link google.cloud.dialogflow.v2.QueryParameters.verify|verify} messages.
    * @param message QueryParameters message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IQueryParameters): Writer = js.native
  def encode(message: IQueryParameters, writer: Writer): Writer = js.native
  /**
    * Encodes the specified QueryParameters message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.QueryParameters.verify|verify} messages.
    * @param message QueryParameters message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IQueryParameters): Writer = js.native
  def encodeDelimited(message: IQueryParameters, writer: Writer): Writer = js.native
  /**
    * Creates a QueryParameters message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryParameters
    */
  def fromObject(`object`: StringDictionary[js.Any]): QueryParameters = js.native
  /**
    * Creates a plain object from a QueryParameters message. Also converts values to other types if specified.
    * @param message QueryParameters
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: QueryParameters): StringDictionary[js.Any] = js.native
  def toObject(message: QueryParameters, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a QueryParameters message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

