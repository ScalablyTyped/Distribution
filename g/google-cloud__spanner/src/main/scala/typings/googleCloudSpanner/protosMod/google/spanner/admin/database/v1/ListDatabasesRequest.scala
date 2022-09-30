package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDatabasesRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListDatabasesRequest")
@js.native
/**
  * Constructs a new ListDatabasesRequest.
  * @param [properties] Properties to set
  */
open class ListDatabasesRequest ()
  extends StObject
     with IListDatabasesRequest {
  def this(properties: IListDatabasesRequest) = this()
  
  /** ListDatabasesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListDatabasesRequest: Double = js.native
  
  /** ListDatabasesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListDatabasesRequest: String = js.native
  
  /** ListDatabasesRequest parent. */
  @JSName("parent")
  var parent_ListDatabasesRequest: String = js.native
  
  /**
    * Converts this ListDatabasesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDatabasesRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListDatabasesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListDatabasesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListDatabasesRequest instance
    */
  /* static member */
  inline def create(): ListDatabasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListDatabasesRequest]
  inline def create(properties: IListDatabasesRequest): ListDatabasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListDatabasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListDatabasesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDatabasesRequest]
  /**
    * Decodes a ListDatabasesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListDatabasesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListDatabasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesRequest]
  inline def decode(reader: Reader, length: Double): ListDatabasesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDatabasesRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListDatabasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesRequest]
  /**
    * Decodes a ListDatabasesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListDatabasesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListDatabasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesRequest]
  
  /**
    * Encodes the specified ListDatabasesRequest message. Does not implicitly {@link google.spanner.admin.database.v1.ListDatabasesRequest.verify|verify} messages.
    * @param message ListDatabasesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListDatabasesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListDatabasesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListDatabasesRequest message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.ListDatabasesRequest.verify|verify} messages.
    * @param message ListDatabasesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListDatabasesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListDatabasesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListDatabasesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDatabasesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDatabasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesRequest]
  
  /**
    * Gets the default type url for ListDatabasesRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListDatabasesRequest message. Also converts values to other types if specified.
    * @param message ListDatabasesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDatabasesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDatabasesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListDatabasesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
