package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteAgentRequest")
@js.native
/**
  * Constructs a new DeleteAgentRequest.
  * @param [properties] Properties to set
  */
class DeleteAgentRequest () extends IDeleteAgentRequest {
  def this(properties: IDeleteAgentRequest) = this()
  /** DeleteAgentRequest parent. */
  @JSName("parent")
  var parent_DeleteAgentRequest: String = js.native
  /**
    * Converts this DeleteAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteAgentRequest")
@js.native
object DeleteAgentRequest extends js.Object {
  /**
    * Creates a new DeleteAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteAgentRequest instance
    */
  def create(): DeleteAgentRequest = js.native
  def create(properties: IDeleteAgentRequest): DeleteAgentRequest = js.native
  /**
    * Decodes a DeleteAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteAgentRequest = js.native
  def decode(reader: Reader, length: Double): DeleteAgentRequest = js.native
  def decode(reader: Uint8Array): DeleteAgentRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteAgentRequest = js.native
  /**
    * Decodes a DeleteAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteAgentRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteAgentRequest = js.native
  /**
    * Encodes the specified DeleteAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteAgentRequest.verify|verify} messages.
    * @param message DeleteAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteAgentRequest): Writer = js.native
  def encode(message: IDeleteAgentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteAgentRequest.verify|verify} messages.
    * @param message DeleteAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteAgentRequest): Writer = js.native
  def encodeDelimited(message: IDeleteAgentRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteAgentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteAgentRequest = js.native
  /**
    * Creates a plain object from a DeleteAgentRequest message. Also converts values to other types if specified.
    * @param message DeleteAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteAgentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

