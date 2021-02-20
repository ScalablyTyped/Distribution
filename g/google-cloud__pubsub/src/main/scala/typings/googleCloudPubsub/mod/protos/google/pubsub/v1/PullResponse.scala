package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPullResponse
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PullResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse")
@js.native
/**
  * Constructs a new PullResponse.
  * @param [properties] Properties to set
  */
class PullResponse ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse {
  def this(properties: IPullResponse) = this()
}
object PullResponse {
  
  /**
    * Creates a new PullResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PullResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.create")
  @js.native
  def create(properties: IPullResponse): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  
  /**
    * Decodes a PullResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  
  /**
    * Decodes a PullResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  
  /**
    * Encodes the specified PullResponse message. Does not implicitly {@link google.pubsub.v1.PullResponse.verify|verify} messages.
    * @param message PullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.encode")
  @js.native
  def encode(message: IPullResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.encode")
  @js.native
  def encode(message: IPullResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PullResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.PullResponse.verify|verify} messages.
    * @param message PullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPullResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPullResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a PullResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PullResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse = js.native
  
  /**
    * Creates a plain object from a PullResponse message. Also converts values to other types if specified.
    * @param message PullResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PullResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PullResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PullResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
