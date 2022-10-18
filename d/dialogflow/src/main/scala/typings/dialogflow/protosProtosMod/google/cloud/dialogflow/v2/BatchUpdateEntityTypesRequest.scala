package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.entityTypeBatchInline
import typings.dialogflow.dialogflowStrings.entityTypeBatchUri
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchUpdateEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest")
@js.native
/**
  * Constructs a new BatchUpdateEntityTypesRequest.
  * @param [properties] Properties to set
  */
open class BatchUpdateEntityTypesRequest ()
  extends StObject
     with IBatchUpdateEntityTypesRequest {
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
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchUpdateEntityTypesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchUpdateEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateEntityTypesRequest instance
    */
  /* static member */
  inline def create(): BatchUpdateEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchUpdateEntityTypesRequest]
  inline def create(properties: IBatchUpdateEntityTypesRequest): BatchUpdateEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchUpdateEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchUpdateEntityTypesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateEntityTypesRequest]
  /**
    * Decodes a BatchUpdateEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchUpdateEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesRequest]
  inline def decode(reader: Reader, length: Double): BatchUpdateEntityTypesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateEntityTypesRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchUpdateEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesRequest]
  /**
    * Decodes a BatchUpdateEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchUpdateEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesRequest]
  
  /**
    * Encodes the specified BatchUpdateEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest.verify|verify} messages.
    * @param message BatchUpdateEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchUpdateEntityTypesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchUpdateEntityTypesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchUpdateEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest.verify|verify} messages.
    * @param message BatchUpdateEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchUpdateEntityTypesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchUpdateEntityTypesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchUpdateEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateEntityTypesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchUpdateEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesRequest]
  
  /**
    * Creates a plain object from a BatchUpdateEntityTypesRequest message. Also converts values to other types if specified.
    * @param message BatchUpdateEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchUpdateEntityTypesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchUpdateEntityTypesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchUpdateEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
