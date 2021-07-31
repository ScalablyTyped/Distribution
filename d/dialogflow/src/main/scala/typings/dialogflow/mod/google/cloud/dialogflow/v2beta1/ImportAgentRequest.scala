package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.agentContent
import typings.dialogflow.dialogflowStrings.agentUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ImportAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ImportAgentRequest")
@js.native
/**
  * Constructs a new ImportAgentRequest.
  * @param [properties] Properties to set
  */
class ImportAgentRequest ()
  extends StObject
     with IImportAgentRequest {
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
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ImportAgentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ImportAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ImportAgentRequest instance
    */
  /* static member */
  @scala.inline
  def create(): ImportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ImportAgentRequest]
  @scala.inline
  def create(properties: IImportAgentRequest): ImportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ImportAgentRequest]
  
  /**
    * Decodes an ImportAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ImportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): ImportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ImportAgentRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ImportAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ImportAgentRequest]
  @scala.inline
  def decode(reader: Uint8Array): ImportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ImportAgentRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ImportAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ImportAgentRequest]
  
  /**
    * Decodes an ImportAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ImportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): ImportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ImportAgentRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ImportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ImportAgentRequest]
  
  /**
    * Encodes the specified ImportAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ImportAgentRequest.verify|verify} messages.
    * @param message ImportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IImportAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IImportAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ImportAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ImportAgentRequest.verify|verify} messages.
    * @param message ImportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IImportAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IImportAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an ImportAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ImportAgentRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ImportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ImportAgentRequest]
  
  /**
    * Creates a plain object from an ImportAgentRequest message. Also converts values to other types if specified.
    * @param message ImportAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: ImportAgentRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ImportAgentRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an ImportAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
