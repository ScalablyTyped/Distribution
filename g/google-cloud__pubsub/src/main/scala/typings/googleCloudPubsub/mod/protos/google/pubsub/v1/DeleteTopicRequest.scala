package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteTopicRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteTopicRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteTopicRequest")
@js.native
/**
  * Constructs a new DeleteTopicRequest.
  * @param [properties] Properties to set
  */
class DeleteTopicRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest {
  def this(properties: IDeleteTopicRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteTopicRequest")
@js.native
object DeleteTopicRequest extends js.Object {
  /**
    * Creates a new DeleteTopicRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteTopicRequest instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  def create(properties: IDeleteTopicRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  /**
    * Decodes a DeleteTopicRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  /**
    * Decodes a DeleteTopicRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  /**
    * Encodes the specified DeleteTopicRequest message. Does not implicitly {@link google.pubsub.v1.DeleteTopicRequest.verify|verify} messages.
    * @param message DeleteTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteTopicRequest): Writer = js.native
  def encode(message: IDeleteTopicRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteTopicRequest.verify|verify} messages.
    * @param message DeleteTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteTopicRequest): Writer = js.native
  def encodeDelimited(message: IDeleteTopicRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteTopicRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteTopicRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest = js.native
  /**
    * Creates a plain object from a DeleteTopicRequest message. Also converts values to other types if specified.
    * @param message DeleteTopicRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteTopicRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteTopicRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

