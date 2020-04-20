package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UpdateIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.UpdateIntentRequest")
@js.native
/**
  * Constructs a new UpdateIntentRequest.
  * @param [properties] Properties to set
  */
class UpdateIntentRequest () extends IUpdateIntentRequest {
  def this(properties: IUpdateIntentRequest) = this()
  /** UpdateIntentRequest intentView. */
  @JSName("intentView")
  var intentView_UpdateIntentRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) = js.native
  /** UpdateIntentRequest languageCode. */
  @JSName("languageCode")
  var languageCode_UpdateIntentRequest: String = js.native
  /**
    * Converts this UpdateIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.UpdateIntentRequest")
@js.native
object UpdateIntentRequest extends js.Object {
  /**
    * Creates a new UpdateIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateIntentRequest instance
    */
  def create(): UpdateIntentRequest = js.native
  def create(properties: IUpdateIntentRequest): UpdateIntentRequest = js.native
  /**
    * Decodes an UpdateIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): UpdateIntentRequest = js.native
  def decode(reader: Reader, length: Double): UpdateIntentRequest = js.native
  def decode(reader: Uint8Array): UpdateIntentRequest = js.native
  def decode(reader: Uint8Array, length: Double): UpdateIntentRequest = js.native
  /**
    * Decodes an UpdateIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): UpdateIntentRequest = js.native
  def decodeDelimited(reader: Uint8Array): UpdateIntentRequest = js.native
  /**
    * Encodes the specified UpdateIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.UpdateIntentRequest.verify|verify} messages.
    * @param message UpdateIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUpdateIntentRequest): Writer = js.native
  def encode(message: IUpdateIntentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UpdateIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.UpdateIntentRequest.verify|verify} messages.
    * @param message UpdateIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUpdateIntentRequest): Writer = js.native
  def encodeDelimited(message: IUpdateIntentRequest, writer: Writer): Writer = js.native
  /**
    * Creates an UpdateIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateIntentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): UpdateIntentRequest = js.native
  /**
    * Creates a plain object from an UpdateIntentRequest message. Also converts values to other types if specified.
    * @param message UpdateIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: UpdateIntentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: UpdateIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UpdateIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

