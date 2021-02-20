package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IAcknowledgeRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an AcknowledgeRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest")
@js.native
/**
  * Constructs a new AcknowledgeRequest.
  * @param [properties] Properties to set
  */
class AcknowledgeRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest {
  def this(properties: IAcknowledgeRequest) = this()
}
object AcknowledgeRequest {
  
  /**
    * Creates a new AcknowledgeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AcknowledgeRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.create")
  @js.native
  def create(properties: IAcknowledgeRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  
  /**
    * Decodes an AcknowledgeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AcknowledgeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  
  /**
    * Decodes an AcknowledgeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AcknowledgeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  
  /**
    * Encodes the specified AcknowledgeRequest message. Does not implicitly {@link google.pubsub.v1.AcknowledgeRequest.verify|verify} messages.
    * @param message AcknowledgeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.encode")
  @js.native
  def encode(message: IAcknowledgeRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.encode")
  @js.native
  def encode(message: IAcknowledgeRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified AcknowledgeRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.AcknowledgeRequest.verify|verify} messages.
    * @param message AcknowledgeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAcknowledgeRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAcknowledgeRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates an AcknowledgeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AcknowledgeRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest = js.native
  
  /**
    * Creates a plain object from an AcknowledgeRequest message. Also converts values to other types if specified.
    * @param message AcknowledgeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.AcknowledgeRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an AcknowledgeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.AcknowledgeRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
