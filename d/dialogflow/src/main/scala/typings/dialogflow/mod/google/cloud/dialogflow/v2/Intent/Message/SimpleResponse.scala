package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SimpleResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse")
@js.native
/**
  * Constructs a new SimpleResponse.
  * @param [properties] Properties to set
  */
class SimpleResponse () extends ISimpleResponse {
  def this(properties: ISimpleResponse) = this()
  /** SimpleResponse displayText. */
  @JSName("displayText")
  var displayText_SimpleResponse: String = js.native
  /** SimpleResponse ssml. */
  @JSName("ssml")
  var ssml_SimpleResponse: String = js.native
  /** SimpleResponse textToSpeech. */
  @JSName("textToSpeech")
  var textToSpeech_SimpleResponse: String = js.native
  /**
    * Converts this SimpleResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse")
@js.native
object SimpleResponse extends js.Object {
  /**
    * Creates a new SimpleResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SimpleResponse instance
    */
  def create(): SimpleResponse = js.native
  def create(properties: ISimpleResponse): SimpleResponse = js.native
  /**
    * Decodes a SimpleResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SimpleResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SimpleResponse = js.native
  def decode(reader: Reader, length: Double): SimpleResponse = js.native
  def decode(reader: Uint8Array): SimpleResponse = js.native
  def decode(reader: Uint8Array, length: Double): SimpleResponse = js.native
  /**
    * Decodes a SimpleResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SimpleResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SimpleResponse = js.native
  def decodeDelimited(reader: Uint8Array): SimpleResponse = js.native
  /**
    * Encodes the specified SimpleResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.verify|verify} messages.
    * @param message SimpleResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISimpleResponse): Writer = js.native
  def encode(message: ISimpleResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SimpleResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.verify|verify} messages.
    * @param message SimpleResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISimpleResponse): Writer = js.native
  def encodeDelimited(message: ISimpleResponse, writer: Writer): Writer = js.native
  /**
    * Creates a SimpleResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SimpleResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): SimpleResponse = js.native
  /**
    * Creates a plain object from a SimpleResponse message. Also converts values to other types if specified.
    * @param message SimpleResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SimpleResponse): StringDictionary[js.Any] = js.native
  def toObject(message: SimpleResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SimpleResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

