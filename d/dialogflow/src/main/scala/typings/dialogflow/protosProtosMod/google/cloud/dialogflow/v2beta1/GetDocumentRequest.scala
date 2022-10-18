package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest")
@js.native
/**
  * Constructs a new GetDocumentRequest.
  * @param [properties] Properties to set
  */
open class GetDocumentRequest ()
  extends StObject
     with IGetDocumentRequest {
  def this(properties: IGetDocumentRequest) = this()
  
  /** GetDocumentRequest name. */
  @JSName("name")
  var name_GetDocumentRequest: String = js.native
  
  /**
    * Converts this GetDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetDocumentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetDocumentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetDocumentRequest instance
    */
  /* static member */
  inline def create(): GetDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetDocumentRequest]
  inline def create(properties: IGetDocumentRequest): GetDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetDocumentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): GetDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetDocumentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetDocumentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetDocumentRequest]
  /**
    * Decodes a GetDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetDocumentRequest]
  inline def decode(reader: Reader, length: Double): GetDocumentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetDocumentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetDocumentRequest]
  /**
    * Decodes a GetDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetDocumentRequest]
  
  /**
    * Encodes the specified GetDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetDocumentRequest.verify|verify} messages.
    * @param message GetDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetDocumentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetDocumentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetDocumentRequest.verify|verify} messages.
    * @param message GetDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetDocumentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetDocumentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetDocumentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetDocumentRequest]
  
  /**
    * Creates a plain object from a GetDocumentRequest message. Also converts values to other types if specified.
    * @param message GetDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetDocumentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetDocumentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GetDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
