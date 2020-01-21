package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.action
import typings.dialogflow.dialogflowStrings.reply
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmSuggestion. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestion")
@js.native
/**
  * Constructs a new RbmSuggestion.
  * @param [properties] Properties to set
  */
class RbmSuggestion () extends IRbmSuggestion {
  def this(properties: IRbmSuggestion) = this()
  /** RbmSuggestion suggestion. */
  var suggestion: js.UndefOr[reply | action] = js.native
  /**
    * Converts this RbmSuggestion to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestion")
@js.native
object RbmSuggestion extends js.Object {
  /**
    * Creates a new RbmSuggestion instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmSuggestion instance
    */
  def create(): RbmSuggestion = js.native
  def create(properties: IRbmSuggestion): RbmSuggestion = js.native
  /**
    * Decodes a RbmSuggestion message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmSuggestion
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmSuggestion = js.native
  def decode(reader: Reader, length: Double): RbmSuggestion = js.native
  def decode(reader: Uint8Array): RbmSuggestion = js.native
  def decode(reader: Uint8Array, length: Double): RbmSuggestion = js.native
  /**
    * Decodes a RbmSuggestion message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmSuggestion
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmSuggestion = js.native
  def decodeDelimited(reader: Uint8Array): RbmSuggestion = js.native
  /**
    * Encodes the specified RbmSuggestion message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestion.verify|verify} messages.
    * @param message RbmSuggestion message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmSuggestion): Writer = js.native
  def encode(message: IRbmSuggestion, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmSuggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestion.verify|verify} messages.
    * @param message RbmSuggestion message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmSuggestion): Writer = js.native
  def encodeDelimited(message: IRbmSuggestion, writer: Writer): Writer = js.native
  /**
    * Creates a RbmSuggestion message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmSuggestion
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestion = js.native
  /**
    * Creates a plain object from a RbmSuggestion message. Also converts values to other types if specified.
    * @param message RbmSuggestion
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmSuggestion): StringDictionary[js.Any] = js.native
  def toObject(message: RbmSuggestion, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmSuggestion message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

