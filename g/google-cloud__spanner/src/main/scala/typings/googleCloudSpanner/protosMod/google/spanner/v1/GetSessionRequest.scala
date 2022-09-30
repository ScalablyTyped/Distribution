package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetSessionRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.GetSessionRequest")
@js.native
/**
  * Constructs a new GetSessionRequest.
  * @param [properties] Properties to set
  */
open class GetSessionRequest ()
  extends StObject
     with IGetSessionRequest {
  def this(properties: IGetSessionRequest) = this()
  
  /** GetSessionRequest name. */
  @JSName("name")
  var name_GetSessionRequest: String = js.native
  
  /**
    * Converts this GetSessionRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetSessionRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.GetSessionRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetSessionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSessionRequest instance
    */
  /* static member */
  inline def create(): GetSessionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetSessionRequest]
  inline def create(properties: IGetSessionRequest): GetSessionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetSessionRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): GetSessionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetSessionRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetSessionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetSessionRequest]
  /**
    * Decodes a GetSessionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSessionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetSessionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetSessionRequest]
  inline def decode(reader: Reader, length: Double): GetSessionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetSessionRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetSessionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetSessionRequest]
  /**
    * Decodes a GetSessionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSessionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetSessionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetSessionRequest]
  
  /**
    * Encodes the specified GetSessionRequest message. Does not implicitly {@link google.spanner.v1.GetSessionRequest.verify|verify} messages.
    * @param message GetSessionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetSessionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetSessionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetSessionRequest message, length delimited. Does not implicitly {@link google.spanner.v1.GetSessionRequest.verify|verify} messages.
    * @param message GetSessionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetSessionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetSessionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetSessionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSessionRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetSessionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetSessionRequest]
  
  /**
    * Gets the default type url for GetSessionRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a GetSessionRequest message. Also converts values to other types if specified.
    * @param message GetSessionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetSessionRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetSessionRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GetSessionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
