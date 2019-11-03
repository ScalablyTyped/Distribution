package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Any. */
@JSImport("dialogflow/protos/protos", "google.protobuf.Any")
@js.native
/**
  * Constructs a new Any.
  * @param [properties] Properties to set
  */
class Any () extends IAny {
  def this(properties: IAny) = this()
  /** Any type_url. */
  @JSName("type_url")
  var type_url_Any: String = js.native
  /** Any value. */
  @JSName("value")
  var value_Any: Uint8Array = js.native
  /**
    * Converts this Any to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.protobuf.Any")
@js.native
object Any extends js.Object {
  /**
    * Creates a new Any instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Any instance
    */
  def create(): Any = js.native
  def create(properties: IAny): Any = js.native
  /**
    * Decodes an Any message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Any
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Any = js.native
  def decode(reader: Reader, length: Double): Any = js.native
  def decode(reader: Uint8Array): Any = js.native
  def decode(reader: Uint8Array, length: Double): Any = js.native
  /**
    * Decodes an Any message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Any
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Any = js.native
  def decodeDelimited(reader: Uint8Array): Any = js.native
  /**
    * Encodes the specified Any message. Does not implicitly {@link google.protobuf.Any.verify|verify} messages.
    * @param message Any message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IAny): Writer = js.native
  def encode(message: IAny, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Any message, length delimited. Does not implicitly {@link google.protobuf.Any.verify|verify} messages.
    * @param message Any message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IAny): Writer = js.native
  def encodeDelimited(message: IAny, writer: Writer): Writer = js.native
  /**
    * Creates an Any message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Any
    */
  def fromObject(`object`: StringDictionary[js.Any]): Any = js.native
  /**
    * Creates a plain object from an Any message. Also converts values to other types if specified.
    * @param message Any
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Any): StringDictionary[js.Any] = js.native
  def toObject(message: Any, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Any message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

