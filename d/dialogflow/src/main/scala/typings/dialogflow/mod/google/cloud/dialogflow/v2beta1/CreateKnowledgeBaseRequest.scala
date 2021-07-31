package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new CreateKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
class CreateKnowledgeBaseRequest ()
  extends StObject
     with ICreateKnowledgeBaseRequest {
  def this(properties: ICreateKnowledgeBaseRequest) = this()
  
  /** CreateKnowledgeBaseRequest parent. */
  @JSName("parent")
  var parent_CreateKnowledgeBaseRequest: String = js.native
  
  /**
    * Converts this CreateKnowledgeBaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateKnowledgeBaseRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CreateKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateKnowledgeBaseRequest instance
    */
  /* static member */
  @scala.inline
  def create(): CreateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateKnowledgeBaseRequest]
  @scala.inline
  def create(properties: ICreateKnowledgeBaseRequest): CreateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CreateKnowledgeBaseRequest]
  
  /**
    * Decodes a CreateKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): CreateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): CreateKnowledgeBaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Uint8Array): CreateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateKnowledgeBaseRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): CreateKnowledgeBaseRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CreateKnowledgeBaseRequest]
  
  /**
    * Decodes a CreateKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): CreateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateKnowledgeBaseRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): CreateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CreateKnowledgeBaseRequest]
  
  /**
    * Encodes the specified CreateKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.verify|verify} messages.
    * @param message CreateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ICreateKnowledgeBaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ICreateKnowledgeBaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CreateKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.verify|verify} messages.
    * @param message CreateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ICreateKnowledgeBaseRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ICreateKnowledgeBaseRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CreateKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateKnowledgeBaseRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): CreateKnowledgeBaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateKnowledgeBaseRequest]
  
  /**
    * Creates a plain object from a CreateKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message CreateKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: CreateKnowledgeBaseRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: CreateKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a CreateKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
