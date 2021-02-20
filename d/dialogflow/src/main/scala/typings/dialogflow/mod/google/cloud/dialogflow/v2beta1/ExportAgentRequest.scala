package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExportAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest")
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
object ExportAgentRequest {
  
  /**
    * Creates a new ExportAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExportAgentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.create")
  @js.native
  def create(): ExportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.create")
  @js.native
  def create(properties: IExportAgentRequest): ExportAgentRequest = js.native
  
  /**
    * Decodes an ExportAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.decode")
  @js.native
  def decode(reader: Reader): ExportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ExportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ExportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ExportAgentRequest = js.native
  
  /**
    * Decodes an ExportAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ExportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ExportAgentRequest = js.native
  
  /**
    * Encodes the specified ExportAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ExportAgentRequest.verify|verify} messages.
    * @param message ExportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.encode")
  @js.native
  def encode(message: IExportAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.encode")
  @js.native
  def encode(message: IExportAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ExportAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ExportAgentRequest.verify|verify} messages.
    * @param message ExportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IExportAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IExportAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an ExportAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportAgentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ExportAgentRequest = js.native
  
  /**
    * Creates a plain object from an ExportAgentRequest message. Also converts values to other types if specified.
    * @param message ExportAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.toObject")
  @js.native
  def toObject(message: ExportAgentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.toObject")
  @js.native
  def toObject(message: ExportAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an ExportAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
