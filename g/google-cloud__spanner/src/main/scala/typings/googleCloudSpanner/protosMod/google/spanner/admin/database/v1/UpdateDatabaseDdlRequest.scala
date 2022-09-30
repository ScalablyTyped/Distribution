package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateDatabaseDdlRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.UpdateDatabaseDdlRequest")
@js.native
/**
  * Constructs a new UpdateDatabaseDdlRequest.
  * @param [properties] Properties to set
  */
open class UpdateDatabaseDdlRequest ()
  extends StObject
     with IUpdateDatabaseDdlRequest {
  def this(properties: IUpdateDatabaseDdlRequest) = this()
  
  /** UpdateDatabaseDdlRequest database. */
  @JSName("database")
  var database_UpdateDatabaseDdlRequest: String = js.native
  
  /** UpdateDatabaseDdlRequest operationId. */
  @JSName("operationId")
  var operationId_UpdateDatabaseDdlRequest: String = js.native
  
  /** UpdateDatabaseDdlRequest statements. */
  @JSName("statements")
  var statements_UpdateDatabaseDdlRequest: js.Array[String] = js.native
  
  /**
    * Converts this UpdateDatabaseDdlRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object UpdateDatabaseDdlRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.UpdateDatabaseDdlRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UpdateDatabaseDdlRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateDatabaseDdlRequest instance
    */
  /* static member */
  inline def create(): UpdateDatabaseDdlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UpdateDatabaseDdlRequest]
  inline def create(properties: IUpdateDatabaseDdlRequest): UpdateDatabaseDdlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UpdateDatabaseDdlRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): UpdateDatabaseDdlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateDatabaseDdlRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): UpdateDatabaseDdlRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateDatabaseDdlRequest]
  /**
    * Decodes an UpdateDatabaseDdlRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateDatabaseDdlRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): UpdateDatabaseDdlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateDatabaseDdlRequest]
  inline def decode(reader: Reader, length: Double): UpdateDatabaseDdlRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateDatabaseDdlRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): UpdateDatabaseDdlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateDatabaseDdlRequest]
  /**
    * Decodes an UpdateDatabaseDdlRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateDatabaseDdlRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): UpdateDatabaseDdlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateDatabaseDdlRequest]
  
  /**
    * Encodes the specified UpdateDatabaseDdlRequest message. Does not implicitly {@link google.spanner.admin.database.v1.UpdateDatabaseDdlRequest.verify|verify} messages.
    * @param message UpdateDatabaseDdlRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IUpdateDatabaseDdlRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IUpdateDatabaseDdlRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UpdateDatabaseDdlRequest message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.UpdateDatabaseDdlRequest.verify|verify} messages.
    * @param message UpdateDatabaseDdlRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IUpdateDatabaseDdlRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IUpdateDatabaseDdlRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UpdateDatabaseDdlRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateDatabaseDdlRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): UpdateDatabaseDdlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateDatabaseDdlRequest]
  
  /**
    * Gets the default type url for UpdateDatabaseDdlRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an UpdateDatabaseDdlRequest message. Also converts values to other types if specified.
    * @param message UpdateDatabaseDdlRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UpdateDatabaseDdlRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: UpdateDatabaseDdlRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an UpdateDatabaseDdlRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
