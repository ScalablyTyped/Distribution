package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetAgentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetAgentRequest")
@js.native
/**
  * Constructs a new GetAgentRequest.
  * @param [properties] Properties to set
  */
open class GetAgentRequest ()
  extends StObject
     with IGetAgentRequest {
  def this(properties: IGetAgentRequest) = this()
  
  /** GetAgentRequest parent. */
  @JSName("parent")
  var parent_GetAgentRequest: String = js.native
  
  /**
    * Converts this GetAgentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetAgentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.GetAgentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetAgentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetAgentRequest instance
    */
  /* static member */
  inline def create(): GetAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetAgentRequest]
  inline def create(properties: IGetAgentRequest): GetAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetAgentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): GetAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetAgentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetAgentRequest]
  /**
    * Decodes a GetAgentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetAgentRequest]
  inline def decode(reader: Reader, length: Double): GetAgentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetAgentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetAgentRequest]
  /**
    * Decodes a GetAgentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetAgentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetAgentRequest]
  
  /**
    * Encodes the specified GetAgentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.GetAgentRequest.verify|verify} messages.
    * @param message GetAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetAgentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.GetAgentRequest.verify|verify} messages.
    * @param message GetAgentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetAgentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetAgentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetAgentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetAgentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetAgentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetAgentRequest]
  
  /**
    * Creates a plain object from a GetAgentRequest message. Also converts values to other types if specified.
    * @param message GetAgentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetAgentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetAgentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GetAgentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
