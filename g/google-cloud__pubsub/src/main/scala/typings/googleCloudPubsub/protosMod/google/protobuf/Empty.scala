package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Empty. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty")
@js.native
/**
  * Constructs a new Empty.
  * @param [properties] Properties to set
  */
class Empty () extends IEmpty {
  def this(properties: IEmpty) = this()
  /**
    * Converts this Empty to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.Empty")
@js.native
object Empty extends js.Object {
  /**
    * Creates a new Empty instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Empty instance
    */
  def create(): Empty = js.native
  def create(properties: IEmpty): Empty = js.native
  /**
    * Decodes an Empty message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Empty
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Empty = js.native
  def decode(reader: Reader, length: Double): Empty = js.native
  def decode(reader: Uint8Array): Empty = js.native
  def decode(reader: Uint8Array, length: Double): Empty = js.native
  /**
    * Decodes an Empty message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Empty
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Empty = js.native
  def decodeDelimited(reader: Uint8Array): Empty = js.native
  /**
    * Encodes the specified Empty message. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
    * @param message Empty message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEmpty): Writer = js.native
  def encode(message: IEmpty, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Empty message, length delimited. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
    * @param message Empty message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEmpty): Writer = js.native
  def encodeDelimited(message: IEmpty, writer: Writer): Writer = js.native
  /**
    * Creates an Empty message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Empty
    */
  def fromObject(`object`: StringDictionary[js.Any]): Empty = js.native
  /**
    * Creates a plain object from an Empty message. Also converts values to other types if specified.
    * @param message Empty
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Empty): StringDictionary[js.Any] = js.native
  def toObject(message: Empty, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Empty message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

