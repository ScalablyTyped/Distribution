package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.intentBatchInline
import typings.dialogflow.dialogflowStrings.intentBatchUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchUpdateIntentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest")
@js.native
/**
  * Constructs a new BatchUpdateIntentsRequest.
  * @param [properties] Properties to set
  */
class BatchUpdateIntentsRequest () extends IBatchUpdateIntentsRequest {
  def this(properties: IBatchUpdateIntentsRequest) = this()
  
  /** BatchUpdateIntentsRequest intentBatch. */
  var intentBatch: js.UndefOr[intentBatchUri | intentBatchInline] = js.native
  
  /** BatchUpdateIntentsRequest intentBatchUri. */
  @JSName("intentBatchUri")
  var intentBatchUri_BatchUpdateIntentsRequest: String = js.native
  
  /** BatchUpdateIntentsRequest intentView. */
  @JSName("intentView")
  var intentView_BatchUpdateIntentsRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) = js.native
  
  /** BatchUpdateIntentsRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchUpdateIntentsRequest: String = js.native
  
  /** BatchUpdateIntentsRequest parent. */
  @JSName("parent")
  var parent_BatchUpdateIntentsRequest: String = js.native
  
  /**
    * Converts this BatchUpdateIntentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BatchUpdateIntentsRequest {
  
  /**
    * Creates a new BatchUpdateIntentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateIntentsRequest instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.create")
  @js.native
  def create(): BatchUpdateIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.create")
  @js.native
  def create(properties: IBatchUpdateIntentsRequest): BatchUpdateIntentsRequest = js.native
  
  /**
    * Decodes a BatchUpdateIntentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.decode")
  @js.native
  def decode(reader: Reader): BatchUpdateIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): BatchUpdateIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.decode")
  @js.native
  def decode(reader: Uint8Array): BatchUpdateIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): BatchUpdateIntentsRequest = js.native
  
  /**
    * Decodes a BatchUpdateIntentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): BatchUpdateIntentsRequest = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): BatchUpdateIntentsRequest = js.native
  
  /**
    * Encodes the specified BatchUpdateIntentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.verify|verify} messages.
    * @param message BatchUpdateIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.encode")
  @js.native
  def encode(message: IBatchUpdateIntentsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.encode")
  @js.native
  def encode(message: IBatchUpdateIntentsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BatchUpdateIntentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.verify|verify} messages.
    * @param message BatchUpdateIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchUpdateIntentsRequest): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBatchUpdateIntentsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a BatchUpdateIntentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateIntentsRequest
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateIntentsRequest = js.native
  
  /**
    * Creates a plain object from a BatchUpdateIntentsRequest message. Also converts values to other types if specified.
    * @param message BatchUpdateIntentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.toObject")
  @js.native
  def toObject(message: BatchUpdateIntentsRequest): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.toObject")
  @js.native
  def toObject(message: BatchUpdateIntentsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BatchUpdateIntentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
