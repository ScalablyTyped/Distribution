package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig

import org.scalablytyped.runtime.StringDictionary
import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IPushConfig
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.PushConfig")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new PushConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PushConfig instance
    */
  def create(): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  def create(properties: IPushConfig): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  /**
    * Decodes a PushConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PushConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  def decode(reader: Reader, length: Double): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  def decode(reader: Uint8Array): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  def decode(reader: Uint8Array, length: Double): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  /**
    * Decodes a PushConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PushConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  def decodeDelimited(reader: Uint8Array): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  /**
    * Encodes the specified PushConfig message. Does not implicitly {@link google.pubsub.v1.PushConfig.verify|verify} messages.
    * @param message PushConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPushConfig): Writer = js.native
  def encode(message: IPushConfig, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PushConfig message, length delimited. Does not implicitly {@link google.pubsub.v1.PushConfig.verify|verify} messages.
    * @param message PushConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPushConfig): Writer = js.native
  def encodeDelimited(message: IPushConfig, writer: Writer): Writer = js.native
  /**
    * Creates a PushConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PushConfig
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig = js.native
  /**
    * Creates a plain object from a PushConfig message. Also converts values to other types if specified.
    * @param message PushConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.PushConfig,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PushConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

