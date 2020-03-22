package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.agentContent
import typings.dialogflow.dialogflowStrings.agentUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ExportAgentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentResponse")
@js.native
/**
  * Constructs a new ExportAgentResponse.
  * @param [properties] Properties to set
  */
class ExportAgentResponse () extends IExportAgentResponse {
  def this(properties: IExportAgentResponse) = this()
  /** ExportAgentResponse agent. */
  var agent: js.UndefOr[agentUri | agentContent] = js.native
  /** ExportAgentResponse agentContent. */
  @JSName("agentContent")
  var agentContent_ExportAgentResponse: Uint8Array | String = js.native
  /** ExportAgentResponse agentUri. */
  @JSName("agentUri")
  var agentUri_ExportAgentResponse: String = js.native
  /**
    * Converts this ExportAgentResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentResponse")
@js.native
object ExportAgentResponse extends js.Object {
  /**
    * Creates a new ExportAgentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExportAgentResponse instance
    */
  def create(): ExportAgentResponse = js.native
  def create(properties: IExportAgentResponse): ExportAgentResponse = js.native
  /**
    * Decodes an ExportAgentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExportAgentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ExportAgentResponse = js.native
  def decode(reader: Reader, length: Double): ExportAgentResponse = js.native
  def decode(reader: Uint8Array): ExportAgentResponse = js.native
  def decode(reader: Uint8Array, length: Double): ExportAgentResponse = js.native
  /**
    * Decodes an ExportAgentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExportAgentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ExportAgentResponse = js.native
  def decodeDelimited(reader: Uint8Array): ExportAgentResponse = js.native
  /**
    * Encodes the specified ExportAgentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ExportAgentResponse.verify|verify} messages.
    * @param message ExportAgentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IExportAgentResponse): Writer = js.native
  def encode(message: IExportAgentResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ExportAgentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ExportAgentResponse.verify|verify} messages.
    * @param message ExportAgentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IExportAgentResponse): Writer = js.native
  def encodeDelimited(message: IExportAgentResponse, writer: Writer): Writer = js.native
  /**
    * Creates an ExportAgentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportAgentResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ExportAgentResponse = js.native
  /**
    * Creates a plain object from an ExportAgentResponse message. Also converts values to other types if specified.
    * @param message ExportAgentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ExportAgentResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ExportAgentResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an ExportAgentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

