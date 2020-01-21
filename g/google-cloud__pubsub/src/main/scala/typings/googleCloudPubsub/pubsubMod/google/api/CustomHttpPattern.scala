package typings.googleCloudPubsub.pubsubMod.google.api

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CustomHttpPattern. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.api.CustomHttpPattern")
@js.native
/**
  * Constructs a new CustomHttpPattern.
  * @param [properties] Properties to set
  */
class CustomHttpPattern () extends ICustomHttpPattern {
  def this(properties: ICustomHttpPattern) = this()
  /** CustomHttpPattern kind. */
  @JSName("kind")
  var kind_CustomHttpPattern: String = js.native
  /** CustomHttpPattern path. */
  @JSName("path")
  var path_CustomHttpPattern: String = js.native
  /**
    * Converts this CustomHttpPattern to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.api.CustomHttpPattern")
@js.native
object CustomHttpPattern extends js.Object {
  /**
    * Creates a new CustomHttpPattern instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CustomHttpPattern instance
    */
  def create(): CustomHttpPattern = js.native
  def create(properties: ICustomHttpPattern): CustomHttpPattern = js.native
  /**
    * Decodes a CustomHttpPattern message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CustomHttpPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CustomHttpPattern = js.native
  def decode(reader: Reader, length: Double): CustomHttpPattern = js.native
  def decode(reader: Uint8Array): CustomHttpPattern = js.native
  def decode(reader: Uint8Array, length: Double): CustomHttpPattern = js.native
  /**
    * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CustomHttpPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CustomHttpPattern = js.native
  def decodeDelimited(reader: Uint8Array): CustomHttpPattern = js.native
  /**
    * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
    * @param message CustomHttpPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICustomHttpPattern): Writer = js.native
  def encode(message: ICustomHttpPattern, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
    * @param message CustomHttpPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICustomHttpPattern): Writer = js.native
  def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = js.native
  /**
    * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CustomHttpPattern
    */
  def fromObject(`object`: StringDictionary[js.Any]): CustomHttpPattern = js.native
  /**
    * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
    * @param message CustomHttpPattern
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CustomHttpPattern): StringDictionary[js.Any] = js.native
  def toObject(message: CustomHttpPattern, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CustomHttpPattern message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

