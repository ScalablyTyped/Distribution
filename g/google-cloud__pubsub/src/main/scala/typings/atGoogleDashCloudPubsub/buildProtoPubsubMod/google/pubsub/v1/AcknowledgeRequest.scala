package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an AcknowledgeRequest. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.AcknowledgeRequest")
@js.native
/**
  * Constructs a new AcknowledgeRequest.
  * @param [properties] Properties to set
  */
class AcknowledgeRequest () extends IAcknowledgeRequest {
  def this(properties: IAcknowledgeRequest) = this()
  /** AcknowledgeRequest ackIds. */
  @JSName("ackIds")
  var ackIds_AcknowledgeRequest: js.Array[String] = js.native
  /** AcknowledgeRequest subscription. */
  @JSName("subscription")
  var subscription_AcknowledgeRequest: String = js.native
  /**
    * Converts this AcknowledgeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.AcknowledgeRequest")
@js.native
object AcknowledgeRequest extends js.Object {
  /**
    * Creates a new AcknowledgeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AcknowledgeRequest instance
    */
  def create(): AcknowledgeRequest = js.native
  def create(properties: IAcknowledgeRequest): AcknowledgeRequest = js.native
  /**
    * Decodes an AcknowledgeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AcknowledgeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): AcknowledgeRequest = js.native
  def decode(reader: Reader, length: Double): AcknowledgeRequest = js.native
  def decode(reader: Uint8Array): AcknowledgeRequest = js.native
  def decode(reader: Uint8Array, length: Double): AcknowledgeRequest = js.native
  /**
    * Decodes an AcknowledgeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AcknowledgeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): AcknowledgeRequest = js.native
  def decodeDelimited(reader: Uint8Array): AcknowledgeRequest = js.native
  /**
    * Encodes the specified AcknowledgeRequest message. Does not implicitly {@link google.pubsub.v1.AcknowledgeRequest.verify|verify} messages.
    * @param message AcknowledgeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IAcknowledgeRequest): Writer = js.native
  def encode(message: IAcknowledgeRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified AcknowledgeRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.AcknowledgeRequest.verify|verify} messages.
    * @param message AcknowledgeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IAcknowledgeRequest): Writer = js.native
  def encodeDelimited(message: IAcknowledgeRequest, writer: Writer): Writer = js.native
  /**
    * Creates an AcknowledgeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AcknowledgeRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): AcknowledgeRequest = js.native
  /**
    * Creates a plain object from an AcknowledgeRequest message. Also converts values to other types if specified.
    * @param message AcknowledgeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: AcknowledgeRequest): StringDictionary[js.Any] = js.native
  def toObject(message: AcknowledgeRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an AcknowledgeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

