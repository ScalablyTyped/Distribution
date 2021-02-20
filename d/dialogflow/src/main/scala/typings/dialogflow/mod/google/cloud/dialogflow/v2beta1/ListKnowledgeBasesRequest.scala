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

/** Represents a ListKnowledgeBasesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest")
@js.native
/**
  * Constructs a new ListKnowledgeBasesRequest.
  * @param [properties] Properties to set
  */
class ListKnowledgeBasesRequest () extends IListKnowledgeBasesRequest {
  def this(properties: IListKnowledgeBasesRequest) = this()
  
  /** ListKnowledgeBasesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListKnowledgeBasesRequest: Double = js.native
  
  /** ListKnowledgeBasesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListKnowledgeBasesRequest: String = js.native
  
  /** ListKnowledgeBasesRequest parent. */
  @JSName("parent")
  var parent_ListKnowledgeBasesRequest: String = js.native
  
  /**
    * Converts this ListKnowledgeBasesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListKnowledgeBasesRequest {
  
  /**
    * Creates a new ListKnowledgeBasesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListKnowledgeBasesRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.create")
  @js.native
  def create(): ListKnowledgeBasesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.create")
  @js.native
  def create(properties: IListKnowledgeBasesRequest): ListKnowledgeBasesRequest = js.native
  
  /**
    * Decodes a ListKnowledgeBasesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListKnowledgeBasesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.decode")
  @js.native
  def decode(reader: Reader): ListKnowledgeBasesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListKnowledgeBasesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ListKnowledgeBasesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListKnowledgeBasesRequest = js.native
  
  /**
    * Decodes a ListKnowledgeBasesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListKnowledgeBasesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListKnowledgeBasesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListKnowledgeBasesRequest = js.native
  
  /**
    * Encodes the specified ListKnowledgeBasesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.verify|verify} messages.
    * @param message ListKnowledgeBasesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.encode")
  @js.native
  def encode(message: IListKnowledgeBasesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.encode")
  @js.native
  def encode(message: IListKnowledgeBasesRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListKnowledgeBasesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.verify|verify} messages.
    * @param message ListKnowledgeBasesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListKnowledgeBasesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListKnowledgeBasesRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListKnowledgeBasesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListKnowledgeBasesRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListKnowledgeBasesRequest = js.native
  
  /**
    * Creates a plain object from a ListKnowledgeBasesRequest message. Also converts values to other types if specified.
    * @param message ListKnowledgeBasesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.toObject")
  @js.native
  def toObject(message: ListKnowledgeBasesRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.toObject")
  @js.native
  def toObject(message: ListKnowledgeBasesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListKnowledgeBasesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
