package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExportAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentRequest")
@js.native
/**
  * Constructs a new ExportAgentRequest.
  * @param [properties] Properties to set
  */
open class ExportAgentRequest ()
  extends StObject
     with IExportAgentRequest {
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
  def toJSON(): StringDictionary[Any] = js.native
}
object ExportAgentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ExportAgentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ExportAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExportAgentRequest instance
    */
  /* static member */
  inline def create(): ExportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ExportAgentRequest]
  inline def create(properties: IExportAgentRequest): ExportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ExportAgentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ExportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExportAgentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ExportAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExportAgentRequest]
  /**
    * Decodes an ExportAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ExportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExportAgentRequest]
  inline def decode(reader: Reader, length: Double): ExportAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExportAgentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ExportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExportAgentRequest]
  /**
    * Decodes an ExportAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExportAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ExportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExportAgentRequest]
  
  /**
    * Encodes the specified ExportAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.ExportAgentRequest.verify|verify} messages.
    * @param message ExportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IExportAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IExportAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ExportAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ExportAgentRequest.verify|verify} messages.
    * @param message ExportAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IExportAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IExportAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an ExportAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportAgentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ExportAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExportAgentRequest]
  
  /**
    * Creates a plain object from an ExportAgentRequest message. Also converts values to other types if specified.
    * @param message ExportAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ExportAgentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ExportAgentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an ExportAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
