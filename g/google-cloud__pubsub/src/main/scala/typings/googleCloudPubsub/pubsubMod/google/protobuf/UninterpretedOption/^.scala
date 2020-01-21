package typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.pubsubMod.google.protobuf.IUninterpretedOption
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.UninterpretedOption")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new UninterpretedOption instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UninterpretedOption instance
    */
  def create(): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  def create(properties: IUninterpretedOption): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  /**
    * Decodes an UninterpretedOption message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UninterpretedOption
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  /**
    * Decodes an UninterpretedOption message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UninterpretedOption
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  /**
    * Encodes the specified UninterpretedOption message. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
    * @param message UninterpretedOption message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUninterpretedOption): Writer = js.native
  def encode(message: IUninterpretedOption, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UninterpretedOption message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
    * @param message UninterpretedOption message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUninterpretedOption): Writer = js.native
  def encodeDelimited(message: IUninterpretedOption, writer: Writer): Writer = js.native
  /**
    * Creates an UninterpretedOption message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UninterpretedOption
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption = js.native
  /**
    * Creates a plain object from an UninterpretedOption message. Also converts values to other types if specified.
    * @param message UninterpretedOption
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.pubsubMod.google.protobuf.UninterpretedOption,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UninterpretedOption message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

