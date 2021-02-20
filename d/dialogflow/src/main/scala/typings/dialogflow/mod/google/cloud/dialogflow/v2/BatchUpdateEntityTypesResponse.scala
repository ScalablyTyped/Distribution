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

/** Represents a BatchUpdateEntityTypesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse")
@js.native
/**
  * Constructs a new BatchUpdateEntityTypesResponse.
  * @param [properties] Properties to set
  */
class BatchUpdateEntityTypesResponse () extends IBatchUpdateEntityTypesResponse {
  def this(properties: IBatchUpdateEntityTypesResponse) = this()
  
  /** BatchUpdateEntityTypesResponse entityTypes. */
  @JSName("entityTypes")
  var entityTypes_BatchUpdateEntityTypesResponse: js.Array[IEntityType] = js.native
  
  /**
    * Converts this BatchUpdateEntityTypesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BatchUpdateEntityTypesResponse {
  
  /**
    * Creates a new BatchUpdateEntityTypesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateEntityTypesResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.create")
  @js.native
  def create(): BatchUpdateEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.create")
  @js.native
  def create(properties: IBatchUpdateEntityTypesResponse): BatchUpdateEntityTypesResponse = js.native
  
  /**
    * Decodes a BatchUpdateEntityTypesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.decode")
  @js.native
  def decode(reader: Reader): BatchUpdateEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): BatchUpdateEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.decode")
  @js.native
  def decode(reader: Uint8Array): BatchUpdateEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): BatchUpdateEntityTypesResponse = js.native
  
  /**
    * Decodes a BatchUpdateEntityTypesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): BatchUpdateEntityTypesResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): BatchUpdateEntityTypesResponse = js.native
  
  /**
    * Encodes the specified BatchUpdateEntityTypesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.verify|verify} messages.
    * @param message BatchUpdateEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.encode")
  @js.native
  def encode(message: IBatchUpdateEntityTypesResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.encode")
  @js.native
  def encode(message: IBatchUpdateEntityTypesResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BatchUpdateEntityTypesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.verify|verify} messages.
    * @param message BatchUpdateEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchUpdateEntityTypesResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchUpdateEntityTypesResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a BatchUpdateEntityTypesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateEntityTypesResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateEntityTypesResponse = js.native
  
  /**
    * Creates a plain object from a BatchUpdateEntityTypesResponse message. Also converts values to other types if specified.
    * @param message BatchUpdateEntityTypesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.toObject")
  @js.native
  def toObject(message: BatchUpdateEntityTypesResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.toObject")
  @js.native
  def toObject(message: BatchUpdateEntityTypesResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BatchUpdateEntityTypesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
