package typings.dialogflow.protosProtosMod.google.protobuf.EnumDescriptorProto

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EnumReservedRange. */
@JSImport("dialogflow/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange")
@js.native
/**
  * Constructs a new EnumReservedRange.
  * @param [properties] Properties to set
  */
class EnumReservedRange () extends IEnumReservedRange {
  def this(properties: IEnumReservedRange) = this()
  /** EnumReservedRange end. */
  @JSName("end")
  var end_EnumReservedRange: Double = js.native
  /** EnumReservedRange start. */
  @JSName("start")
  var start_EnumReservedRange: Double = js.native
  /**
    * Converts this EnumReservedRange to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange")
@js.native
object EnumReservedRange extends js.Object {
  /**
    * Creates a new EnumReservedRange instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumReservedRange instance
    */
  def create(): EnumReservedRange = js.native
  def create(properties: IEnumReservedRange): EnumReservedRange = js.native
  /**
    * Decodes an EnumReservedRange message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumReservedRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): EnumReservedRange = js.native
  def decode(reader: Reader, length: Double): EnumReservedRange = js.native
  def decode(reader: Uint8Array): EnumReservedRange = js.native
  def decode(reader: Uint8Array, length: Double): EnumReservedRange = js.native
  /**
    * Decodes an EnumReservedRange message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumReservedRange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): EnumReservedRange = js.native
  def decodeDelimited(reader: Uint8Array): EnumReservedRange = js.native
  /**
    * Encodes the specified EnumReservedRange message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
    * @param message EnumReservedRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEnumReservedRange): Writer = js.native
  def encode(message: IEnumReservedRange, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EnumReservedRange message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
    * @param message EnumReservedRange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEnumReservedRange): Writer = js.native
  def encodeDelimited(message: IEnumReservedRange, writer: Writer): Writer = js.native
  /**
    * Creates an EnumReservedRange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumReservedRange
    */
  def fromObject(`object`: StringDictionary[js.Any]): EnumReservedRange = js.native
  /**
    * Creates a plain object from an EnumReservedRange message. Also converts values to other types if specified.
    * @param message EnumReservedRange
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: EnumReservedRange): StringDictionary[js.Any] = js.native
  def toObject(message: EnumReservedRange, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EnumReservedRange message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

