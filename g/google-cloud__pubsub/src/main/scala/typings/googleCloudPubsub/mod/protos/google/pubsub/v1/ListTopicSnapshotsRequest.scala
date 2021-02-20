package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSnapshotsRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicSnapshotsRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest")
@js.native
/**
  * Constructs a new ListTopicSnapshotsRequest.
  * @param [properties] Properties to set
  */
class ListTopicSnapshotsRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest {
  def this(properties: IListTopicSnapshotsRequest) = this()
}
object ListTopicSnapshotsRequest {
  
  /**
    * Creates a new ListTopicSnapshotsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSnapshotsRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.create")
  @js.native
  def create(properties: IListTopicSnapshotsRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  
  /**
    * Decodes a ListTopicSnapshotsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSnapshotsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  
  /**
    * Decodes a ListTopicSnapshotsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSnapshotsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  
  /**
    * Encodes the specified ListTopicSnapshotsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsRequest.verify|verify} messages.
    * @param message ListTopicSnapshotsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.encode")
  @js.native
  def encode(message: IListTopicSnapshotsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.encode")
  @js.native
  def encode(message: IListTopicSnapshotsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListTopicSnapshotsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsRequest.verify|verify} messages.
    * @param message ListTopicSnapshotsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSnapshotsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSnapshotsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListTopicSnapshotsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSnapshotsRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  
  /**
    * Creates a plain object from a ListTopicSnapshotsRequest message. Also converts values to other types if specified.
    * @param message ListTopicSnapshotsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListTopicSnapshotsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
