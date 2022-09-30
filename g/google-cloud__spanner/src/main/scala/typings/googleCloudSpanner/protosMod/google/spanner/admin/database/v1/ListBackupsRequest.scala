package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListBackupsRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListBackupsRequest")
@js.native
/**
  * Constructs a new ListBackupsRequest.
  * @param [properties] Properties to set
  */
open class ListBackupsRequest ()
  extends StObject
     with IListBackupsRequest {
  def this(properties: IListBackupsRequest) = this()
  
  /** ListBackupsRequest filter. */
  @JSName("filter")
  var filter_ListBackupsRequest: String = js.native
  
  /** ListBackupsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListBackupsRequest: Double = js.native
  
  /** ListBackupsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListBackupsRequest: String = js.native
  
  /** ListBackupsRequest parent. */
  @JSName("parent")
  var parent_ListBackupsRequest: String = js.native
  
  /**
    * Converts this ListBackupsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListBackupsRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.ListBackupsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListBackupsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListBackupsRequest instance
    */
  /* static member */
  inline def create(): ListBackupsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListBackupsRequest]
  inline def create(properties: IListBackupsRequest): ListBackupsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListBackupsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListBackupsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListBackupsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListBackupsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListBackupsRequest]
  /**
    * Decodes a ListBackupsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListBackupsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListBackupsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListBackupsRequest]
  inline def decode(reader: Reader, length: Double): ListBackupsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListBackupsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListBackupsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListBackupsRequest]
  /**
    * Decodes a ListBackupsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListBackupsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListBackupsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListBackupsRequest]
  
  /**
    * Encodes the specified ListBackupsRequest message. Does not implicitly {@link google.spanner.admin.database.v1.ListBackupsRequest.verify|verify} messages.
    * @param message ListBackupsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListBackupsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListBackupsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListBackupsRequest message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.ListBackupsRequest.verify|verify} messages.
    * @param message ListBackupsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListBackupsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListBackupsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListBackupsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListBackupsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListBackupsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListBackupsRequest]
  
  /**
    * Gets the default type url for ListBackupsRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListBackupsRequest message. Also converts values to other types if specified.
    * @param message ListBackupsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListBackupsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListBackupsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListBackupsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
