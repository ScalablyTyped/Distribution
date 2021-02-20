package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchDeleteEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest")
@js.native
/**
  * Constructs a new BatchDeleteEntityTypesRequest.
  * @param [properties] Properties to set
  */
class BatchDeleteEntityTypesRequest () extends IBatchDeleteEntityTypesRequest {
  def this(properties: IBatchDeleteEntityTypesRequest) = this()
  
  /** BatchDeleteEntityTypesRequest entityTypeNames. */
  @JSName("entityTypeNames")
  var entityTypeNames_BatchDeleteEntityTypesRequest: js.Array[String] = js.native
  
  /** BatchDeleteEntityTypesRequest parent. */
  @JSName("parent")
  var parent_BatchDeleteEntityTypesRequest: String = js.native
  
  /**
    * Converts this BatchDeleteEntityTypesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BatchDeleteEntityTypesRequest {
  
  /**
    * Creates a new BatchDeleteEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchDeleteEntityTypesRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.create")
  @js.native
  def create(): BatchDeleteEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.create")
  @js.native
  def create(properties: IBatchDeleteEntityTypesRequest): BatchDeleteEntityTypesRequest = js.native
  
  /**
    * Decodes a BatchDeleteEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchDeleteEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.decode")
  @js.native
  def decode(reader: Reader): BatchDeleteEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): BatchDeleteEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.decode")
  @js.native
  def decode(reader: Uint8Array): BatchDeleteEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): BatchDeleteEntityTypesRequest = js.native
  
  /**
    * Decodes a BatchDeleteEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchDeleteEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): BatchDeleteEntityTypesRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): BatchDeleteEntityTypesRequest = js.native
  
  /**
    * Encodes the specified BatchDeleteEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.verify|verify} messages.
    * @param message BatchDeleteEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.encode")
  @js.native
  def encode(message: IBatchDeleteEntityTypesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.encode")
  @js.native
  def encode(message: IBatchDeleteEntityTypesRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BatchDeleteEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.verify|verify} messages.
    * @param message BatchDeleteEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchDeleteEntityTypesRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchDeleteEntityTypesRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a BatchDeleteEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchDeleteEntityTypesRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): BatchDeleteEntityTypesRequest = js.native
  
  /**
    * Creates a plain object from a BatchDeleteEntityTypesRequest message. Also converts values to other types if specified.
    * @param message BatchDeleteEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.toObject")
  @js.native
  def toObject(message: BatchDeleteEntityTypesRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.toObject")
  @js.native
  def toObject(message: BatchDeleteEntityTypesRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BatchDeleteEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
