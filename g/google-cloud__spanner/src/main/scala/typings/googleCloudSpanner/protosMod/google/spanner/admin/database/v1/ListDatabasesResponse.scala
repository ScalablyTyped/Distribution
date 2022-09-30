package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDatabasesResponse. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListDatabasesResponse")
@js.native
/**
  * Constructs a new ListDatabasesResponse.
  * @param [properties] Properties to set
  */
open class ListDatabasesResponse ()
  extends StObject
     with IListDatabasesResponse {
  def this(properties: IListDatabasesResponse) = this()
  
  /** ListDatabasesResponse databases. */
  @JSName("databases")
  var databases_ListDatabasesResponse: js.Array[IDatabase] = js.native
  
  /** ListDatabasesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListDatabasesResponse: String = js.native
  
  /**
    * Converts this ListDatabasesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDatabasesResponse {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListDatabasesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListDatabasesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListDatabasesResponse instance
    */
  /* static member */
  inline def create(): ListDatabasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListDatabasesResponse]
  inline def create(properties: IListDatabasesResponse): ListDatabasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListDatabasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListDatabasesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDatabasesResponse]
  /**
    * Decodes a ListDatabasesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListDatabasesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListDatabasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesResponse]
  inline def decode(reader: Reader, length: Double): ListDatabasesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDatabasesResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListDatabasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesResponse]
  /**
    * Decodes a ListDatabasesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListDatabasesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListDatabasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesResponse]
  
  /**
    * Encodes the specified ListDatabasesResponse message. Does not implicitly {@link google.spanner.admin.database.v1.ListDatabasesResponse.verify|verify} messages.
    * @param message ListDatabasesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListDatabasesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListDatabasesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListDatabasesResponse message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.ListDatabasesResponse.verify|verify} messages.
    * @param message ListDatabasesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListDatabasesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListDatabasesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListDatabasesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDatabasesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDatabasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesResponse]
  
  /**
    * Gets the default type url for ListDatabasesResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListDatabasesResponse message. Also converts values to other types if specified.
    * @param message ListDatabasesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDatabasesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDatabasesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListDatabasesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
