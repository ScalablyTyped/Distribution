package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicsRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsRequest")
@js.native
/**
  * Constructs a new ListTopicsRequest.
  * @param [properties] Properties to set
  */
class ListTopicsRequest ()
  extends StObject
     with IListTopicsRequest {
  def this(properties: IListTopicsRequest) = this()
  
  /** ListTopicsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListTopicsRequest: Double = js.native
  
  /** ListTopicsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListTopicsRequest: String = js.native
  
  /** ListTopicsRequest project. */
  @JSName("project")
  var project_ListTopicsRequest: String = js.native
  
  /**
    * Converts this ListTopicsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListTopicsRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListTopicsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicsRequest instance
    */
  /* static member */
  inline def create(): ListTopicsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListTopicsRequest]
  inline def create(properties: IListTopicsRequest): ListTopicsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListTopicsRequest]
  
  /**
    * Decodes a ListTopicsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListTopicsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicsRequest]
  inline def decode(reader: Reader, length: Double): ListTopicsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListTopicsRequest]
  inline def decode(reader: Uint8Array): ListTopicsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicsRequest]
  inline def decode(reader: Uint8Array, length: Double): ListTopicsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListTopicsRequest]
  
  /**
    * Decodes a ListTopicsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListTopicsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicsRequest]
  inline def decodeDelimited(reader: Uint8Array): ListTopicsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicsRequest]
  
  /**
    * Encodes the specified ListTopicsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicsRequest.verify|verify} messages.
    * @param message ListTopicsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListTopicsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListTopicsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListTopicsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsRequest.verify|verify} messages.
    * @param message ListTopicsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListTopicsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListTopicsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListTopicsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): ListTopicsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListTopicsRequest]
  
  /**
    * Creates a plain object from a ListTopicsRequest message. Also converts values to other types if specified.
    * @param message ListTopicsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListTopicsRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ListTopicsRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ListTopicsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
