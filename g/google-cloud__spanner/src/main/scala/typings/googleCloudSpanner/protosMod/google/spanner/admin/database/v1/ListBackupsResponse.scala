package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListBackupsResponse. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListBackupsResponse")
@js.native
/**
  * Constructs a new ListBackupsResponse.
  * @param [properties] Properties to set
  */
open class ListBackupsResponse ()
  extends StObject
     with IListBackupsResponse {
  def this(properties: IListBackupsResponse) = this()
  
  /** ListBackupsResponse backups. */
  @JSName("backups")
  var backups_ListBackupsResponse: js.Array[IBackup] = js.native
  
  /** ListBackupsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListBackupsResponse: String = js.native
  
  /**
    * Converts this ListBackupsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListBackupsResponse {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListBackupsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListBackupsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListBackupsResponse instance
    */
  /* static member */
  inline def create(): ListBackupsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListBackupsResponse]
  inline def create(properties: IListBackupsResponse): ListBackupsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListBackupsResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListBackupsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListBackupsResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListBackupsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListBackupsResponse]
  /**
    * Decodes a ListBackupsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListBackupsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListBackupsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListBackupsResponse]
  inline def decode(reader: Reader, length: Double): ListBackupsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListBackupsResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListBackupsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListBackupsResponse]
  /**
    * Decodes a ListBackupsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListBackupsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListBackupsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListBackupsResponse]
  
  /**
    * Encodes the specified ListBackupsResponse message. Does not implicitly {@link google.spanner.admin.database.v1.ListBackupsResponse.verify|verify} messages.
    * @param message ListBackupsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListBackupsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListBackupsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListBackupsResponse message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.ListBackupsResponse.verify|verify} messages.
    * @param message ListBackupsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListBackupsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListBackupsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListBackupsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListBackupsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListBackupsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListBackupsResponse]
  
  /**
    * Gets the default type url for ListBackupsResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListBackupsResponse message. Also converts values to other types if specified.
    * @param message ListBackupsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListBackupsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListBackupsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListBackupsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
