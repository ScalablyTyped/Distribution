package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EnumValueDescriptorProto. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.EnumValueDescriptorProto")
@js.native
/**
  * Constructs a new EnumValueDescriptorProto.
  * @param [properties] Properties to set
  */
class EnumValueDescriptorProto () extends IEnumValueDescriptorProto {
  def this(properties: IEnumValueDescriptorProto) = this()
  /** EnumValueDescriptorProto name. */
  @JSName("name")
  var name_EnumValueDescriptorProto: String = js.native
  /** EnumValueDescriptorProto number. */
  @JSName("number")
  var number_EnumValueDescriptorProto: Double = js.native
  /**
    * Converts this EnumValueDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.EnumValueDescriptorProto")
@js.native
object EnumValueDescriptorProto extends js.Object {
  /**
    * Creates a new EnumValueDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumValueDescriptorProto instance
    */
  def create(): EnumValueDescriptorProto = js.native
  def create(properties: IEnumValueDescriptorProto): EnumValueDescriptorProto = js.native
  /**
    * Decodes an EnumValueDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumValueDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): EnumValueDescriptorProto = js.native
  def decode(reader: Reader, length: Double): EnumValueDescriptorProto = js.native
  def decode(reader: Uint8Array): EnumValueDescriptorProto = js.native
  def decode(reader: Uint8Array, length: Double): EnumValueDescriptorProto = js.native
  /**
    * Decodes an EnumValueDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumValueDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): EnumValueDescriptorProto = js.native
  def decodeDelimited(reader: Uint8Array): EnumValueDescriptorProto = js.native
  /**
    * Encodes the specified EnumValueDescriptorProto message. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
    * @param message EnumValueDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEnumValueDescriptorProto): Writer = js.native
  def encode(message: IEnumValueDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EnumValueDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
    * @param message EnumValueDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEnumValueDescriptorProto): Writer = js.native
  def encodeDelimited(message: IEnumValueDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates an EnumValueDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueDescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): EnumValueDescriptorProto = js.native
  /**
    * Creates a plain object from an EnumValueDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumValueDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: EnumValueDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(message: EnumValueDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EnumValueDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

