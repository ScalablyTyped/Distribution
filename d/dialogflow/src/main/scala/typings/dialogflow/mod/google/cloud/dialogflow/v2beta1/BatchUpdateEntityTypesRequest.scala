package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.entityTypeBatchInline
import typings.dialogflow.dialogflowStrings.entityTypeBatchUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchUpdateEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest")
@js.native
/**
  * Constructs a new BatchUpdateEntityTypesRequest.
  * @param [properties] Properties to set
  */
class BatchUpdateEntityTypesRequest () extends IBatchUpdateEntityTypesRequest {
  def this(properties: IBatchUpdateEntityTypesRequest) = this()
  
  /** BatchUpdateEntityTypesRequest entityTypeBatch. */
  var entityTypeBatch: js.UndefOr[entityTypeBatchUri | entityTypeBatchInline] = js.native
  
  /** BatchUpdateEntityTypesRequest entityTypeBatchUri. */
  @JSName("entityTypeBatchUri")
  var entityTypeBatchUri_BatchUpdateEntityTypesRequest: String = js.native
  
  /** BatchUpdateEntityTypesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchUpdateEntityTypesRequest: String = js.native
  
  /** BatchUpdateEntityTypesRequest parent. */
  @JSName("parent")
  var parent_BatchUpdateEntityTypesRequest: String = js.native
  
  /**
    * Converts this BatchUpdateEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BatchUpdateEntityTypesRequest {
  
  /**
    * Creates a new BatchUpdateEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateEntityTypesRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.create")
  @js.native
  def create(): BatchUpdateEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.create")
  @js.native
  def create(properties: IBatchUpdateEntityTypesRequest): BatchUpdateEntityTypesRequest = js.native
  
  /**
    * Decodes a BatchUpdateEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.decode")
  @js.native
  def decode(reader: Reader): BatchUpdateEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): BatchUpdateEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.decode")
  @js.native
  def decode(reader: Uint8Array): BatchUpdateEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): BatchUpdateEntityTypesRequest = js.native
  
  /**
    * Decodes a BatchUpdateEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): BatchUpdateEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): BatchUpdateEntityTypesRequest = js.native
  
  /**
    * Encodes the specified BatchUpdateEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.verify|verify} messages.
    * @param message BatchUpdateEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.encode")
  @js.native
  def encode(message: IBatchUpdateEntityTypesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.encode")
  @js.native
  def encode(message: IBatchUpdateEntityTypesRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BatchUpdateEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.verify|verify} messages.
    * @param message BatchUpdateEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchUpdateEntityTypesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchUpdateEntityTypesRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a BatchUpdateEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateEntityTypesRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateEntityTypesRequest = js.native
  
  /**
    * Creates a plain object from a BatchUpdateEntityTypesRequest message. Also converts values to other types if specified.
    * @param message BatchUpdateEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.toObject")
  @js.native
  def toObject(message: BatchUpdateEntityTypesRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.toObject")
  @js.native
  def toObject(message: BatchUpdateEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BatchUpdateEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
