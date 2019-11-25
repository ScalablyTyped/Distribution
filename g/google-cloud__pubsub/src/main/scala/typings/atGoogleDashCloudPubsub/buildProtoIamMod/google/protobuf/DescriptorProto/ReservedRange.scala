package typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.protobuf.DescriptorProto

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ReservedRange. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.DescriptorProto.ReservedRange")
@js.native
/**
  * Constructs a new ReservedRange.
  * @param [properties] Properties to set
  */
class ReservedRange () extends IReservedRange {
  def this(properties: IReservedRange) = this()
  /** ReservedRange end. */
  @JSName("end")
  var end_ReservedRange: Double = js.native
  /** ReservedRange start. */
  @JSName("start")
  var start_ReservedRange: Double = js.native
  /**
    * Converts this ReservedRange to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.DescriptorProto.ReservedRange")
@js.native
object ReservedRange extends js.Object {
  /**
    * Creates a new ReservedRange instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReservedRange instance
    */
  def create(): ReservedRange = js.native
  def create(properties: IReservedRange): ReservedRange = js.native
  /**
    * Decodes a ReservedRange message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReservedRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ReservedRange = js.native
  def decode(reader: Reader, length: Double): ReservedRange = js.native
  def decode(reader: Uint8Array): ReservedRange = js.native
  def decode(reader: Uint8Array, length: Double): ReservedRange = js.native
  /**
    * Decodes a ReservedRange message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReservedRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ReservedRange = js.native
  def decodeDelimited(reader: Uint8Array): ReservedRange = js.native
  /**
    * Encodes the specified ReservedRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
    * @param message ReservedRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IReservedRange): Writer = js.native
  def encode(message: IReservedRange, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ReservedRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
    * @param message ReservedRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IReservedRange): Writer = js.native
  def encodeDelimited(message: IReservedRange, writer: Writer): Writer = js.native
  /**
    * Creates a ReservedRange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReservedRange
    */
  def fromObject(`object`: StringDictionary[js.Any]): ReservedRange = js.native
  /**
    * Creates a plain object from a ReservedRange message. Also converts values to other types if specified.
    * @param message ReservedRange
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ReservedRange): StringDictionary[js.Any] = js.native
  def toObject(message: ReservedRange, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ReservedRange message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

