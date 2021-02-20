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

/** Represents a DeleteSnapshotRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest")
@js.native
/**
  * Constructs a new DeleteSnapshotRequest.
  * @param [properties] Properties to set
  */
class DeleteSnapshotRequest () extends IDeleteSnapshotRequest {
  def this(properties: IDeleteSnapshotRequest) = this()
  
  /** DeleteSnapshotRequest snapshot. */
  @JSName("snapshot")
  var snapshot_DeleteSnapshotRequest: String = js.native
  
  /**
    * Converts this DeleteSnapshotRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteSnapshotRequest {
  
  /**
    * Creates a new DeleteSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteSnapshotRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.create")
  @js.native
  def create(): DeleteSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.create")
  @js.native
  def create(properties: IDeleteSnapshotRequest): DeleteSnapshotRequest = js.native
  
  /**
    * Decodes a DeleteSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.decode")
  @js.native
  def decode(reader: Uint8Array): DeleteSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DeleteSnapshotRequest = js.native
  
  /**
    * Decodes a DeleteSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DeleteSnapshotRequest = js.native
  
  /**
    * Encodes the specified DeleteSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.DeleteSnapshotRequest.verify|verify} messages.
    * @param message DeleteSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.encode")
  @js.native
  def encode(message: IDeleteSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.encode")
  @js.native
  def encode(message: IDeleteSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteSnapshotRequest.verify|verify} messages.
    * @param message DeleteSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteSnapshotRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteSnapshotRequest = js.native
  
  /**
    * Creates a plain object from a DeleteSnapshotRequest message. Also converts values to other types if specified.
    * @param message DeleteSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.toObject")
  @js.native
  def toObject(message: DeleteSnapshotRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.toObject")
  @js.native
  def toObject(message: DeleteSnapshotRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSnapshotRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
