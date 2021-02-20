package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new CreateKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
class CreateKnowledgeBaseRequest () extends ICreateKnowledgeBaseRequest {
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
  
  /**
    * Creates a new CreateKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateKnowledgeBaseRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.create")
  @js.native
  def create(): CreateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.create")
  @js.native
  def create(properties: ICreateKnowledgeBaseRequest): CreateKnowledgeBaseRequest = js.native
  
  /**
    * Decodes a CreateKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Reader): CreateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): CreateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Uint8Array): CreateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): CreateKnowledgeBaseRequest = js.native
  
  /**
    * Decodes a CreateKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CreateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): CreateKnowledgeBaseRequest = js.native
  
  /**
    * Encodes the specified CreateKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.verify|verify} messages.
    * @param message CreateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.encode")
  @js.native
  def encode(message: ICreateKnowledgeBaseRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.encode")
  @js.native
  def encode(message: ICreateKnowledgeBaseRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CreateKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.verify|verify} messages.
    * @param message CreateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateKnowledgeBaseRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateKnowledgeBaseRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a CreateKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateKnowledgeBaseRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CreateKnowledgeBaseRequest = js.native
  
  /**
    * Creates a plain object from a CreateKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message CreateKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.toObject")
  @js.native
  def toObject(message: CreateKnowledgeBaseRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.toObject")
  @js.native
  def toObject(message: CreateKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CreateKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
