package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmSuggestedReply. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedReply")
@js.native
/**
  * Constructs a new RbmSuggestedReply.
  * @param [properties] Properties to set
  */
class RbmSuggestedReply () extends IRbmSuggestedReply {
  def this(properties: IRbmSuggestedReply) = this()
  /** RbmSuggestedReply postbackData. */
  @JSName("postbackData")
  var postbackData_RbmSuggestedReply: String = js.native
  /** RbmSuggestedReply text. */
  @JSName("text")
  var text_RbmSuggestedReply: String = js.native
  /**
    * Converts this RbmSuggestedReply to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedReply")
@js.native
object RbmSuggestedReply extends js.Object {
  /**
    * Creates a new RbmSuggestedReply instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmSuggestedReply instance
    */
  def create(): RbmSuggestedReply = js.native
  def create(properties: IRbmSuggestedReply): RbmSuggestedReply = js.native
  /**
    * Decodes a RbmSuggestedReply message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmSuggestedReply
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmSuggestedReply = js.native
  def decode(reader: Reader, length: Double): RbmSuggestedReply = js.native
  def decode(reader: Uint8Array): RbmSuggestedReply = js.native
  def decode(reader: Uint8Array, length: Double): RbmSuggestedReply = js.native
  /**
    * Decodes a RbmSuggestedReply message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmSuggestedReply
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmSuggestedReply = js.native
  def decodeDelimited(reader: Uint8Array): RbmSuggestedReply = js.native
  /**
    * Encodes the specified RbmSuggestedReply message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedReply.verify|verify} messages.
    * @param message RbmSuggestedReply message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmSuggestedReply): Writer = js.native
  def encode(message: IRbmSuggestedReply, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmSuggestedReply message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedReply.verify|verify} messages.
    * @param message RbmSuggestedReply message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmSuggestedReply): Writer = js.native
  def encodeDelimited(message: IRbmSuggestedReply, writer: Writer): Writer = js.native
  /**
    * Creates a RbmSuggestedReply message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmSuggestedReply
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedReply = js.native
  /**
    * Creates a plain object from a RbmSuggestedReply message. Also converts values to other types if specified.
    * @param message RbmSuggestedReply
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmSuggestedReply): StringDictionary[js.Any] = js.native
  def toObject(message: RbmSuggestedReply, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmSuggestedReply message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

