package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetValidationResultRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest")
@js.native
/**
  * Constructs a new GetValidationResultRequest.
  * @param [properties] Properties to set
  */
open class GetValidationResultRequest ()
  extends StObject
     with IGetValidationResultRequest {
  def this(properties: IGetValidationResultRequest) = this()
  
  /** GetValidationResultRequest languageCode. */
  @JSName("languageCode")
  var languageCode_GetValidationResultRequest: String = js.native
  
  /** GetValidationResultRequest parent. */
  @JSName("parent")
  var parent_GetValidationResultRequest: String = js.native
  
  /**
    * Converts this GetValidationResultRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetValidationResultRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetValidationResultRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetValidationResultRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetValidationResultRequest instance
    */
  /* static member */
  inline def create(): GetValidationResultRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetValidationResultRequest]
  inline def create(properties: IGetValidationResultRequest): GetValidationResultRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetValidationResultRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): GetValidationResultRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetValidationResultRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetValidationResultRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetValidationResultRequest]
  /**
    * Decodes a GetValidationResultRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetValidationResultRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetValidationResultRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetValidationResultRequest]
  inline def decode(reader: Reader, length: Double): GetValidationResultRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetValidationResultRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetValidationResultRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetValidationResultRequest]
  /**
    * Decodes a GetValidationResultRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetValidationResultRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetValidationResultRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetValidationResultRequest]
  
  /**
    * Encodes the specified GetValidationResultRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetValidationResultRequest.verify|verify} messages.
    * @param message GetValidationResultRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetValidationResultRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetValidationResultRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetValidationResultRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetValidationResultRequest.verify|verify} messages.
    * @param message GetValidationResultRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetValidationResultRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetValidationResultRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetValidationResultRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetValidationResultRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetValidationResultRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetValidationResultRequest]
  
  /**
    * Creates a plain object from a GetValidationResultRequest message. Also converts values to other types if specified.
    * @param message GetValidationResultRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetValidationResultRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetValidationResultRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GetValidationResultRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
