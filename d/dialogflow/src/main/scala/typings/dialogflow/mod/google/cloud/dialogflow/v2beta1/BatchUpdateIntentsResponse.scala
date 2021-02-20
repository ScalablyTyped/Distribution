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

/** Represents a BatchUpdateIntentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse")
@js.native
/**
  * Constructs a new BatchUpdateIntentsResponse.
  * @param [properties] Properties to set
  */
class BatchUpdateIntentsResponse () extends IBatchUpdateIntentsResponse {
  def this(properties: IBatchUpdateIntentsResponse) = this()
  
  /** BatchUpdateIntentsResponse intents. */
  @JSName("intents")
  var intents_BatchUpdateIntentsResponse: js.Array[IIntent] = js.native
  
  /**
    * Converts this BatchUpdateIntentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BatchUpdateIntentsResponse {
  
  /**
    * Creates a new BatchUpdateIntentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateIntentsResponse instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.create")
  @js.native
  def create(): BatchUpdateIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.create")
  @js.native
  def create(properties: IBatchUpdateIntentsResponse): BatchUpdateIntentsResponse = js.native
  
  /**
    * Decodes a BatchUpdateIntentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.decode")
  @js.native
  def decode(reader: Reader): BatchUpdateIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): BatchUpdateIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.decode")
  @js.native
  def decode(reader: Uint8Array): BatchUpdateIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): BatchUpdateIntentsResponse = js.native
  
  /**
    * Decodes a BatchUpdateIntentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): BatchUpdateIntentsResponse = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): BatchUpdateIntentsResponse = js.native
  
  /**
    * Encodes the specified BatchUpdateIntentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.verify|verify} messages.
    * @param message BatchUpdateIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.encode")
  @js.native
  def encode(message: IBatchUpdateIntentsResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.encode")
  @js.native
  def encode(message: IBatchUpdateIntentsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BatchUpdateIntentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.verify|verify} messages.
    * @param message BatchUpdateIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchUpdateIntentsResponse): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchUpdateIntentsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a BatchUpdateIntentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateIntentsResponse
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateIntentsResponse = js.native
  
  /**
    * Creates a plain object from a BatchUpdateIntentsResponse message. Also converts values to other types if specified.
    * @param message BatchUpdateIntentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.toObject")
  @js.native
  def toObject(message: BatchUpdateIntentsResponse): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.toObject")
  @js.native
  def toObject(message: BatchUpdateIntentsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BatchUpdateIntentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
