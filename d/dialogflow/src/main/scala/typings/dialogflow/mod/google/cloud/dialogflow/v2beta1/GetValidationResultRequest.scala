package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetValidationResultRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest")
@js.native
/**
  * Constructs a new GetValidationResultRequest.
  * @param [properties] Properties to set
  */
class GetValidationResultRequest () extends IGetValidationResultRequest {
  def this(properties: IGetValidationResultRequest) = this()
  /** GetValidationResultRequest languageCode. */
  @JSName("languageCode")
  var languageCode_GetValidationResultRequest: String = js.native
  /** GetValidationResultRequest parent. */
  @JSName("parent")
  var parent_GetValidationResultRequest: String = js.native
  /**
    * Converts this GetValidationResultRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest")
@js.native
object GetValidationResultRequest extends js.Object {
  /**
    * Creates a new GetValidationResultRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetValidationResultRequest instance
    */
  def create(): GetValidationResultRequest = js.native
  def create(properties: IGetValidationResultRequest): GetValidationResultRequest = js.native
  /**
    * Decodes a GetValidationResultRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetValidationResultRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetValidationResultRequest = js.native
  def decode(reader: Reader, length: Double): GetValidationResultRequest = js.native
  def decode(reader: Uint8Array): GetValidationResultRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetValidationResultRequest = js.native
  /**
    * Decodes a GetValidationResultRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetValidationResultRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetValidationResultRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetValidationResultRequest = js.native
  /**
    * Encodes the specified GetValidationResultRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetValidationResultRequest.verify|verify} messages.
    * @param message GetValidationResultRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetValidationResultRequest): Writer = js.native
  def encode(message: IGetValidationResultRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetValidationResultRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetValidationResultRequest.verify|verify} messages.
    * @param message GetValidationResultRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetValidationResultRequest): Writer = js.native
  def encodeDelimited(message: IGetValidationResultRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetValidationResultRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetValidationResultRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetValidationResultRequest = js.native
  /**
    * Creates a plain object from a GetValidationResultRequest message. Also converts values to other types if specified.
    * @param message GetValidationResultRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetValidationResultRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetValidationResultRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetValidationResultRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

