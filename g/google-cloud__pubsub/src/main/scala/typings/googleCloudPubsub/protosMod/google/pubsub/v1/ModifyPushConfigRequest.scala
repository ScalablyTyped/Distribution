package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ModifyPushConfigRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ModifyPushConfigRequest")
@js.native
/**
  * Constructs a new ModifyPushConfigRequest.
  * @param [properties] Properties to set
  */
class ModifyPushConfigRequest () extends IModifyPushConfigRequest {
  def this(properties: IModifyPushConfigRequest) = this()
  /** ModifyPushConfigRequest subscription. */
  @JSName("subscription")
  var subscription_ModifyPushConfigRequest: String = js.native
  /**
    * Converts this ModifyPushConfigRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ModifyPushConfigRequest")
@js.native
object ModifyPushConfigRequest extends js.Object {
  /**
    * Creates a new ModifyPushConfigRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ModifyPushConfigRequest instance
    */
  def create(): ModifyPushConfigRequest = js.native
  def create(properties: IModifyPushConfigRequest): ModifyPushConfigRequest = js.native
  /**
    * Decodes a ModifyPushConfigRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ModifyPushConfigRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ModifyPushConfigRequest = js.native
  def decode(reader: Reader, length: Double): ModifyPushConfigRequest = js.native
  def decode(reader: Uint8Array): ModifyPushConfigRequest = js.native
  def decode(reader: Uint8Array, length: Double): ModifyPushConfigRequest = js.native
  /**
    * Decodes a ModifyPushConfigRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ModifyPushConfigRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ModifyPushConfigRequest = js.native
  def decodeDelimited(reader: Uint8Array): ModifyPushConfigRequest = js.native
  /**
    * Encodes the specified ModifyPushConfigRequest message. Does not implicitly {@link google.pubsub.v1.ModifyPushConfigRequest.verify|verify} messages.
    * @param message ModifyPushConfigRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IModifyPushConfigRequest): Writer = js.native
  def encode(message: IModifyPushConfigRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ModifyPushConfigRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ModifyPushConfigRequest.verify|verify} messages.
    * @param message ModifyPushConfigRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IModifyPushConfigRequest): Writer = js.native
  def encodeDelimited(message: IModifyPushConfigRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ModifyPushConfigRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ModifyPushConfigRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ModifyPushConfigRequest = js.native
  /**
    * Creates a plain object from a ModifyPushConfigRequest message. Also converts values to other types if specified.
    * @param message ModifyPushConfigRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ModifyPushConfigRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ModifyPushConfigRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ModifyPushConfigRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

