package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.intentBatchInline
import typings.dialogflow.dialogflowStrings.intentBatchUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchUpdateIntentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest")
@js.native
/**
  * Constructs a new BatchUpdateIntentsRequest.
  * @param [properties] Properties to set
  */
class BatchUpdateIntentsRequest ()
  extends StObject
     with IBatchUpdateIntentsRequest {
  def this(properties: IBatchUpdateIntentsRequest) = this()
  
  /** BatchUpdateIntentsRequest intentBatch. */
  var intentBatch: js.UndefOr[intentBatchUri | intentBatchInline] = js.native
  
  /** BatchUpdateIntentsRequest intentBatchUri. */
  @JSName("intentBatchUri")
  var intentBatchUri_BatchUpdateIntentsRequest: String = js.native
  
  /** BatchUpdateIntentsRequest intentView. */
  @JSName("intentView")
  var intentView_BatchUpdateIntentsRequest: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) = js.native
  
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
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchUpdateIntentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateIntentsRequest instance
    */
  /* static member */
  inline def create(): BatchUpdateIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchUpdateIntentsRequest]
  inline def create(properties: IBatchUpdateIntentsRequest): BatchUpdateIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsRequest]
  
  /**
    * Decodes a BatchUpdateIntentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchUpdateIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsRequest]
  inline def decode(reader: Reader, length: Double): BatchUpdateIntentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateIntentsRequest]
  inline def decode(reader: Uint8Array): BatchUpdateIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsRequest]
  inline def decode(reader: Uint8Array, length: Double): BatchUpdateIntentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateIntentsRequest]
  
  /**
    * Decodes a BatchUpdateIntentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchUpdateIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsRequest]
  inline def decodeDelimited(reader: Uint8Array): BatchUpdateIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsRequest]
  
  /**
    * Encodes the specified BatchUpdateIntentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest.verify|verify} messages.
    * @param message BatchUpdateIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchUpdateIntentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchUpdateIntentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchUpdateIntentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest.verify|verify} messages.
    * @param message BatchUpdateIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchUpdateIntentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchUpdateIntentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchUpdateIntentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateIntentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsRequest]
  
  /**
    * Creates a plain object from a BatchUpdateIntentsRequest message. Also converts values to other types if specified.
    * @param message BatchUpdateIntentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchUpdateIntentsRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: BatchUpdateIntentsRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a BatchUpdateIntentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
