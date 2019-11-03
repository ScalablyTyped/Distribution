package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.audioConfig
import typings.dialogflow.dialogflowStrings.event
import typings.dialogflow.dialogflowStrings.text
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a QueryInput. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput")
@js.native
/**
  * Constructs a new QueryInput.
  * @param [properties] Properties to set
  */
class QueryInput () extends IQueryInput {
  def this(properties: IQueryInput) = this()
  /** QueryInput input. */
  var input: js.UndefOr[audioConfig | text | event] = js.native
  /**
    * Converts this QueryInput to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryInput")
@js.native
object QueryInput extends js.Object {
  /**
    * Creates a new QueryInput instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryInput instance
    */
  def create(): QueryInput = js.native
  def create(properties: IQueryInput): QueryInput = js.native
  /**
    * Decodes a QueryInput message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): QueryInput = js.native
  def decode(reader: Reader, length: Double): QueryInput = js.native
  def decode(reader: Uint8Array): QueryInput = js.native
  def decode(reader: Uint8Array, length: Double): QueryInput = js.native
  /**
    * Decodes a QueryInput message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): QueryInput = js.native
  def decodeDelimited(reader: Uint8Array): QueryInput = js.native
  /**
    * Encodes the specified QueryInput message. Does not implicitly {@link google.cloud.dialogflow.v2.QueryInput.verify|verify} messages.
    * @param message QueryInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IQueryInput): Writer = js.native
  def encode(message: IQueryInput, writer: Writer): Writer = js.native
  /**
    * Encodes the specified QueryInput message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.QueryInput.verify|verify} messages.
    * @param message QueryInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IQueryInput): Writer = js.native
  def encodeDelimited(message: IQueryInput, writer: Writer): Writer = js.native
  /**
    * Creates a QueryInput message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryInput
    */
  def fromObject(`object`: StringDictionary[js.Any]): QueryInput = js.native
  /**
    * Creates a plain object from a QueryInput message. Also converts values to other types if specified.
    * @param message QueryInput
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: QueryInput): StringDictionary[js.Any] = js.native
  def toObject(message: QueryInput, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a QueryInput message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

