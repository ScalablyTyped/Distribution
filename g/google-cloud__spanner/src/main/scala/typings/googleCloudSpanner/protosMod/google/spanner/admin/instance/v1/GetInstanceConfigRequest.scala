package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetInstanceConfigRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.GetInstanceConfigRequest")
@js.native
/**
  * Constructs a new GetInstanceConfigRequest.
  * @param [properties] Properties to set
  */
open class GetInstanceConfigRequest ()
  extends StObject
     with IGetInstanceConfigRequest {
  def this(properties: IGetInstanceConfigRequest) = this()
  
  /** GetInstanceConfigRequest name. */
  @JSName("name")
  var name_GetInstanceConfigRequest: String = js.native
  
  /**
    * Converts this GetInstanceConfigRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetInstanceConfigRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.GetInstanceConfigRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetInstanceConfigRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetInstanceConfigRequest instance
    */
  /* static member */
  inline def create(): GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetInstanceConfigRequest]
  inline def create(properties: IGetInstanceConfigRequest): GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetInstanceConfigRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetInstanceConfigRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetInstanceConfigRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetInstanceConfigRequest]
  /**
    * Decodes a GetInstanceConfigRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetInstanceConfigRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetInstanceConfigRequest]
  inline def decode(reader: Reader, length: Double): GetInstanceConfigRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetInstanceConfigRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetInstanceConfigRequest]
  /**
    * Decodes a GetInstanceConfigRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetInstanceConfigRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetInstanceConfigRequest]
  
  /**
    * Encodes the specified GetInstanceConfigRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.GetInstanceConfigRequest.verify|verify} messages.
    * @param message GetInstanceConfigRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetInstanceConfigRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetInstanceConfigRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetInstanceConfigRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.GetInstanceConfigRequest.verify|verify} messages.
    * @param message GetInstanceConfigRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetInstanceConfigRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetInstanceConfigRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetInstanceConfigRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetInstanceConfigRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetInstanceConfigRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetInstanceConfigRequest]
  
  /**
    * Gets the default type url for GetInstanceConfigRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a GetInstanceConfigRequest message. Also converts values to other types if specified.
    * @param message GetInstanceConfigRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetInstanceConfigRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetInstanceConfigRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GetInstanceConfigRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
