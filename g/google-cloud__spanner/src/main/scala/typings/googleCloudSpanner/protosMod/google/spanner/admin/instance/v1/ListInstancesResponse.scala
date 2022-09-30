package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListInstancesResponse. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ListInstancesResponse")
@js.native
/**
  * Constructs a new ListInstancesResponse.
  * @param [properties] Properties to set
  */
open class ListInstancesResponse ()
  extends StObject
     with IListInstancesResponse {
  def this(properties: IListInstancesResponse) = this()
  
  /** ListInstancesResponse instances. */
  @JSName("instances")
  var instances_ListInstancesResponse: js.Array[IInstance] = js.native
  
  /** ListInstancesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListInstancesResponse: String = js.native
  
  /**
    * Converts this ListInstancesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListInstancesResponse {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ListInstancesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListInstancesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListInstancesResponse instance
    */
  /* static member */
  inline def create(): ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListInstancesResponse]
  inline def create(properties: IListInstancesResponse): ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListInstancesResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstancesResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListInstancesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListInstancesResponse]
  /**
    * Decodes a ListInstancesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListInstancesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstancesResponse]
  inline def decode(reader: Reader, length: Double): ListInstancesResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListInstancesResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstancesResponse]
  /**
    * Decodes a ListInstancesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListInstancesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstancesResponse]
  
  /**
    * Encodes the specified ListInstancesResponse message. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstancesResponse.verify|verify} messages.
    * @param message ListInstancesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListInstancesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListInstancesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListInstancesResponse message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstancesResponse.verify|verify} messages.
    * @param message ListInstancesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListInstancesResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListInstancesResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListInstancesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListInstancesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListInstancesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListInstancesResponse]
  
  /**
    * Gets the default type url for ListInstancesResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListInstancesResponse message. Also converts values to other types if specified.
    * @param message ListInstancesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListInstancesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListInstancesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListInstancesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
