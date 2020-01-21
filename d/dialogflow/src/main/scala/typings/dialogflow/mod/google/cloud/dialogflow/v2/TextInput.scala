package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TextInput. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.TextInput")
@js.native
/**
  * Constructs a new TextInput.
  * @param [properties] Properties to set
  */
class TextInput () extends ITextInput {
  def this(properties: ITextInput) = this()
  /** TextInput languageCode. */
  @JSName("languageCode")
  var languageCode_TextInput: String = js.native
  /** TextInput text. */
  @JSName("text")
  var text_TextInput: String = js.native
  /**
    * Converts this TextInput to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.TextInput")
@js.native
object TextInput extends js.Object {
  /**
    * Creates a new TextInput instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TextInput instance
    */
  def create(): TextInput = js.native
  def create(properties: ITextInput): TextInput = js.native
  /**
    * Decodes a TextInput message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TextInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TextInput = js.native
  def decode(reader: Reader, length: Double): TextInput = js.native
  def decode(reader: Uint8Array): TextInput = js.native
  def decode(reader: Uint8Array, length: Double): TextInput = js.native
  /**
    * Decodes a TextInput message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TextInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TextInput = js.native
  def decodeDelimited(reader: Uint8Array): TextInput = js.native
  /**
    * Encodes the specified TextInput message. Does not implicitly {@link google.cloud.dialogflow.v2.TextInput.verify|verify} messages.
    * @param message TextInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITextInput): Writer = js.native
  def encode(message: ITextInput, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TextInput message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.TextInput.verify|verify} messages.
    * @param message TextInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITextInput): Writer = js.native
  def encodeDelimited(message: ITextInput, writer: Writer): Writer = js.native
  /**
    * Creates a TextInput message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TextInput
    */
  def fromObject(`object`: StringDictionary[js.Any]): TextInput = js.native
  /**
    * Creates a plain object from a TextInput message. Also converts values to other types if specified.
    * @param message TextInput
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TextInput): StringDictionary[js.Any] = js.native
  def toObject(message: TextInput, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TextInput message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

