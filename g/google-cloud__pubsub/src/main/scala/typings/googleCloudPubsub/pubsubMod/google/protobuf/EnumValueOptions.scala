package typings.googleCloudPubsub.pubsubMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EnumValueOptions. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.EnumValueOptions")
@js.native
/**
  * Constructs a new EnumValueOptions.
  * @param [properties] Properties to set
  */
class EnumValueOptions () extends IEnumValueOptions {
  def this(properties: IEnumValueOptions) = this()
  /** EnumValueOptions deprecated. */
  @JSName("deprecated")
  var deprecated_EnumValueOptions: Boolean = js.native
  /** EnumValueOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_EnumValueOptions: js.Array[IUninterpretedOption] = js.native
  /**
    * Converts this EnumValueOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.EnumValueOptions")
@js.native
object EnumValueOptions extends js.Object {
  /**
    * Creates a new EnumValueOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumValueOptions instance
    */
  def create(): EnumValueOptions = js.native
  def create(properties: IEnumValueOptions): EnumValueOptions = js.native
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): EnumValueOptions = js.native
  def decode(reader: Reader, length: Double): EnumValueOptions = js.native
  def decode(reader: Uint8Array): EnumValueOptions = js.native
  def decode(reader: Uint8Array, length: Double): EnumValueOptions = js.native
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): EnumValueOptions = js.native
  def decodeDelimited(reader: Uint8Array): EnumValueOptions = js.native
  /**
    * Encodes the specified EnumValueOptions message. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEnumValueOptions): Writer = js.native
  def encode(message: IEnumValueOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EnumValueOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEnumValueOptions): Writer = js.native
  def encodeDelimited(message: IEnumValueOptions, writer: Writer): Writer = js.native
  /**
    * Creates an EnumValueOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): EnumValueOptions = js.native
  /**
    * Creates a plain object from an EnumValueOptions message. Also converts values to other types if specified.
    * @param message EnumValueOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: EnumValueOptions): StringDictionary[js.Any] = js.native
  def toObject(message: EnumValueOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EnumValueOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

