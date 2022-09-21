package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchUpdateEntitiesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntitiesRequest")
@js.native
/**
  * Constructs a new BatchUpdateEntitiesRequest.
  * @param [properties] Properties to set
  */
open class BatchUpdateEntitiesRequest ()
  extends StObject
     with IBatchUpdateEntitiesRequest {
  def this(properties: IBatchUpdateEntitiesRequest) = this()
  
  /** BatchUpdateEntitiesRequest entities. */
  @JSName("entities")
  var entities_BatchUpdateEntitiesRequest: js.Array[IEntity] = js.native
  
  /** BatchUpdateEntitiesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchUpdateEntitiesRequest: String = js.native
  
  /** BatchUpdateEntitiesRequest parent. */
  @JSName("parent")
  var parent_BatchUpdateEntitiesRequest: String = js.native
  
  /**
    * Converts this BatchUpdateEntitiesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchUpdateEntitiesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateEntitiesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchUpdateEntitiesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateEntitiesRequest instance
    */
  /* static member */
  inline def create(): BatchUpdateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchUpdateEntitiesRequest]
  inline def create(properties: IBatchUpdateEntitiesRequest): BatchUpdateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntitiesRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchUpdateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntitiesRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchUpdateEntitiesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateEntitiesRequest]
  /**
    * Decodes a BatchUpdateEntitiesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchUpdateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntitiesRequest]
  inline def decode(reader: Reader, length: Double): BatchUpdateEntitiesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateEntitiesRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchUpdateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntitiesRequest]
  /**
    * Decodes a BatchUpdateEntitiesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchUpdateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntitiesRequest]
  
  /**
    * Encodes the specified BatchUpdateEntitiesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateEntitiesRequest.verify|verify} messages.
    * @param message BatchUpdateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchUpdateEntitiesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchUpdateEntitiesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchUpdateEntitiesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateEntitiesRequest.verify|verify} messages.
    * @param message BatchUpdateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchUpdateEntitiesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchUpdateEntitiesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchUpdateEntitiesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateEntitiesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchUpdateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateEntitiesRequest]
  
  /**
    * Creates a plain object from a BatchUpdateEntitiesRequest message. Also converts values to other types if specified.
    * @param message BatchUpdateEntitiesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchUpdateEntitiesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchUpdateEntitiesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchUpdateEntitiesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
