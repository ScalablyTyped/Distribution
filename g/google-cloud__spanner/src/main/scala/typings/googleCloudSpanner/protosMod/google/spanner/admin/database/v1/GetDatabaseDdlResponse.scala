package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetDatabaseDdlResponse. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.GetDatabaseDdlResponse")
@js.native
/**
  * Constructs a new GetDatabaseDdlResponse.
  * @param [properties] Properties to set
  */
open class GetDatabaseDdlResponse ()
  extends StObject
     with IGetDatabaseDdlResponse {
  def this(properties: IGetDatabaseDdlResponse) = this()
  
  /** GetDatabaseDdlResponse statements. */
  @JSName("statements")
  var statements_GetDatabaseDdlResponse: js.Array[String] = js.native
  
  /**
    * Converts this GetDatabaseDdlResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetDatabaseDdlResponse {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.GetDatabaseDdlResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetDatabaseDdlResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetDatabaseDdlResponse instance
    */
  /* static member */
  inline def create(): GetDatabaseDdlResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetDatabaseDdlResponse]
  inline def create(properties: IGetDatabaseDdlResponse): GetDatabaseDdlResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetDatabaseDdlResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): GetDatabaseDdlResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetDatabaseDdlResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetDatabaseDdlResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetDatabaseDdlResponse]
  /**
    * Decodes a GetDatabaseDdlResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetDatabaseDdlResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetDatabaseDdlResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetDatabaseDdlResponse]
  inline def decode(reader: Reader, length: Double): GetDatabaseDdlResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetDatabaseDdlResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetDatabaseDdlResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetDatabaseDdlResponse]
  /**
    * Decodes a GetDatabaseDdlResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetDatabaseDdlResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetDatabaseDdlResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetDatabaseDdlResponse]
  
  /**
    * Encodes the specified GetDatabaseDdlResponse message. Does not implicitly {@link google.spanner.admin.database.v1.GetDatabaseDdlResponse.verify|verify} messages.
    * @param message GetDatabaseDdlResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetDatabaseDdlResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetDatabaseDdlResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetDatabaseDdlResponse message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.GetDatabaseDdlResponse.verify|verify} messages.
    * @param message GetDatabaseDdlResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetDatabaseDdlResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetDatabaseDdlResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetDatabaseDdlResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetDatabaseDdlResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetDatabaseDdlResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetDatabaseDdlResponse]
  
  /**
    * Gets the default type url for GetDatabaseDdlResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a GetDatabaseDdlResponse message. Also converts values to other types if specified.
    * @param message GetDatabaseDdlResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetDatabaseDdlResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetDatabaseDdlResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GetDatabaseDdlResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
