package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISeekResponse
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SeekResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.SeekResponse")
@js.native
/**
  * Constructs a new SeekResponse.
  * @param [properties] Properties to set
  */
class SeekResponse ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse {
  def this(properties: ISeekResponse) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.SeekResponse")
@js.native
object SeekResponse extends js.Object {
  /**
    * Creates a new SeekResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SeekResponse instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  def create(properties: ISeekResponse): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  /**
    * Decodes a SeekResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SeekResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  /**
    * Decodes a SeekResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SeekResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  /**
    * Encodes the specified SeekResponse message. Does not implicitly {@link google.pubsub.v1.SeekResponse.verify|verify} messages.
    * @param message SeekResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISeekResponse): Writer = js.native
  def encode(message: ISeekResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SeekResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekResponse.verify|verify} messages.
    * @param message SeekResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISeekResponse): Writer = js.native
  def encodeDelimited(message: ISeekResponse, writer: Writer): Writer = js.native
  /**
    * Creates a SeekResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SeekResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse = js.native
  /**
    * Creates a plain object from a SeekResponse message. Also converts values to other types if specified.
    * @param message SeekResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.SeekResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SeekResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

