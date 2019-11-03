package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SimpleResponses. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses")
@js.native
/**
  * Constructs a new SimpleResponses.
  * @param [properties] Properties to set
  */
class SimpleResponses () extends ISimpleResponses {
  def this(properties: ISimpleResponses) = this()
  /** SimpleResponses simpleResponses. */
  @JSName("simpleResponses")
  var simpleResponses_SimpleResponses: js.Array[ISimpleResponse] = js.native
  /**
    * Converts this SimpleResponses to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses")
@js.native
object SimpleResponses extends js.Object {
  /**
    * Creates a new SimpleResponses instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SimpleResponses instance
    */
  def create(): SimpleResponses = js.native
  def create(properties: ISimpleResponses): SimpleResponses = js.native
  /**
    * Decodes a SimpleResponses message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SimpleResponses
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SimpleResponses = js.native
  def decode(reader: Reader, length: Double): SimpleResponses = js.native
  def decode(reader: Uint8Array): SimpleResponses = js.native
  def decode(reader: Uint8Array, length: Double): SimpleResponses = js.native
  /**
    * Decodes a SimpleResponses message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SimpleResponses
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SimpleResponses = js.native
  def decodeDelimited(reader: Uint8Array): SimpleResponses = js.native
  /**
    * Encodes the specified SimpleResponses message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.verify|verify} messages.
    * @param message SimpleResponses message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISimpleResponses): Writer = js.native
  def encode(message: ISimpleResponses, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SimpleResponses message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.verify|verify} messages.
    * @param message SimpleResponses message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISimpleResponses): Writer = js.native
  def encodeDelimited(message: ISimpleResponses, writer: Writer): Writer = js.native
  /**
    * Creates a SimpleResponses message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SimpleResponses
    */
  def fromObject(`object`: StringDictionary[js.Any]): SimpleResponses = js.native
  /**
    * Creates a plain object from a SimpleResponses message. Also converts values to other types if specified.
    * @param message SimpleResponses
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SimpleResponses): StringDictionary[js.Any] = js.native
  def toObject(message: SimpleResponses, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SimpleResponses message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

