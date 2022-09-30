package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListInstanceConfigsResponse. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ListInstanceConfigsResponse")
@js.native
/**
  * Constructs a new ListInstanceConfigsResponse.
  * @param [properties] Properties to set
  */
open class ListInstanceConfigsResponse ()
  extends StObject
     with IListInstanceConfigsResponse {
  def this(properties: IListInstanceConfigsResponse) = this()
  
  /** ListInstanceConfigsResponse instanceConfigs. */
  @JSName("instanceConfigs")
  var instanceConfigs_ListInstanceConfigsResponse: js.Array[IInstanceConfig] = js.native
  
  /** ListInstanceConfigsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListInstanceConfigsResponse: String = js.native
  
  /**
    * Converts this ListInstanceConfigsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListInstanceConfigsResponse {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ListInstanceConfigsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListInstanceConfigsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListInstanceConfigsResponse instance
    */
  /* static member */
  inline def create(): ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListInstanceConfigsResponse]
  inline def create(properties: IListInstanceConfigsResponse): ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListInstanceConfigsResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstanceConfigsResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListInstanceConfigsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListInstanceConfigsResponse]
  /**
    * Decodes a ListInstanceConfigsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListInstanceConfigsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstanceConfigsResponse]
  inline def decode(reader: Reader, length: Double): ListInstanceConfigsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListInstanceConfigsResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstanceConfigsResponse]
  /**
    * Decodes a ListInstanceConfigsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListInstanceConfigsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstanceConfigsResponse]
  
  /**
    * Encodes the specified ListInstanceConfigsResponse message. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse.verify|verify} messages.
    * @param message ListInstanceConfigsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListInstanceConfigsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListInstanceConfigsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListInstanceConfigsResponse message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse.verify|verify} messages.
    * @param message ListInstanceConfigsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListInstanceConfigsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListInstanceConfigsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListInstanceConfigsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListInstanceConfigsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListInstanceConfigsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListInstanceConfigsResponse]
  
  /**
    * Gets the default type url for ListInstanceConfigsResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListInstanceConfigsResponse message. Also converts values to other types if specified.
    * @param message ListInstanceConfigsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListInstanceConfigsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListInstanceConfigsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListInstanceConfigsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
