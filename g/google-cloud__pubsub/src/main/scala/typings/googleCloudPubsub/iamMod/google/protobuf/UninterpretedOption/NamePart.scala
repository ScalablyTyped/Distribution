package typings.googleCloudPubsub.iamMod.google.protobuf.UninterpretedOption

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a NamePart. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.UninterpretedOption.NamePart")
@js.native
/**
  * Constructs a new NamePart.
  * @param [properties] Properties to set
  */
class NamePart () extends INamePart {
  def this(properties: INamePart) = this()
  /** NamePart isExtension */
  /* CompleteClass */
  override var isExtension: Boolean = js.native
  /** NamePart namePart */
  /* CompleteClass */
  override var namePart: String = js.native
  /**
    * Converts this NamePart to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.UninterpretedOption.NamePart")
@js.native
object NamePart extends js.Object {
  /**
    * Creates a new NamePart instance using the specified properties.
    * @param [properties] Properties to set
    * @returns NamePart instance
    */
  def create(): NamePart = js.native
  def create(properties: INamePart): NamePart = js.native
  /**
    * Decodes a NamePart message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns NamePart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): NamePart = js.native
  def decode(reader: Reader, length: Double): NamePart = js.native
  def decode(reader: Uint8Array): NamePart = js.native
  def decode(reader: Uint8Array, length: Double): NamePart = js.native
  /**
    * Decodes a NamePart message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns NamePart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): NamePart = js.native
  def decodeDelimited(reader: Uint8Array): NamePart = js.native
  /**
    * Encodes the specified NamePart message. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
    * @param message NamePart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: INamePart): Writer = js.native
  def encode(message: INamePart, writer: Writer): Writer = js.native
  /**
    * Encodes the specified NamePart message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
    * @param message NamePart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: INamePart): Writer = js.native
  def encodeDelimited(message: INamePart, writer: Writer): Writer = js.native
  /**
    * Creates a NamePart message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns NamePart
    */
  def fromObject(`object`: StringDictionary[js.Any]): NamePart = js.native
  /**
    * Creates a plain object from a NamePart message. Also converts values to other types if specified.
    * @param message NamePart
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: NamePart): StringDictionary[js.Any] = js.native
  def toObject(message: NamePart, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a NamePart message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

