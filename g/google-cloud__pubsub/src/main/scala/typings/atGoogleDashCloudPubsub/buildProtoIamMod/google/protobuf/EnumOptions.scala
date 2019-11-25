package typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EnumOptions. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.EnumOptions")
@js.native
/**
  * Constructs a new EnumOptions.
  * @param [properties] Properties to set
  */
class EnumOptions () extends IEnumOptions {
  def this(properties: IEnumOptions) = this()
  /** EnumOptions allowAlias. */
  @JSName("allowAlias")
  var allowAlias_EnumOptions: Boolean = js.native
  /** EnumOptions deprecated. */
  @JSName("deprecated")
  var deprecated_EnumOptions: Boolean = js.native
  /** EnumOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_EnumOptions: js.Array[IUninterpretedOption] = js.native
  /**
    * Converts this EnumOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.EnumOptions")
@js.native
object EnumOptions extends js.Object {
  /**
    * Creates a new EnumOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumOptions instance
    */
  def create(): EnumOptions = js.native
  def create(properties: IEnumOptions): EnumOptions = js.native
  /**
    * Decodes an EnumOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): EnumOptions = js.native
  def decode(reader: Reader, length: Double): EnumOptions = js.native
  def decode(reader: Uint8Array): EnumOptions = js.native
  def decode(reader: Uint8Array, length: Double): EnumOptions = js.native
  /**
    * Decodes an EnumOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): EnumOptions = js.native
  def decodeDelimited(reader: Uint8Array): EnumOptions = js.native
  /**
    * Encodes the specified EnumOptions message. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
    * @param message EnumOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEnumOptions): Writer = js.native
  def encode(message: IEnumOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EnumOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
    * @param message EnumOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEnumOptions): Writer = js.native
  def encodeDelimited(message: IEnumOptions, writer: Writer): Writer = js.native
  /**
    * Creates an EnumOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): EnumOptions = js.native
  /**
    * Creates a plain object from an EnumOptions message. Also converts values to other types if specified.
    * @param message EnumOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: EnumOptions): StringDictionary[js.Any] = js.native
  def toObject(message: EnumOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EnumOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

