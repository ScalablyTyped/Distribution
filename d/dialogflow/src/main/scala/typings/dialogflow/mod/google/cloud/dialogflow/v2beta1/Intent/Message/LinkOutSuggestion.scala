package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a LinkOutSuggestion. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.LinkOutSuggestion")
@js.native
/**
  * Constructs a new LinkOutSuggestion.
  * @param [properties] Properties to set
  */
class LinkOutSuggestion () extends ILinkOutSuggestion {
  def this(properties: ILinkOutSuggestion) = this()
  /** LinkOutSuggestion destinationName. */
  @JSName("destinationName")
  var destinationName_LinkOutSuggestion: String = js.native
  /** LinkOutSuggestion uri. */
  @JSName("uri")
  var uri_LinkOutSuggestion: String = js.native
  /**
    * Converts this LinkOutSuggestion to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.LinkOutSuggestion")
@js.native
object LinkOutSuggestion extends js.Object {
  /**
    * Creates a new LinkOutSuggestion instance using the specified properties.
    * @param [properties] Properties to set
    * @returns LinkOutSuggestion instance
    */
  def create(): LinkOutSuggestion = js.native
  def create(properties: ILinkOutSuggestion): LinkOutSuggestion = js.native
  /**
    * Decodes a LinkOutSuggestion message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns LinkOutSuggestion
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): LinkOutSuggestion = js.native
  def decode(reader: Reader, length: Double): LinkOutSuggestion = js.native
  def decode(reader: Uint8Array): LinkOutSuggestion = js.native
  def decode(reader: Uint8Array, length: Double): LinkOutSuggestion = js.native
  /**
    * Decodes a LinkOutSuggestion message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns LinkOutSuggestion
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): LinkOutSuggestion = js.native
  def decodeDelimited(reader: Uint8Array): LinkOutSuggestion = js.native
  /**
    * Encodes the specified LinkOutSuggestion message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.LinkOutSuggestion.verify|verify} messages.
    * @param message LinkOutSuggestion message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ILinkOutSuggestion): Writer = js.native
  def encode(message: ILinkOutSuggestion, writer: Writer): Writer = js.native
  /**
    * Encodes the specified LinkOutSuggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.LinkOutSuggestion.verify|verify} messages.
    * @param message LinkOutSuggestion message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ILinkOutSuggestion): Writer = js.native
  def encodeDelimited(message: ILinkOutSuggestion, writer: Writer): Writer = js.native
  /**
    * Creates a LinkOutSuggestion message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns LinkOutSuggestion
    */
  def fromObject(`object`: StringDictionary[js.Any]): LinkOutSuggestion = js.native
  /**
    * Creates a plain object from a LinkOutSuggestion message. Also converts values to other types if specified.
    * @param message LinkOutSuggestion
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: LinkOutSuggestion): StringDictionary[js.Any] = js.native
  def toObject(message: LinkOutSuggestion, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a LinkOutSuggestion message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

