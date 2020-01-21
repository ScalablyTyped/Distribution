package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ExtensionRangeOptions. */
@JSImport("dialogflow/protos/protos", "google.protobuf.ExtensionRangeOptions")
@js.native
/**
  * Constructs a new ExtensionRangeOptions.
  * @param [properties] Properties to set
  */
class ExtensionRangeOptions () extends IExtensionRangeOptions {
  def this(properties: IExtensionRangeOptions) = this()
  /** ExtensionRangeOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_ExtensionRangeOptions: js.Array[IUninterpretedOption] = js.native
  /**
    * Converts this ExtensionRangeOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.protobuf.ExtensionRangeOptions")
@js.native
object ExtensionRangeOptions extends js.Object {
  /**
    * Creates a new ExtensionRangeOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExtensionRangeOptions instance
    */
  def create(): ExtensionRangeOptions = js.native
  def create(properties: IExtensionRangeOptions): ExtensionRangeOptions = js.native
  /**
    * Decodes an ExtensionRangeOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExtensionRangeOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ExtensionRangeOptions = js.native
  def decode(reader: Reader, length: Double): ExtensionRangeOptions = js.native
  def decode(reader: Uint8Array): ExtensionRangeOptions = js.native
  def decode(reader: Uint8Array, length: Double): ExtensionRangeOptions = js.native
  /**
    * Decodes an ExtensionRangeOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExtensionRangeOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ExtensionRangeOptions = js.native
  def decodeDelimited(reader: Uint8Array): ExtensionRangeOptions = js.native
  /**
    * Encodes the specified ExtensionRangeOptions message. Does not implicitly {@link google.protobuf.ExtensionRangeOptions.verify|verify} messages.
    * @param message ExtensionRangeOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IExtensionRangeOptions): Writer = js.native
  def encode(message: IExtensionRangeOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ExtensionRangeOptions message, length delimited. Does not implicitly {@link google.protobuf.ExtensionRangeOptions.verify|verify} messages.
    * @param message ExtensionRangeOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IExtensionRangeOptions): Writer = js.native
  def encodeDelimited(message: IExtensionRangeOptions, writer: Writer): Writer = js.native
  /**
    * Creates an ExtensionRangeOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExtensionRangeOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): ExtensionRangeOptions = js.native
  /**
    * Creates a plain object from an ExtensionRangeOptions message. Also converts values to other types if specified.
    * @param message ExtensionRangeOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ExtensionRangeOptions): StringDictionary[js.Any] = js.native
  def toObject(message: ExtensionRangeOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an ExtensionRangeOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

