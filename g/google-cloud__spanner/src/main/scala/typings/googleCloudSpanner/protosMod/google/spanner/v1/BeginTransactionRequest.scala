package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BeginTransactionRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.BeginTransactionRequest")
@js.native
/**
  * Constructs a new BeginTransactionRequest.
  * @param [properties] Properties to set
  */
open class BeginTransactionRequest ()
  extends StObject
     with IBeginTransactionRequest {
  def this(properties: IBeginTransactionRequest) = this()
  
  /** BeginTransactionRequest session. */
  @JSName("session")
  var session_BeginTransactionRequest: String = js.native
  
  /**
    * Converts this BeginTransactionRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BeginTransactionRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.BeginTransactionRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BeginTransactionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BeginTransactionRequest instance
    */
  /* static member */
  inline def create(): BeginTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BeginTransactionRequest]
  inline def create(properties: IBeginTransactionRequest): BeginTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BeginTransactionRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): BeginTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BeginTransactionRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BeginTransactionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BeginTransactionRequest]
  /**
    * Decodes a BeginTransactionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BeginTransactionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BeginTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BeginTransactionRequest]
  inline def decode(reader: Reader, length: Double): BeginTransactionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BeginTransactionRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BeginTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BeginTransactionRequest]
  /**
    * Decodes a BeginTransactionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BeginTransactionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BeginTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BeginTransactionRequest]
  
  /**
    * Encodes the specified BeginTransactionRequest message. Does not implicitly {@link google.spanner.v1.BeginTransactionRequest.verify|verify} messages.
    * @param message BeginTransactionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBeginTransactionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBeginTransactionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BeginTransactionRequest message, length delimited. Does not implicitly {@link google.spanner.v1.BeginTransactionRequest.verify|verify} messages.
    * @param message BeginTransactionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBeginTransactionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBeginTransactionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BeginTransactionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BeginTransactionRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BeginTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BeginTransactionRequest]
  
  /**
    * Gets the default type url for BeginTransactionRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a BeginTransactionRequest message. Also converts values to other types if specified.
    * @param message BeginTransactionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BeginTransactionRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BeginTransactionRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BeginTransactionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
