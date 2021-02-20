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

/** Represents a DeleteKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new DeleteKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
class DeleteKnowledgeBaseRequest () extends IDeleteKnowledgeBaseRequest {
  def this(properties: IDeleteKnowledgeBaseRequest) = this()
  
  /** DeleteKnowledgeBaseRequest force. */
  @JSName("force")
  var force_DeleteKnowledgeBaseRequest: Boolean = js.native
  
  /** DeleteKnowledgeBaseRequest name. */
  @JSName("name")
  var name_DeleteKnowledgeBaseRequest: String = js.native
  
  /**
    * Converts this DeleteKnowledgeBaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteKnowledgeBaseRequest {
  
  /**
    * Creates a new DeleteKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteKnowledgeBaseRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.create")
  @js.native
  def create(): DeleteKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.create")
  @js.native
  def create(properties: IDeleteKnowledgeBaseRequest): DeleteKnowledgeBaseRequest = js.native
  
  /**
    * Decodes a DeleteKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Uint8Array): DeleteKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DeleteKnowledgeBaseRequest = js.native
  
  /**
    * Decodes a DeleteKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DeleteKnowledgeBaseRequest = js.native
  
  /**
    * Encodes the specified DeleteKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.verify|verify} messages.
    * @param message DeleteKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.encode")
  @js.native
  def encode(message: IDeleteKnowledgeBaseRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.encode")
  @js.native
  def encode(message: IDeleteKnowledgeBaseRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.verify|verify} messages.
    * @param message DeleteKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteKnowledgeBaseRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteKnowledgeBaseRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteKnowledgeBaseRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteKnowledgeBaseRequest = js.native
  
  /**
    * Creates a plain object from a DeleteKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message DeleteKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.toObject")
  @js.native
  def toObject(message: DeleteKnowledgeBaseRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.toObject")
  @js.native
  def toObject(message: DeleteKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
