package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchDeleteEntityTypesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest")
@js.native
/**
  * Constructs a new BatchDeleteEntityTypesRequest.
  * @param [properties] Properties to set
  */
open class BatchDeleteEntityTypesRequest ()
  extends StObject
     with IBatchDeleteEntityTypesRequest {
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
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchDeleteEntityTypesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchDeleteEntityTypesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchDeleteEntityTypesRequest instance
    */
  /* static member */
  inline def create(): BatchDeleteEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchDeleteEntityTypesRequest]
  inline def create(properties: IBatchDeleteEntityTypesRequest): BatchDeleteEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntityTypesRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchDeleteEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntityTypesRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchDeleteEntityTypesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchDeleteEntityTypesRequest]
  /**
    * Decodes a BatchDeleteEntityTypesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchDeleteEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchDeleteEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntityTypesRequest]
  inline def decode(reader: Reader, length: Double): BatchDeleteEntityTypesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchDeleteEntityTypesRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchDeleteEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntityTypesRequest]
  /**
    * Decodes a BatchDeleteEntityTypesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchDeleteEntityTypesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchDeleteEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntityTypesRequest]
  
  /**
    * Encodes the specified BatchDeleteEntityTypesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest.verify|verify} messages.
    * @param message BatchDeleteEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchDeleteEntityTypesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchDeleteEntityTypesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchDeleteEntityTypesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest.verify|verify} messages.
    * @param message BatchDeleteEntityTypesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchDeleteEntityTypesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchDeleteEntityTypesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchDeleteEntityTypesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchDeleteEntityTypesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchDeleteEntityTypesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntityTypesRequest]
  
  /**
    * Creates a plain object from a BatchDeleteEntityTypesRequest message. Also converts values to other types if specified.
    * @param message BatchDeleteEntityTypesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchDeleteEntityTypesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchDeleteEntityTypesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchDeleteEntityTypesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
