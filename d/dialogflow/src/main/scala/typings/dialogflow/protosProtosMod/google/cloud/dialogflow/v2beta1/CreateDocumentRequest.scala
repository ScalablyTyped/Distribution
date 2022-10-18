package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest")
@js.native
/**
  * Constructs a new CreateDocumentRequest.
  * @param [properties] Properties to set
  */
open class CreateDocumentRequest ()
  extends StObject
     with ICreateDocumentRequest {
  def this(properties: ICreateDocumentRequest) = this()
  
  /** CreateDocumentRequest parent. */
  @JSName("parent")
  var parent_CreateDocumentRequest: String = js.native
  
  /**
    * Converts this CreateDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateDocumentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateDocumentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateDocumentRequest instance
    */
  /* static member */
  inline def create(): CreateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateDocumentRequest]
  inline def create(properties: ICreateDocumentRequest): CreateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateDocumentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): CreateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDocumentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CreateDocumentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateDocumentRequest]
  /**
    * Decodes a CreateDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CreateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDocumentRequest]
  inline def decode(reader: Reader, length: Double): CreateDocumentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateDocumentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CreateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDocumentRequest]
  /**
    * Decodes a CreateDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CreateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateDocumentRequest]
  
  /**
    * Encodes the specified CreateDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateDocumentRequest.verify|verify} messages.
    * @param message CreateDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICreateDocumentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICreateDocumentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateDocumentRequest.verify|verify} messages.
    * @param message CreateDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICreateDocumentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICreateDocumentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateDocumentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateDocumentRequest]
  
  /**
    * Creates a plain object from a CreateDocumentRequest message. Also converts values to other types if specified.
    * @param message CreateDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateDocumentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateDocumentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CreateDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
