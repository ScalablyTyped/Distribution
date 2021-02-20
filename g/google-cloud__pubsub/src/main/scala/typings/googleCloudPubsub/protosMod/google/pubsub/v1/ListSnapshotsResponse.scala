package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListSnapshotsResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse")
@js.native
/**
  * Constructs a new ListSnapshotsResponse.
  * @param [properties] Properties to set
  */
class ListSnapshotsResponse () extends IListSnapshotsResponse {
  def this(properties: IListSnapshotsResponse) = this()
  
  /** ListSnapshotsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListSnapshotsResponse: String = js.native
  
  /** ListSnapshotsResponse snapshots. */
  @JSName("snapshots")
  var snapshots_ListSnapshotsResponse: js.Array[ISnapshot] = js.native
  
  /**
    * Converts this ListSnapshotsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ListSnapshotsResponse {
  
  /**
    * Creates a new ListSnapshotsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSnapshotsResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.create")
  @js.native
  def create(): ListSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.create")
  @js.native
  def create(properties: IListSnapshotsResponse): ListSnapshotsResponse = js.native
  
  /**
    * Decodes a ListSnapshotsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.decode")
  @js.native
  def decode(reader: Reader): ListSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ListSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListSnapshotsResponse = js.native
  
  /**
    * Decodes a ListSnapshotsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListSnapshotsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListSnapshotsResponse = js.native
  
  /**
    * Encodes the specified ListSnapshotsResponse message. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
    * @param message ListSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.encode")
  @js.native
  def encode(message: IListSnapshotsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.encode")
  @js.native
  def encode(message: IListSnapshotsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListSnapshotsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
    * @param message ListSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSnapshotsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListSnapshotsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListSnapshotsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSnapshotsResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListSnapshotsResponse = js.native
  
  /**
    * Creates a plain object from a ListSnapshotsResponse message. Also converts values to other types if specified.
    * @param message ListSnapshotsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.toObject")
  @js.native
  def toObject(message: ListSnapshotsResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.toObject")
  @js.native
  def toObject(message: ListSnapshotsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListSnapshotsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
