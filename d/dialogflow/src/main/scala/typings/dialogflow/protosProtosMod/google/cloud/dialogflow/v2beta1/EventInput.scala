package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EventInput. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EventInput")
@js.native
/**
  * Constructs a new EventInput.
  * @param [properties] Properties to set
  */
class EventInput () extends IEventInput {
  def this(properties: IEventInput) = this()
  /** EventInput languageCode. */
  @JSName("languageCode")
  var languageCode_EventInput: String = js.native
  /** EventInput name. */
  @JSName("name")
  var name_EventInput: String = js.native
  /**
    * Converts this EventInput to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EventInput")
@js.native
object EventInput extends js.Object {
  /**
    * Creates a new EventInput instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventInput instance
    */
  def create(): EventInput = js.native
  def create(properties: IEventInput): EventInput = js.native
  /**
    * Decodes an EventInput message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): EventInput = js.native
  def decode(reader: Reader, length: Double): EventInput = js.native
  def decode(reader: Uint8Array): EventInput = js.native
  def decode(reader: Uint8Array, length: Double): EventInput = js.native
  /**
    * Decodes an EventInput message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): EventInput = js.native
  def decodeDelimited(reader: Uint8Array): EventInput = js.native
  /**
    * Encodes the specified EventInput message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EventInput.verify|verify} messages.
    * @param message EventInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEventInput): Writer = js.native
  def encode(message: IEventInput, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EventInput message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EventInput.verify|verify} messages.
    * @param message EventInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEventInput): Writer = js.native
  def encodeDelimited(message: IEventInput, writer: Writer): Writer = js.native
  /**
    * Creates an EventInput message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventInput
    */
  def fromObject(`object`: StringDictionary[js.Any]): EventInput = js.native
  /**
    * Creates a plain object from an EventInput message. Also converts values to other types if specified.
    * @param message EventInput
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: EventInput): StringDictionary[js.Any] = js.native
  def toObject(message: EventInput, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EventInput message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

