package typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Binding. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.Binding")
@js.native
/**
  * Constructs a new Binding.
  * @param [properties] Properties to set
  */
class Binding () extends IBinding {
  def this(properties: IBinding) = this()
  /** Binding members. */
  @JSName("members")
  var members_Binding: js.Array[String] = js.native
  /** Binding role. */
  @JSName("role")
  var role_Binding: String = js.native
  /**
    * Converts this Binding to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.iam.v1.Binding")
@js.native
object Binding extends js.Object {
  /**
    * Creates a new Binding instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Binding instance
    */
  def create(): Binding = js.native
  def create(properties: IBinding): Binding = js.native
  /**
    * Decodes a Binding message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Binding
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Binding = js.native
  def decode(reader: Reader, length: Double): Binding = js.native
  def decode(reader: Uint8Array): Binding = js.native
  def decode(reader: Uint8Array, length: Double): Binding = js.native
  /**
    * Decodes a Binding message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Binding
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Binding = js.native
  def decodeDelimited(reader: Uint8Array): Binding = js.native
  /**
    * Encodes the specified Binding message. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
    * @param message Binding message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBinding): Writer = js.native
  def encode(message: IBinding, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Binding message, length delimited. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
    * @param message Binding message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBinding): Writer = js.native
  def encodeDelimited(message: IBinding, writer: Writer): Writer = js.native
  /**
    * Creates a Binding message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Binding
    */
  def fromObject(`object`: StringDictionary[js.Any]): Binding = js.native
  /**
    * Creates a plain object from a Binding message. Also converts values to other types if specified.
    * @param message Binding
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Binding): StringDictionary[js.Any] = js.native
  def toObject(message: Binding, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Binding message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

