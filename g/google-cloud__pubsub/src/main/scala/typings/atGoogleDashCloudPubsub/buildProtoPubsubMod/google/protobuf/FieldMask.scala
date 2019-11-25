package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FieldMask. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.FieldMask")
@js.native
/**
  * Constructs a new FieldMask.
  * @param [properties] Properties to set
  */
class FieldMask () extends IFieldMask {
  def this(properties: IFieldMask) = this()
  /** FieldMask paths. */
  @JSName("paths")
  var paths_FieldMask: js.Array[String] = js.native
  /**
    * Converts this FieldMask to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.FieldMask")
@js.native
object FieldMask extends js.Object {
  /**
    * Creates a new FieldMask instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldMask instance
    */
  def create(): FieldMask = js.native
  def create(properties: IFieldMask): FieldMask = js.native
  /**
    * Decodes a FieldMask message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldMask
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): FieldMask = js.native
  def decode(reader: Reader, length: Double): FieldMask = js.native
  def decode(reader: Uint8Array): FieldMask = js.native
  def decode(reader: Uint8Array, length: Double): FieldMask = js.native
  /**
    * Decodes a FieldMask message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldMask
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): FieldMask = js.native
  def decodeDelimited(reader: Uint8Array): FieldMask = js.native
  /**
    * Encodes the specified FieldMask message. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
    * @param message FieldMask message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFieldMask): Writer = js.native
  def encode(message: IFieldMask, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FieldMask message, length delimited. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
    * @param message FieldMask message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFieldMask): Writer = js.native
  def encodeDelimited(message: IFieldMask, writer: Writer): Writer = js.native
  /**
    * Creates a FieldMask message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldMask
    */
  def fromObject(`object`: StringDictionary[js.Any]): FieldMask = js.native
  /**
    * Creates a plain object from a FieldMask message. Also converts values to other types if specified.
    * @param message FieldMask
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: FieldMask): StringDictionary[js.Any] = js.native
  def toObject(message: FieldMask, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FieldMask message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

