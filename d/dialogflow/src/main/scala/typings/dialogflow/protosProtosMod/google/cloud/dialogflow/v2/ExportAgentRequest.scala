package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ExportAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentRequest")
@js.native
/**
  * Constructs a new ExportAgentRequest.
  * @param [properties] Properties to set
  */
class ExportAgentRequest () extends IExportAgentRequest {
  def this(properties: IExportAgentRequest) = this()
  /** ExportAgentRequest agentUri. */
  @JSName("agentUri")
  var agentUri_ExportAgentRequest: String = js.native
  /** ExportAgentRequest parent. */
  @JSName("parent")
  var parent_ExportAgentRequest: String = js.native
  /**
    * Converts this ExportAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentRequest")
@js.native
object ExportAgentRequest extends js.Object {
  /**
    * Creates a new ExportAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExportAgentRequest instance
    */
  def create(): ExportAgentRequest = js.native
  def create(properties: IExportAgentRequest): ExportAgentRequest = js.native
  /**
    * Decodes an ExportAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ExportAgentRequest = js.native
  def decode(reader: Reader, length: Double): ExportAgentRequest = js.native
  def decode(reader: Uint8Array): ExportAgentRequest = js.native
  def decode(reader: Uint8Array, length: Double): ExportAgentRequest = js.native
  /**
    * Decodes an ExportAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ExportAgentRequest = js.native
  def decodeDelimited(reader: Uint8Array): ExportAgentRequest = js.native
  /**
    * Encodes the specified ExportAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.ExportAgentRequest.verify|verify} messages.
    * @param message ExportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IExportAgentRequest): Writer = js.native
  def encode(message: IExportAgentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ExportAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ExportAgentRequest.verify|verify} messages.
    * @param message ExportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IExportAgentRequest): Writer = js.native
  def encodeDelimited(message: IExportAgentRequest, writer: Writer): Writer = js.native
  /**
    * Creates an ExportAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportAgentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ExportAgentRequest = js.native
  /**
    * Creates a plain object from an ExportAgentRequest message. Also converts values to other types if specified.
    * @param message ExportAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ExportAgentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ExportAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an ExportAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

