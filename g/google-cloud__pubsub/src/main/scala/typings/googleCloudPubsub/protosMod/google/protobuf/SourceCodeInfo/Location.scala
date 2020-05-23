package typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Location. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.SourceCodeInfo.Location")
@js.native
/**
  * Constructs a new Location.
  * @param [properties] Properties to set
  */
class Location () extends ILocation {
  def this(properties: ILocation) = this()
  /** Location leadingComments. */
  @JSName("leadingComments")
  var leadingComments_Location: String = js.native
  /** Location leadingDetachedComments. */
  @JSName("leadingDetachedComments")
  var leadingDetachedComments_Location: js.Array[String] = js.native
  /** Location path. */
  @JSName("path")
  var path_Location: js.Array[Double] = js.native
  /** Location span. */
  @JSName("span")
  var span_Location: js.Array[Double] = js.native
  /** Location trailingComments. */
  @JSName("trailingComments")
  var trailingComments_Location: String = js.native
  /**
    * Converts this Location to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.SourceCodeInfo.Location")
@js.native
object Location extends js.Object {
  /**
    * Creates a new Location instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Location instance
    */
  def create(): Location = js.native
  def create(properties: ILocation): Location = js.native
  /**
    * Decodes a Location message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Location
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Location = js.native
  def decode(reader: Reader, length: Double): Location = js.native
  def decode(reader: Uint8Array): Location = js.native
  def decode(reader: Uint8Array, length: Double): Location = js.native
  /**
    * Decodes a Location message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Location
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Location = js.native
  def decodeDelimited(reader: Uint8Array): Location = js.native
  /**
    * Encodes the specified Location message. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
    * @param message Location message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ILocation): Writer = js.native
  def encode(message: ILocation, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Location message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
    * @param message Location message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ILocation): Writer = js.native
  def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
  /**
    * Creates a Location message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Location
    */
  def fromObject(`object`: StringDictionary[js.Any]): Location = js.native
  /**
    * Creates a plain object from a Location message. Also converts values to other types if specified.
    * @param message Location
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Location): StringDictionary[js.Any] = js.native
  def toObject(message: Location, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Location message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

