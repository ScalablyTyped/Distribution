package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchUpdateEntityTypesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse")
@js.native
/**
  * Constructs a new BatchUpdateEntityTypesResponse.
  * @param [properties] Properties to set
  */
open class BatchUpdateEntityTypesResponse ()
  extends StObject
     with IBatchUpdateEntityTypesResponse {
  def this(properties: IBatchUpdateEntityTypesResponse) = this()
  
  /** BatchUpdateEntityTypesResponse entityTypes. */
  @JSName("entityTypes")
  var entityTypes_BatchUpdateEntityTypesResponse: js.Array[IEntityType] = js.native
  
  /**
    * Converts this BatchUpdateEntityTypesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchUpdateEntityTypesResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchUpdateEntityTypesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateEntityTypesResponse instance
    */
  /* static member */
  inline def create(): BatchUpdateEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchUpdateEntityTypesResponse]
  inline def create(properties: IBatchUpdateEntityTypesResponse): BatchUpdateEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchUpdateEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchUpdateEntityTypesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateEntityTypesResponse]
  /**
    * Decodes a BatchUpdateEntityTypesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchUpdateEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesResponse]
  inline def decode(reader: Reader, length: Double): BatchUpdateEntityTypesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateEntityTypesResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchUpdateEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesResponse]
  /**
    * Decodes a BatchUpdateEntityTypesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchUpdateEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesResponse]
  
  /**
    * Encodes the specified BatchUpdateEntityTypesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse.verify|verify} messages.
    * @param message BatchUpdateEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchUpdateEntityTypesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchUpdateEntityTypesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchUpdateEntityTypesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse.verify|verify} messages.
    * @param message BatchUpdateEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchUpdateEntityTypesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchUpdateEntityTypesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchUpdateEntityTypesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateEntityTypesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchUpdateEntityTypesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntityTypesResponse]
  
  /**
    * Creates a plain object from a BatchUpdateEntityTypesResponse message. Also converts values to other types if specified.
    * @param message BatchUpdateEntityTypesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchUpdateEntityTypesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchUpdateEntityTypesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchUpdateEntityTypesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
