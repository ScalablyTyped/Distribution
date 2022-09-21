package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchDeleteIntentsRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest")
@js.native
/**
  * Constructs a new BatchDeleteIntentsRequest.
  * @param [properties] Properties to set
  */
open class BatchDeleteIntentsRequest ()
  extends StObject
     with IBatchDeleteIntentsRequest {
  def this(properties: IBatchDeleteIntentsRequest) = this()
  
  /** BatchDeleteIntentsRequest intents. */
  @JSName("intents")
  var intents_BatchDeleteIntentsRequest: js.Array[IIntent] = js.native
  
  /** BatchDeleteIntentsRequest parent. */
  @JSName("parent")
  var parent_BatchDeleteIntentsRequest: String = js.native
  
  /**
    * Converts this BatchDeleteIntentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchDeleteIntentsRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchDeleteIntentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchDeleteIntentsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchDeleteIntentsRequest instance
    */
  /* static member */
  inline def create(): BatchDeleteIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchDeleteIntentsRequest]
  inline def create(properties: IBatchDeleteIntentsRequest): BatchDeleteIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteIntentsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchDeleteIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteIntentsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchDeleteIntentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchDeleteIntentsRequest]
  /**
    * Decodes a BatchDeleteIntentsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchDeleteIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchDeleteIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteIntentsRequest]
  inline def decode(reader: Reader, length: Double): BatchDeleteIntentsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchDeleteIntentsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchDeleteIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteIntentsRequest]
  /**
    * Decodes a BatchDeleteIntentsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchDeleteIntentsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchDeleteIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteIntentsRequest]
  
  /**
    * Encodes the specified BatchDeleteIntentsRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.verify|verify} messages.
    * @param message BatchDeleteIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchDeleteIntentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchDeleteIntentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchDeleteIntentsRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchDeleteIntentsRequest.verify|verify} messages.
    * @param message BatchDeleteIntentsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchDeleteIntentsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchDeleteIntentsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchDeleteIntentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchDeleteIntentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchDeleteIntentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchDeleteIntentsRequest]
  
  /**
    * Creates a plain object from a BatchDeleteIntentsRequest message. Also converts values to other types if specified.
    * @param message BatchDeleteIntentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchDeleteIntentsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchDeleteIntentsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchDeleteIntentsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
