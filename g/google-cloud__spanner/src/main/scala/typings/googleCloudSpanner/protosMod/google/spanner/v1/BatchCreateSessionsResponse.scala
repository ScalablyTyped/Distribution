package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchCreateSessionsResponse. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.BatchCreateSessionsResponse")
@js.native
/**
  * Constructs a new BatchCreateSessionsResponse.
  * @param [properties] Properties to set
  */
open class BatchCreateSessionsResponse ()
  extends StObject
     with IBatchCreateSessionsResponse {
  def this(properties: IBatchCreateSessionsResponse) = this()
  
  /** BatchCreateSessionsResponse session. */
  @JSName("session")
  var session_BatchCreateSessionsResponse: js.Array[ISession] = js.native
  
  /**
    * Converts this BatchCreateSessionsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchCreateSessionsResponse {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.BatchCreateSessionsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchCreateSessionsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchCreateSessionsResponse instance
    */
  /* static member */
  inline def create(): BatchCreateSessionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchCreateSessionsResponse]
  inline def create(properties: IBatchCreateSessionsResponse): BatchCreateSessionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchCreateSessionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchCreateSessionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchCreateSessionsResponse]
  /**
    * Decodes a BatchCreateSessionsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchCreateSessionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchCreateSessionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsResponse]
  inline def decode(reader: Reader, length: Double): BatchCreateSessionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchCreateSessionsResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchCreateSessionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsResponse]
  /**
    * Decodes a BatchCreateSessionsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchCreateSessionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchCreateSessionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsResponse]
  
  /**
    * Encodes the specified BatchCreateSessionsResponse message. Does not implicitly {@link google.spanner.v1.BatchCreateSessionsResponse.verify|verify} messages.
    * @param message BatchCreateSessionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchCreateSessionsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchCreateSessionsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchCreateSessionsResponse message, length delimited. Does not implicitly {@link google.spanner.v1.BatchCreateSessionsResponse.verify|verify} messages.
    * @param message BatchCreateSessionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchCreateSessionsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchCreateSessionsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchCreateSessionsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchCreateSessionsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchCreateSessionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsResponse]
  
  /**
    * Gets the default type url for BatchCreateSessionsResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a BatchCreateSessionsResponse message. Also converts values to other types if specified.
    * @param message BatchCreateSessionsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchCreateSessionsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchCreateSessionsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchCreateSessionsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
