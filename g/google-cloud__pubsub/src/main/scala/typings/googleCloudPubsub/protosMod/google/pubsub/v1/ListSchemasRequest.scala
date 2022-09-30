package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListSchemasRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSchemasRequest")
@js.native
/**
  * Constructs a new ListSchemasRequest.
  * @param [properties] Properties to set
  */
open class ListSchemasRequest ()
  extends StObject
     with IListSchemasRequest {
  def this(properties: IListSchemasRequest) = this()
  
  /** ListSchemasRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListSchemasRequest: Double = js.native
  
  /** ListSchemasRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListSchemasRequest: String = js.native
  
  /** ListSchemasRequest parent. */
  @JSName("parent")
  var parent_ListSchemasRequest: String = js.native
  
  /**
    * Converts this ListSchemasRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ListSchemasRequest view. */
  @JSName("view")
  var view_ListSchemasRequest: SchemaView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.SchemaView * / any */ String) = js.native
}
object ListSchemasRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSchemasRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListSchemasRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSchemasRequest instance
    */
  /* static member */
  inline def create(): ListSchemasRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListSchemasRequest]
  inline def create(properties: IListSchemasRequest): ListSchemasRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListSchemasRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListSchemasRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSchemasRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListSchemasRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSchemasRequest]
  /**
    * Decodes a ListSchemasRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSchemasRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListSchemasRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSchemasRequest]
  inline def decode(reader: Reader, length: Double): ListSchemasRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSchemasRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListSchemasRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSchemasRequest]
  /**
    * Decodes a ListSchemasRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSchemasRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListSchemasRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSchemasRequest]
  
  /**
    * Encodes the specified ListSchemasRequest message. Does not implicitly {@link google.pubsub.v1.ListSchemasRequest.verify|verify} messages.
    * @param message ListSchemasRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListSchemasRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListSchemasRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListSchemasRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSchemasRequest.verify|verify} messages.
    * @param message ListSchemasRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListSchemasRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListSchemasRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListSchemasRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSchemasRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListSchemasRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListSchemasRequest]
  
  /**
    * Gets the default type url for ListSchemasRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListSchemasRequest message. Also converts values to other types if specified.
    * @param message ListSchemasRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListSchemasRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListSchemasRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListSchemasRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
