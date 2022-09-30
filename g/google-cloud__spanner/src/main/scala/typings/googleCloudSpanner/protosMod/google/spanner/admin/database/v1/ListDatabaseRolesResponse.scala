package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDatabaseRolesResponse. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListDatabaseRolesResponse")
@js.native
/**
  * Constructs a new ListDatabaseRolesResponse.
  * @param [properties] Properties to set
  */
open class ListDatabaseRolesResponse ()
  extends StObject
     with IListDatabaseRolesResponse {
  def this(properties: IListDatabaseRolesResponse) = this()
  
  /** ListDatabaseRolesResponse databaseRoles. */
  @JSName("databaseRoles")
  var databaseRoles_ListDatabaseRolesResponse: js.Array[IDatabaseRole] = js.native
  
  /** ListDatabaseRolesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListDatabaseRolesResponse: String = js.native
  
  /**
    * Converts this ListDatabaseRolesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDatabaseRolesResponse {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListDatabaseRolesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListDatabaseRolesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListDatabaseRolesResponse instance
    */
  /* static member */
  inline def create(): ListDatabaseRolesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListDatabaseRolesResponse]
  inline def create(properties: IListDatabaseRolesResponse): ListDatabaseRolesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseRolesResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListDatabaseRolesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseRolesResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListDatabaseRolesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDatabaseRolesResponse]
  /**
    * Decodes a ListDatabaseRolesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListDatabaseRolesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListDatabaseRolesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseRolesResponse]
  inline def decode(reader: Reader, length: Double): ListDatabaseRolesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDatabaseRolesResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListDatabaseRolesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseRolesResponse]
  /**
    * Decodes a ListDatabaseRolesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListDatabaseRolesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListDatabaseRolesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseRolesResponse]
  
  /**
    * Encodes the specified ListDatabaseRolesResponse message. Does not implicitly {@link google.spanner.admin.database.v1.ListDatabaseRolesResponse.verify|verify} messages.
    * @param message ListDatabaseRolesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListDatabaseRolesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListDatabaseRolesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListDatabaseRolesResponse message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.ListDatabaseRolesResponse.verify|verify} messages.
    * @param message ListDatabaseRolesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListDatabaseRolesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListDatabaseRolesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListDatabaseRolesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDatabaseRolesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDatabaseRolesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseRolesResponse]
  
  /**
    * Gets the default type url for ListDatabaseRolesResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListDatabaseRolesResponse message. Also converts values to other types if specified.
    * @param message ListDatabaseRolesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDatabaseRolesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDatabaseRolesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListDatabaseRolesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
