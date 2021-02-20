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

/** Represents an ImportAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest")
@js.native
/**
  * Constructs a new ImportAgentRequest.
  * @param [properties] Properties to set
  */
class ImportAgentRequest () extends IImportAgentRequest {
  def this(properties: IImportAgentRequest) = this()
  
  /** ImportAgentRequest agent. */
  var agent: js.UndefOr[agentUri | agentContent] = js.native
  
  /** ImportAgentRequest agentContent. */
  @JSName("agentContent")
  var agentContent_ImportAgentRequest: Uint8Array | String = js.native
  
  /** ImportAgentRequest agentUri. */
  @JSName("agentUri")
  var agentUri_ImportAgentRequest: String = js.native
  
  /** ImportAgentRequest parent. */
  @JSName("parent")
  var parent_ImportAgentRequest: String = js.native
  
  /**
    * Converts this ImportAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ImportAgentRequest {
  
  /**
    * Creates a new ImportAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ImportAgentRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.create")
  @js.native
  def create(): ImportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.create")
  @js.native
  def create(properties: IImportAgentRequest): ImportAgentRequest = js.native
  
  /**
    * Decodes an ImportAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ImportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.decode")
  @js.native
  def decode(reader: Reader): ImportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ImportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ImportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ImportAgentRequest = js.native
  
  /**
    * Decodes an ImportAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ImportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ImportAgentRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ImportAgentRequest = js.native
  
  /**
    * Encodes the specified ImportAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.ImportAgentRequest.verify|verify} messages.
    * @param message ImportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.encode")
  @js.native
  def encode(message: IImportAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.encode")
  @js.native
  def encode(message: IImportAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ImportAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ImportAgentRequest.verify|verify} messages.
    * @param message ImportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IImportAgentRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IImportAgentRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an ImportAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ImportAgentRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ImportAgentRequest = js.native
  
  /**
    * Creates a plain object from an ImportAgentRequest message. Also converts values to other types if specified.
    * @param message ImportAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.toObject")
  @js.native
  def toObject(message: ImportAgentRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.toObject")
  @js.native
  def toObject(message: ImportAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an ImportAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ImportAgentRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
