package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.agentContent
import typings.dialogflow.dialogflowStrings.agentUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExportAgentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentResponse")
@js.native
/**
  * Constructs a new ExportAgentResponse.
  * @param [properties] Properties to set
  */
open class ExportAgentResponse ()
  extends StObject
     with IExportAgentResponse {
  def this(properties: IExportAgentResponse) = this()
  
  /** ExportAgentResponse agent. */
  var agent: js.UndefOr[agentUri | agentContent] = js.native
  
  /** ExportAgentResponse agentContent. */
  @JSName("agentContent")
  var agentContent_ExportAgentResponse: js.typedarray.Uint8Array | String = js.native
  
  /** ExportAgentResponse agentUri. */
  @JSName("agentUri")
  var agentUri_ExportAgentResponse: String = js.native
  
  /**
    * Converts this ExportAgentResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ExportAgentResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ExportAgentResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ExportAgentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExportAgentResponse instance
    */
  /* static member */
  inline def create(): ExportAgentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ExportAgentResponse]
  inline def create(properties: IExportAgentResponse): ExportAgentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ExportAgentResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ExportAgentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExportAgentResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ExportAgentResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExportAgentResponse]
  /**
    * Decodes an ExportAgentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExportAgentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ExportAgentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExportAgentResponse]
  inline def decode(reader: Reader, length: Double): ExportAgentResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExportAgentResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ExportAgentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExportAgentResponse]
  /**
    * Decodes an ExportAgentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExportAgentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ExportAgentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExportAgentResponse]
  
  /**
    * Encodes the specified ExportAgentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ExportAgentResponse.verify|verify} messages.
    * @param message ExportAgentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IExportAgentResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IExportAgentResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ExportAgentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ExportAgentResponse.verify|verify} messages.
    * @param message ExportAgentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IExportAgentResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IExportAgentResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an ExportAgentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportAgentResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ExportAgentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExportAgentResponse]
  
  /**
    * Creates a plain object from an ExportAgentResponse message. Also converts values to other types if specified.
    * @param message ExportAgentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ExportAgentResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ExportAgentResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an ExportAgentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
