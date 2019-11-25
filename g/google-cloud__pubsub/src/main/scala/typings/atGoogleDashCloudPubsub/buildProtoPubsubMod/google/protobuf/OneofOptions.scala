package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an OneofOptions. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.OneofOptions")
@js.native
/**
  * Constructs a new OneofOptions.
  * @param [properties] Properties to set
  */
class OneofOptions () extends IOneofOptions {
  def this(properties: IOneofOptions) = this()
  /** OneofOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_OneofOptions: js.Array[IUninterpretedOption] = js.native
  /**
    * Converts this OneofOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.OneofOptions")
@js.native
object OneofOptions extends js.Object {
  /**
    * Creates a new OneofOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OneofOptions instance
    */
  def create(): OneofOptions = js.native
  def create(properties: IOneofOptions): OneofOptions = js.native
  /**
    * Decodes an OneofOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OneofOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): OneofOptions = js.native
  def decode(reader: Reader, length: Double): OneofOptions = js.native
  def decode(reader: Uint8Array): OneofOptions = js.native
  def decode(reader: Uint8Array, length: Double): OneofOptions = js.native
  /**
    * Decodes an OneofOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OneofOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): OneofOptions = js.native
  def decodeDelimited(reader: Uint8Array): OneofOptions = js.native
  /**
    * Encodes the specified OneofOptions message. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
    * @param message OneofOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IOneofOptions): Writer = js.native
  def encode(message: IOneofOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified OneofOptions message, length delimited. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
    * @param message OneofOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IOneofOptions): Writer = js.native
  def encodeDelimited(message: IOneofOptions, writer: Writer): Writer = js.native
  /**
    * Creates an OneofOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OneofOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): OneofOptions = js.native
  /**
    * Creates a plain object from an OneofOptions message. Also converts values to other types if specified.
    * @param message OneofOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: OneofOptions): StringDictionary[js.Any] = js.native
  def toObject(message: OneofOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an OneofOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

