package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest")
@js.native
/**
  * Constructs a new GetIntentRequest.
  * @param [properties] Properties to set
  */
class GetIntentRequest () extends IGetIntentRequest {
  def this(properties: IGetIntentRequest) = this()
  /** GetIntentRequest intentView. */
  @JSName("intentView")
  var intentView_GetIntentRequest: IntentView = js.native
  /** GetIntentRequest languageCode. */
  @JSName("languageCode")
  var languageCode_GetIntentRequest: String = js.native
  /** GetIntentRequest name. */
  @JSName("name")
  var name_GetIntentRequest: String = js.native
  /**
    * Converts this GetIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetIntentRequest")
@js.native
object GetIntentRequest extends js.Object {
  /**
    * Creates a new GetIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetIntentRequest instance
    */
  def create(): GetIntentRequest = js.native
  def create(properties: IGetIntentRequest): GetIntentRequest = js.native
  /**
    * Decodes a GetIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetIntentRequest = js.native
  def decode(reader: Reader, length: Double): GetIntentRequest = js.native
  def decode(reader: Uint8Array): GetIntentRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetIntentRequest = js.native
  /**
    * Decodes a GetIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetIntentRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetIntentRequest = js.native
  /**
    * Encodes the specified GetIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetIntentRequest.verify|verify} messages.
    * @param message GetIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetIntentRequest): Writer = js.native
  def encode(message: IGetIntentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetIntentRequest.verify|verify} messages.
    * @param message GetIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetIntentRequest): Writer = js.native
  def encodeDelimited(message: IGetIntentRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetIntentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetIntentRequest = js.native
  /**
    * Creates a plain object from a GetIntentRequest message. Also converts values to other types if specified.
    * @param message GetIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetIntentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetIntentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

