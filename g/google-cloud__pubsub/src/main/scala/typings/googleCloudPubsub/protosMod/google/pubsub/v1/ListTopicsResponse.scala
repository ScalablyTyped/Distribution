package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicsResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse")
@js.native
/**
  * Constructs a new ListTopicsResponse.
  * @param [properties] Properties to set
  */
class ListTopicsResponse ()
  extends StObject
     with IListTopicsResponse {
  def this(properties: IListTopicsResponse) = this()
  
  /** ListTopicsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListTopicsResponse: String = js.native
  
  /**
    * Converts this ListTopicsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ListTopicsResponse topics. */
  @JSName("topics")
  var topics_ListTopicsResponse: js.Array[ITopic] = js.native
}
object ListTopicsResponse {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListTopicsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicsResponse instance
    */
  /* static member */
  inline def create(): ListTopicsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListTopicsResponse]
  inline def create(properties: IListTopicsResponse): ListTopicsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListTopicsResponse]
  
  /**
    * Decodes a ListTopicsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListTopicsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicsResponse]
  inline def decode(reader: Reader, length: Double): ListTopicsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListTopicsResponse]
  inline def decode(reader: Uint8Array): ListTopicsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicsResponse]
  inline def decode(reader: Uint8Array, length: Double): ListTopicsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListTopicsResponse]
  
  /**
    * Decodes a ListTopicsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListTopicsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicsResponse]
  inline def decodeDelimited(reader: Uint8Array): ListTopicsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicsResponse]
  
  /**
    * Encodes the specified ListTopicsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
    * @param message ListTopicsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListTopicsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListTopicsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListTopicsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
    * @param message ListTopicsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListTopicsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListTopicsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListTopicsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): ListTopicsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListTopicsResponse]
  
  /**
    * Creates a plain object from a ListTopicsResponse message. Also converts values to other types if specified.
    * @param message ListTopicsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListTopicsResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ListTopicsResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ListTopicsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
