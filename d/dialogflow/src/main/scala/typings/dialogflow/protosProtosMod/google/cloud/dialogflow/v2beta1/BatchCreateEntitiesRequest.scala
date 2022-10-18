package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchCreateEntitiesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest")
@js.native
/**
  * Constructs a new BatchCreateEntitiesRequest.
  * @param [properties] Properties to set
  */
open class BatchCreateEntitiesRequest ()
  extends StObject
     with IBatchCreateEntitiesRequest {
  def this(properties: IBatchCreateEntitiesRequest) = this()
  
  /** BatchCreateEntitiesRequest entities. */
  @JSName("entities")
  var entities_BatchCreateEntitiesRequest: js.Array[IEntity] = js.native
  
  /** BatchCreateEntitiesRequest languageCode. */
  @JSName("languageCode")
  var languageCode_BatchCreateEntitiesRequest: String = js.native
  
  /** BatchCreateEntitiesRequest parent. */
  @JSName("parent")
  var parent_BatchCreateEntitiesRequest: String = js.native
  
  /**
    * Converts this BatchCreateEntitiesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchCreateEntitiesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchCreateEntitiesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchCreateEntitiesRequest instance
    */
  /* static member */
  inline def create(): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchCreateEntitiesRequest]
  inline def create(properties: IBatchCreateEntitiesRequest): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchCreateEntitiesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchCreateEntitiesRequest]
  /**
    * Decodes a BatchCreateEntitiesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchCreateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  inline def decode(reader: Reader, length: Double): BatchCreateEntitiesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchCreateEntitiesRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  /**
    * Decodes a BatchCreateEntitiesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchCreateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  
  /**
    * Encodes the specified BatchCreateEntitiesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest.verify|verify} messages.
    * @param message BatchCreateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchCreateEntitiesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchCreateEntitiesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchCreateEntitiesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest.verify|verify} messages.
    * @param message BatchCreateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchCreateEntitiesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchCreateEntitiesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchCreateEntitiesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchCreateEntitiesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  
  /**
    * Creates a plain object from a BatchCreateEntitiesRequest message. Also converts values to other types if specified.
    * @param message BatchCreateEntitiesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchCreateEntitiesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchCreateEntitiesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchCreateEntitiesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
