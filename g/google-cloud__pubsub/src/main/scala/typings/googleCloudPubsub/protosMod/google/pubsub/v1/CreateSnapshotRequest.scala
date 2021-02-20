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

/** Represents a CreateSnapshotRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest")
@js.native
/**
  * Constructs a new CreateSnapshotRequest.
  * @param [properties] Properties to set
  */
class CreateSnapshotRequest () extends ICreateSnapshotRequest {
  def this(properties: ICreateSnapshotRequest) = this()
  
  /** CreateSnapshotRequest labels. */
  @JSName("labels")
  var labels_CreateSnapshotRequest: StringDictionary[String] = js.native
  
  /** CreateSnapshotRequest name. */
  @JSName("name")
  var name_CreateSnapshotRequest: String = js.native
  
  /** CreateSnapshotRequest subscription. */
  @JSName("subscription")
  var subscription_CreateSnapshotRequest: String = js.native
  
  /**
    * Converts this CreateSnapshotRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CreateSnapshotRequest {
  
  /**
    * Creates a new CreateSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateSnapshotRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.create")
  @js.native
  def create(): CreateSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.create")
  @js.native
  def create(properties: ICreateSnapshotRequest): CreateSnapshotRequest = js.native
  
  /**
    * Decodes a CreateSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader): CreateSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): CreateSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.decode")
  @js.native
  def decode(reader: Uint8Array): CreateSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): CreateSnapshotRequest = js.native
  
  /**
    * Decodes a CreateSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CreateSnapshotRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): CreateSnapshotRequest = js.native
  
  /**
    * Encodes the specified CreateSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.CreateSnapshotRequest.verify|verify} messages.
    * @param message CreateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.encode")
  @js.native
  def encode(message: ICreateSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.encode")
  @js.native
  def encode(message: ICreateSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CreateSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.CreateSnapshotRequest.verify|verify} messages.
    * @param message CreateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateSnapshotRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICreateSnapshotRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a CreateSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateSnapshotRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CreateSnapshotRequest = js.native
  
  /**
    * Creates a plain object from a CreateSnapshotRequest message. Also converts values to other types if specified.
    * @param message CreateSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.toObject")
  @js.native
  def toObject(message: CreateSnapshotRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.toObject")
  @js.native
  def toObject(message: CreateSnapshotRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CreateSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.CreateSnapshotRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
