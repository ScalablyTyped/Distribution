package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.agentContent
import typings.dialogflow.dialogflowStrings.agentUri
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RestoreAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest")
@js.native
/**
  * Constructs a new RestoreAgentRequest.
  * @param [properties] Properties to set
  */
class RestoreAgentRequest () extends IRestoreAgentRequest {
  def this(properties: IRestoreAgentRequest) = this()
  /** RestoreAgentRequest agent. */
  var agent: js.UndefOr[agentUri | agentContent] = js.native
  /** RestoreAgentRequest agentContent. */
  @JSName("agentContent")
  var agentContent_RestoreAgentRequest: Uint8Array = js.native
  /** RestoreAgentRequest agentUri. */
  @JSName("agentUri")
  var agentUri_RestoreAgentRequest: String = js.native
  /** RestoreAgentRequest parent. */
  @JSName("parent")
  var parent_RestoreAgentRequest: String = js.native
  /**
    * Converts this RestoreAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.RestoreAgentRequest")
@js.native
object RestoreAgentRequest extends js.Object {
  /**
    * Creates a new RestoreAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RestoreAgentRequest instance
    */
  def create(): RestoreAgentRequest = js.native
  def create(properties: IRestoreAgentRequest): RestoreAgentRequest = js.native
  /**
    * Decodes a RestoreAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RestoreAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RestoreAgentRequest = js.native
  def decode(reader: Reader, length: Double): RestoreAgentRequest = js.native
  def decode(reader: Uint8Array): RestoreAgentRequest = js.native
  def decode(reader: Uint8Array, length: Double): RestoreAgentRequest = js.native
  /**
    * Decodes a RestoreAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RestoreAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RestoreAgentRequest = js.native
  def decodeDelimited(reader: Uint8Array): RestoreAgentRequest = js.native
  /**
    * Encodes the specified RestoreAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.RestoreAgentRequest.verify|verify} messages.
    * @param message RestoreAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRestoreAgentRequest): Writer = js.native
  def encode(message: IRestoreAgentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RestoreAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.RestoreAgentRequest.verify|verify} messages.
    * @param message RestoreAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRestoreAgentRequest): Writer = js.native
  def encodeDelimited(message: IRestoreAgentRequest, writer: Writer): Writer = js.native
  /**
    * Creates a RestoreAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RestoreAgentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): RestoreAgentRequest = js.native
  /**
    * Creates a plain object from a RestoreAgentRequest message. Also converts values to other types if specified.
    * @param message RestoreAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RestoreAgentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: RestoreAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RestoreAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

