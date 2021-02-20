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

/** Represents a GetKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new GetKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
class GetKnowledgeBaseRequest () extends IGetKnowledgeBaseRequest {
  def this(properties: IGetKnowledgeBaseRequest) = this()
  
  /** GetKnowledgeBaseRequest name. */
  @JSName("name")
  var name_GetKnowledgeBaseRequest: String = js.native
  
  /**
    * Converts this GetKnowledgeBaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GetKnowledgeBaseRequest {
  
  /**
    * Creates a new GetKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetKnowledgeBaseRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.create")
  @js.native
  def create(): GetKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.create")
  @js.native
  def create(properties: IGetKnowledgeBaseRequest): GetKnowledgeBaseRequest = js.native
  
  /**
    * Decodes a GetKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Reader): GetKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Uint8Array): GetKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GetKnowledgeBaseRequest = js.native
  
  /**
    * Decodes a GetKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GetKnowledgeBaseRequest = js.native
  
  /**
    * Encodes the specified GetKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.verify|verify} messages.
    * @param message GetKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.encode")
  @js.native
  def encode(message: IGetKnowledgeBaseRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.encode")
  @js.native
  def encode(message: IGetKnowledgeBaseRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.verify|verify} messages.
    * @param message GetKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetKnowledgeBaseRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetKnowledgeBaseRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetKnowledgeBaseRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetKnowledgeBaseRequest = js.native
  
  /**
    * Creates a plain object from a GetKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message GetKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.toObject")
  @js.native
  def toObject(message: GetKnowledgeBaseRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.toObject")
  @js.native
  def toObject(message: GetKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
