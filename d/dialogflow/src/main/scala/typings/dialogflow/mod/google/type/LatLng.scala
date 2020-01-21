package typings.dialogflow.mod.google.`type`

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a LatLng. */
@JSImport("dialogflow/protos/protos", "google.type.LatLng")
@js.native
/**
  * Constructs a new LatLng.
  * @param [properties] Properties to set
  */
class LatLng () extends ILatLng {
  def this(properties: ILatLng) = this()
  /** LatLng latitude. */
  @JSName("latitude")
  var latitude_LatLng: Double = js.native
  /** LatLng longitude. */
  @JSName("longitude")
  var longitude_LatLng: Double = js.native
  /**
    * Converts this LatLng to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.type.LatLng")
@js.native
object LatLng extends js.Object {
  /**
    * Creates a new LatLng instance using the specified properties.
    * @param [properties] Properties to set
    * @returns LatLng instance
    */
  def create(): LatLng = js.native
  def create(properties: ILatLng): LatLng = js.native
  /**
    * Decodes a LatLng message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns LatLng
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): LatLng = js.native
  def decode(reader: Reader, length: Double): LatLng = js.native
  def decode(reader: Uint8Array): LatLng = js.native
  def decode(reader: Uint8Array, length: Double): LatLng = js.native
  /**
    * Decodes a LatLng message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns LatLng
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): LatLng = js.native
  def decodeDelimited(reader: Uint8Array): LatLng = js.native
  /**
    * Encodes the specified LatLng message. Does not implicitly {@link google.type.LatLng.verify|verify} messages.
    * @param message LatLng message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ILatLng): Writer = js.native
  def encode(message: ILatLng, writer: Writer): Writer = js.native
  /**
    * Encodes the specified LatLng message, length delimited. Does not implicitly {@link google.type.LatLng.verify|verify} messages.
    * @param message LatLng message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ILatLng): Writer = js.native
  def encodeDelimited(message: ILatLng, writer: Writer): Writer = js.native
  /**
    * Creates a LatLng message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns LatLng
    */
  def fromObject(`object`: StringDictionary[js.Any]): LatLng = js.native
  /**
    * Creates a plain object from a LatLng message. Also converts values to other types if specified.
    * @param message LatLng
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: LatLng): StringDictionary[js.Any] = js.native
  def toObject(message: LatLng, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a LatLng message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

