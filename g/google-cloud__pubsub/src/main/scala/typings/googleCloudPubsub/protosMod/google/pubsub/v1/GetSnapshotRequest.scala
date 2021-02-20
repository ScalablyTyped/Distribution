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

/** Represents a GetSnapshotRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest")
@js.native
/**
  * Constructs a new GetSnapshotRequest.
  * @param [properties] Properties to set
  */
class GetSnapshotRequest () extends IGetSnapshotRequest {
  def this(properties: IGetSnapshotRequest) = this()
  
  /** GetSnapshotRequest snapshot. */
  @JSName("snapshot")
  var snapshot_GetSnapshotRequest: String = js.native
  
  /**
    * Converts this GetSnapshotRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GetSnapshotRequest {
  
  /**
    * Creates a new GetSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSnapshotRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.create")
  @js.native
  def create(): GetSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.create")
  @js.native
  def create(properties: IGetSnapshotRequest): GetSnapshotRequest = js.native
  
  /**
    * Decodes a GetSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader): GetSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): GetSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.decode")
  @js.native
  def decode(reader: Uint8Array): GetSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GetSnapshotRequest = js.native
  
  /**
    * Decodes a GetSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GetSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GetSnapshotRequest = js.native
  
  /**
    * Encodes the specified GetSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.GetSnapshotRequest.verify|verify} messages.
    * @param message GetSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.encode")
  @js.native
  def encode(message: IGetSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.encode")
  @js.native
  def encode(message: IGetSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetSnapshotRequest.verify|verify} messages.
    * @param message GetSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSnapshotRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GetSnapshotRequest = js.native
  
  /**
    * Creates a plain object from a GetSnapshotRequest message. Also converts values to other types if specified.
    * @param message GetSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.toObject")
  @js.native
  def toObject(message: GetSnapshotRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.toObject")
  @js.native
  def toObject(message: GetSnapshotRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSnapshotRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
