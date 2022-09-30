package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RollbackRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.RollbackRequest")
@js.native
/**
  * Constructs a new RollbackRequest.
  * @param [properties] Properties to set
  */
open class RollbackRequest ()
  extends StObject
     with IRollbackRequest {
  def this(properties: IRollbackRequest) = this()
  
  /** RollbackRequest session. */
  @JSName("session")
  var session_RollbackRequest: String = js.native
  
  /**
    * Converts this RollbackRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** RollbackRequest transactionId. */
  @JSName("transactionId")
  var transactionId_RollbackRequest: js.typedarray.Uint8Array | String = js.native
}
object RollbackRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.RollbackRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new RollbackRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RollbackRequest instance
    */
  /* static member */
  inline def create(): RollbackRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RollbackRequest]
  inline def create(properties: IRollbackRequest): RollbackRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RollbackRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): RollbackRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RollbackRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): RollbackRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RollbackRequest]
  /**
    * Decodes a RollbackRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RollbackRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): RollbackRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RollbackRequest]
  inline def decode(reader: Reader, length: Double): RollbackRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RollbackRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): RollbackRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RollbackRequest]
  /**
    * Decodes a RollbackRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RollbackRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): RollbackRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RollbackRequest]
  
  /**
    * Encodes the specified RollbackRequest message. Does not implicitly {@link google.spanner.v1.RollbackRequest.verify|verify} messages.
    * @param message RollbackRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IRollbackRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRollbackRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RollbackRequest message, length delimited. Does not implicitly {@link google.spanner.v1.RollbackRequest.verify|verify} messages.
    * @param message RollbackRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IRollbackRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRollbackRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RollbackRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RollbackRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RollbackRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RollbackRequest]
  
  /**
    * Gets the default type url for RollbackRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a RollbackRequest message. Also converts values to other types if specified.
    * @param message RollbackRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RollbackRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RollbackRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a RollbackRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
