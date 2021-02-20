package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.agentContent
import typings.dialogflow.dialogflowStrings.agentUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExportAgentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse")
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
object ExportAgentResponse {
  
  /**
    * Creates a new ExportAgentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExportAgentResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.create")
  @js.native
  def create(): ExportAgentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.create")
  @js.native
  def create(properties: IExportAgentResponse): ExportAgentResponse = js.native
  
  /**
    * Decodes an ExportAgentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExportAgentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.decode")
  @js.native
  def decode(reader: Reader): ExportAgentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ExportAgentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ExportAgentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ExportAgentResponse = js.native
  
  /**
    * Decodes an ExportAgentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExportAgentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ExportAgentResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ExportAgentResponse = js.native
  
  /**
    * Encodes the specified ExportAgentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.ExportAgentResponse.verify|verify} messages.
    * @param message ExportAgentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.encode")
  @js.native
  def encode(message: IExportAgentResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.encode")
  @js.native
  def encode(message: IExportAgentResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ExportAgentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ExportAgentResponse.verify|verify} messages.
    * @param message ExportAgentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IExportAgentResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IExportAgentResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates an ExportAgentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportAgentResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ExportAgentResponse = js.native
  
  /**
    * Creates a plain object from an ExportAgentResponse message. Also converts values to other types if specified.
    * @param message ExportAgentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.toObject")
  @js.native
  def toObject(message: ExportAgentResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.toObject")
  @js.native
  def toObject(message: ExportAgentResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an ExportAgentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
