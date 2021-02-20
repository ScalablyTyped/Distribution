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

/** Represents an UpdateKnowledgeBaseRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest")
@js.native
/**
  * Constructs a new UpdateKnowledgeBaseRequest.
  * @param [properties] Properties to set
  */
class UpdateKnowledgeBaseRequest () extends IUpdateKnowledgeBaseRequest {
  def this(properties: IUpdateKnowledgeBaseRequest) = this()
  
  /**
    * Converts this UpdateKnowledgeBaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateKnowledgeBaseRequest {
  
  /**
    * Creates a new UpdateKnowledgeBaseRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateKnowledgeBaseRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.create")
  @js.native
  def create(): UpdateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.create")
  @js.native
  def create(properties: IUpdateKnowledgeBaseRequest): UpdateKnowledgeBaseRequest = js.native
  
  /**
    * Decodes an UpdateKnowledgeBaseRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Reader): UpdateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): UpdateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Uint8Array): UpdateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): UpdateKnowledgeBaseRequest = js.native
  
  /**
    * Decodes an UpdateKnowledgeBaseRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateKnowledgeBaseRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): UpdateKnowledgeBaseRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): UpdateKnowledgeBaseRequest = js.native
  
  /**
    * Encodes the specified UpdateKnowledgeBaseRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.verify|verify} messages.
    * @param message UpdateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.encode")
  @js.native
  def encode(message: IUpdateKnowledgeBaseRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.encode")
  @js.native
  def encode(message: IUpdateKnowledgeBaseRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UpdateKnowledgeBaseRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.verify|verify} messages.
    * @param message UpdateKnowledgeBaseRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateKnowledgeBaseRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUpdateKnowledgeBaseRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an UpdateKnowledgeBaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateKnowledgeBaseRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): UpdateKnowledgeBaseRequest = js.native
  
  /**
    * Creates a plain object from an UpdateKnowledgeBaseRequest message. Also converts values to other types if specified.
    * @param message UpdateKnowledgeBaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.toObject")
  @js.native
  def toObject(message: UpdateKnowledgeBaseRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.toObject")
  @js.native
  def toObject(message: UpdateKnowledgeBaseRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UpdateKnowledgeBaseRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
