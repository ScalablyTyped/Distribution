package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetAgentRequest")
@js.native
/**
  * Constructs a new GetAgentRequest.
  * @param [properties] Properties to set
  */
class GetAgentRequest () extends IGetAgentRequest {
  def this(properties: IGetAgentRequest) = this()
  /** GetAgentRequest parent. */
  @JSName("parent")
  var parent_GetAgentRequest: String = js.native
  /**
    * Converts this GetAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetAgentRequest")
@js.native
object GetAgentRequest extends js.Object {
  /**
    * Creates a new GetAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetAgentRequest instance
    */
  def create(): GetAgentRequest = js.native
  def create(properties: IGetAgentRequest): GetAgentRequest = js.native
  /**
    * Decodes a GetAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetAgentRequest = js.native
  def decode(reader: Reader, length: Double): GetAgentRequest = js.native
  def decode(reader: Uint8Array): GetAgentRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetAgentRequest = js.native
  /**
    * Decodes a GetAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetAgentRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetAgentRequest = js.native
  /**
    * Encodes the specified GetAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.GetAgentRequest.verify|verify} messages.
    * @param message GetAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetAgentRequest): Writer = js.native
  def encode(message: IGetAgentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.GetAgentRequest.verify|verify} messages.
    * @param message GetAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetAgentRequest): Writer = js.native
  def encodeDelimited(message: IGetAgentRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetAgentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetAgentRequest = js.native
  /**
    * Creates a plain object from a GetAgentRequest message. Also converts values to other types if specified.
    * @param message GetAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetAgentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

