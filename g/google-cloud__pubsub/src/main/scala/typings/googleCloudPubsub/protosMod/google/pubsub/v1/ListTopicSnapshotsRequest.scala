package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicSnapshotsRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsRequest")
@js.native
/**
  * Constructs a new ListTopicSnapshotsRequest.
  * @param [properties] Properties to set
  */
class ListTopicSnapshotsRequest ()
  extends StObject
     with IListTopicSnapshotsRequest {
  def this(properties: IListTopicSnapshotsRequest) = this()
  
  /** ListTopicSnapshotsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListTopicSnapshotsRequest: Double = js.native
  
  /** ListTopicSnapshotsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListTopicSnapshotsRequest: String = js.native
  
  /**
    * Converts this ListTopicSnapshotsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ListTopicSnapshotsRequest topic. */
  @JSName("topic")
  var topic_ListTopicSnapshotsRequest: String = js.native
}
object ListTopicSnapshotsRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSnapshotsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListTopicSnapshotsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSnapshotsRequest instance
    */
  /* static member */
  inline def create(): ListTopicSnapshotsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListTopicSnapshotsRequest]
  inline def create(properties: IListTopicSnapshotsRequest): ListTopicSnapshotsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListTopicSnapshotsRequest]
  
  /**
    * Decodes a ListTopicSnapshotsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSnapshotsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListTopicSnapshotsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicSnapshotsRequest]
  inline def decode(reader: Reader, length: Double): ListTopicSnapshotsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListTopicSnapshotsRequest]
  inline def decode(reader: Uint8Array): ListTopicSnapshotsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicSnapshotsRequest]
  inline def decode(reader: Uint8Array, length: Double): ListTopicSnapshotsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListTopicSnapshotsRequest]
  
  /**
    * Decodes a ListTopicSnapshotsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSnapshotsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListTopicSnapshotsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicSnapshotsRequest]
  inline def decodeDelimited(reader: Uint8Array): ListTopicSnapshotsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicSnapshotsRequest]
  
  /**
    * Encodes the specified ListTopicSnapshotsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsRequest.verify|verify} messages.
    * @param message ListTopicSnapshotsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListTopicSnapshotsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListTopicSnapshotsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListTopicSnapshotsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsRequest.verify|verify} messages.
    * @param message ListTopicSnapshotsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListTopicSnapshotsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListTopicSnapshotsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListTopicSnapshotsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSnapshotsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): ListTopicSnapshotsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListTopicSnapshotsRequest]
  
  /**
    * Creates a plain object from a ListTopicSnapshotsRequest message. Also converts values to other types if specified.
    * @param message ListTopicSnapshotsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListTopicSnapshotsRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ListTopicSnapshotsRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ListTopicSnapshotsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
