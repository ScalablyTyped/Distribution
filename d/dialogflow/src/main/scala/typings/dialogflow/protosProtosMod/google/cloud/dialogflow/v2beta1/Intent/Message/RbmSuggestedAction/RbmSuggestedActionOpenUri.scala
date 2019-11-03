package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmSuggestedActionOpenUri. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionOpenUri")
@js.native
/**
  * Constructs a new RbmSuggestedActionOpenUri.
  * @param [properties] Properties to set
  */
class RbmSuggestedActionOpenUri () extends IRbmSuggestedActionOpenUri {
  def this(properties: IRbmSuggestedActionOpenUri) = this()
  /** RbmSuggestedActionOpenUri uri. */
  @JSName("uri")
  var uri_RbmSuggestedActionOpenUri: String = js.native
  /**
    * Converts this RbmSuggestedActionOpenUri to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionOpenUri")
@js.native
object RbmSuggestedActionOpenUri extends js.Object {
  /**
    * Creates a new RbmSuggestedActionOpenUri instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmSuggestedActionOpenUri instance
    */
  def create(): RbmSuggestedActionOpenUri = js.native
  def create(properties: IRbmSuggestedActionOpenUri): RbmSuggestedActionOpenUri = js.native
  /**
    * Decodes a RbmSuggestedActionOpenUri message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmSuggestedActionOpenUri
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmSuggestedActionOpenUri = js.native
  def decode(reader: Reader, length: Double): RbmSuggestedActionOpenUri = js.native
  def decode(reader: Uint8Array): RbmSuggestedActionOpenUri = js.native
  def decode(reader: Uint8Array, length: Double): RbmSuggestedActionOpenUri = js.native
  /**
    * Decodes a RbmSuggestedActionOpenUri message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmSuggestedActionOpenUri
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmSuggestedActionOpenUri = js.native
  def decodeDelimited(reader: Uint8Array): RbmSuggestedActionOpenUri = js.native
  /**
    * Encodes the specified RbmSuggestedActionOpenUri message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionOpenUri.verify|verify} messages.
    * @param message RbmSuggestedActionOpenUri message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmSuggestedActionOpenUri): Writer = js.native
  def encode(message: IRbmSuggestedActionOpenUri, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmSuggestedActionOpenUri message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionOpenUri.verify|verify} messages.
    * @param message RbmSuggestedActionOpenUri message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmSuggestedActionOpenUri): Writer = js.native
  def encodeDelimited(message: IRbmSuggestedActionOpenUri, writer: Writer): Writer = js.native
  /**
    * Creates a RbmSuggestedActionOpenUri message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmSuggestedActionOpenUri
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedActionOpenUri = js.native
  /**
    * Creates a plain object from a RbmSuggestedActionOpenUri message. Also converts values to other types if specified.
    * @param message RbmSuggestedActionOpenUri
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmSuggestedActionOpenUri): StringDictionary[js.Any] = js.native
  def toObject(message: RbmSuggestedActionOpenUri, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmSuggestedActionOpenUri message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

