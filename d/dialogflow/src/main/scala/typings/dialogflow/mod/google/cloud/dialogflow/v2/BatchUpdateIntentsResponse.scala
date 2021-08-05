package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchUpdateIntentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsResponse")
@js.native
/**
  * Constructs a new BatchUpdateIntentsResponse.
  * @param [properties] Properties to set
  */
class BatchUpdateIntentsResponse ()
  extends StObject
     with IBatchUpdateIntentsResponse {
  def this(properties: IBatchUpdateIntentsResponse) = this()
  
  /** BatchUpdateIntentsResponse intents. */
  @JSName("intents")
  var intents_BatchUpdateIntentsResponse: js.Array[IIntent] = js.native
  
  /**
    * Converts this BatchUpdateIntentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BatchUpdateIntentsResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.BatchUpdateIntentsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchUpdateIntentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchUpdateIntentsResponse instance
    */
  /* static member */
  inline def create(): BatchUpdateIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchUpdateIntentsResponse]
  inline def create(properties: IBatchUpdateIntentsResponse): BatchUpdateIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsResponse]
  
  /**
    * Decodes a BatchUpdateIntentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchUpdateIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchUpdateIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsResponse]
  inline def decode(reader: Reader, length: Double): BatchUpdateIntentsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateIntentsResponse]
  inline def decode(reader: Uint8Array): BatchUpdateIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsResponse]
  inline def decode(reader: Uint8Array, length: Double): BatchUpdateIntentsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchUpdateIntentsResponse]
  
  /**
    * Decodes a BatchUpdateIntentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchUpdateIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchUpdateIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsResponse]
  inline def decodeDelimited(reader: Uint8Array): BatchUpdateIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsResponse]
  
  /**
    * Encodes the specified BatchUpdateIntentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateIntentsResponse.verify|verify} messages.
    * @param message BatchUpdateIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchUpdateIntentsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchUpdateIntentsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchUpdateIntentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.BatchUpdateIntentsResponse.verify|verify} messages.
    * @param message BatchUpdateIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchUpdateIntentsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchUpdateIntentsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchUpdateIntentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchUpdateIntentsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): BatchUpdateIntentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchUpdateIntentsResponse]
  
  /**
    * Creates a plain object from a BatchUpdateIntentsResponse message. Also converts values to other types if specified.
    * @param message BatchUpdateIntentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchUpdateIntentsResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: BatchUpdateIntentsResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a BatchUpdateIntentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
