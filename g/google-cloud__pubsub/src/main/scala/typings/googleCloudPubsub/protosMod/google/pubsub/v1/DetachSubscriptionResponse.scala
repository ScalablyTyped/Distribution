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

/** Represents a DetachSubscriptionResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse")
@js.native
/**
  * Constructs a new DetachSubscriptionResponse.
  * @param [properties] Properties to set
  */
class DetachSubscriptionResponse () extends IDetachSubscriptionResponse {
  def this(properties: IDetachSubscriptionResponse) = this()
  
  /**
    * Converts this DetachSubscriptionResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DetachSubscriptionResponse {
  
  /**
    * Creates a new DetachSubscriptionResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetachSubscriptionResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.create")
  @js.native
  def create(): DetachSubscriptionResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.create")
  @js.native
  def create(properties: IDetachSubscriptionResponse): DetachSubscriptionResponse = js.native
  
  /**
    * Decodes a DetachSubscriptionResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetachSubscriptionResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.decode")
  @js.native
  def decode(reader: Reader): DetachSubscriptionResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): DetachSubscriptionResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.decode")
  @js.native
  def decode(reader: Uint8Array): DetachSubscriptionResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DetachSubscriptionResponse = js.native
  
  /**
    * Decodes a DetachSubscriptionResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetachSubscriptionResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DetachSubscriptionResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DetachSubscriptionResponse = js.native
  
  /**
    * Encodes the specified DetachSubscriptionResponse message. Does not implicitly {@link google.pubsub.v1.DetachSubscriptionResponse.verify|verify} messages.
    * @param message DetachSubscriptionResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.encode")
  @js.native
  def encode(message: IDetachSubscriptionResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.encode")
  @js.native
  def encode(message: IDetachSubscriptionResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DetachSubscriptionResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.DetachSubscriptionResponse.verify|verify} messages.
    * @param message DetachSubscriptionResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDetachSubscriptionResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDetachSubscriptionResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a DetachSubscriptionResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetachSubscriptionResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DetachSubscriptionResponse = js.native
  
  /**
    * Creates a plain object from a DetachSubscriptionResponse message. Also converts values to other types if specified.
    * @param message DetachSubscriptionResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.toObject")
  @js.native
  def toObject(message: DetachSubscriptionResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.toObject")
  @js.native
  def toObject(message: DetachSubscriptionResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DetachSubscriptionResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
