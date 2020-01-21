package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GcsSource. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GcsSource")
@js.native
/**
  * Constructs a new GcsSource.
  * @param [properties] Properties to set
  */
class GcsSource () extends IGcsSource {
  def this(properties: IGcsSource) = this()
  /** GcsSource uri. */
  @JSName("uri")
  var uri_GcsSource: String = js.native
  /**
    * Converts this GcsSource to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GcsSource")
@js.native
object GcsSource extends js.Object {
  /**
    * Creates a new GcsSource instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GcsSource instance
    */
  def create(): GcsSource = js.native
  def create(properties: IGcsSource): GcsSource = js.native
  /**
    * Decodes a GcsSource message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GcsSource
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GcsSource = js.native
  def decode(reader: Reader, length: Double): GcsSource = js.native
  def decode(reader: Uint8Array): GcsSource = js.native
  def decode(reader: Uint8Array, length: Double): GcsSource = js.native
  /**
    * Decodes a GcsSource message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GcsSource
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GcsSource = js.native
  def decodeDelimited(reader: Uint8Array): GcsSource = js.native
  /**
    * Encodes the specified GcsSource message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GcsSource.verify|verify} messages.
    * @param message GcsSource message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGcsSource): Writer = js.native
  def encode(message: IGcsSource, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GcsSource message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GcsSource.verify|verify} messages.
    * @param message GcsSource message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGcsSource): Writer = js.native
  def encodeDelimited(message: IGcsSource, writer: Writer): Writer = js.native
  /**
    * Creates a GcsSource message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GcsSource
    */
  def fromObject(`object`: StringDictionary[js.Any]): GcsSource = js.native
  /**
    * Creates a plain object from a GcsSource message. Also converts values to other types if specified.
    * @param message GcsSource
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GcsSource): StringDictionary[js.Any] = js.native
  def toObject(message: GcsSource, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GcsSource message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

