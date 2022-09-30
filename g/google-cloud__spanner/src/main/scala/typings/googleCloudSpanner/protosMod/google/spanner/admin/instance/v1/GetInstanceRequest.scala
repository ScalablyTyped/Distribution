package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetInstanceRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.GetInstanceRequest")
@js.native
/**
  * Constructs a new GetInstanceRequest.
  * @param [properties] Properties to set
  */
open class GetInstanceRequest ()
  extends StObject
     with IGetInstanceRequest {
  def this(properties: IGetInstanceRequest) = this()
  
  /** GetInstanceRequest name. */
  @JSName("name")
  var name_GetInstanceRequest: String = js.native
  
  /**
    * Converts this GetInstanceRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetInstanceRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.GetInstanceRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetInstanceRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetInstanceRequest instance
    */
  /* static member */
  inline def create(): GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetInstanceRequest]
  inline def create(properties: IGetInstanceRequest): GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetInstanceRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetInstanceRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetInstanceRequest]
  /**
    * Decodes a GetInstanceRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetInstanceRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetInstanceRequest]
  inline def decode(reader: Reader, length: Double): GetInstanceRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetInstanceRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetInstanceRequest]
  /**
    * Decodes a GetInstanceRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetInstanceRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetInstanceRequest]
  
  /**
    * Encodes the specified GetInstanceRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.GetInstanceRequest.verify|verify} messages.
    * @param message GetInstanceRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetInstanceRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.GetInstanceRequest.verify|verify} messages.
    * @param message GetInstanceRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetInstanceRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetInstanceRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetInstanceRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetInstanceRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetInstanceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetInstanceRequest]
  
  /**
    * Gets the default type url for GetInstanceRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a GetInstanceRequest message. Also converts values to other types if specified.
    * @param message GetInstanceRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetInstanceRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetInstanceRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GetInstanceRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
