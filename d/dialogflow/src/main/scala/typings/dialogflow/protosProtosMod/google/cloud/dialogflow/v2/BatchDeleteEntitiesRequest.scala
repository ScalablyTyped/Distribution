package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchDeleteEntitiesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest")
@js.native
/**
  * Constructs a new BatchDeleteEntitiesRequest.
  * @param [properties] Properties to set
  */
open class BatchDeleteEntitiesRequest ()
  extends StObject
     with IBatchDeleteEntitiesRequest {
  def this(properties: IBatchDeleteEntitiesRequest) = this()
  
  /** BatchDeleteEntitiesRequest entityValues. */
  @JSName("entityValues")
  var entityValues_BatchDeleteEntitiesRequest: js.Array[String] = js.native
  
  /** BatchDeleteEntitiesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchDeleteEntitiesRequest: String = js.native
  
  /** BatchDeleteEntitiesRequest parent. */
  @JSName("parent")
  var parent_BatchDeleteEntitiesRequest: String = js.native
  
  /**
    * Converts this BatchDeleteEntitiesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchDeleteEntitiesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchDeleteEntitiesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchDeleteEntitiesRequest instance
    */
  /* static member */
  inline def create(): BatchDeleteEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchDeleteEntitiesRequest]
  inline def create(properties: IBatchDeleteEntitiesRequest): BatchDeleteEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntitiesRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchDeleteEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntitiesRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchDeleteEntitiesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchDeleteEntitiesRequest]
  /**
    * Decodes a BatchDeleteEntitiesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchDeleteEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchDeleteEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntitiesRequest]
  inline def decode(reader: Reader, length: Double): BatchDeleteEntitiesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchDeleteEntitiesRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchDeleteEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntitiesRequest]
  /**
    * Decodes a BatchDeleteEntitiesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchDeleteEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchDeleteEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntitiesRequest]
  
  /**
    * Encodes the specified BatchDeleteEntitiesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.verify|verify} messages.
    * @param message BatchDeleteEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchDeleteEntitiesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchDeleteEntitiesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchDeleteEntitiesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest.verify|verify} messages.
    * @param message BatchDeleteEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchDeleteEntitiesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchDeleteEntitiesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchDeleteEntitiesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchDeleteEntitiesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchDeleteEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteEntitiesRequest]
  
  /**
    * Creates a plain object from a BatchDeleteEntitiesRequest message. Also converts values to other types if specified.
    * @param message BatchDeleteEntitiesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchDeleteEntitiesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchDeleteEntitiesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchDeleteEntitiesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
