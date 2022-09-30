package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListInstancesRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ListInstancesRequest")
@js.native
/**
  * Constructs a new ListInstancesRequest.
  * @param [properties] Properties to set
  */
open class ListInstancesRequest ()
  extends StObject
     with IListInstancesRequest {
  def this(properties: IListInstancesRequest) = this()
  
  /** ListInstancesRequest filter. */
  @JSName("filter")
  var filter_ListInstancesRequest: String = js.native
  
  /** ListInstancesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListInstancesRequest: Double = js.native
  
  /** ListInstancesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListInstancesRequest: String = js.native
  
  /** ListInstancesRequest parent. */
  @JSName("parent")
  var parent_ListInstancesRequest: String = js.native
  
  /**
    * Converts this ListInstancesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListInstancesRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ListInstancesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListInstancesRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListInstancesRequest instance
    */
  /* static member */
  inline def create(): ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListInstancesRequest]
  inline def create(properties: IListInstancesRequest): ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListInstancesRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstancesRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListInstancesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListInstancesRequest]
  /**
    * Decodes a ListInstancesRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListInstancesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstancesRequest]
  inline def decode(reader: Reader, length: Double): ListInstancesRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListInstancesRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstancesRequest]
  /**
    * Decodes a ListInstancesRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListInstancesRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListInstancesRequest]
  
  /**
    * Encodes the specified ListInstancesRequest message. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstancesRequest.verify|verify} messages.
    * @param message ListInstancesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListInstancesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListInstancesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListInstancesRequest message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ListInstancesRequest.verify|verify} messages.
    * @param message ListInstancesRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListInstancesRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListInstancesRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListInstancesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListInstancesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListInstancesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListInstancesRequest]
  
  /**
    * Gets the default type url for ListInstancesRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ListInstancesRequest message. Also converts values to other types if specified.
    * @param message ListInstancesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListInstancesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListInstancesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListInstancesRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
