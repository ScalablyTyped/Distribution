package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Suggestion. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Suggestion")
@js.native
/**
  * Constructs a new Suggestion.
  * @param [properties] Properties to set
  */
class Suggestion () extends ISuggestion {
  def this(properties: ISuggestion) = this()
  /** Suggestion title. */
  @JSName("title")
  var title_Suggestion: String = js.native
  /**
    * Converts this Suggestion to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Suggestion")
@js.native
object Suggestion extends js.Object {
  /**
    * Creates a new Suggestion instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Suggestion instance
    */
  def create(): Suggestion = js.native
  def create(properties: ISuggestion): Suggestion = js.native
  /**
    * Decodes a Suggestion message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Suggestion
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Suggestion = js.native
  def decode(reader: Reader, length: Double): Suggestion = js.native
  def decode(reader: Uint8Array): Suggestion = js.native
  def decode(reader: Uint8Array, length: Double): Suggestion = js.native
  /**
    * Decodes a Suggestion message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Suggestion
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Suggestion = js.native
  def decodeDelimited(reader: Uint8Array): Suggestion = js.native
  /**
    * Encodes the specified Suggestion message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Suggestion.verify|verify} messages.
    * @param message Suggestion message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISuggestion): Writer = js.native
  def encode(message: ISuggestion, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Suggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Suggestion.verify|verify} messages.
    * @param message Suggestion message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISuggestion): Writer = js.native
  def encodeDelimited(message: ISuggestion, writer: Writer): Writer = js.native
  /**
    * Creates a Suggestion message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Suggestion
    */
  def fromObject(`object`: StringDictionary[js.Any]): Suggestion = js.native
  /**
    * Creates a plain object from a Suggestion message. Also converts values to other types if specified.
    * @param message Suggestion
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Suggestion): StringDictionary[js.Any] = js.native
  def toObject(message: Suggestion, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Suggestion message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

