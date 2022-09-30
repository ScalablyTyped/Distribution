package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListSchemasResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSchemasResponse")
@js.native
/**
  * Constructs a new ListSchemasResponse.
  * @param [properties] Properties to set
  */
open class ListSchemasResponse ()
  extends StObject
     with IListSchemasResponse {
  def this(properties: IListSchemasResponse) = this()
  
  /** ListSchemasResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListSchemasResponse: String = js.native
  
  /** ListSchemasResponse schemas. */
  @JSName("schemas")
  var schemas_ListSchemasResponse: js.Array[ISchema] = js.native
  
  /**
    * Converts this ListSchemasResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListSchemasResponse {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSchemasResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListSchemasResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSchemasResponse instance
    */
  /* static member */
  inline def create(): ListSchemasResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListSchemasResponse]
  inline def create(properties: IListSchemasResponse): ListSchemasResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListSchemasResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListSchemasResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSchemasResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListSchemasResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSchemasResponse]
  /**
    * Decodes a ListSchemasResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSchemasResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListSchemasResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSchemasResponse]
  inline def decode(reader: Reader, length: Double): ListSchemasResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSchemasResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListSchemasResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSchemasResponse]
  /**
    * Decodes a ListSchemasResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSchemasResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListSchemasResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSchemasResponse]
  
  /**
    * Encodes the specified ListSchemasResponse message. Does not implicitly {@link google.pubsub.v1.ListSchemasResponse.verify|verify} messages.
    * @param message ListSchemasResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListSchemasResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListSchemasResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListSchemasResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSchemasResponse.verify|verify} messages.
    * @param message ListSchemasResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListSchemasResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListSchemasResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListSchemasResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSchemasResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListSchemasResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListSchemasResponse]
  
  /**
    * Gets the default type url for ListSchemasResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListSchemasResponse message. Also converts values to other types if specified.
    * @param message ListSchemasResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListSchemasResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListSchemasResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListSchemasResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
