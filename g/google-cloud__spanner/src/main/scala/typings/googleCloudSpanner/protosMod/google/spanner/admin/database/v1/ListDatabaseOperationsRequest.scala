package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDatabaseOperationsRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListDatabaseOperationsRequest")
@js.native
/**
  * Constructs a new ListDatabaseOperationsRequest.
  * @param [properties] Properties to set
  */
open class ListDatabaseOperationsRequest ()
  extends StObject
     with IListDatabaseOperationsRequest {
  def this(properties: IListDatabaseOperationsRequest) = this()
  
  /** ListDatabaseOperationsRequest filter. */
  @JSName("filter")
  var filter_ListDatabaseOperationsRequest: String = js.native
  
  /** ListDatabaseOperationsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListDatabaseOperationsRequest: Double = js.native
  
  /** ListDatabaseOperationsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListDatabaseOperationsRequest: String = js.native
  
  /** ListDatabaseOperationsRequest parent. */
  @JSName("parent")
  var parent_ListDatabaseOperationsRequest: String = js.native
  
  /**
    * Converts this ListDatabaseOperationsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDatabaseOperationsRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListDatabaseOperationsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListDatabaseOperationsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListDatabaseOperationsRequest instance
    */
  /* static member */
  inline def create(): ListDatabaseOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListDatabaseOperationsRequest]
  inline def create(properties: IListDatabaseOperationsRequest): ListDatabaseOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseOperationsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListDatabaseOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseOperationsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListDatabaseOperationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDatabaseOperationsRequest]
  /**
    * Decodes a ListDatabaseOperationsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListDatabaseOperationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListDatabaseOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseOperationsRequest]
  inline def decode(reader: Reader, length: Double): ListDatabaseOperationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListDatabaseOperationsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListDatabaseOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseOperationsRequest]
  /**
    * Decodes a ListDatabaseOperationsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListDatabaseOperationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListDatabaseOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseOperationsRequest]
  
  /**
    * Encodes the specified ListDatabaseOperationsRequest message. Does not implicitly {@link google.spanner.admin.database.v1.ListDatabaseOperationsRequest.verify|verify} messages.
    * @param message ListDatabaseOperationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListDatabaseOperationsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListDatabaseOperationsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListDatabaseOperationsRequest message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.ListDatabaseOperationsRequest.verify|verify} messages.
    * @param message ListDatabaseOperationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListDatabaseOperationsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListDatabaseOperationsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListDatabaseOperationsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDatabaseOperationsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDatabaseOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDatabaseOperationsRequest]
  
  /**
    * Gets the default type url for ListDatabaseOperationsRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListDatabaseOperationsRequest message. Also converts values to other types if specified.
    * @param message ListDatabaseOperationsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDatabaseOperationsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDatabaseOperationsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListDatabaseOperationsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
