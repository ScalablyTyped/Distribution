package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a QuickReplies. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies")
@js.native
/**
  * Constructs a new QuickReplies.
  * @param [properties] Properties to set
  */
class QuickReplies () extends IQuickReplies {
  def this(properties: IQuickReplies) = this()
  /** QuickReplies quickReplies. */
  @JSName("quickReplies")
  var quickReplies_QuickReplies: js.Array[String] = js.native
  /** QuickReplies title. */
  @JSName("title")
  var title_QuickReplies: String = js.native
  /**
    * Converts this QuickReplies to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies")
@js.native
object QuickReplies extends js.Object {
  /**
    * Creates a new QuickReplies instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QuickReplies instance
    */
  def create(): QuickReplies = js.native
  def create(properties: IQuickReplies): QuickReplies = js.native
  /**
    * Decodes a QuickReplies message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QuickReplies
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): QuickReplies = js.native
  def decode(reader: Reader, length: Double): QuickReplies = js.native
  def decode(reader: Uint8Array): QuickReplies = js.native
  def decode(reader: Uint8Array, length: Double): QuickReplies = js.native
  /**
    * Decodes a QuickReplies message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QuickReplies
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): QuickReplies = js.native
  def decodeDelimited(reader: Uint8Array): QuickReplies = js.native
  /**
    * Encodes the specified QuickReplies message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.QuickReplies.verify|verify} messages.
    * @param message QuickReplies message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IQuickReplies): Writer = js.native
  def encode(message: IQuickReplies, writer: Writer): Writer = js.native
  /**
    * Encodes the specified QuickReplies message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.QuickReplies.verify|verify} messages.
    * @param message QuickReplies message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IQuickReplies): Writer = js.native
  def encodeDelimited(message: IQuickReplies, writer: Writer): Writer = js.native
  /**
    * Creates a QuickReplies message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QuickReplies
    */
  def fromObject(`object`: StringDictionary[js.Any]): QuickReplies = js.native
  /**
    * Creates a plain object from a QuickReplies message. Also converts values to other types if specified.
    * @param message QuickReplies
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: QuickReplies): StringDictionary[js.Any] = js.native
  def toObject(message: QuickReplies, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a QuickReplies message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

