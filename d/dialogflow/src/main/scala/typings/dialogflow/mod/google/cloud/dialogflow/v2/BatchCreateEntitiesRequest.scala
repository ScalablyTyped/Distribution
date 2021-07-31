package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchCreateEntitiesRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchCreateEntitiesRequest")
@js.native
/**
  * Constructs a new BatchCreateEntitiesRequest.
  * @param [properties] Properties to set
  */
class BatchCreateEntitiesRequest ()
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
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BatchCreateEntitiesRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchCreateEntitiesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchCreateEntitiesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchCreateEntitiesRequest instance
    */
  /* static member */
  @scala.inline
  def create(): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchCreateEntitiesRequest]
  @scala.inline
  def create(properties: IBatchCreateEntitiesRequest): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  
  /**
    * Decodes a BatchCreateEntitiesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchCreateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): BatchCreateEntitiesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchCreateEntitiesRequest]
  @scala.inline
  def decode(reader: Uint8Array): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): BatchCreateEntitiesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchCreateEntitiesRequest]
  
  /**
    * Decodes a BatchCreateEntitiesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchCreateEntitiesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  
  /**
    * Encodes the specified BatchCreateEntitiesRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchCreateEntitiesRequest.verify|verify} messages.
    * @param message BatchCreateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IBatchCreateEntitiesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IBatchCreateEntitiesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchCreateEntitiesRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchCreateEntitiesRequest.verify|verify} messages.
    * @param message BatchCreateEntitiesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IBatchCreateEntitiesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IBatchCreateEntitiesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchCreateEntitiesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchCreateEntitiesRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): BatchCreateEntitiesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchCreateEntitiesRequest]
  
  /**
    * Creates a plain object from a BatchCreateEntitiesRequest message. Also converts values to other types if specified.
    * @param message BatchCreateEntitiesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: BatchCreateEntitiesRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: BatchCreateEntitiesRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a BatchCreateEntitiesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
