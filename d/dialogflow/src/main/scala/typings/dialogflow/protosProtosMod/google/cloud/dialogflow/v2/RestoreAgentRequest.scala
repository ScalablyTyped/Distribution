package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.agentContent
import typings.dialogflow.dialogflowStrings.agentUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RestoreAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.RestoreAgentRequest")
@js.native
/**
  * Constructs a new RestoreAgentRequest.
  * @param [properties] Properties to set
  */
open class RestoreAgentRequest ()
  extends StObject
     with IRestoreAgentRequest {
  def this(properties: IRestoreAgentRequest) = this()
  
  /** RestoreAgentRequest agent. */
  var agent: js.UndefOr[agentUri | agentContent] = js.native
  
  /** RestoreAgentRequest agentContent. */
  @JSName("agentContent")
  var agentContent_RestoreAgentRequest: js.typedarray.Uint8Array | String = js.native
  
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
  def toJSON(): StringDictionary[Any] = js.native
}
object RestoreAgentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.RestoreAgentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new RestoreAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RestoreAgentRequest instance
    */
  /* static member */
  inline def create(): RestoreAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RestoreAgentRequest]
  inline def create(properties: IRestoreAgentRequest): RestoreAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RestoreAgentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): RestoreAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreAgentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): RestoreAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RestoreAgentRequest]
  /**
    * Decodes a RestoreAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RestoreAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): RestoreAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreAgentRequest]
  inline def decode(reader: Reader, length: Double): RestoreAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RestoreAgentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): RestoreAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreAgentRequest]
  /**
    * Decodes a RestoreAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RestoreAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): RestoreAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RestoreAgentRequest]
  
  /**
    * Encodes the specified RestoreAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.RestoreAgentRequest.verify|verify} messages.
    * @param message RestoreAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IRestoreAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRestoreAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RestoreAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.RestoreAgentRequest.verify|verify} messages.
    * @param message RestoreAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IRestoreAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRestoreAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RestoreAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RestoreAgentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RestoreAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RestoreAgentRequest]
  
  /**
    * Creates a plain object from a RestoreAgentRequest message. Also converts values to other types if specified.
    * @param message RestoreAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RestoreAgentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RestoreAgentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a RestoreAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
