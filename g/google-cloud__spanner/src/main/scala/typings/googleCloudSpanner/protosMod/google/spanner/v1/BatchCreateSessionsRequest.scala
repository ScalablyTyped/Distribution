package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchCreateSessionsRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.BatchCreateSessionsRequest")
@js.native
/**
  * Constructs a new BatchCreateSessionsRequest.
  * @param [properties] Properties to set
  */
open class BatchCreateSessionsRequest ()
  extends StObject
     with IBatchCreateSessionsRequest {
  def this(properties: IBatchCreateSessionsRequest) = this()
  
  /** BatchCreateSessionsRequest database. */
  @JSName("database")
  var database_BatchCreateSessionsRequest: String = js.native
  
  /** BatchCreateSessionsRequest sessionCount. */
  @JSName("sessionCount")
  var sessionCount_BatchCreateSessionsRequest: Double = js.native
  
  /**
    * Converts this BatchCreateSessionsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchCreateSessionsRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.BatchCreateSessionsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchCreateSessionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchCreateSessionsRequest instance
    */
  /* static member */
  inline def create(): BatchCreateSessionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchCreateSessionsRequest]
  inline def create(properties: IBatchCreateSessionsRequest): BatchCreateSessionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchCreateSessionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchCreateSessionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchCreateSessionsRequest]
  /**
    * Decodes a BatchCreateSessionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchCreateSessionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BatchCreateSessionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsRequest]
  inline def decode(reader: Reader, length: Double): BatchCreateSessionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchCreateSessionsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchCreateSessionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsRequest]
  /**
    * Decodes a BatchCreateSessionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchCreateSessionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BatchCreateSessionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsRequest]
  
  /**
    * Encodes the specified BatchCreateSessionsRequest message. Does not implicitly {@link google.spanner.v1.BatchCreateSessionsRequest.verify|verify} messages.
    * @param message BatchCreateSessionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBatchCreateSessionsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchCreateSessionsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchCreateSessionsRequest message, length delimited. Does not implicitly {@link google.spanner.v1.BatchCreateSessionsRequest.verify|verify} messages.
    * @param message BatchCreateSessionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBatchCreateSessionsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchCreateSessionsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchCreateSessionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchCreateSessionsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchCreateSessionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchCreateSessionsRequest]
  
  /**
    * Gets the default type url for BatchCreateSessionsRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a BatchCreateSessionsRequest message. Also converts values to other types if specified.
    * @param message BatchCreateSessionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchCreateSessionsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchCreateSessionsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchCreateSessionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
