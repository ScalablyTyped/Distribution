package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PartitionReadRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PartitionReadRequest")
@js.native
/**
  * Constructs a new PartitionReadRequest.
  * @param [properties] Properties to set
  */
open class PartitionReadRequest ()
  extends StObject
     with IPartitionReadRequest {
  def this(properties: IPartitionReadRequest) = this()
  
  /** PartitionReadRequest columns. */
  @JSName("columns")
  var columns_PartitionReadRequest: js.Array[String] = js.native
  
  /** PartitionReadRequest index. */
  @JSName("index")
  var index_PartitionReadRequest: String = js.native
  
  /** PartitionReadRequest session. */
  @JSName("session")
  var session_PartitionReadRequest: String = js.native
  
  /** PartitionReadRequest table. */
  @JSName("table")
  var table_PartitionReadRequest: String = js.native
  
  /**
    * Converts this PartitionReadRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object PartitionReadRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PartitionReadRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PartitionReadRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PartitionReadRequest instance
    */
  /* static member */
  inline def create(): PartitionReadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PartitionReadRequest]
  inline def create(properties: IPartitionReadRequest): PartitionReadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PartitionReadRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): PartitionReadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionReadRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PartitionReadRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PartitionReadRequest]
  /**
    * Decodes a PartitionReadRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PartitionReadRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PartitionReadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionReadRequest]
  inline def decode(reader: Reader, length: Double): PartitionReadRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PartitionReadRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PartitionReadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionReadRequest]
  /**
    * Decodes a PartitionReadRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PartitionReadRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PartitionReadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionReadRequest]
  
  /**
    * Encodes the specified PartitionReadRequest message. Does not implicitly {@link google.spanner.v1.PartitionReadRequest.verify|verify} messages.
    * @param message PartitionReadRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPartitionReadRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPartitionReadRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PartitionReadRequest message, length delimited. Does not implicitly {@link google.spanner.v1.PartitionReadRequest.verify|verify} messages.
    * @param message PartitionReadRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPartitionReadRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPartitionReadRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PartitionReadRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PartitionReadRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PartitionReadRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PartitionReadRequest]
  
  /**
    * Gets the default type url for PartitionReadRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a PartitionReadRequest message. Also converts values to other types if specified.
    * @param message PartitionReadRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PartitionReadRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PartitionReadRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PartitionReadRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
