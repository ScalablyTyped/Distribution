package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IModifyPushConfigRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ModifyPushConfigRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest")
@js.native
/**
  * Constructs a new ModifyPushConfigRequest.
  * @param [properties] Properties to set
  */
class ModifyPushConfigRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest {
  def this(properties: IModifyPushConfigRequest) = this()
}
object ModifyPushConfigRequest {
  
  /**
    * Creates a new ModifyPushConfigRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ModifyPushConfigRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.create")
  @js.native
  def create(properties: IModifyPushConfigRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  
  /**
    * Decodes a ModifyPushConfigRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ModifyPushConfigRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  
  /**
    * Decodes a ModifyPushConfigRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ModifyPushConfigRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  
  /**
    * Encodes the specified ModifyPushConfigRequest message. Does not implicitly {@link google.pubsub.v1.ModifyPushConfigRequest.verify|verify} messages.
    * @param message ModifyPushConfigRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.encode")
  @js.native
  def encode(message: IModifyPushConfigRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.encode")
  @js.native
  def encode(message: IModifyPushConfigRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ModifyPushConfigRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ModifyPushConfigRequest.verify|verify} messages.
    * @param message ModifyPushConfigRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IModifyPushConfigRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IModifyPushConfigRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ModifyPushConfigRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ModifyPushConfigRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest = js.native
  
  /**
    * Creates a plain object from a ModifyPushConfigRequest message. Also converts values to other types if specified.
    * @param message ModifyPushConfigRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ModifyPushConfigRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ModifyPushConfigRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ModifyPushConfigRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
