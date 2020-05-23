package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UpdateTopicRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.UpdateTopicRequest")
@js.native
/**
  * Constructs a new UpdateTopicRequest.
  * @param [properties] Properties to set
  */
class UpdateTopicRequest () extends IUpdateTopicRequest {
  def this(properties: IUpdateTopicRequest) = this()
  /**
    * Converts this UpdateTopicRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.UpdateTopicRequest")
@js.native
object UpdateTopicRequest extends js.Object {
  /**
    * Creates a new UpdateTopicRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateTopicRequest instance
    */
  def create(): UpdateTopicRequest = js.native
  def create(properties: IUpdateTopicRequest): UpdateTopicRequest = js.native
  /**
    * Decodes an UpdateTopicRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): UpdateTopicRequest = js.native
  def decode(reader: Reader, length: Double): UpdateTopicRequest = js.native
  def decode(reader: Uint8Array): UpdateTopicRequest = js.native
  def decode(reader: Uint8Array, length: Double): UpdateTopicRequest = js.native
  /**
    * Decodes an UpdateTopicRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): UpdateTopicRequest = js.native
  def decodeDelimited(reader: Uint8Array): UpdateTopicRequest = js.native
  /**
    * Encodes the specified UpdateTopicRequest message. Does not implicitly {@link google.pubsub.v1.UpdateTopicRequest.verify|verify} messages.
    * @param message UpdateTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUpdateTopicRequest): Writer = js.native
  def encode(message: IUpdateTopicRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UpdateTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateTopicRequest.verify|verify} messages.
    * @param message UpdateTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUpdateTopicRequest): Writer = js.native
  def encodeDelimited(message: IUpdateTopicRequest, writer: Writer): Writer = js.native
  /**
    * Creates an UpdateTopicRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateTopicRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): UpdateTopicRequest = js.native
  /**
    * Creates a plain object from an UpdateTopicRequest message. Also converts values to other types if specified.
    * @param message UpdateTopicRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: UpdateTopicRequest): StringDictionary[js.Any] = js.native
  def toObject(message: UpdateTopicRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UpdateTopicRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

