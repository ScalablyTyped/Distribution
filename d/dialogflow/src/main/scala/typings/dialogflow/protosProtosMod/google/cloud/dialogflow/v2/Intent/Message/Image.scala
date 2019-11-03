package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Image. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image")
@js.native
/**
  * Constructs a new Image.
  * @param [properties] Properties to set
  */
class Image () extends IImage {
  def this(properties: IImage) = this()
  /** Image accessibilityText. */
  @JSName("accessibilityText")
  var accessibilityText_Image: String = js.native
  /** Image imageUri. */
  @JSName("imageUri")
  var imageUri_Image: String = js.native
  /**
    * Converts this Image to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image")
@js.native
object Image extends js.Object {
  /**
    * Creates a new Image instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Image instance
    */
  def create(): Image = js.native
  def create(properties: IImage): Image = js.native
  /**
    * Decodes an Image message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Image
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Image = js.native
  def decode(reader: Reader, length: Double): Image = js.native
  def decode(reader: Uint8Array): Image = js.native
  def decode(reader: Uint8Array, length: Double): Image = js.native
  /**
    * Decodes an Image message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Image
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Image = js.native
  def decodeDelimited(reader: Uint8Array): Image = js.native
  /**
    * Encodes the specified Image message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Image.verify|verify} messages.
    * @param message Image message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IImage): Writer = js.native
  def encode(message: IImage, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Image message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Image.verify|verify} messages.
    * @param message Image message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IImage): Writer = js.native
  def encodeDelimited(message: IImage, writer: Writer): Writer = js.native
  /**
    * Creates an Image message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Image
    */
  def fromObject(`object`: StringDictionary[js.Any]): Image = js.native
  /**
    * Creates a plain object from an Image message. Also converts values to other types if specified.
    * @param message Image
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Image): StringDictionary[js.Any] = js.native
  def toObject(message: Image, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Image message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

